package com.test.tsp.board.model.vo;

import java.sql.Date;

public class Board implements java.io.Serializable{
	private int bNo;
	private String bTitle;
	private String bContent;
	private Date writenDate;
	private int bCount;
	private int bWriter;
	private int bCode;
	
	public Board() {}

	public Board(int bNo, String bTitle, String bContent, Date writenDate, int bCount, int bWriter, int bCode) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.writenDate = writenDate;
		this.bCount = bCount;
		this.bWriter = bWriter;
		this.bCode = bCode;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Date getWritenDate() {
		return writenDate;
	}

	public void setWritenDate(Date writenDate) {
		this.writenDate = writenDate;
	}

	public int getbCount() {
		return bCount;
	}

	public void setbCount(int bCount) {
		this.bCount = bCount;
	}

	public int getbWriter() {
		return bWriter;
	}

	public void setbWriter(int bWriter) {
		this.bWriter = bWriter;
	}

	public int getbCode() {
		return bCode;
	}

	public void setbCode(int bCode) {
		this.bCode = bCode;
	}

	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", writenDate=" + writenDate
				+ ", bCount=" + bCount + ", bWriter=" + bWriter + ", bCode=" + bCode + "]";
	}
	
	
}
