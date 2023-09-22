package com.vtxlab.demo.helloworld.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")
public class HelloworldController {

  @GetMapping(value = "/helloworld")
  public String helloworld() {
    return "Hello World! This is DJ Leon in the house!!";
  }
}
