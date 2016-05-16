package com.sightseekerstudio.example.javaee.jaxrs.resource;

import com.sightseekerstudio.example.javaee.jaxrs.model.User;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 *
 * @author master
 */
public class GenericJsonBeanConverterTest {

    private static final Logger LOG = Logger.getLogger(GenericJsonBeanConverterTest.class.getName());

    @Test
    public void getObjectListTest() throws IOException {
        List<User> users = new GenericJsonBeanConverter().getObjectList(User.class);
        assertEquals(users.size(), 2);
    }

}
