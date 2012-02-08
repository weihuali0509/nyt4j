package com.downes.nyt4j;

import java.util.List;

public interface SearchResultList {

  List<Article> getArticles();

  List<SearchResult> getSearchResults();

}
