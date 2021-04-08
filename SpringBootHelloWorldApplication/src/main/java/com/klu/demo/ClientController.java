package com.klu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController 
{
  @GetMapping(value="/demo")
  public String display()
  {
	  return "Hello World";
	  
  }
  @GetMapping(value="/demo1")
  public String display1()
  {
	  return "Go Corona";
  }
  @GetMapping(value="/")
  public String display2()
  {
	  return "Welcome to Spring Boot Application";
  }
}
