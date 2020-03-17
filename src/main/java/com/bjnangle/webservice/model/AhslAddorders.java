package com.bjnangle.webservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 接收医嘱信息
 */
@Entity
@Table(name = "_ahslAddorders")
public class AhslAddorders implements java.io.Serializable {

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

	@Column(name = "paadmencountertypecode")
	private String  paadmencountertypecode;

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

	public String getPaadmvisitnumber() {
		return paadmvisitnumber;
	}
	public void setPaadmvisitnumber(String paadmvisitnumber) {
		this.paadmvisitnumber = paadmvisitnumber;
	}

	public String getPaadmencountertypecode() {
		return paadmencountertypecode;
	}
	public void setPaadmencountertypecode(String paadmencountertypecode) {
		this.paadmencountertypecode = paadmencountertypecode;
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

	public AhslAddorders() {}

	public AhslAddorders(String nggid, String patpatientid, String paadmvisitnumber, String paadmencountertypecode, String updateuserdesc, String updatedate, String updatetime, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.paadmvisitnumber = paadmvisitnumber;
		this.paadmencountertypecode = paadmencountertypecode;
		this.updateuserdesc = updateuserdesc;
		this.updatedate = updatedate;
		this.updatetime = updatetime;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslAddorders [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmencountertypecode=" + paadmencountertypecode + ", "
				+ "updateuserdesc=" + updateuserdesc + ", "
				+ "updatedate=" + updatedate + ", "
				+ "updatetime=" + updatetime + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}