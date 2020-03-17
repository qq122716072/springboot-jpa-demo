package com.bjnangle.webservice.model;

public class Sqlinfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer  id;
	private String  sqlcontent;
	private String  recvdate;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSqlcontent() {
		return sqlcontent;
	}
	public void setSqlcontent(String sqlcontent) {
		this.sqlcontent = sqlcontent;
	}

	public String getRecvdate() {
		return recvdate;
	}
	public void setRecvdate(String recvdate) {
		this.recvdate = recvdate;
	}

	public Sqlinfo() {}

	public Sqlinfo(Integer id, String sqlcontent, String recvdate) {
		super();
		this.id = id;
		this.sqlcontent = sqlcontent;
		this.recvdate = recvdate;
	}
	@Override
	public String toString() {
		 return "Sqlinfo [id=" + id + ", "
				+ "sqlcontent=" + sqlcontent + ", "
				+ "recvdate=" + recvdate + "]";
	}


}