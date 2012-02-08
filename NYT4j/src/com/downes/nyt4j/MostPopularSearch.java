package com.downes.nyt4j;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * http://api.nytimes.com/svc/mostpopular/{version}/{resource-type}/{section}[/share-types]/{time-
 * period}[.response-format]?api-key={your-API-key}
 * 
 * @author cdownes
 * 
 */
public class MostPopularSearch {

  private String BASE_URI = "http://api.nytimes.com/svc/mostpopular/";

  NYTAPIKey key;
  MostPopularQuery query;

  public MostPopularSearch(NYTAPIKey key) {
    this.key = key;
  }

  public void search(MostPopularQuery query) {
    this.query = query;
    StringBuilder queryURL = new StringBuilder();
    queryURL.append(BASE_URI);
    queryURL.append(query.getVersion());
    queryURL.append("/" + query.getResourceType().toString());
    queryURL.append("/all-sections");
    queryURL.append("/" + query.getTimePeriod().toString());
    queryURL.append("/" + "?api-key=" + key.getKey());
    System.out.println(queryURL.toString());
    try {
      System.out.println(HttpRequest.urlToJSON(new URL(queryURL.toString())));
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
