package com.bjnangle.webservice.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 医嘱状态变更
 */
@Entity
@Table(name = "_ahslAddordersOeoriinfo")
public class AhslAddordersOeoriinfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nggid", length = 32, nullable = false)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@JsonSerialize(using= ToStringSerializer.class)
	private String  nggid;

	@Column(name = "patpatientid")
	private String  ngparentgid;

	@Column(name = "oeoriorderitemid")
	private String  oeoriorderitemid;

	@Column(name = "oeorioeoridr")
	private String  oeorioeoridr;

	@Column(name = "oeoriarcitmmastcode")
	private String  oeoriarcitmmastcode;

	@Column(name = "oeoriarcitmmastdesc")
	private String  oeoriarcitmmastdesc;

	@Column(name = "oeoriprioritydesc")
	private String  oeoriprioritydesc;

	@Column(name = "oeoristatuscode")
	private String  oeoristatuscode;

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

	public String getOeorioeoridr() {
		return oeorioeoridr;
	}
	public void setOeorioeoridr(String oeorioeoridr) {
		this.oeorioeoridr = oeorioeoridr;
	}

	public String getOeoriarcitmmastcode() {
		return oeoriarcitmmastcode;
	}
	public void setOeoriarcitmmastcode(String oeoriarcitmmastcode) {
		this.oeoriarcitmmastcode = oeoriarcitmmastcode;
	}

	public String getOeoriarcitmmastdesc() {
		return oeoriarcitmmastdesc;
	}
	public void setOeoriarcitmmastdesc(String oeoriarcitmmastdesc) {
		this.oeoriarcitmmastdesc = oeoriarcitmmastdesc;
	}

	public String getOeoriprioritydesc() {
		return oeoriprioritydesc;
	}
	public void setOeoriprioritydesc(String oeoriprioritydesc) {
		this.oeoriprioritydesc = oeoriprioritydesc;
	}

	public String getOeoristatuscode() {
		return oeoristatuscode;
	}
	public void setOeoristatuscode(String oeoristatuscode) {
		this.oeoristatuscode = oeoristatuscode;
	}

	public AhslAddordersOeoriinfo() {}

	public AhslAddordersOeoriinfo(String nggid, String ngparentgid, String oeoriorderitemid, String oeorioeoridr, String oeoriarcitmmastcode, String oeoriarcitmmastdesc, String oeoriprioritydesc, String oeoristatuscode) {
		super();
		this.nggid = nggid;
		this.ngparentgid = ngparentgid;
		this.oeoriorderitemid = oeoriorderitemid;
		this.oeorioeoridr = oeorioeoridr;
		this.oeoriarcitmmastcode = oeoriarcitmmastcode;
		this.oeoriarcitmmastdesc = oeoriarcitmmastdesc;
		this.oeoriprioritydesc = oeoriprioritydesc;
		this.oeoristatuscode = oeoristatuscode;
	}
	@Override
	public String toString() {
		 return "AhslAddordersOeoriinfo [nggid=" + nggid + ", "
				+ "ngparentgid=" + ngparentgid + ", "
				+ "oeoriorderitemid=" + oeoriorderitemid + ", "
				+ "oeorioeoridr=" + oeorioeoridr + ", "
				+ "oeoriarcitmmastcode=" + oeoriarcitmmastcode + ", "
				+ "oeoriarcitmmastdesc=" + oeoriarcitmmastdesc + ", "
				+ "oeoriprioritydesc=" + oeoriprioritydesc + ", "
				+ "oeoristatuscode=" + oeoristatuscode + "]";
	}


}