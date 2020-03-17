package com.bjnangle.webservice.model;

public class AhslPatientPatrelation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  ngparentgid;
	private String  patrelationdesc;
	private String  patrelationname;

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

	public String getPatrelationdesc() {
		return patrelationdesc;
	}
	public void setPatrelationdesc(String patrelationdesc) {
		this.patrelationdesc = patrelationdesc;
	}

	public String getPatrelationname() {
		return patrelationname;
	}
	public void setPatrelationname(String patrelationname) {
		this.patrelationname = patrelationname;
	}

	public AhslPatientPatrelation() {}

	public AhslPatientPatrelation(String nggid, String ngparentgid, String patrelationdesc, String patrelationname) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
		this.patrelationdesc = patrelationdesc;
		this.patrelationname = patrelationname;
	}
	@Override
	public String toString() {
		 return "AhslPatientPatrelation [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + ", "
				+ "patrelationdesc=" + patrelationdesc + ", "
				+ "patrelationname=" + patrelationname + "]";
	}


}