package com.promineotech.jeep;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Option {
  private Long optionPK;
  private String optionId;
  private OptionType category;
  private String name;
  private BigDecimal price;
  
  
  
  
  
  
}
