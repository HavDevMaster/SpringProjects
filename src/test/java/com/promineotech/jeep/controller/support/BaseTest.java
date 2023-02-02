package com.promineotech.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import lombok.Getter;

public class BaseTest {
@LocalServerPort
private int serverport;

@Autowired
@Getter
protected TestRestTemplate restTemplate;


/**
 * 
 * @return
 */
protected String getBaseUriForJeeps() {
  return String.format("http://localhost:%d/jeeps", serverport);
}
/*
 * 
 */

protected String getBaseUriForOrders() {
  return String.format("http://localhost:%d/orders", serverport);
}
}
