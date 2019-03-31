package com.jc.dto;

import java.io.Serializable;

public class YsrcpMembershipDto implements Serializable {
	private int srlno;
	private int mid;
	private String mName;
	private String Village;
	private String constitenucey;
	private String mandal;
	private String district;
	private long mobile;

	public int getSrlno() {
		return srlno;
	}

	public void setSrlno(int srlno) {
		this.srlno = srlno;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getVillage() {
		return Village;
	}

	public void setVillage(String village) {
		Village = village;
	}

	public String getConstitenucey() {
		return constitenucey;
	}

	public void setConstitenucey(String constitenucey) {
		this.constitenucey = constitenucey;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
