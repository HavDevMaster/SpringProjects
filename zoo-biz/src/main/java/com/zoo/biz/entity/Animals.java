package com.zoo.biz.entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder


public class Animals {

    private Long animalPK;
    private String animalId;
    private String Species;
    private String habitatId;
  }

