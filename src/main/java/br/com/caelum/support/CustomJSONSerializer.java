package br.com.caelum.support;

import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.interceptor.TypeNameExtractor;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.serialization.ProxyInitializer;
import br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerialization;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

@Component
public class CustomJSONSerializer extends XStreamJSONSerialization {
	private AnnotatedXStreamClasses classes;

	public CustomJSONSerializer(HttpServletResponse response,
			TypeNameExtractor extractor, ProxyInitializer initializer, AnnotatedXStreamClasses classes) {
		
		super(response, extractor, initializer);
		this.classes = classes;
	}
	
	@Override
	protected XStream getXStream() {
		XStream xStream = new XStream(new JettisonMappedXmlDriver());
		xStream.processAnnotations(classes.getTypes());
		return xStream;
	}
}
