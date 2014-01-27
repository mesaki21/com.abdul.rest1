package com.abdul.rest1.status;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/*")
public class V1_Status {	
	private static final String version="00.01.00";
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p> Java Web Service</p>";
	}
	@Path("/Version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p> Version</p>"+version;
	}

}
