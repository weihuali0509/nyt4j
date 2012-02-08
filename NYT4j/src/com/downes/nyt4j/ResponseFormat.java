package com.downes.nyt4j;

public enum ResponseFormat {

  JSON(".json"), XML(".xml"), SPHP(".sphp");

  String extension;

  ResponseFormat(String extension) {
    this.extension = extension;
  }

  public String toString() {
    return extension;
  }

}
