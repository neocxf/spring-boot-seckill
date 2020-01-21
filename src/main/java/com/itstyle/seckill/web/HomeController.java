package com.itstyle.seckill.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/{id}")
	public String home(@PathVariable(value = "id") String id)
	{
		System.out.println("invoking home controller of id: " + id);
		return id;
	}
}
