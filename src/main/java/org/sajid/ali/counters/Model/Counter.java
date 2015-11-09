package org.sajid.ali.counters.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Counter {
	
	private String CounterName;
	private int counter;
	
	public Counter(){
		
	}
	
	public Counter(String counterName, int counter) {
		super();
		CounterName = counterName;
		this.counter = counter;
	}
	

	public String getCounterName() {
		return CounterName;
	}
	public void setCounterName(String counterName) {
		CounterName = counterName;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	

}
