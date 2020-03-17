package com.bjnangle.webservice.model;

public class AhslInpatientdischargecancel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String  nggid;
	private String  patpatientid;
	private String  paadmvisitnumber;
	private String  paadmdeptcode;
	private String  paadmdeptdesc;
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

	public String getPaadmdeptcode() {
		return paadmdeptcode;
	}
	public void setPaadmdeptcode(String paadmdeptcode) {
		this.paadmdeptcode = paadmdeptcode;
	}

	public String getPaadmdeptdesc() {
		return paadmdeptdesc;
	}
	public void setPaadmdeptdesc(String paadmdeptdesc) {
		this.paadmdeptdesc = paadmdeptdesc;
	}

	public String getInsdatetime() {
		return insdatetime;
	}
	public void setInsdatetime(String insdatetime) {
		this.insdatetime = insdatetime;
	}

	public AhslInpatientdischargecancel() {}

	public AhslInpatientdischargecancel(String nggid, String patpatientid, String paadmvisitnumber, String paadmdeptcode, String paadmdeptdesc, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.paadmvisitnumber = paadmvisitnumber;
		this.paadmdeptcode = paadmdeptcode;
		this.paadmdeptdesc = paadmdeptdesc;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslInpatientdischargecancel [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmdeptcode=" + paadmdeptcode + ", "
				+ "paadmdeptdesc=" + paadmdeptdesc + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}