package com.darrshana.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="persons",path="persons")
public interface PersonRepo extends JpaRepository<Person,Integer>{

}
