package com.downes.nyt4j;

import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class ArticleSearchQueryImpl implements ArticleSearchQuery {

  private NYTAPIKey apiKey;
  private static String ARTICLE_SEARCH_BASE_URL = "http://api.nytimes.com/svc/search/v1/article";
  private JSONObject responseJSON;

  public ArticleSearchQueryImpl(NYTAPIKey key) {
    apiKey = key;
  }

  @Override
  public ArticleSearchResponse query(Query query) {
    return null;
  }

  @Override
  public ArticleSearchResponse query(String query) {
    try {
      return query(new URL(pBase() + pQuery(query) + pAPIKey()));
    } catch (MalformedURLException e) {
      return null;
    }
  }

  private ArticleSearchResponse query(URL url) {
    System.out.println(url.toString());
    ArticleSearchResponse searchResult;
    try {
      responseJSON = new JSONObject(HttpRequest.request(url));
      System.out.println(responseJSON.toString());
      if (responseJSON == null) {
        System.out.println("null");
      }
      searchResult = new JSONFactoryImpl().searchResponseFromJSON(responseJSON);
    } catch (JSONException e) {
      searchResult = null;
    }
    return searchResult;
  }

  private String pBase() {
    return ARTICLE_SEARCH_BASE_URL;
  }

  private String pAPIKey() {
    return "&api-key=" + apiKey.getKey();
  }

  private String pQuery(String query) {
    return "?query=" + query;
  }

}
