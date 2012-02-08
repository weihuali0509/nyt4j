package com.downes.nyt4j;

public enum TimePeriod {
  ONE(1), SEVEN(7), THRITY(30);

  int numDays;

  TimePeriod(int num) {
    numDays = num;
  }

  public String toString() {
    return String.valueOf(numDays);
  }
}