package com.conztanz.demo.rest.sbr;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.servicemix.examples.camel.rest.model.Person;

@Path("/services/")
public class RestService_SBR_14_1_XML_EDI {

	@POST
	@Path("/ConnectMessageListener_SBR14_1_EDIService")
	public Response convert(Object sbr) {
		System.out.println(sbr);
		return null;
	}

}

/*
 * 
 * 
 * package org.apache.servicemix.examples.camel.rest;
 * 
 * import org.apache.servicemix.examples.camel.rest.model.Person;
 * 
 * import javax.ws.rs.*; import javax.ws.rs.core.Response;
 * 
 * // This could be an interface if CAMEL-6014 is fixed.
 * 
 * @Path("/personservice/") public class PersonService {
 * 
 * @GET
 * 
 * @Path("/person/get/{id}/")
 * 
 * @Produces("application/xml") public Person getPerson(@PathParam("id") String
 * id) { return null; }
 * 
 * @POST
 * 
 * @Path("/person/post") public Response putPerson(Person person) { return null;
 * }
 * 
 * @DELETE
 * 
 * @Path("/person/delete/{id}") public void deletePerson(@PathParam("id") String
 * id) { } }
 */
