package com.bkex.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BkexAccountApplication {

  public static void main(String[] args) {
    SpringApplication.run(BkexAccountApplication.class, args);
  }
}
