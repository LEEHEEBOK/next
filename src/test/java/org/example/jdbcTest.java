package org.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/web/WEB-INF/applicationContext.xml")
public class jdbcTest {


    @Autowired
    DataSource dataSource;

    @Test
    public void connectionTest() throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("connection");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
