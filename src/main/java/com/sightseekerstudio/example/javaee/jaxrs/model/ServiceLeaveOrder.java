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
public class ServiceLeaveOrder {
    private Integer id;
    private ServiceOrder serviceOrder;
}
