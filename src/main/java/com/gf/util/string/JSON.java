package com.gf.util.string;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public final class JSON {
	private static final ObjectMapper mapper = new ObjectMapper();
	private static final ObjectMapper prettyMapper = new ObjectMapper();
	
	static{
		prettyMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}
	
	public static final String toJson(final Object obj){
		try {
			return mapper.writeValueAsString(obj);
		} catch (final JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static final String toPrettyJson(final Object obj){
		try {
			return prettyMapper.writeValueAsString(obj);
		} catch (final JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static final <T> T fromJson(final String json, final Class<T> valueType){
		try {
			return mapper.readValue(json, valueType);
		} catch (final JsonParseException e) {
			throw new RuntimeException(e);
		} catch (final JsonMappingException e) {
			throw new RuntimeException(e);
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}
}
