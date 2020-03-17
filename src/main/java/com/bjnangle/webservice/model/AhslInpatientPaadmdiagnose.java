package com.bjnangle.webservice.model;

public class AhslInpatientPaadmdiagnose implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  ngparentgid;
	private String  paddiagcode;
	private String  paddiagdesc;

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

	public String getPaddiagcode() {
		return paddiagcode;
	}
	public void setPaddiagcode(String paddiagcode) {
		this.paddiagcode = paddiagcode;
	}

	public String getPaddiagdesc() {
		return paddiagdesc;
	}
	public void setPaddiagdesc(String paddiagdesc) {
		this.paddiagdesc = paddiagdesc;
	}

	public AhslInpatientPaadmdiagnose() {}

	public AhslInpatientPaadmdiagnose(String nggid, String ngparentgid, String paddiagcode, String paddiagdesc) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
		this.paddiagcode = paddiagcode;
		this.paddiagdesc = paddiagdesc;
	}
	@Override
	public String toString() {
		 return "AhslInpatientPaadmdiagnose [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + ", "
				+ "paddiagcode=" + paddiagcode + ", "
				+ "paddiagdesc=" + paddiagdesc + "]";
	}


}