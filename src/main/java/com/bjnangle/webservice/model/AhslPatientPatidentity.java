package com.bjnangle.webservice.model;

public class AhslPatientPatidentity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  ngparentgid;
	private String  patidentitynum;

	public String getNggid() {
		return nggid;
	}
	public void setNggid(String nggid) {
		this.nggid = nggid;
	}

	public String getNgparentgid() {
		return ngparentgid;
	}
	public void setNgparentgid(String ngparentgid) {
		this.ngparentgid = ngparentgid;
	}

	public String getPatidentitynum() {
		return patidentitynum;
	}
	public void setPatidentitynum(String patidentitynum) {
		this.patidentitynum = patidentitynum;
	}

	public AhslPatientPatidentity() {}

	public AhslPatientPatidentity(String nggid, String ngparentgid, String patidentitynum) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
		this.patidentitynum = patidentitynum;
	}
	@Override
	public String toString() {
		 return "AhslPatientPatidentity [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + ", "
				+ "patidentitynum=" + patidentitynum + "]";
	}


}