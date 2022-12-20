package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Jeep {
  private Long modelPK;
  private JeepModel modelId;
  private String trimLevel;
  private int numDoors;
  private int wheelSize;
  private BigDecimal basePrice;

}
/*
 CREATE TABLE models (
  model_pk int unsigned NOT NULL AUTO_INCREMENT,
  model_id enum('GRAND_CHEROKEE', 'CHEROKEE', 'COMPASS', 'RENEGADE', 'WRANGLER', 'GLADIATOR', 'WRANGLER_4XE') NOT NULL,
  trim_level varchar(40) NOT NULL,
  num_doors int NOT NULL,
  wheel_size int NOT NULL,
  base_price decimal(9, 2) NOT NULL,
  PRIMARY KEY (model_pk),
  UNIQUE KEY (model_id, trim_level, num_doors)
);
*/