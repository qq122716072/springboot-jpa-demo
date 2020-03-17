package com.bjnangle.webservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 病人基本信息
 */
@Entity
@Table(name = "_ahslPatient")
public class AhslPatient implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nggid", length = 32, nullable = false)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@JsonSerialize(using= ToStringSerializer.class)
	private String  nggid;

	@Column(name = "patpatientid")
	private String  patpatientid;

	@Column(name = "patname")
	private String  patname;

	@Column(name = "patdob")
	private String  patdob;

	@Column(name = "patsexdesc")
	private String  patsexdesc;

	@Column(name = "pattelephone")
	private String  pattelephone;

	@Column(name = "patremarks")
	private String  patremarks;

	@Column(name = "updateuserdesc")
	private String  updateuserdesc;

	@Column(name = "updatedate")
	private String  updatedate;

	@Column(name = "updatetime")
	private String  updatetime;

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

	public String getPatname() {
		return patname;
	}
	public void setPatname(String patname) {
		this.patname = patname;
	}

	public String getPatdob() {
		return patdob;
	}
	public void setPatdob(String patdob) {
		this.patdob = patdob;
	}

	public String getPatsexdesc() {
		return patsexdesc;
	}
	public void setPatsexdesc(String patsexdesc) {
		this.patsexdesc = patsexdesc;
	}

	public String getPattelephone() {
		return pattelephone;
	}
	public void setPattelephone(String pattelephone) {
		this.pattelephone = pattelephone;
	}

	public String getPatremarks() {
		return patremarks;
	}
	public void setPatremarks(String patremarks) {
		this.patremarks = patremarks;
	}

	public String getUpdateuserdesc() {
		return updateuserdesc;
	}
	public void setUpdateuserdesc(String updateuserdesc) {
		this.updateuserdesc = updateuserdesc;
	}

	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public String getInsdatetime() {
		return insdatetime;
	}
	public void setInsdatetime(String insdatetime) {
		this.insdatetime = insdatetime;
	}

	public AhslPatient() {}

	public AhslPatient(String nggid, String patpatientid, String patname, String patdob, String patsexdesc, String pattelephone, String patremarks, String updateuserdesc, String updatedate, String updatetime, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.patname = patname;
		this.patdob = patdob;
		this.patsexdesc = patsexdesc;
		this.pattelephone = pattelephone;
		this.patremarks = patremarks;
		this.updateuserdesc = updateuserdesc;
		this.updatedate = updatedate;
		this.updatetime = updatetime;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslPatient [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "patname=" + patname + ", "
				+ "patdob=" + patdob + ", "
				+ "patsexdesc=" + patsexdesc + ", "
				+ "pattelephone=" + pattelephone + ", "
				+ "patremarks=" + patremarks + ", "
				+ "updateuserdesc=" + updateuserdesc + ", "
				+ "updatedate=" + updatedate + ", "
				+ "updatetime=" + updatetime + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}