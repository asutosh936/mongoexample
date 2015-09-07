package com.mongo.dao;

import com.mongo.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ashu936 on 9/7/2015.
 */
public class PersonDaoImplTest {

    public static void main(String[] args) {
        try{
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
            PersonDao personDao = (PersonDao)ctx.getBean("personDao");

            Person person = new Person();
            person.setDob("06-01-1981");
            person.setFirstName("Jonny");
            person.setLastName("Walker");

            personDao.create(person);
            System.out.println("person.getId() = " + person.getId());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
