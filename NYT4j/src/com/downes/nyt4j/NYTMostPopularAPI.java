package com.downes.nyt4j;

public class NYTMostPopularAPI implements NYTAPI {

  NYTAPIKey key;

  public NYTMostPopularAPI(NYTAPIKey key) {
    this.key = key;
  }

  public NYTMostPopularAPI(String key) {
    this.key = new NYTAPIKey(key);
  }

  public Response query() {
    return null;
  }

}
