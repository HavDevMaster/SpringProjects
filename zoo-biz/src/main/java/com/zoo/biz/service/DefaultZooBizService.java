package com.zoo.biz.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.biz.dao.ZooBizDao;
import com.zoo.biz.entity.Staff;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
class DefaultZooBizService implements ZooBizService {

  @Autowired
  private ZooBizDao zooBizDao;
  
  
  @Override
  public List<Staff> fetchStaff(String firstName, String lastName) {
    log.info("The fetchStaff method was called with firstName={} and lastName={}", firstName, lastName);
    
    return zooBizDao.fetchStaff(firstName, lastName);
  }

}
