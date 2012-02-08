package com.downes.nyt4j;

public enum Field {

  BODY("body"), BYLINE("byline"), DATE("date"), LEAD_PARAGRAPH("lead_paragraph"), TITLE("title"), URL(
      "url"), ABSTRACT("abstract"), GEO_FACET("geo_facet"), ORG_FACET("org_facet"), PER_FACET(
      "per_facet"), CLASSIFIERS_FACET("classifiers_facet");

  private String string;

  Field(String s) {
    string = s;
  }

  public String toString() {
    return string;
  }

}
