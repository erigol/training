package com.capgemini.training.controllers;

import com.capgemini.training.services.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrainingController {

  @Autowired TrainingService service;

  @GetMapping(path = "/hello")
  public String getHello() {
    return service.getHello();
  }
}
