package com.bjnangle.webservice.model;

public class AhslUpdateordersstatusOeoriinfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  ngparentgid;
	private String  oeoriorderitemid;

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

	public String getOeoriorderitemid() {
		return oeoriorderitemid;
	}
	public void setOeoriorderitemid(String oeoriorderitemid) {
		this.oeoriorderitemid = oeoriorderitemid;
	}

	public AhslUpdateordersstatusOeoriinfo() {}

	public AhslUpdateordersstatusOeoriinfo(String nggid, String ngparentgid, String oeoriorderitemid) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
		this.oeoriorderitemid = oeoriorderitemid;
	}
	@Override
	public String toString() {
		 return "AhslUpdateordersstatusOeoriinfo [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + ", "
				+ "oeoriorderitemid=" + oeoriorderitemid + "]";
	}


}