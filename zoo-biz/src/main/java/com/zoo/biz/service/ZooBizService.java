package com.zoo.biz.service;

import java.util.List;
import com.zoo.biz.entity.Staff;

public interface ZooBizService {

  List<Staff> fetchStaff(String firstName, String lastName);

}
