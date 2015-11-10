package org.sajid.ali.counters.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sajid.ali.counters.Model.Counter;
import org.sajid.ali.counters.Service.CounterService;

@Path("/counters")
@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
@Produces(value={MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
public class CountersResource {

	CounterService counterService =new CounterService();
	
	
	//To get the list of all counter
	@GET	
	public List<Counter> getCounters(){
		
		return counterService.getAllCounters();
	}
	
	//To get a specific counter
	@GET
	@Path("/{counterName}")
	//@Produces(MediaType.APPLICATION_JSON)
	
	
	public Counter getCounter(@PathParam("counterName") String counterName){
		
		return counterService.getCounter(counterName);
	}
	//to add a new counter
	@POST
	public Counter addCounter(Counter counter){
		return counterService.addCounter(counter);
		
	}
	//To update a counter by name
	@PUT
	@Path("/{counterName}")	
	public Counter updateCounter(@PathParam("counterName") String counterName){
		
		Counter counter=new Counter();
		counter.setCounterName(counterName);
		return counterService.updateCounter(counter);
		
	}
}
