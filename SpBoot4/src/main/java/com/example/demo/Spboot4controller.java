package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Spboot4controller {
	
	@Autowired
	NormalCar nc;
	
	@RequestMapping(value = "/", method =RequestMethod.GET)
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("index");
		nc.setVelocity("34km/h");
		nc.setDistance("3.6km");
		nc.run();
		nc.stop();
		return mv;
	}
}
