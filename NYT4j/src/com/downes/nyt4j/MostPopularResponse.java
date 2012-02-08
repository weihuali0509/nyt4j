package com.downes.nyt4j;

public interface MostPopularResponse extends Response {

  String getStatus();

  boolean isOK();

  int getNumResults();

  String getCopywrite();

}
