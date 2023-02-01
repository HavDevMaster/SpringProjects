package com.zoo.biz.dao;

import java.util.List;
import com.zoo.biz.entity.Staff;

public interface ZooBizDao {

  List<Staff> fetchStaff(String firstName, String lastName);

}
