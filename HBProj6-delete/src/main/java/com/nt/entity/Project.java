package com.nt.entity;

import java.io.Serializable;

public class Project implements Serializable {
	private Long ProjId;
	private String ProjName;
	private int TeamSize;
	public Long getProjId() {
		return ProjId;
	}
	public void setProjId(Long projId) {
		ProjId = projId;
	}
	public String getProjName() {
		return ProjName;
	}
	public void setProjName(String projName) {
		ProjName = projName;
	}
	public int getTeamSize() {
		return TeamSize;
	}
	public void setTeamSize(int teamSize) {
		TeamSize = teamSize;
	}
	

}
