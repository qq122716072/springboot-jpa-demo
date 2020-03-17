package com.bjnangle.webservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 住院登记
 */

@Entity
@Table(name = "_ahslInpatient")
public class AhslInpatient implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nggid", length = 32, nullable = false)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@JsonSerialize(using= ToStringSerializer.class)
	private String  nggid;

	@Column(name = "patpatientid"/*,columnDefinition="varchar(100) COMMENT '患者主索引'"*/)
	private String  patpatientid;

	@Column(name = "paadmvisitnumber"/*,columnDefinition="varchar(100) COMMENT '就诊号码'"*/)
	private String  paadmvisitnumber;

	@Column(name = "paadmencountertypecode"/*,columnDefinition="varchar(100) COMMENT '就诊类型代码'"*/)
	private String  paadmencountertypecode;

	@Column(name = "paadmencountertypedesc"/*,columnDefinition="varchar(100) COMMENT '就诊类型描述'"*/)
	private String  paadmencountertypedesc;

	@Column(name = "feetypecode"/*,columnDefinition="varchar(100) COMMENT '费别代码'"*/)
	private String  feetypecode;

	@Column(name = "feetypedesc"/*,columnDefinition="varchar(100) COMMENT '费别描述'"*/)
	private String  feetypedesc;

	@Column(name = "paadmvisittimes"/*,columnDefinition="varchar(100) COMMENT '住院次数'"*/)
	private String  paadmvisittimes;

	@Column(name = "paadmadmitdoccode"/*,columnDefinition="varchar(100) COMMENT '入院医生代码'"*/)
	private String  paadmadmitdoccode;

	@Column(name = "paadmadmitdocdesc"/*,columnDefinition="varchar(100) COMMENT '入院医生描述'"*/)
	private String  paadmadmitdocdesc;

	@Column(name = "paadmstartdate"/*,columnDefinition="varchar(100) COMMENT '入院日期'"*/)
	private String  paadmstartdate;

	@Column(name = "paadmstarttime"/*,columnDefinition="varchar(100) COMMENT '入院时间'"*/)
	private String  paadmstarttime;

	@Column(name = "paadmadmdeptcode"/*,columnDefinition="varchar(100) COMMENT '入院科室代码'"*/)
	private String  paadmadmdeptcode;

	@Column(name = "paadmadmdeptdesc"/*,columnDefinition="varchar(100) COMMENT '入院科室描述'"*/)
	private String  paadmadmdeptdesc;

	@Column(name = "paadmadmwardcode"/*,columnDefinition="varchar(100) COMMENT '入院病区代码'"*/)
	private String  paadmadmwardcode;

	@Column(name = "paadmadmwarddesc"/*,columnDefinition="varchar(100) COMMENT '入院病区描述'"*/)
	private String  paadmadmwarddesc;

	@Column(name = "paadmcurbedno"/*,columnDefinition="varchar(100) COMMENT '病床号'"*/)
	private String  paadmcurbedno;

	@Column(name = "updateuserdesc"/*,columnDefinition="varchar(100) COMMENT '最后更新人描述'"*/)
	private String  updateuserdesc;

	@Column(name = "updatedate"/*,columnDefinition="varchar(100) COMMENT '最后更新日期'"*/)
	private String  updatedate;

	@Column(name = "updatetime"/*,columnDefinition="varchar(100) COMMENT '最后更新时间'"*/)
	private String  updatetime;

	@Column(name = "inpatientstate"/*,columnDefinition="varchar(100) COMMENT '在院状态'"*/)
	private int  inpatientstate;

	@Column(name = "insdatetime"/*,columnDefinition="varchar(100) COMMENT ''"*/)
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

	public String getPaadmencountertypedesc() {
		return paadmencountertypedesc;
	}
	public void setPaadmencountertypedesc(String paadmencountertypedesc) {
		this.paadmencountertypedesc = paadmencountertypedesc;
	}

	public String getFeetypedesc() {
		return feetypedesc;
	}
	public void setFeetypedesc(String feetypedesc) {
		this.feetypedesc = feetypedesc;
	}

	public String getPaadmadmitdocdesc() {
		return paadmadmitdocdesc;
	}
	public void setPaadmadmitdocdesc(String paadmadmitdocdesc) {
		this.paadmadmitdocdesc = paadmadmitdocdesc;
	}

	public String getPaadmstartdate() {
		return paadmstartdate;
	}
	public void setPaadmstartdate(String paadmstartdate) {
		this.paadmstartdate = paadmstartdate;
	}

	public String getPaadmstarttime() {
		return paadmstarttime;
	}
	public void setPaadmstarttime(String paadmstarttime) {
		this.paadmstarttime = paadmstarttime;
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

	public int getInpatientstate() {
		return inpatientstate;
	}
	public void setInpatientstate(int inpatientstate) {
		this.inpatientstate = inpatientstate;
	}

	public String getInsdatetime() {
		return insdatetime;
	}
	public void setInsdatetime(String insdatetime) {
		this.insdatetime = insdatetime;
	}

	public String getFeetypecode() {
		return feetypecode;
	}

	public void setFeetypecode(String feetypecode) {
		this.feetypecode = feetypecode;
	}

	public String getPaadmvisittimes() {
		return paadmvisittimes;
	}

	public void setPaadmvisittimes(String paadmvisittimes) {
		this.paadmvisittimes = paadmvisittimes;
	}

	public String getPaadmadmitdoccode() {
		return paadmadmitdoccode;
	}

	public void setPaadmadmitdoccode(String paadmadmitdoccode) {
		this.paadmadmitdoccode = paadmadmitdoccode;
	}

	public String getPaadmadmdeptcode() {
		return paadmadmdeptcode;
	}

	public void setPaadmadmdeptcode(String paadmadmdeptcode) {
		this.paadmadmdeptcode = paadmadmdeptcode;
	}

	public String getPaadmadmdeptdesc() {
		return paadmadmdeptdesc;
	}

	public void setPaadmadmdeptdesc(String paadmadmdeptdesc) {
		this.paadmadmdeptdesc = paadmadmdeptdesc;
	}

	public String getPaadmadmwardcode() {
		return paadmadmwardcode;
	}

	public void setPaadmadmwardcode(String paadmadmwardcode) {
		this.paadmadmwardcode = paadmadmwardcode;
	}

	public String getPaadmadmwarddesc() {
		return paadmadmwarddesc;
	}

	public void setPaadmadmwarddesc(String paadmadmwarddesc) {
		this.paadmadmwarddesc = paadmadmwarddesc;
	}

	public String getPaadmcurbedno() {
		return paadmcurbedno;
	}

	public void setPaadmcurbedno(String paadmcurbedno) {
		this.paadmcurbedno = paadmcurbedno;
	}

	public AhslInpatient() {}

	public AhslInpatient(String nggid, String patpatientid, String paadmvisitnumber, String paadmencountertypecode, String paadmencountertypedesc, String feetypedesc, String paadmadmitdocdesc, String paadmstartdate, String paadmstarttime, String updateuserdesc, String updatedate, String updatetime, int inpatientstate, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.paadmvisitnumber = paadmvisitnumber;
		this.paadmencountertypecode = paadmencountertypecode;
		this.paadmencountertypedesc = paadmencountertypedesc;
		this.feetypedesc = feetypedesc;
		this.paadmadmitdocdesc = paadmadmitdocdesc;
		this.paadmstartdate = paadmstartdate;
		this.paadmstarttime = paadmstarttime;
		this.updateuserdesc = updateuserdesc;
		this.updatedate = updatedate;
		this.updatetime = updatetime;
		this.inpatientstate = inpatientstate;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslInpatient [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmencountertypecode=" + paadmencountertypecode + ", "
				+ "paadmencountertypedesc=" + paadmencountertypedesc + ", "
				+ "feetypedesc=" + feetypedesc + ", "
				+ "paadmadmitdocdesc=" + paadmadmitdocdesc + ", "
				+ "paadmstartdate=" + paadmstartdate + ", "
				+ "paadmstarttime=" + paadmstarttime + ", "
				+ "updateuserdesc=" + updateuserdesc + ", "
				+ "updatedate=" + updatedate + ", "
				+ "updatetime=" + updatetime + ", "
				+ "inpatientstate=" + inpatientstate + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}