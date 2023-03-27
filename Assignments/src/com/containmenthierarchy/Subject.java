package com.containmenthierarchy;

public class Subject {

	private int subjid;
	private String subjname;
	private String topic;

	public Subject() {

	}

	public Subject(int subjid, String subjname, Stringtopic) {

		this.subjid = subjid;
		this.subjname = subjname;
		this.topic = topic;

	}

	public int getSubjid() {
		return subjid;
	}

	public void setSubjid(int subjid) {
		this.subjid = subjid;
	}

	public String getSubjname() {
		return subjname;
	}

	public void setSubjname(String subjname) {
		this.subjname = subjname;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String toString() {
		return "Subject [subjid=" + subjid + ", subjname=" + subjname + ", topic=" + topic + "]";
	}

}