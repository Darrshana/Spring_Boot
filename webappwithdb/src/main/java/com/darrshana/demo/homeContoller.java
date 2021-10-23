package com.darrshana.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeContoller {
	
	@Autowired
	Personrepo repo;
	@RequestMapping("home")
	public String Home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person person) {
		repo.save(person);
		return "home.jsp";
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView("showperson.jsp");
		Person person = repo.findById(pid).orElse(null);
		mv.addObject(person);
		System.out.println(repo.findByPname("darsh"));
		return mv;
	}

}
