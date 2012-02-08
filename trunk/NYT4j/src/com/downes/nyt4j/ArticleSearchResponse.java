package com.downes.nyt4j;

import java.util.List;

import org.json.JSONObject;

public interface ArticleSearchResponse extends Response {

  int getTotal();

  List<Article> getArticles();

  List<JSONObject> getResultsAsJSONList();

  List<SearchResult> getSearchResults();

}
