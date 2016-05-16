package com.sightseekerstudio.example.javaee.jaxrs.resource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author master
 */
public class GenericJsonBeanConverter {

    private static final Logger LOG = Logger.getLogger(GenericJsonBeanConverter.class.getName());

    public <T> List<T> getObjectList(Class<T> clazz) {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(clazz.getName() + ".json");
        ObjectMapper mapper = new ObjectMapper();
        List<T> objects = null;
        try {
            objects = mapper.readValue(is, new TypeReference<List<T>>() {});
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return objects;
    }
    
    public <T> Map<Integer, T> getObjectMap(Class<T> clazz) {
        List<T> list = getObjectList(clazz);
        Map<Integer, T> map = new HashMap<>();
        for (T obj : list) {
            try {
                Field field = clazz.getField("id");
                map.put((Integer) field.get(obj), obj);
            } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                LOG.log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }
    
    private <T> InputStream getInputStream(Class<T> clazz) {
        return this.getClass().getClassLoader().getResourceAsStream(clazz.getName() + ".json");
    }
}
