package com.conztanz.persistence.services.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.conztanz.persistence.services.ISBR_14MessageService;


@Named
public class EntitiesServiceRest {

	@Inject
	private ISBR_14MessageService sBR_14MessageService;


	
    @POST
    @Consumes({"application/json"})
    @Produces({ "application/json"})
    public Response addMessage(ParametrableRequestContent parametrableRequestContent) {
    	System.out.println("shouldFail :"+parametrableRequestContent.isShouldFail());
    	try {			
    		sBR_14MessageService.insertMessage(parametrableRequestContent.isShouldFail());
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return Response.ok().build();
//        URI taskURI = uri.getRequestUriBuilder().path(TaskServiceRest.class, "getTask").build(task.getId());
//        return Response.created(taskURI).build();
    }
    
    
    @GET
    @Produces({ "text/plain" })
	public int getTotalCount() {
    	System.out.println("## sBR_14MessageService.getTotalCount() : " + sBR_14MessageService.getTotalCount());
    	return sBR_14MessageService.getTotalCount();
	}
}
