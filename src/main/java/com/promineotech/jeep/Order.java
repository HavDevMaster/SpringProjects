package com.promineotech.jeep;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import lombok.Data;

@Data
public class Order {
  private Long orderPK;
  private Customer customer;
  private Jeep model;
  private Color color;
  private Engine engine;
  private Tire tire;
  private List<Option> options;
  }

