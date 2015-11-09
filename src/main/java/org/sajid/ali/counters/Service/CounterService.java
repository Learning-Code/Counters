package org.sajid.ali.counters.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sajid.ali.counters.Database.DatabaseClass;
import org.sajid.ali.counters.Model.Counter;


public class CounterService {
	
	private static Map<String,Counter> counters=DatabaseClass.getCounters();

	
	public CounterService(){
		//This will add a sample named counter with value 0 in the memory
		//counters.put("Example",new Counter("Example",0));
	}
	
	//returns the list of all counter
	public List<Counter> getAllCounters(){
		
		return new ArrayList<Counter>(counters.values());
	}
	
	//returns the specific counter
	public Counter getCounter(String counterName){
		
		return counters.get(counterName);
	}
	
	//to add a new counter
	public Counter addCounter(Counter counter){
		counter.setCounter(1);
		counters.put(counter.getCounterName(), counter);
		return counter;
	}
	
	//to update a counter
	public Counter updateCounter(Counter counter){
		int iCounter=0;
		Counter count=new Counter();
		//If the counter does not exist before, add this and return
		if (counters.get(counter.getCounterName())==null){
			addCounter(counter);
			return counter;
		}
		count = counters.get(counter.getCounterName());
		count.getCounter();
		iCounter=count.getCounter();
		iCounter=iCounter+1;
		counter.setCounter(iCounter);
		counters.put(counter.getCounterName(), counter);
		return counter;
		
	}
	
	
}
