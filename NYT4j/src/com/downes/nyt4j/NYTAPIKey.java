package com.downes.nyt4j;

public class NYTAPIKey {

  private String key;

  public NYTAPIKey(String key) {
    this.key = key;
  }

  public NYTAPIKey(NYTAPIKey key) {
    this.key = key.getKey();
  }

  public String getKey() {
    return key;
  }

}
