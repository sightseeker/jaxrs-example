package com.sightseekerstudio.example.javaee.jaxrs.resource;

import com.sightseekerstudio.example.javaee.jaxrs.model.ServiceOrder;
import com.sightseekerstudio.example.javaee.jaxrs.model.User;
import com.sightseekerstudio.example.javaee.jaxrs.service.UserService;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author master
 */
@Path("users")
@ApplicationScoped
public class UsersResource {

    @Inject
    private UserService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        Map<Integer, User> users = service.getUsers();
        return Response.ok(users.values()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerUser(@Valid User user) {
        service.register(user);
        return Response.ok(user).build();
    }
    
    @Path("{id}/serviceOrder")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerServiceOrder(@PathParam("id") Integer id, @Valid ServiceOrder order) {
        service.getUsers().get(id).getServiceOrders().add(order);
        return Response.ok(order).build();
    }
}
