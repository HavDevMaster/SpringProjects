package com.zoo.biz.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.zoo.biz.entity.Staff;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicZooBizController implements zooBizController {
  
  @Override
  public List<Staff> fetchStaff(String firstName, String lastName) {
    log.info("firstName={},LastName={},", firstName, lastName);
      return null;
}

  @Override
  public List<Staff> fetchAllEmployees() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Staff createStaff(String firstName, String lastName, String phone) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteEmployee(int deleteId) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Staff updateStaff(int employeePK, Staff updatedStaff) {
    // TODO Auto-generated method stub
    return null;
  }
}