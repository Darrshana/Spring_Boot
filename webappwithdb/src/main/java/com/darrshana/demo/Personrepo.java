package com.darrshana.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Personrepo extends CrudRepository<Person,Integer> {
	
	List<Person> findByPname(String pname);

}
