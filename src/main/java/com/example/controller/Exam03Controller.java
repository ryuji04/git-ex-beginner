package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(String price1,String price2,String price3) {
		int sum=Integer.valueOf(price1)+Integer.valueOf(price2)+Integer.valueOf(price3);
		int tax=sum/10;
		int result=sum+tax;
		
		return "exam03-result";
	}
}
