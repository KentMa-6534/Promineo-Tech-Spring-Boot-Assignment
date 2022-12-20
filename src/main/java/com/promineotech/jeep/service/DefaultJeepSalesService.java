/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Kent Ma
 *
 */
@Slf4j
@Service
public class DefaultJeepSalesService implements JeepSalesService {

  @Override
  public List<Jeep> fetchJeeps(String model, String trim) {
    // TODO Auto-generated method stub
    log.info("The fetchJeeps method was called with model={} and trim ={}",model,trim);
    return null;
  }

}
