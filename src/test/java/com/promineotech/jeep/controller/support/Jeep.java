package com.promineotech.jeep.controller.support;

import java.math.BigDecimal;
import com.promineotech.jeep.entity.JeepModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
  private Long modelPK;
  private JeepModel modelId;
  private String trimlevel;
  private int numDoors;
  private int wheelSize;
  private BigDecimal basePrice;
}
