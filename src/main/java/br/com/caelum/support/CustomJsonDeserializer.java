package br.com.caelum.support;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import br.com.caelum.vraptor.deserialization.JsonDeserializer;
import br.com.caelum.vraptor.http.ParameterNameProvider;
import br.com.caelum.vraptor.interceptor.TypeNameExtractor;
import br.com.caelum.vraptor.ioc.Component;

import com.thoughtworks.xstream.XStream;

@Component
public class CustomJsonDeserializer extends JsonDeserializer {
	
	public CustomJsonDeserializer(ParameterNameProvider provider, TypeNameExtractor extractor) {
		super(provider, extractor);
	}
	
	public XStream getConfiguredXStream(java.lang.reflect.Method javaMethod, java.lang.Class<?>[] types) {
		XStream xStream = super.getConfiguredXStream(javaMethod, types);
		
		for (Type type : javaMethod.getGenericParameterTypes()) {
			if (type instanceof ParameterizedType) 
				xStream.processAnnotations(
						(Class<?>) ((ParameterizedType) type).getActualTypeArguments()[0]);
		}
		xStream.processAnnotations(types);
		
		return xStream;
	}
}
