package com.downes.nyt4j;

import java.util.ArrayList;
import java.util.List;

public final class MostPopularQuery {

  static String VERSION_TWO = "v2";
  static String ALL_SECTIONS = "all-sections";
  ResourceType resourceType;
  TimePeriod timePeriod;
  List<String> sections;
  int offset;
  ResponseFormat responseFormat = ResponseFormat.JSON;
  List<ShareType> shareTypes;
  String version;

  public MostPopularQuery(ResourceType resourceType, String section, TimePeriod timePeriod) {
    this.resourceType = resourceType;
    sections = new ArrayList<String>();
    sections.add(section);
    this.timePeriod = timePeriod;
    shareTypes = new ArrayList<ShareType>();
    version = VERSION_TWO;
  }

  public MostPopularQuery(ResourceType resourceType, TimePeriod timePeriod) {
    this(resourceType, ALL_SECTIONS, timePeriod);
  }

  public void addShareType(ShareType shareType) {
    shareTypes.add(shareType);
  }

  public void addShareTypes(List<ShareType> shareTypes) {
    shareTypes.addAll(shareTypes);
  }

  public void setOffset(int offset) {
    if (offset % 20 != 0) {
      offset = (int) Math.floor(offset / 20) * Math.round((offset % 20) * 20);
    } else {
      this.offset = offset;
    }
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setResponseFormat(ResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

  public TimePeriod getTimePeriod() {
    return timePeriod;
  }

  public ResourceType getResourceType() {
    return resourceType;
  }

  public List<String> getSections() {
    List<String> s = new ArrayList<String>();
    s.addAll(sections);
    return s;
  }

  public List<ShareType> getShareTypes() {
    List<ShareType> st = new ArrayList<ShareType>();
    st.addAll(shareTypes);
    return st;
  }

  public ResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public int getOffset() {
    return offset;
  }

  public String getVersion() {
    return version;
  }

}
