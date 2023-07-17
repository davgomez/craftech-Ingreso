package com.craftech.ingreso.home;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class Home {
	
	@GetMapping("/{name}")
	@ResponseBody
	public String homePage(@PathVariable String name) {
		String userName = (name != null)?name:"Mundo!";
		return "Hello " + userName;
	}
	@GetMapping("/{name}/hour")
	@ResponseBody
	public ResponseEntity<Respuesta> getHour(@PathVariable String name) {
		String userName = (name != null)?name:"Mundo!";
		Date date = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		
		return ResponseEntity.ok(new Respuesta("Hello "+userName+" it's "+ calendar.get(Calendar.HOUR_OF_DAY))); 
	}
}