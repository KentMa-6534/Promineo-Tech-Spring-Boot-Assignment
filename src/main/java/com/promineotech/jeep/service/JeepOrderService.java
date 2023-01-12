/**
 * 
 */
package com.promineotech.jeep.service;

import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;

/**
 * @author Kent Ma
 *
 */
public interface JeepOrderService {

  Order createOrder(OrderRequest orderRequest);
  
}
