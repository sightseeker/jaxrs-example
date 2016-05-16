package com.sightseekerstudio.example.javaee.jaxrs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author master
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrder {
    private Integer id;
    private Service service;
}
