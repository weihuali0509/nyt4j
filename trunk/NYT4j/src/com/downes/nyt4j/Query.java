package com.downes.nyt4j;

import java.util.Date;
import java.util.List;

public interface Query {

  String getSimpleQueryString();

  Date getBeginDate();

  void setBeginDate(Date beginDate);

  Date getEndDate();

  void setEndDate(Date endDate);

  ResponseFormat getResponseFormat();

  void setResponseFormat(ResponseFormat format);

  int getOffset();

  void setOffset(int offset);

  Rank getRank();

  void setRank(Rank rank);

  List<Facet> getFacets();

  void setFacets(List<Facet> facets);

  void addFacet(Facet facet);

  void removeFacet(Facet facet);

  // void clearReturnFields();
  // Set<Field> getReturnFields();
  //
  // void setReturnFields(Set<Field> returnFields);

  // void returnBodyField(boolean b);
  // void returnTitleField(boolean b);
  // void returnBylineField(boolean b);
  // void returnDateField(boolean b);
  // void returnAbstractField(boolean b);
  // void returnURLField(boolean b);
  // void returnLeadParagraphField(boolean b);

}
