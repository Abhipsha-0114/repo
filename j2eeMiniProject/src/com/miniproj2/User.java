package com.miniproj2;

public class User {
	int cid;
	String cname,qualification,state,end_date,party;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification ) {
		this.qualification = qualification;
	}
	public String getState() {
		return state;
	}
	public void setState(String state ) {
		this.state = state;
	}
	
	public String getParty() {
		return party;
	}
	public void setParty(String party ) {
		this.party= party;
	}
}
