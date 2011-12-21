package br.com.caelum.support;

import br.com.caelum.vraptor.deserialization.JsonDeserializer;
import br.com.caelum.vraptor.http.ParameterNameProvider;
import br.com.caelum.vraptor.interceptor.TypeNameExtractor;
import br.com.caelum.vraptor.ioc.Component;

import com.thoughtworks.xstream.XStream;

@Component
public class CustomJsonDeserializer extends JsonDeserializer {
	private AnnotatedXStreamClasses classes;
	
	public CustomJsonDeserializer(ParameterNameProvider provider, TypeNameExtractor extractor, AnnotatedXStreamClasses classes) {
		super(provider, extractor);
		this.classes = classes;
	}
	
	public XStream getConfiguredXStream(java.lang.reflect.Method javaMethod, java.lang.Class<?>[] types) {
		XStream xStream = super.getConfiguredXStream(javaMethod, types);
		
		xStream.processAnnotations(classes.getTypes());
		return xStream;
	}
}
