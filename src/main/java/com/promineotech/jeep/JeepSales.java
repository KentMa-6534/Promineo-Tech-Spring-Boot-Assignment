/**
 * 
 */
package com.promineotech.jeep;

/**
 * @author Kent Ma
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class JeepSales {
  public static void main(String[] args) {
    SpringApplication.run(JeepSales.class, args);
  }

}
