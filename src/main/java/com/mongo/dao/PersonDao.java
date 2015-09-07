package com.mongo.dao;

import com.mongo.model.Person;

/**
 * Created by ashu936 on 9/7/2015.
 */
public interface PersonDao {

    public void create(Person person);
    public void update(Person person);
    public void delete(Person person);
    public Person findById(String id);
}
