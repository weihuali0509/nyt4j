package com.downes.nyt4j;

public enum Rank {

  NEWEST("newest"), OLDEST("oldest"), CLOSEEST("closest");

  String text;

  Rank(String text) {
    this.text = text;
  }

  public String toString() {
    return text;
  }

}
