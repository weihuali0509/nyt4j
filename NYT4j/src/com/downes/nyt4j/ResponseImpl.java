package com.downes.nyt4j;

import org.json.JSONObject;

public class ResponseImpl implements Response {

  JSONObject json;

  public ResponseImpl(JSONObject json) {
    this.json = json;
    parse();
  }

  private void parse() {

  }

  @Override
  public JSONObject getResultsAsJSON() {
    return json;
  }

}
