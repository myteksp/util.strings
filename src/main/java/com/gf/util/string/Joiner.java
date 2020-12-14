package com.gf.util.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class Joiner {
	public static final String join(final Object[] coll, final String on){
		final ArrayList<Object> list = new ArrayList<Object>(coll.length);
		list.addAll(Arrays.asList(coll));
		return join(list, on);
	}

	
	public static final String join(final Collection<?> coll, final String on){
		final int len = coll.size();
		final List<String> strs = toStrs(coll);
		switch(len){
		case 0:
			return "";
		case 1:
			return strs.get(0);
		}
		final int lastIndex = len - 1;
		final StringBuilder sb = new StringBuilder(Math.max(20, countLength(strs) + (len * on.length())));
		for (int i = 0; i < lastIndex; i++) 
			sb.append(strs.get(i)).append(on);
		
		sb.append(strs.get(lastIndex));
		
		return sb.toString();
	}
	
	public static interface GlueFunction{
		String start(final String after);
		String apply(final String before, final String after, final int index);
		String end(final String before, final int index);
	}
	
	public static final String join(final Collection<?> coll, final GlueFunction glue){
		final int len = coll.size();
		final List<String> strs = toStrs(coll);
		switch(len){
		case 0:
			return glue.start(null);
		case 1:
			return glue.start(strs.get(0)) + strs.get(0) + glue.end(strs.get(0), 0);
		case 2:
			return glue.start(strs.get(0)) + strs.get(0) + glue.apply(strs.get(0), strs.get(1), 0) + strs.get(1) + glue.end(strs.get(1), 1);
		}
		final int lastIndex = len - 1;
		final StringBuilder sb = new StringBuilder(Math.max(20, countLength(strs) + (len * 20)));
		sb.append(glue.start(strs.get(0)));
		for (int i = 0; i < lastIndex; i++) {
			sb.append(strs.get(i)).append(glue.apply(strs.get(i), strs.get(i+1), i));
		}
		sb.append(strs.get(lastIndex)).append(glue.end(strs.get(lastIndex), lastIndex));
		return sb.toString();
	}
	
	private static final int countLength(final List<String> coll){
		int result = 0;
		for(final String obj : coll)
			result += obj.length();
		
		return result;
	}
	
	
	private static final List<String> toStrs(final Collection<?> coll){
		final ArrayList<String> res = new ArrayList<String>(coll.size());
		for(final Object o : coll){
			if (o == null)
				res.add("null");
			else
				res.add(o.toString());
		}
		return res;
	}
	
}
