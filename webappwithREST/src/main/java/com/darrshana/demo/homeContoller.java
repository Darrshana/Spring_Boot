package com.darrshana.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class homeContoller {
	
	@Autowired
	Personrepo repo;
	@RequestMapping("home")
	public String Home() {
		return "home.jsp";
	}
	
	@GetMapping("/addPerson")
	public String addPerson(Person person) {
		repo.save(person);
		return "home.jsp";
	}
	@PostMapping("/person")
	public Person addPer(Person person) {
		repo.save(person);
		return person;
	}
	@PutMapping("/person")
	public Person updateOrAddPer(Person person) {
		repo.save(person);
		return person;
	}

	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView("showperson.jsp");
		Person person = repo.findById(pid).orElse(null);
		mv.addObject(person);
		System.out.println(repo.findByPname("darsh"));
		return mv;
	}
	
	@RequestMapping("/persons")

	public List<Person> getPersons() {
		return repo.findAll();
}
	@RequestMapping("/person/{pid}")
	
	public Optional<Person> getPer(@PathVariable int pid) {
		return repo.findById(pid);
}
@DeleteMapping("/person/{pid}")
	public String deletePerson(@PathVariable int pid) {
	Person p = repo.getOne(pid);
	repo.delete(p);
	return "deleted";
}

}
