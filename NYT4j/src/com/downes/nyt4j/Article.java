package com.downes.nyt4j;

import java.util.List;

public interface Article {

  String getAbstract();

  String getAuthor();

  String getBody();

  String getByline();

  List<Facet> getClassifiersFacet();

  List<Facet> getColumnFacet();

  boolean hasComments();

  String getDate();

  Facet getDayOfWeekFacet();

  Facet getDesFacet();

  boolean getFee();

  Facet getGeoFacet();

  String getLeadParagraph();

  Facet getMaterialTypeFacet();

  // public ? getMultimedia();

}
