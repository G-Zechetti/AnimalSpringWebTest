package com.gzechett.animal.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gzechett.animal.base.Animal;
import com.gzechett.animal.base.AnimalService;



@Controller
public class CommonController 
{
	@Autowired
	private AnimalService animalService;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView("index");
		
		List<Animal> listAnimal = animalService.listAll();
		
		mav.addObject("listAnimal", listAnimal);
		
		return mav;
	}
	
	//Edit
	@RequestMapping("editAnimal")
	public ModelAndView editAnimalForm(@RequestParam String name)
	{
		ModelAndView mav = new ModelAndView("edit_animal");
		Animal animal = animalService.get(name);
		mav.addObject("animal", animal);
		return mav;
	}
	
	
	
	//Delete
	@RequestMapping("/deleteAnimal")
	public String deleteAnimal(@RequestParam String name) 
	{
		animalService.delete(name);
		
		return "redirect:/";
	}
	
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword)
	{
		ModelAndView mav = new ModelAndView("search");
		List<Animal> result = animalService.search(keyword);
		mav.addObject("result", result);
		return mav;
	}
}
