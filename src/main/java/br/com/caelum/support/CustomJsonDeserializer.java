package br.com.caelum.support;

import java.util.ArrayList;

import br.com.caelum.cadastro.modelo.Aluno;
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
		xStream.alias("aluno", Aluno.class);
		xStream.alias("list", ArrayList.class);
		return xStream;
	};
}
