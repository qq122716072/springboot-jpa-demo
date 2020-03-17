package com.bjnangle.webservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 接收转科信息
 */
@Entity
@Table(name = "_ahslAdmtransaction")
public class AhslAdmtransaction implements java.io.Serializable {

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

	@Column(name = "paadmtstartdate")
	private String  paadmtstartdate;

	@Column(name = "paadmtstarttime")
	private String  paadmtstarttime;

	@Column(name = "paadmtorigdoccode")
	private String  paadmtorigdoccode;

	@Column(name = "paadmtorigdeptcode")
	private String  paadmtorigdeptcode;

	@Column(name = "paadmtorigwardcode")
	private String  paadmtorigwardcode;

	@Column(name = "paadmtorigroomcode")
	private String  paadmtorigroomcode;

	@Column(name = "paadmtorigbedcode")
	private String  paadmtorigbedcode;

	@Column(name = "paadmtenddate")
	private String  paadmtenddate;

	@Column(name = "paadmtendtime")
	private String  paadmtendtime;

	@Column(name = "paadmttargdoccode")
	private String  paadmttargdoccode;

	@Column(name = "paadmttargdeptcode")
	private String  paadmttargdeptcode;

	@Column(name = "paadmttargwardcode")
	private String  paadmttargwardcode;

	@Column(name = "paadmttargroomcode")
	private String  paadmttargroomcode;

	@Column(name = "paadmttargbedcode")
	private String  paadmttargbedcode;

	@Column(name = "paadmtstate")
	private String  paadmtstate;

	@Column(name = "updateusercode")
	private String  updateusercode;

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

	public String getPaadmtstartdate() {
		return paadmtstartdate;
	}
	public void setPaadmtstartdate(String paadmtstartdate) {
		this.paadmtstartdate = paadmtstartdate;
	}

	public String getPaadmtstarttime() {
		return paadmtstarttime;
	}
	public void setPaadmtstarttime(String paadmtstarttime) {
		this.paadmtstarttime = paadmtstarttime;
	}

	public String getPaadmtorigdoccode() {
		return paadmtorigdoccode;
	}
	public void setPaadmtorigdoccode(String paadmtorigdoccode) {
		this.paadmtorigdoccode = paadmtorigdoccode;
	}

	public String getPaadmtorigdeptcode() {
		return paadmtorigdeptcode;
	}
	public void setPaadmtorigdeptcode(String paadmtorigdeptcode) {
		this.paadmtorigdeptcode = paadmtorigdeptcode;
	}

	public String getPaadmtorigwardcode() {
		return paadmtorigwardcode;
	}
	public void setPaadmtorigwardcode(String paadmtorigwardcode) {
		this.paadmtorigwardcode = paadmtorigwardcode;
	}

	public String getPaadmtorigroomcode() {
		return paadmtorigroomcode;
	}
	public void setPaadmtorigroomcode(String paadmtorigroomcode) {
		this.paadmtorigroomcode = paadmtorigroomcode;
	}

	public String getPaadmtorigbedcode() {
		return paadmtorigbedcode;
	}
	public void setPaadmtorigbedcode(String paadmtorigbedcode) {
		this.paadmtorigbedcode = paadmtorigbedcode;
	}

	public String getPaadmtenddate() {
		return paadmtenddate;
	}
	public void setPaadmtenddate(String paadmtenddate) {
		this.paadmtenddate = paadmtenddate;
	}

	public String getPaadmtendtime() {
		return paadmtendtime;
	}
	public void setPaadmtendtime(String paadmtendtime) {
		this.paadmtendtime = paadmtendtime;
	}

	public String getPaadmttargdoccode() {
		return paadmttargdoccode;
	}
	public void setPaadmttargdoccode(String paadmttargdoccode) {
		this.paadmttargdoccode = paadmttargdoccode;
	}

	public String getPaadmttargdeptcode() {
		return paadmttargdeptcode;
	}
	public void setPaadmttargdeptcode(String paadmttargdeptcode) {
		this.paadmttargdeptcode = paadmttargdeptcode;
	}

	public String getPaadmttargwardcode() {
		return paadmttargwardcode;
	}
	public void setPaadmttargwardcode(String paadmttargwardcode) {
		this.paadmttargwardcode = paadmttargwardcode;
	}

