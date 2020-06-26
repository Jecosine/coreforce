package com.mjx.news.entity;

public class Passage {
  private String id;
  private String uid;
  private String title;
  private Integer view, agree;
  private String thumb;
  private String part_id;
  private String datetime;
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getView() {
    return view;
  }

  public void setView(Integer view) {
    this.view = view;
  }

  public Integer getAgree() {
    return agree;
  }

  public void setAgree(Integer agree) {
    this.agree = agree;
  }

  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public String getPart_id() {
    return part_id;
  }

  public void setPart_id(String part_id) {
    this.part_id = part_id;
  }

    /**
     * @return String return the datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * @param datetime the datetime to set
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

}