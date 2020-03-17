package com.bjnangle.webservice.model;

public class AhslPatientPatrelationaddress implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  ngparentgid;

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

	public AhslPatientPatrelationaddress() {}

	public AhslPatientPatrelationaddress(String nggid, String ngparentgid) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
	}
	@Override
	public String toString() {
		 return "AhslPatientPatrelationaddress [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + "]";
	}


}