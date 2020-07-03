package org.studyeasy.showroom.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	@GET
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands!";
	}

	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String postBrands() {
		return "Add a new brand";
	}
	
	@PUT
	@Path("/brands/{brandName}/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String putBrands(@PathParam("brandName")String brandName, @PathParam("brandId")int brandId) {
		return "update brand info with ID  " + brandName + " " + brandId;
	}
	
	@DELETE
	@Path("/brands/{brandName}/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteBrands(@PathParam("brandname") String brandName, @PathParam("brandId")int brandId) {
		return "delete brand from db with ID " + brandName + " " + brandId;
	}
}
