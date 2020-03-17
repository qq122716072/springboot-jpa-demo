package com.bjnangle.webservice.model;

public class AhslUpdateordersstatus implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  patpatientid;
	private String  paadmvisitnumber;
	private String  paadmencountertypecode;
	private String  updateuserdesc;
	private String  updatedate;
	private String  updatetime;
	private String  insdatetime;

	public String getNggid() {
		return nggid;
	}
	public void setNggid(String nggid) {
		this.nggid = nggid;
	}

	public String getPatpatientid() {
		return patpatientid;
	}
	public void setPatpatientid(String patpatientid) {
		this.patpatientid = patpatientid;
	}

	public String getPaadmvisitnumber() {
		return paadmvisitnumber;
	}
	public void setPaadmvisitnumber(String paadmvisitnumber) {
		this.paadmvisitnumber = paadmvisitnumber;
	}

	public String getPaadmencountertypecode() {
		return paadmencountertypecode;
	}
	public void setPaadmencountertypecode(String paadmencountertypecode) {
		this.paadmencountertypecode = paadmencountertypecode;
	}

	public String getUpdateuserdesc() {
		return updateuserdesc;
	}
	public void setUpdateuserdesc(String updateuserdesc) {
		this.updateuserdesc = updateuserdesc;
	}

	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public String getInsdatetime() {
		return insdatetime;
	}
	public void setInsdatetime(String insdatetime) {
		this.insdatetime = insdatetime;
	}

	public AhslUpdateordersstatus() {}

	public AhslUpdateordersstatus(String nggid, String patpatientid, String paadmvisitnumber, String paadmencountertypecode, String updateuserdesc, String updatedate, String updatetime, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.paadmvisitnumber = paadmvisitnumber;
		this.paadmencountertypecode = paadmencountertypecode;
		this.updateuserdesc = updateuserdesc;
		this.updatedate = updatedate;
		this.updatetime = updatetime;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslUpdateordersstatus [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmencountertypecode=" + paadmencountertypecode + ", "
				+ "updateuserdesc=" + updateuserdesc + ", "
				+ "updatedate=" + updatedate + ", "
				+ "updatetime=" + updatetime + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}