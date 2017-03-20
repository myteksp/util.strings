package com.gf.util.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class Joiner {
	public static final String join(final Object[] coll, final String on){
		final int len = coll.length;
		final ArrayList<Object> list = new ArrayList<Object>(len);
		for (int i = 0; i < len; i++) 
			list.add(coll[i]);
		
		return join(list, on);
	}
	
	public static final String join(final Collection<Object> coll, final String on){
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
	
	private static final int countLength(final List<String> coll){
		int result = 0;
		for(final String obj : coll)
			result += obj.length();
		
		return result;
	}
	
	
	private static final List<String> toStrs(final Collection<Object> coll){
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
