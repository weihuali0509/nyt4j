package com.downes.nyt4j;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public interface JSONFactory {

  Article articleFromJSON(JSONObject articleJSON) throws JSONException;

  SearchResultList searchResultListFromJSON(JSONArray srlJSON) throws JSONException;

  ArticleSearchResponse searchResponseFromJSON(JSONObject searchResponseJSON) throws JSONException;

  SearchResult searchResultFromJSON(JSONObject searchResultJSON) throws JSONException;

}
