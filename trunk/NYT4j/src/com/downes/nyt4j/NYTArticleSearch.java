package com.downes.nyt4j;

//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.omg.CORBA.RepositoryIdHelper;

public class NYTArticleSearch {

  private NYTAPIKey nytApiKey;

  // private static String ARTICLE_SEARCH_BASE_URL = "http://api.nytimes.com/svc/search/v1/article";
  // private JSONObject responseJSON;

  // private ArticleSearchResult articleSearchResult;

  public NYTArticleSearch(String key) {
    nytApiKey = new NYTAPIKey(key);
  }

  public NYTArticleSearch(NYTAPIKey key) {
    nytApiKey = new NYTAPIKey(key);
  }

  public ArticleSearchQuery newQuery() {
    return new ArticleSearchQueryImpl(nytApiKey);
  }

  // public ArticleSearchResult search(ArticleSearchQueryImpl query) {
  // try {
  // URL url = new URL(ARTICLE_SEARCH_BASE_URL + query.toURLString() + "&api-key=" +
  // nytApiKey.getKey());
  // System.out.println(url.toString());
  // HttpRequest request = new HttpRequest(url);
  // try {
  // responseJSON = new JSONObject(request.getResponseAsString());
  // System.out.println(responseJSON.toString());
  // articleSearchResult = new JSONFactoryImpl().articleSearchResultFromJSON(responseJSON);
  // } catch (JSONException e) {
  // e.printStackTrace();
  // }
  // } catch (MalformedURLException e1) {
  // e1.printStackTrace();
  // }
  // return articleSearchResult;
  // }
}
