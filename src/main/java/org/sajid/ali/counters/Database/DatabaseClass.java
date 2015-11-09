package org.sajid.ali.counters.Database;

import java.util.HashMap;
import java.util.Map;

import org.sajid.ali.counters.Model.Counter;



public class DatabaseClass {
	
	private static Map<String,Counter> counters=new HashMap<>();
	
	public static Map<String,Counter> getCounters(){
		
		return counters;
	}
	

}
