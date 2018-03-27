package com.avaloq.ledger.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "buc")
public class Config {

  private String test_url;
  private String voucher_posting_url;

  public String getTest_url() {
    return test_url;
  }

  public void setTest_url(String test_url) {
    this.test_url = test_url;
  }

  public String getVoucher_posting_url() {
    return voucher_posting_url;
  }

  public void setVoucher_posting_url(String voucher_posting_url) {
    this.voucher_posting_url = voucher_posting_url;
  }
}
