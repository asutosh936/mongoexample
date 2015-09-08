package com.mongo.dao;

import com.mongo.model.Address;
import com.mongo.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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
            person.setFirstName("Asutosh");
            person.setLastName("Pandya");

            List<Address> addresses = new ArrayList<Address>();

            Address address = new Address();
            address.setAddressLine1("9544 Valley Ranch Pkwy");
            address.setCity("Irving");
            address.setCountry("USA");
            address.setZipcode("75063");

            addresses.add(address);

            address = new Address();
            address.setAddressLine1("9613 Valley Ranch Pkwy");
            address.setCity("Irving");
            address.setCountry("USA");
            address.setZipcode("75063");

            addresses.add(address);

            person.setAddressList(addresses);
            personDao.create(person);
            System.out.println("person.getId() = " + person.getId());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
