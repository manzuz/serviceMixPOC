package com.conztanz.persistence.services.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;

import org.ops4j.pax.cdi.api.OsgiService;

import com.conztanz.persistence.model.SBRMessage;
import com.conztanz.persistence.services.SBR_14MessageService;
@Named
public class EntitiesServiceRest {
	@Inject @OsgiService
	private SBR_14MessageService sBR_14MessageService ;
	
	
	
	  @GET
	    public List<SBRMessage> getTasks() {
	        return sBR_14MessageService.getAll();
	    }
}
