package com.downes.nyt4j.driver;

import com.downes.nyt4j.Field;
import com.downes.nyt4j.MostPopularQuery;
import com.downes.nyt4j.MostPopularSearch;
import com.downes.nyt4j.NYTAPIKey;
import com.downes.nyt4j.ResourceType;
import com.downes.nyt4j.TimePeriod;

public class Driver {
  
  public static NYTAPIKey MOST_POPUALR_KEY = new NYTAPIKey("0d758bfe922a2af3a7acd5a01b8eab09:4:58678823");

  void go() {
    MostPopularQuery mpq = new MostPopularQuery(ResourceType.MOSTEMAILED, TimePeriod.THRITY);
    MostPopularSearch mostPopularSearch = new MostPopularSearch(MOST_POPUALR_KEY);
    mostPopularSearch.search(mpq);
    System.out.println(Field.BODY);
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.go();
  }

}
