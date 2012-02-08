package com.downes.nyt4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpRequest {

  String baseUrl;
  Query query;
  String response;
  NYTAPIKey apiKey;

  public HttpRequest(String baseUrl, Query query, NYTAPIKey key) {
    this.baseUrl = baseUrl;
    this.query = query;
    this.apiKey = key;
    try {
      request(new URL(baseUrl + "?query=obama&api-key=" + apiKey.getKey()));
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public HttpRequest() {
    apiKey = null;
  }

  public HttpRequest(URL url) {
    request(url);
  }

  public static JSONObject urlToJSON(URL url) {
    JSONObject json = null;
    try {
      json = new JSONObject(request(url));
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return json;
  }

  public static String request(URL url) {
    StringBuffer stringBuffer = new StringBuffer();
    String result = null;
    try {
      URLConnection connection = url.openConnection();
      BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
        stringBuffer.append(line);
      }
      rd.close();
      result = stringBuffer.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }

  public JSONObject getResponseAsJSON() {
    JSONObject responseJson = null;
    try {
      responseJson = new JSONObject(response);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return responseJson;
  }

  public String getResponseAsString() {
    return response;
  }

}
