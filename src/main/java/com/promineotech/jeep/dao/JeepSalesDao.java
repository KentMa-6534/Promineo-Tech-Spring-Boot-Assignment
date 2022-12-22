/**
 * 
 */
package com.promineotech.jeep.dao;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

/**
 * @author Kent Ma
 *
 */
public interface JeepSalesDao {

  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
