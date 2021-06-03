package org.example;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/web/WEB-INF/applicationContext.xml")
public class MyBatisTest {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void testSession() throws Exception {
        try (SqlSession session = sqlSessionFactory.openSession()){
            System.out.println(session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
