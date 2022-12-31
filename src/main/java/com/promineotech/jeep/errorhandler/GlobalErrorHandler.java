/**
 * 
 */
package com.promineotech.jeep.errorhandler;

import java.util.Map;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Kent Ma
 *
 */
@RestControllerAdvice
public class GlobalErrorHandler {
  public Map<String, Object> handleNoSuchElementException(){
    
  }
}
