package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;

@Slf4j    //a lombok annotation for the logger (week 14, video 1)

@RestController
public class DefaultJeepSalesController implements JeepSalesController {

  @Autowired
  private JeepSalesService jeepSalesService;
  
  @Override
  public List<Jeep> fetchJeeps(String model, String trim) {
    log.info("model={}, trim={}", model, trim);     //logging info (records HTTP request parameters to the console) week 14, video 1
   
    
    return jeepSalesService.fetchJeeps(model, trim);
  }

}
