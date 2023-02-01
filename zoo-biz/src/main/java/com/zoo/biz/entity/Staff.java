package com.zoo.biz.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
  private Long staffPK;
  private String staffId;
  private String firstName;
  private String lastName;
  private String phone;


}
