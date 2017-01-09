package org.springframework.http.converter.json;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.Assert;

/**
 * @author Eddú Meléndez
 * @since 5.0
 */
public class YassonHttpMessageConverter extends AbstractGenericHttpMessageConverter<Object> {

	public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

	private Jsonb jsonb = JsonbBuilder.create();

	private String jsonPrefix;

	public YassonHttpMessageConverter() {
		super(MediaType.APPLICATION_JSON, new MediaType("application", "*+json"));
		this.setDefaultCharset(DEFAULT_CHARSET);
	}

	/**
	 *
	 * @param jsonb
	 */
	public void setJsonb(Jsonb jsonb) {
		Assert.notNull(jsonb, "'jsonb' is required");
		this.jsonb = jsonb;
	}

	/**
	 *
	 * @return
	 */
	public Jsonb getJsonb() {
		return this.jsonb;
	}

	/**
	 *
	 * @param jsonPrefix
	 */
	public void setJsonPrefix(String jsonPrefix) {
		this.jsonPrefix = jsonPrefix;
	}

	@Override
	public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		return null;
	}

	@Override
	protected void writeInternal(Object o, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

	}

	@Override
	protected boolean supports(Class<?> clazz) {
		throw  new UnsupportedOperationException();
	}

	@Override
	protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		return null;
	}

}
