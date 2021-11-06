package com.darrshana.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {

	
		@GetMapping({"/","/hello"})
		public String getName(@RequestParam(defaultValue="World") String name,Model m) {
		m.addAttribute("name",name);
		return "hello";
		}

	

}
