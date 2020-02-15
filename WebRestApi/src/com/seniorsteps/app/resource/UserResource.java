package com.seniorsteps.app.resource;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.seniorsteps.app.data.DummyDB;
import com.seniorsteps.app.model.User;
import com.seniorsteps.app.services.UserService;

@Path("/userResource")
public class UserResource {

	UserService userService = new UserService();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<User> list(){
		return userService.list();
	}
	@GET
	@Path("/user/{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public User getDetails(@PathParam("userId") int userId){
		return userService.get(userId);
	}
	@POST
	@Path("addUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User add() {
		User user = userService.createUser();
		return userService.add(user);
	}
}
