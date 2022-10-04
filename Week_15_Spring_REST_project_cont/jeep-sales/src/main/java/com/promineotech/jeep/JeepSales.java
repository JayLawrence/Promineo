package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;


//do we need to add a component scan (marker?) see Week 14 video 02 "componentscan issues and lombok coding around 5:00)
//might need to add this on the line below: (scanBasePackages = {"com.promineotech"})
//note - I went ahead and did this and also added the 'ComponentScanMarker.java' interface to the com.promineotech package.
@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class JeepSales {

  public static void main(String[] args) {
    SpringApplication.run(JeepSales.class, args);
   

  }

}
