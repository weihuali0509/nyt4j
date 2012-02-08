package com.downes.nyt4j;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SearchResultListImpl implements SearchResultList {

  JSONArray json;
  List<JSONObject> searchResultsJSONList;
  List<Article> articles;
  List<SearchResult> searchResults;

  SearchResultListImpl(JSONArray json) throws JSONException {
    this.json = json;
    searchResultsJSONList = null;
    parse();
  }

  private void parse() throws JSONException {
    searchResultsJSONList = new ArrayList<JSONObject>();
    searchResults = new ArrayList<SearchResult>();
    articles = new ArrayList<Article>();
    for (int i = 0; i < json.length(); i++) {
      JSONObject ob = json.getJSONObject(i);
      searchResultsJSONList.add(ob);
      JSONFactoryImpl factory = new JSONFactoryImpl();
      searchResults.add(factory.searchResultFromJSON(ob));
      articles.add(factory.articleFromJSON(ob));
    }
  }

  @Override
  public List<Article> getArticles() {
    return articles;
  }

  @Override
  public List<SearchResult> getSearchResults() {
    return searchResults;
  }

}
