package com.mahendra.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mahendra.dao.PersonDAO;
import com.mahendra.dao.PersonDAOImpl;
import com.mahendra.entities.Person;
import com.mahendra.services.PersonService;

@Controller
@RequestMapping("/")
public class PersonController {

	private static Logger logger = Logger.getLogger(PersonController.class.getName());
	
	@Autowired
	private PersonService service;

	public void setService(PersonService service) {
		this.service = service;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String showForm(Model model) {
		logger.info("Data entry form for new person launched");
		Person person = new Person();
		model.addAttribute("person",person);
		return "form";
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String showForm(@ModelAttribute Person person,Model model) {
		logger.info("Storing personal details for "+person.getName());
		Long id = service.save(person);
		if(id!=null) {
			model.addAttribute("msg", "New person added !");
		}
		else {
			model.addAttribute("msg", "Could not add new record !, try again later.");
		}
		return "redirect:/";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model) {
		logger.info("Loading home page...");
		List<Person> people = service.getAll();
		model.addAttribute("people",people );
		return "home";
	}
	
}
