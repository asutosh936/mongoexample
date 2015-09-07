package com.mongo.dao;

import com.mongo.model.Person;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * Created by ashu936 on 9/7/2015.
 */
public class PersonDaoImpl implements PersonDao {

    private MongoOperations mongoOperations;

    public PersonDaoImpl(MongoOperations mongoOperations){
        this.mongoOperations = mongoOperations;
    }

    public void create(Person person) {
        this.mongoOperations.insert(person, "person");
    }

    public void update(Person person) {

    }

    public void delete(Person person) {

    }

    public Person findById(String id) {
        return null;
    }
}
