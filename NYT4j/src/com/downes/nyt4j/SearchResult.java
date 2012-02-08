package com.downes.nyt4j;

import java.util.Date;

public interface SearchResult {

  String getBody();

  String getByline();

  Date getDate();

  String getUrl();
  
  String getTitle();

}
