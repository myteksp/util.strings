package com.gf.util.string;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public final class JSON {
	private static final ObjectMapper mapper = new ObjectMapper();
	private static final ObjectMapper prettyMapper = new ObjectMapper();

	private static final ObjectMapper yaml = new ObjectMapper(new YAMLFactory());
	
	static{
		prettyMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	public static final String toYaml(final Object obj){
		try {
			return yaml.writeValueAsString(obj);
		} catch (final JsonProcessingException e) {
			throw new RuntimeException(e);
		}
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

	public static final <T> T fromYaml(final String yaml, final Class<T> valueType){
		return read(mapper, yaml, valueType);
	}
	
	public static final <T> T fromJson(final String json, final Class<T> valueType){
		return read(mapper, json, valueType);
	}

	private static final <T> T read(final ObjectMapper map, final String value, final Class<T> valueType){
		if (value == null)
			return null;

		try {
			return map.readValue(value, valueType);
		} catch (final JsonParseException e) {
			throw new RuntimeException(e);
		} catch (final JsonMappingException e) {
			throw new RuntimeException(e);
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}
}
