package com.gf.util.string;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class StartArgs {
	private final ConcurrentHashMap<String, List<String>> cache;
	private final String[] args;
	private final char splitOn;
	
	public StartArgs(final String[] args, final char splitOn){
		this.cache = new ConcurrentHashMap<String, List<String>>();
		this.args = args;
		this.splitOn = splitOn;
	}
	
	public StartArgs(final String[] args){
		this(args, '=');
	}
	
	public final boolean getBoolean(final String key){
		final String val = getOneArg(key);
		if (val == null)
			throw new RuntimeException("arg '" + key + "' not found.");
		
		return Boolean.parseBoolean(val);
	}
	
	public final double getDouble(final String key){
		final String val = getOneArg(key);
		if (val == null)
			throw new RuntimeException("arg '" + key + "' not found.");
		
		return Double.parseDouble(val);
	}
	
	public final int getInt(final String key){
		final String val = getOneArg(key);
		if (val == null)
			throw new RuntimeException("arg '" + key + "' not found.");
		
		return Integer.parseInt(val);
	}
	
	public final List<String> setOneArg(final String key, final String val){
		final List<String> n = new ArrayList<String>(1);
		n.add(val);
		return setArgs(key, n);
	}
	
	public final List<String> setArgs(final String key, final List<String> arg){
		return cache.put(key.toLowerCase(), arg);
	}
	
	public final List<String> getArgs(final String key){
		final String l_key = key.toLowerCase();
		List<String> cached = cache.get(l_key);
		if (cached != null)
			return cached;
		
		cached = new ArrayList<String>();
		cache.put(l_key, cached);
		
		for(final String val:args){
			final String[] splitted = Splitter.split(val, splitOn);
			switch(splitted.length){
			case 2:
				if (l_key.equalsIgnoreCase(splitted[0])){
					cached.add(splitted[1]);
				}
				break;
			}
		}
		return cached;
	}
	
	public final String getOneArg(final String key){
		final List<String> result = getArgs(key);
		if (result.size() > 0)
			return result.get(0);
		
		return null;
	}
	
	public final String get(final int index){
		return args[index];
	}
	
	public final void set(final int index, final String value){
		args[index] = value;
	}
	
	public final int getInt(final int index){
		return Integer.parseInt(get(index));
	}
	
	public final double getDouble(final int index){
		return Double.parseDouble(get(index));
	}
	
	public final boolean getBoolean(final int index){
		return Boolean.parseBoolean(get(index));
	}
	
	public final void set(final int index, final double value){
		set(index, Double.toString(value));
	}
	
	public final void set(final int index, final int value){
		set(index, Integer.toString(value));
	}
	
	public final void set(final int index, final boolean value){
		set(index, Boolean.toString(value));
	}
	
	public final int size(){
		return args.length;
	}
}
