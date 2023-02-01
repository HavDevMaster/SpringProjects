package com.zoo.biz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.zoo.biz.entity.Staff;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class DefaultZooBizDao implements ZooBizDao {

  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  
  @Override
  public List<Staff> fetchStaff(String firstName, String lastName) {
    log.debug("DAO: firstName={}, lastName={}", firstName, lastName);
    
    String sql = ""
        + "SELECT * "
        + "FROM firstName"
        +"WHERE firstName = :firstName AND lastName = :lastName";
    
    Map<String, Object> params = new HashMap<>();
    params.put("firstName", firstName);
    params.put("lastName", lastName);
    
    return jdbcTemplate.query(sql, params, 
        new RowMapper<>() {

          @Override
          public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
         // @formatter:off
            return Staff.builder()
               .firstName(rs.getString("firstName"))
                .lastName(rs.getString("lastName"))
                .phone(rs.getString("phone"))
                .staffId(rs.getString("staffId"))
                .build();
            //formatter:on
          }});
  }

}
