package com.hashedin.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.model.User;
import com.hashedin.service.UserService;

@Component
@Path("/users")
public class UserResource {

	@Autowired
	private UserService	userService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<User> list() {

		// Handles GET on /tasks. Lists all the tasks we have in our system.
		return userService.findAll();
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(User user,
			@Context final HttpServletResponse response)
			throws URISyntaxException {

		// Handles POST on /tasks. Creates a new task and adds it into an
		// repository.
		userService.save(user);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response.created(new URI("/users/" + user.getId())).build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{userId}")
	public User get(@PathParam("userId") Long userId) {

		return userService.find(userId);
	}
}
