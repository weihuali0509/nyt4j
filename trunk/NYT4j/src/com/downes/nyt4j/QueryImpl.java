package com.downes.nyt4j;

import java.util.Date;
import java.util.List;

public class QueryImpl implements Query {

  private String simpleQueryString;

  private Date beginDate;
  private Date endDate;
  private ResponseFormat responseFormat;
  private int offset;
  private Rank rank;

  private List<Facet> facets;

  public QueryImpl(String simpleQuery) {
    simpleQueryString = simpleQuery;
  }

  public QueryImpl() {

  }

  @Override
  public Date getBeginDate() {
    return beginDate;
  }

  @Override
  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  @Override
  public Date getEndDate() {
    return endDate;
  }

  @Override
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  @Override
  public ResponseFormat getResponseFormat() {
    return responseFormat;
  }

  @Override
  public void setResponseFormat(ResponseFormat format) {
    this.responseFormat = format;
  }

  @Override
  public int getOffset() {
    return offset;
  }

  @Override
  public void setOffset(int offset) {
    this.offset = offset;
  }

  @Override
  public Rank getRank() {
    return rank;
  }

  @Override
  public void setRank(Rank rank) {
    this.rank = rank;
  }

  @Override
  public String getSimpleQueryString() {
    return simpleQueryString;
  }

  @Override
  public List<Facet> getFacets() {
    return facets;
  }

  @Override
  public void setFacets(List<Facet> facets) {
    this.facets = facets;

  }

  @Override
  public void addFacet(Facet facet) {
    facets.add(facet);
  }

  @Override
  public void removeFacet(Facet facet) {
    facets.remove(facet);
  }

}
