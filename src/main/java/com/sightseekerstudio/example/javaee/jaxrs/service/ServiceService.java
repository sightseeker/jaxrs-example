package com.sightseekerstudio.example.javaee.jaxrs.service;

import com.sightseekerstudio.example.javaee.jaxrs.model.Service;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import lombok.Getter;

/**
 *
 * @author master
 */
@ApplicationScoped
public class ServiceService {
    @Getter
    private List<Service> service = new ArrayList<>();
    
    @PostConstruct
    private void postConstruct() {
        
    }
}