	public String getPaadmttargroomcode() {
		return paadmttargroomcode;
	}
	public void setPaadmttargroomcode(String paadmttargroomcode) {
		this.paadmttargroomcode = paadmttargroomcode;
	}

	public String getPaadmttargbedcode() {
		return paadmttargbedcode;
	}
	public void setPaadmttargbedcode(String paadmttargbedcode) {
		this.paadmttargbedcode = paadmttargbedcode;
	}

	public String getPaadmtstate() {
		return paadmtstate;
	}
	public void setPaadmtstate(String paadmtstate) {
		this.paadmtstate = paadmtstate;
	}

	public String getUpdateusercode() {
		return updateusercode;
	}
	public void setUpdateusercode(String updateusercode) {
		this.updateusercode = updateusercode;
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

	public AhslAdmtransaction() {}

	public AhslAdmtransaction(String nggid, String patpatientid, String paadmvisitnumber, String paadmtstartdate, String paadmtstarttime, String paadmtorigdoccode, String paadmtorigdeptcode, String paadmtorigwardcode, String paadmtorigroomcode, String paadmtorigbedcode, String paadmtenddate, String paadmtendtime, String paadmttargdoccode, String paadmttargdeptcode, String paadmttargwardcode, String paadmttargroomcode, String paadmttargbedcode, String paadmtstate, String updateusercode, String updatedate, String updatetime, String insdatetime) {
		super();
		this.nggid = nggid;
		this.patpatientid = patpatientid;
		this.paadmvisitnumber = paadmvisitnumber;
		this.paadmtstartdate = paadmtstartdate;
		this.paadmtstarttime = paadmtstarttime;
		this.paadmtorigdoccode = paadmtorigdoccode;
		this.paadmtorigdeptcode = paadmtorigdeptcode;
		this.paadmtorigwardcode = paadmtorigwardcode;
		this.paadmtorigroomcode = paadmtorigroomcode;
		this.paadmtorigbedcode = paadmtorigbedcode;
		this.paadmtenddate = paadmtenddate;
		this.paadmtendtime = paadmtendtime;
		this.paadmttargdoccode = paadmttargdoccode;
		this.paadmttargdeptcode = paadmttargdeptcode;
		this.paadmttargwardcode = paadmttargwardcode;
		this.paadmttargroomcode = paadmttargroomcode;
		this.paadmttargbedcode = paadmttargbedcode;
		this.paadmtstate = paadmtstate;
		this.updateusercode = updateusercode;
		this.updatedate = updatedate;
		this.updatetime = updatetime;
		this.insdatetime = insdatetime;
	}
	@Override
	public String toString() {
		 return "AhslAdmtransaction [nggid=" + nggid + ", "
				+ "patpatientid=" + patpatientid + ", "
				+ "paadmvisitnumber=" + paadmvisitnumber + ", "
				+ "paadmtstartdate=" + paadmtstartdate + ", "
				+ "paadmtstarttime=" + paadmtstarttime + ", "
				+ "paadmtorigdoccode=" + paadmtorigdoccode + ", "
				+ "paadmtorigdeptcode=" + paadmtorigdeptcode + ", "
				+ "paadmtorigwardcode=" + paadmtorigwardcode + ", "
				+ "paadmtorigroomcode=" + paadmtorigroomcode + ", "
				+ "paadmtorigbedcode=" + paadmtorigbedcode + ", "
				+ "paadmtenddate=" + paadmtenddate + ", "
				+ "paadmtendtime=" + paadmtendtime + ", "
				+ "paadmttargdoccode=" + paadmttargdoccode + ", "
				+ "paadmttargdeptcode=" + paadmttargdeptcode + ", "
				+ "paadmttargwardcode=" + paadmttargwardcode + ", "
				+ "paadmttargroomcode=" + paadmttargroomcode + ", "
				+ "paadmttargbedcode=" + paadmttargbedcode + ", "
				+ "paadmtstate=" + paadmtstate + ", "
				+ "updateusercode=" + updateusercode + ", "
				+ "updatedate=" + updatedate + ", "
				+ "updatetime=" + updatetime + ", "
				+ "insdatetime=" + insdatetime + "]";
	}


}