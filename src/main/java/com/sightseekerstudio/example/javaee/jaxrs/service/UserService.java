package com.sightseekerstudio.example.javaee.jaxrs.service;

import com.sightseekerstudio.example.javaee.jaxrs.model.User;
import com.sightseekerstudio.example.javaee.jaxrs.resource.GenericJsonBeanConverter;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import lombok.Getter;

/**
 *
 * @author master
 */
@ApplicationScoped
public class UserService {

    @Getter
    private Map<Integer, User> users;
    
    @PostConstruct
    public void postConstruct() {
        users = new GenericJsonBeanConverter().getObjectMap(User.class);
    }
    
    public void register(User user) {
        users.put(user.getId(), user);
    }
}
