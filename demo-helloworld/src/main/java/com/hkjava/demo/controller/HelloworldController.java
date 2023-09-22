package com.hkjava.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1") // "/"
public interface HelloworldController {

  @GetMapping(value = "/hello")
  String hello();

}
