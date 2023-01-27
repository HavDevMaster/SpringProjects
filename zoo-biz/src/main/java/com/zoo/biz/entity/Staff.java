package com.zoo.biz.entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Staff {
  private Long staffPK;
  private String staffId;
  private String firstName;
  private String lastName;
  private String phone;


}
