/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Bill {
    private Integer id;
    private Integer fee;
}
