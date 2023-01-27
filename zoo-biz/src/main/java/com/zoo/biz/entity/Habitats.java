package com.zoo.biz.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Habitats {
  private Long habitatPK;
  private String habitatId;
  private String habitatName;
}
