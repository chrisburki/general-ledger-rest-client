package com.avaloq.ledger.client.controller;

import com.avaloq.ledger.client.config.Config;
import com.avaloq.ledger.client.model.PostingMap;
import com.avaloq.ledger.client.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ledger-client")
public class ClientResource {

  @Autowired
  Config config;

  @GetMapping("/quote")
  public Quote quote () {
    RestTemplateBuilder builder = new RestTemplateBuilder();
    RestTemplate restTemplate = builder.build();

    Quote quote = restTemplate.getForObject(
        config.getTest_url(), Quote.class);

    return quote;
  }

  @GetMapping("/posting-rule")
  public PostingMap postingMap () {
    RestTemplateBuilder builder = new RestTemplateBuilder();
    RestTemplate restTemplate = builder.build();

    PostingMap postingMap = restTemplate.getForObject(
        config.getVoucher_posting_url(), PostingMap.class);

    return postingMap;
  }

}
