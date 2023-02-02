package com.promineotech.jeep;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Tire {

  private Long tirePK;
  private String tireId;
  private String tireSize;
  private String manufacturer;
  private BigDecimal price;
  private int warrantyMiles;
  
  
  
  
  
}
