package com.bjnangle.webservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 取消住院登记
 */

@Entity
@Table(name = "_ahslInpatientcancel")
public class AhslInpatientcancel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nggid", length = 32, nullable = false)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@JsonSerialize(using= ToStringSerializer.class)
	private String  nggid;

	@Column(name = "patpatientid")
	private String  patpatientid;

	@Column(name = "paadmvisitnumber")
	private String  paadmvisitnumber;

	@Column(name = "paadmdeptcode")
	private String  paadmdeptcode;

	@Column(name = "paadmdeptdesc")
	private String  paadmdeptdesc;

	@Column(name = "insdatetime")
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

	public AhslInpatientcancel() {}

	public AhslInpatientcancel(String nggid, String patpatientid, String paadmvisitnumber, String paadmdeptcode, String paadmdeptdesc, String insdatetime) {
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
		 return "AhslInpatientcancel [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmdeptcode=" + paadmdeptcode + ", "
				+ "paadmdeptdesc=" + paadmdeptdesc + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}