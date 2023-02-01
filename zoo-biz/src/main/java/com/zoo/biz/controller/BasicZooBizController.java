package com.zoo.biz.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.zoo.biz.entity.Staff;
import com.zoo.biz.service.ZooBizService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicZooBizController implements zooBizController {
  
  @Autowired
  private ZooBizService zooBizService;
  
  
  @Override
  public List<Staff> fetchStaff(String firstName, String lastName) {
    log.info("firstName={},LastName={},", firstName, lastName);
      return zooBizService.fetchStaff(firstName, lastName);

}
/*
  @Override
  public List<Staff> fetchAllEmployees() {
    // TODO Auto-generated method stub
    return null;
  }
*/
  @Override
  public Staff createStaff(String firstName, String lastName, String phone) {
    // TODO Auto-generated method stub
    return null;
  }
/*
  @Override
  public void deleteEmployee(int deleteId) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Staff updateStaff(int employeePK, Staff updatedStaff) {
    // TODO Auto-generated method stub
    return null;
  }
  
*/

  @Override
  public List<Staff> fetchAllEmployees() {
    // TODO Auto-generated method stub
    return null;
  }

/*
  @Override
  public Staff createStaff1(String firstName, String lastName, String phone) {
    // TODO Auto-generated method stub
    return null;
  }
*/

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