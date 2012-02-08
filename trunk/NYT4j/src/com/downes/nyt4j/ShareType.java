package com.downes.nyt4j;

public enum ShareType {

  DIGG("digg"), EMAIL("email"), FACEBOOK("facebook"), MIXX("mixx"), MYSPACE("myspace"), PERMALINK(
      "permalink"), TIMESPEOPLE("timespeople"), TWITTER("twitter"), YAHOOBUZZ("yahoobuzz");

  String name;

  ShareType(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

}
