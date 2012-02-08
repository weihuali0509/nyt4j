package com.downes.nyt4j;

public interface ArticleSearchQuery {

  ArticleSearchResponse query(Query query);

  ArticleSearchResponse query(String query);

}
