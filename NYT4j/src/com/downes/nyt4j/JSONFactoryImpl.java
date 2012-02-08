package com.downes.nyt4j;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONFactoryImpl implements JSONFactory {

  @Override
  public Article articleFromJSON(JSONObject articleJSON) throws JSONException {
    return new ArticleImpl(articleJSON);
  }

  @Override
  public SearchResultList searchResultListFromJSON(JSONArray searchResultListJSON)
      throws JSONException {
    return new SearchResultListImpl(searchResultListJSON);
  }

  @Override
  public ArticleSearchResponse searchResponseFromJSON(JSONObject searchResponseJSON)
      throws JSONException {
    return new ArticleSearchResponseImpl(searchResponseJSON);
  }

  @Override
  public SearchResult searchResultFromJSON(JSONObject searchResultJSON) throws JSONException {
    return new SearchResultImpl(searchResultJSON);
  }
}
