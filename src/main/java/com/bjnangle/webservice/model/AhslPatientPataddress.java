package com.bjnangle.webservice.model;

public class AhslPatientPataddress implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  ngparentgid;
	private String  pataddresstype;

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

	public String getPataddresstype() {
		return pataddresstype;
	}
	public void setPataddresstype(String pataddresstype) {
		this.pataddresstype = pataddresstype;
	}

	public AhslPatientPataddress() {}

	public AhslPatientPataddress(String nggid, String ngparentgid, String pataddresstype) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
		this.pataddresstype = pataddresstype;
	}
	@Override
	public String toString() {
		 return "AhslPatientPataddress [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + ", "
				+ "pataddresstype=" + pataddresstype + "]";
	}


}