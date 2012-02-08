package com.downes.nyt4j;

public enum ResourceType {

  MOSTEMAILED("mostemailed"), MOSTSHARED("mostshared"), MOSTVIEWED("mostviewed");

  String typeName;

  ResourceType(String typeName) {
    this.typeName = typeName;
  }

  public String toString() {
    return typeName;
  }
}