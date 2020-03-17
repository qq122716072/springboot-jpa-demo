package com.bjnangle.webservice.model;

public class AhslInpatientdischarge implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  patpatientid;
	private String  paadmvisitnumber;
	private String  paadmenddate;
	private String  paadmendtime;
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

	public String getPaadmenddate() {
		return paadmenddate;
	}
	public void setPaadmenddate(String paadmenddate) {
		this.paadmenddate = paadmenddate;
	}

	public String getPaadmendtime() {
		return paadmendtime;
	}
	public void setPaadmendtime(String paadmendtime) {
		this.paadmendtime = paadmendtime;
	}

	public String getInsdatetime() {
		return insdatetime;
	}
	public void setInsdatetime(String insdatetime) {
		this.insdatetime = insdatetime;
	}

	public AhslInpatientdischarge() {}

	public AhslInpatientdischarge(String nggid, String patpatientid, String paadmvisitnumber, String paadmenddate, String paadmendtime, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.paadmvisitnumber = paadmvisitnumber;
		this.paadmenddate = paadmenddate;
		this.paadmendtime = paadmendtime;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslInpatientdischarge [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmenddate=" + paadmenddate + ", "
				+ "paadmendtime=" + paadmendtime + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}