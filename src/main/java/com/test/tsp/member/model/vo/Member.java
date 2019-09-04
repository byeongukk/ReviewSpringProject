package com.test.tsp.member.model.vo;

import java.sql.Date;

public class Member implements java.io.Serializable{
	private int mNo;
	private String mId;
	private String mPwd;
	private String email;
	private String emailCheck;
	private String mStatus;
	private String github;
	private String nickName;
	private Date joinDate;
	
	public Member(){}

	public Member(int mNo, String mId, String mPwd, String email, String emailCheck, String mStatus, String github,
			String nickName, Date joinDate) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.email = email;
		this.emailCheck = emailCheck;
		this.mStatus = mStatus;
		this.github = github;
		this.nickName = nickName;
		this.joinDate = joinDate;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailCheck() {
		return emailCheck;
	}

	public void setEmailCheck(String emailCheck) {
		this.emailCheck = emailCheck;
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPwd=" + mPwd + ", email=" + email + ", emailCheck="
				+ emailCheck + ", mStatus=" + mStatus + ", github=" + github + ", nickName=" + nickName + ", joinDate="
				+ joinDate + "]";
	}
	
	
}
