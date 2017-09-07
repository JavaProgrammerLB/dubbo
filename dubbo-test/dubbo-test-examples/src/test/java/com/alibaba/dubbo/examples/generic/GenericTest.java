package com.alibaba.dubbo.examples.generic;

import com.alibaba.dubbo.examples.generic.api.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class GenericTest {

    @Test
    public void testGeneric() {
        String sep = File.separator;
        ClassPathXmlApplicationContext providerContext = new ClassPathXmlApplicationContext(GenericTest.class.getPackage().getName().replace(".", sep) + sep + "generic-provider.xml");
        providerContext.start();
        try {
            ClassPathXmlApplicationContext consumerContext = new ClassPathXmlApplicationContext(GenericTest.class.getPackage().getName().replace(".", sep) + sep + "generic-consumer.xml");
            consumerContext.start();
            try {
                IUserService userService = (IUserService) consumerContext.getBean("userservice");
                IUserService.Params params = new IUserService.Params("1");
                IUserService.User user = userService.get(params);
                assertEquals(1, user.getId());
                assertEquals("charles", user.getName());
            } finally {
                consumerContext.close();
                providerContext.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
