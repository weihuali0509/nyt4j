package com.downes.nyt4j;

import static com.downes.nyt4j.JSONParseUtil.JSONArrayToList;
import static com.downes.nyt4j.JSONParseUtil.getInt;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ArticleSearchResponseImpl extends ResponseImpl implements ArticleSearchResponse {

  private int total;
  private JSONArray resultsJSON;
  private List<SearchResult> searchResults;
  private SearchResultList searchResultList;

  public ArticleSearchResponseImpl(JSONObject json) {
    super(json);
    parse();
  }

  private void parse() {
    total = getInt("total", json);
    if (!json.isNull("results")) {
      try {
        resultsJSON = json.getJSONArray("results");
        searchResultList = new JSONFactoryImpl().searchResultListFromJSON(resultsJSON);
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public int getTotal() {
    return total;
  }

  @Override
  public List<Article> getArticles() {
    return searchResultList.getArticles();
  }

  @Override
  public List<SearchResult> getSearchResults() {
    return searchResults;
  }

  @Override
  public List<JSONObject> getResultsAsJSONList() {
    return JSONArrayToList(resultsJSON);
  }

}
