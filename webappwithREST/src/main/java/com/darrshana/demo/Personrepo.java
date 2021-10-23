package com.darrshana.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface Personrepo extends JpaRepository<Person,Integer> {
	
	List<Person> findByPname(String pname);

}
