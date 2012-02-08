package com.downes.nyt4j;

public enum Section {

  AllSections("all-sections");

  String name;

  Section(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

}
