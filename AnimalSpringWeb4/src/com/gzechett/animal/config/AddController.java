package com.gzechett.animal.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gzechett.animal.base.Animal;
import com.gzechett.animal.base.AnimalService;
import com.gzechett.animal.base.Elephant;
import com.gzechett.animal.base.Lion;
import com.gzechett.animal.base.Monkey;
import com.gzechett.animal.base.Tiger;

@Controller
public class AddController 
{
	@Autowired
	private AnimalService service;
	
	@RequestMapping("/newLion")
	public String newLionForm(Map<String, Object> model)
	{
		model.put("animal", new Lion());
		return "new_lion";
	}
	
	@RequestMapping(value = "/saveLion", method = RequestMethod.POST)
	public String saveLion(@ModelAttribute("animal") Lion animal)
	{
		service.save(animal);
		return "redirect:/";
	}
	
	@RequestMapping("/newElephant")
	public String newElephantForm(Map<String, Object> model)
	{
		model.put("animal", new Elephant());
		return "new_elephant";
	}
	
	@RequestMapping(value = "/saveElephant", method = RequestMethod.POST)
	public String saveElephant(@ModelAttribute("animal") Elephant animal)
	{
		service.save(animal);
		return "redirect:/";
	}
	
	@RequestMapping("/newMonkey")
	public String newMonkeyForm(Map<String, Object> model)
	{
		model.put("animal", new Monkey());
		return "new_monkey";
	}
	
	@RequestMapping(value = "/saveMonkey", method = RequestMethod.POST)
	public String saveMonkey(@ModelAttribute("animal") Monkey animal)
	{
		service.save(animal);
		return "redirect:/";
	}
	
	@RequestMapping("/newTiger")
	public String newTigerForm(Map<String, Object> model)
	{
		model.put("animal", new Tiger());
		return "new_tiger";
	}
	
	@RequestMapping(value = "/saveTiger", method = RequestMethod.POST)
	public String saveTiger(@ModelAttribute("animal") Tiger animal)
	{
		service.save(animal);
		return "redirect:/";
	}
}
