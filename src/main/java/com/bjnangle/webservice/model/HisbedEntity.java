package com.bjnangle.webservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;

/**
 * @program: nics
 * @description: ${description}
 * @author: weixd
 * @createTime: 2019-01-10 13:57
 **/
@Entity
@Table(name = "hisBed")
public class HisbedEntity {

    @Id
    @Column(name = "id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonSerialize(using= ToStringSerializer.class)
    private Long id;

    private String buildName;

    private String floorName;

    @Column(name = "hushisiteid", nullable = false)
    private String hushisiteid;

    @Column(name = "bedId")
    private String bedId;

    @Column(name = "bedName")
    private String bedName;

    @Column(name = "roomId")
    private String roomId;

    @Column(name = "sickstate", nullable = false)
    private Integer sickstate = 0;

    @Column(name = "sickno")
    private String sickno;

    @Column(name = "sickname")
    private String sickname;

    @Column(name = "sex")
    private String sex;

    @Column(name = "age")
    private String age;

    @Column(name = "doctorZz")
    private String doctorZz;

    @Column(name = "doctorZg")
    private String doctorZg;

    @Column(name = "doctorJz")
    private String doctorJz;

    @Column(name = "nurlevel")
    private String nurlevel;

    @Column(name = "eatmode")
    private String eatmode;

    @Column(name = "chargeclass")
    private String chargeclass;

    @Column(name = "illstate")
    private String illstate;

    @Column(name = "cared")
    private String cared;

    @Column(name = "wcfs")
    private String wcfs;

    @Column(name = "jlfs")
    private String jlfs;

    @Column(name = "isolationId")
    private String isolationId;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "isadd")
    private String isadd;

    @Column(name = "revcdate")
    private String revcdate;

    @Column(name = "child1name")
    private String child1name;

    @Column(name = "child1sex")
    private String child1sex;

    @Column(name = "child1birthday")
    private String child1birthday;

    @Column(name = "child1weight")
    private String child1weight;

    @Column(name = "child1age")
    private String child1age;

    @Column(name = "child1memo")
    private String child1memo;

    @Column(name = "child1sexhd")
    private String child1sexhd;

    @Column(name = "child2name")
    private String child2name;

    @Column(name = "child2sex")
    private String child2sex;

    @Column(name = "child2birthday")
    private String child2birthday;

    @Column(name = "child2weight")
    private String child2weight;

    @Column(name = "child2age")
    private String child2age;

    @Column(name = "child2memo")
    private String child2memo;

    @Column(name = "child2sexhd")
    private String child2sexhd;

    @Column(name = "guomin")
    private String guomin;

    @Column(name = "ver")
    private Integer ver;

    /**
     * @Description 由于瑞金北院需要6个桂敏字段,下面6个字段,仅供瑞金北院使用
     **/
    //文书名称
    @Column(name = "bookName")
    private String bookName;

    //文书内容
    @Column(name = "bookContent")
    private String bookContent;

    //录入日期
    @Column(name = "entryDate")
    private String entryDate;

    //录入人
    @Column(name = "entryBy")
    private String entryBy;

    //打印排序时间
    @Column(name = "printSortDate")
    private String printSortDate;

    //住院号
    @Column(name = "sickNumber")
    private String sickNumber;

    //过敏1
    @Column(name = "allergy1")
    private String allergy1;

    //过敏2
    @Column(name = "allergy2")
    private String allergy2;

    //过敏3
    @Column(name = "allergy3")
    private String allergy3;

    //过敏4
    @Column(name = "allergy4")
    private String allergy4;

    //过敏5
    @Column(name = "allergy5")
    private String allergy5;

    //过敏6
    @Column(name = "allergy6")
    private String allergy6;

    //入院天数
    @Column(name = "admissionDay")
    private String admissionDay;

    //入院天数
    @Column(name = "staydays")
    private String staydays;

    //化疗前知情同意书
    @Column(name = "chemotherapyInformed", length = 2000)
    private String chemotherapyInformed;

    //鼻饲
    @Column(name = "nasalFeeding", length = 2000)
    private String nasalFeeding;

    //计尿
    @Column(name = "countUrine", length = 2000)
    private String countUrine;

    //预防压力性损伤1
    @Column(name = "preventionStressInjury1", length = 2000)
    private String preventionStressInjury1;

    //预防压力性损伤2
    @Column(name = "preventionStressInjury2", length = 2000)
    private String preventionStressInjury2;

    //防跌倒
    @Column(name = "preventionFall", length = 2000)
    private String preventionFall;

    //防坠床
    @Column(name = "preventionFallBed", length = 2000)
    private String preventionFallBed;

    //约束
    @Column(name = "protectedConstraint", length = 2000)
    private String protectedConstraint;

    //陪客证
    @Column(name = "escortCard", length = 2000)
    private String escortCard;

    public String getNasalFeeding() {
        return nasalFeeding;
    }

    public void setNasalFeeding(String nasalFeeding) {
        this.nasalFeeding = nasalFeeding;
    }

    public String getCountUrine() {
        return countUrine;
    }

    public void setCountUrine(String countUrine) {
        this.countUrine = countUrine;
    }

    public String getPreventionStressInjury1() {
        return preventionStressInjury1;
    }

    public void setPreventionStressInjury1(String preventionStressInjury1) {
        this.preventionStressInjury1 = preventionStressInjury1;
    }

    public String getPreventionStressInjury2() {
        return preventionStressInjury2;
    }

    public void setPreventionStressInjury2(String preventionStressInjury2) {
        this.preventionStressInjury2 = preventionStressInjury2;
    }

    public String getPreventionFall() {
        return preventionFall;
    }

    public void setPreventionFall(String preventionFall) {
        this.preventionFall = preventionFall;
    }

    public String getPreventionFallBed() {
        return preventionFallBed;
    }

    public void setPreventionFallBed(String preventionFallBed) {
        this.preventionFallBed = preventionFallBed;
    }

    public String getProtectedConstraint() {
        return protectedConstraint;
    }

    public void setProtectedConstraint(String protectedConstraint) {
        this.protectedConstraint = protectedConstraint;
    }

    public String getEscortCard() {
        return escortCard;
    }

    public void setEscortCard(String escortCard) {
        this.escortCard = escortCard;
    }

    public String getChemotherapyInformed() {
        return chemotherapyInformed;
    }

    public void setChemotherapyInformed(String chemotherapyInformed) {
        this.chemotherapyInformed = chemotherapyInformed;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryBy() {
        return entryBy;
    }

    public void setEntryBy(String entryBy) {
        this.entryBy = entryBy;
    }

    public String getPrintSortDate() {
        return printSortDate;
    }

    public void setPrintSortDate(String printSortDate) {
        this.printSortDate = printSortDate;
    }

    public String getStaydays() {
        return staydays;
    }

    public void setStaydays(String staydays) {
        this.staydays = staydays;
    }

    public String getSickNumber() {
        return sickNumber;
    }

    public void setSickNumber(String sickNumber) {
        this.sickNumber = sickNumber;
    }

    public String getAdmissionDay() {
        return admissionDay;
    }

    public void setAdmissionDay(String admissionDay) {
        this.admissionDay = admissionDay;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    public String getAllergy2() {
        return allergy2;
    }

    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    public String getAllergy3() {
        return allergy3;
    }

    public void setAllergy3(String allergy3) {
        this.allergy3 = allergy3;
    }

    public String getAllergy4() {
        return allergy4;
    }

    public void setAllergy4(String allergy4) {
        this.allergy4 = allergy4;
    }

    public String getAllergy5() {
        return allergy5;
    }

    public void setAllergy5(String allergy5) {
        this.allergy5 = allergy5;
    }

    public String getAllergy6() {
        return allergy6;
    }

    public void setAllergy6(String allergy6) {
        this.allergy6 = allergy6;
    }

    /**
     * @Description 由于瑞金北院需要6个桂敏字段,上面6个字段,仅供瑞金北院使用
     **/

    @Column(name = "shoushurq")
    private String shoushurq;

    @Column(name = "ruyuanrq")
    private String ruyuanrq;

    @Column(name = "detail")
    private String detail;

    @Column(name = "todayExes")
    private String todayExes;

    @Column(name = "balance")
    private String balance;

    @Column(name = "zerennurse")
    private String zerennurse;

    @Column(name = "zhuanrurq")
    private String zhuanrurq;

    @Column(name = "fallpreventtip")
    private String fallpreventtip;

    @Column(name = "pendantbed")
    private String pendantbed;

    @Column(name = "scaldprevent")
    private String scaldprevent;

    @Column(name = "wuxiprevent")
    private String wuxiprevent;

    @Column(name = "absolutebed")
    private String absolutebed;

    @Column(name = "bodybraking")
    private String bodybraking;

    @Column(name = "jlnl")
    private String jlnl;

    @Column(name = "tuoguanprevent")
    private String tuoguanprevent;

    @Column(name = "lostprevent")
    private String lostprevent;

    @Column(name = "cognitiveimpairment")
    private String cognitiveimpairment;

    @Column(name = "totalCosts")
    private String totalCosts;

    @Column(name = "prepayments")
    private String prepayments;

    @Column(name = "costs")
    private String costs;

    @Column(name = "chuyuanrq")
    private String chuyuanrq;

    @Column(name = "infectflag")
    private String infectflag;

    @Column(name = "operationname")
    private String operationname;

    @Column(name = "medicalCosts")
    private String medicalCosts;

    @Column(name = "inspectionFee")
    private String inspectionFee;

    @Column(name = "laboratoryFee")
    private String laboratoryFee;

    @Column(name = "operationFee")
    private String operationFee;

    @Column(name = "bedFee")
    private String bedFee;

    @Column(name = "otherCost")
    private String otherCost;

    @Column(name = "mainnursedesc")
    private String mainnursedesc;

    @Column(name = "mainnursedesc1")
    private String mainnursedesc1;

    @Column(name = "falldownflag")
    private String falldownflag;

    @Column(name = "pressureflag")
    private String pressureflag;

    @Column(name = "checkno")
    private String checkno;

    @Column(name = "checkname")
    private String checkname;

    @Column(name = "waitnumber")
    private String waitnumber;

    @Column(name = "checkdate")
    private String checkdate;

    @Column(name = "patientweight")
    private String patientweight;

    @Column(name = "dialysismode")
    private String dialysismode;

    @Column(name = "zhuanchurq")
    private String zhuanchurq;

    @Column(name = "energylevel")
    private String energylevel;

    @Column(name = "borntype")
    private String borntype;

    @Column(name = "gesweek")
    private String gesweek;

    @Column(name = "gelinaiyaojun")
    private String gelinaiyaojun;

    @Column(name = "child3age")
    private String child3age;

    @Column(name = "child3name")
    private String child3name;

    @Column(name = "child3sex")
    private String child3sex;

    @Column(name = "child3birthday")
    private String child3birthday;

    @Column(name = "child3weight")
    private String child3weight;

    @Column(name = "child4age")
    private String child4age;

    @Column(name = "child4name")
    private String child4name;

    @Column(name = "child4sex")
    private String child4sex;

    @Column(name = "child4birthday")
    private String child4birthday;

    @Column(name = "child4weight")
    private String child4weight;

    @Column(name = "babymotherid")
    private String babymotherid;

    @Column(name = "nurseincharge")
    private String nurseincharge;

    @Column(name = "armyidentity")
    private String armyidentity;

    @Column(name = "mdrinfected")
    private String mdrinfected;

    @Column(name = "noaccnurlevel")
    private String noaccnurlevel;

    @Column(name = "painscore")
    private String painscore;

    @Column(name = "sickbed")
    private String sickbed;

    @Column(name = "catheter")
    private String catheter;

    @Column(name = "selfcare")
    private String selfcare;

    @Column(name = "otheritem1")
    private String otheritem1;

    @Column(name = "otheritem2")
    private String otheritem2;

    @Column(name = "otheritem4")
    private String otheritem4;

    @Column(name = "otheritem3")
    private String otheritem3;

    @Column(name = "bloodpressure")
    private String bloodpressure;

    @Column(name = "escmonitor")
    private String escmonitor;

    @Column(name = "oxygen")
    private String oxygen;

    @Column(name = "stomachtube")
    private String stomachtube;

    @Column(name = "urinetube")
    private String urinetube;

    @Column(name = "dietName")
    private String dietName;

    @Column(name = "vte")
    private String vte;

    @Column(name = "nursecosts")
    private String nursecosts;

    @Column(name = "treatmentcosts")
    private String treatmentcosts;

    @Column(name = "mealcosts")
    private String mealcosts;

    @Column(name = "bloodproduct")
    private String bloodproduct;

    @Column(name = "braden")
    private String braden;

    @Column(name = "diedao")
    private String ycpf;

    @Column(name = "adl")
    private String adl;

    @Column(name = "drainage")
    private String drainage;

    @Column(name = "drainage1")
    private String drainage1;

    public HisbedEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHushisiteid() {
        return hushisiteid;
    }

    public void setHushisiteid(String hushisiteid) {
        this.hushisiteid = hushisiteid;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getSickstate() {
        return sickstate;
    }

    public void setSickstate(Integer sickstate) {
        this.sickstate = sickstate;
    }

    public String getSickno() {
        return sickno;
    }

    public void setSickno(String sickno) {
        this.sickno = sickno;
    }

    public String getSickname() {
        return sickname;
    }

    public void setSickname(String sickname) {
        this.sickname = sickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDoctorZz() {
        return doctorZz;
    }

    public void setDoctorZz(String doctorZz) {
        this.doctorZz = doctorZz;
    }

    public String getDoctorZg() {
        return doctorZg;
    }

    public void setDoctorZg(String doctorZg) {
        this.doctorZg = doctorZg;
    }

    public String getDoctorJz() {
        return doctorJz;
    }

    public void setDoctorJz(String doctorJz) {
        this.doctorJz = doctorJz;
    }

    public String getNurlevel() {
        return nurlevel;
    }

    public void setNurlevel(String nurlevel) {
        this.nurlevel = nurlevel;
    }

    public String getEatmode() {
        return eatmode;
    }

    public void setEatmode(String eatmode) {
        this.eatmode = eatmode;
    }

    public String getChargeclass() {
        return chargeclass;
    }

    public void setChargeclass(String chargeclass) {
        this.chargeclass = chargeclass;
    }

    public String getIllstate() {
        return illstate;
    }

    public void setIllstate(String illstate) {
        this.illstate = illstate;
    }

    public String getCared() {
        return cared;
    }

    public void setCared(String cared) {
        this.cared = cared;
    }

    public String getWcfs() {
        return wcfs;
    }

    public void setWcfs(String wcfs) {
        this.wcfs = wcfs;
    }

    public String getJlfs() {
        return jlfs;
    }

    public void setJlfs(String jlfs) {
        this.jlfs = jlfs;
    }

    public String getIsolationId() {
        return isolationId;
    }

    public void setIsolationId(String isolationId) {
        this.isolationId = isolationId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getIsadd() {
        return isadd;
    }

    public void setIsadd(String isadd) {
        this.isadd = isadd;
    }

    public String getRevcdate() {
        return revcdate;
    }

    public void setRevcdate(String revcdate) {
        this.revcdate = revcdate;
    }

    public String getChild1name() {
        return child1name;
    }

    public void setChild1name(String child1name) {
        this.child1name = child1name;
    }

    public String getChild1sex() {
        return child1sex;
    }

    public void setChild1sex(String child1sex) {
        this.child1sex = child1sex;
    }

    public String getChild1birthday() {
        return child1birthday;
    }

    public void setChild1birthday(String child1birthday) {
        this.child1birthday = child1birthday;
    }

    public String getChild1weight() {
        return child1weight;
    }

    public void setChild1weight(String child1weight) {
        this.child1weight = child1weight;
    }

    public String getChild1age() {
        return child1age;
    }

    public void setChild1age(String child1age) {
        this.child1age = child1age;
    }

    public String getChild1memo() {
        return child1memo;
    }

    public void setChild1memo(String child1memo) {
        this.child1memo = child1memo;
    }

    public String getChild1sexhd() {
        return child1sexhd;
    }

    public void setChild1sexhd(String child1sexhd) {
        this.child1sexhd = child1sexhd;
    }

    public String getChild2name() {
        return child2name;
    }

    public void setChild2name(String child2name) {
        this.child2name = child2name;
    }

    public String getChild2sex() {
        return child2sex;
    }

    public void setChild2sex(String child2sex) {
        this.child2sex = child2sex;
    }

    public String getChild2birthday() {
        return child2birthday;
    }

    public void setChild2birthday(String child2birthday) {
        this.child2birthday = child2birthday;
    }

    public String getChild2weight() {
        return child2weight;
    }

    public void setChild2weight(String child2weight) {
        this.child2weight = child2weight;
    }

    public String getChild2age() {
        return child2age;
    }

    public void setChild2age(String child2age) {
        this.child2age = child2age;
    }

    public String getChild2memo() {
        return child2memo;
    }

    public void setChild2memo(String child2memo) {
        this.child2memo = child2memo;
    }

    public String getChild2sexhd() {
        return child2sexhd;
    }

    public void setChild2sexhd(String child2sexhd) {
        this.child2sexhd = child2sexhd;
    }

    public String getGuomin() {
        return guomin;
    }

    public void setGuomin(String guomin) {
        this.guomin = guomin;
    }

    public String getShoushurq() {
        return shoushurq;
    }

    public void setShoushurq(String shoushurq) {
        this.shoushurq = shoushurq;
    }

    public String getRuyuanrq() {
        return ruyuanrq;
    }

    public void setRuyuanrq(String ruyuanrq) {
        this.ruyuanrq = ruyuanrq;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTodayExes() {
        return todayExes;
    }

    public void setTodayExes(String todayExes) {
        this.todayExes = todayExes;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getZerennurse() {
        return zerennurse;
    }

    public void setZerennurse(String zerennurse) {
        this.zerennurse = zerennurse;
    }

    public String getZhuanrurq() {
        return zhuanrurq;
    }

    public void setZhuanrurq(String zhuanrurq) {
        this.zhuanrurq = zhuanrurq;
    }

    public String getFallpreventtip() {
        return fallpreventtip;
    }

    public void setFallpreventtip(String fallpreventtip) {
        this.fallpreventtip = fallpreventtip;
    }

    public String getPendantbed() {
        return pendantbed;
    }

    public void setPendantbed(String pendantbed) {
        this.pendantbed = pendantbed;
    }

    public String getScaldprevent() {
        return scaldprevent;
    }

    public void setScaldprevent(String scaldprevent) {
        this.scaldprevent = scaldprevent;
    }

    public String getWuxiprevent() {
        return wuxiprevent;
    }

    public void setWuxiprevent(String wuxiprevent) {
        this.wuxiprevent = wuxiprevent;
    }

    public String getAbsolutebed() {
        return absolutebed;
    }

    public void setAbsolutebed(String absolutebed) {
        this.absolutebed = absolutebed;
    }

    public String getBodybraking() {
        return bodybraking;
    }

    public void setBodybraking(String bodybraking) {
        this.bodybraking = bodybraking;
    }

    public String getJlnl() {
        return jlnl;
    }

    public void setJlnl(String jlnl) {
        this.jlnl = jlnl;
    }

    public String getTuoguanprevent() {
        return tuoguanprevent;
    }

    public void setTuoguanprevent(String tuoguanprevent) {
        this.tuoguanprevent = tuoguanprevent;
    }

    public String getLostprevent() {
        return lostprevent;
    }

    public void setLostprevent(String lostprevent) {
        this.lostprevent = lostprevent;
    }

    public String getCognitiveimpairment() {
        return cognitiveimpairment;
    }

    public void setCognitiveimpairment(String cognitiveimpairment) {
        this.cognitiveimpairment = cognitiveimpairment;
    }

    public String getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(String totalCosts) {
        this.totalCosts = totalCosts;
    }

    public String getPrepayments() {
        return prepayments;
    }

    public void setPrepayments(String prepayments) {
        this.prepayments = prepayments;
    }

    public String getCosts() {
        return costs;
    }

    public void setCosts(String costs) {
        this.costs = costs;
    }

    public String getChuyuanrq() {
        return chuyuanrq;
    }

    public void setChuyuanrq(String chuyuanrq) {
        this.chuyuanrq = chuyuanrq;
    }

    public String getInfectflag() {
        return infectflag;
    }

    public void setInfectflag(String infectflag) {
        this.infectflag = infectflag;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public String getMedicalCosts() {
        return medicalCosts;
    }

    public void setMedicalCosts(String medicalCosts) {
        this.medicalCosts = medicalCosts;
    }

    public String getInspectionFee() {
        return inspectionFee;
    }

    public void setInspectionFee(String inspectionFee) {
        this.inspectionFee = inspectionFee;
    }

    public String getLaboratoryFee() {
        return laboratoryFee;
    }

    public void setLaboratoryFee(String laboratoryFee) {
        this.laboratoryFee = laboratoryFee;
    }

    public String getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(String operationFee) {
        this.operationFee = operationFee;
    }

    public String getBedFee() {
        return bedFee;
    }

    public void setBedFee(String bedFee) {
        this.bedFee = bedFee;
    }

    public String getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(String otherCost) {
        this.otherCost = otherCost;
    }

    public String getMainnursedesc() {
        return mainnursedesc;
    }

    public void setMainnursedesc(String mainnursedesc) {
        this.mainnursedesc = mainnursedesc;
    }

    public String getMainnursedesc1() {
        return mainnursedesc1;
    }

    public void setMainnursedesc1(String mainnursedesc1) {
        this.mainnursedesc1 = mainnursedesc1;
    }

    public String getFalldownflag() {
        return falldownflag;
    }

    public void setFalldownflag(String falldownflag) {
        this.falldownflag = falldownflag;
    }

    public String getPressureflag() {
        return pressureflag;
    }

    public void setPressureflag(String pressureflag) {
        this.pressureflag = pressureflag;
    }

    public String getCheckno() {
        return checkno;
    }

    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname;
    }

    public String getWaitnumber() {
        return waitnumber;
    }

    public void setWaitnumber(String waitnumber) {
        this.waitnumber = waitnumber;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public String getPatientweight() {
        return patientweight;
    }

    public void setPatientweight(String patientweight) {
        this.patientweight = patientweight;
    }

    public String getDialysismode() {
        return dialysismode;
    }

    public void setDialysismode(String dialysismode) {
        this.dialysismode = dialysismode;
    }

    public String getZhuanchurq() {
        return zhuanchurq;
    }

    public void setZhuanchurq(String zhuanchurq) {
        this.zhuanchurq = zhuanchurq;
    }

    public String getEnergylevel() {
        return energylevel;
    }

    public void setEnergylevel(String energylevel) {
        this.energylevel = energylevel;
    }

    public String getBorntype() {
        return borntype;
    }

    public void setBorntype(String borntype) {
        this.borntype = borntype;
    }

    public String getGesweek() {
        return gesweek;
    }

    public void setGesweek(String gesweek) {
        this.gesweek = gesweek;
    }

    public String getGelinaiyaojun() {
        return gelinaiyaojun;
    }

    public void setGelinaiyaojun(String gelinaiyaojun) {
        this.gelinaiyaojun = gelinaiyaojun;
    }

    public String getChild3age() {
        return child3age;
    }

    public void setChild3age(String child3age) {
        this.child3age = child3age;
    }

    public String getChild3name() {
        return child3name;
    }

    public void setChild3name(String child3name) {
        this.child3name = child3name;
    }

    public String getChild3sex() {
        return child3sex;
    }

    public void setChild3sex(String child3sex) {
        this.child3sex = child3sex;
    }

    public String getChild3birthday() {
        return child3birthday;
    }

    public void setChild3birthday(String child3birthday) {
        this.child3birthday = child3birthday;
    }

    public String getChild3weight() {
        return child3weight;
    }

    public void setChild3weight(String child3weight) {
        this.child3weight = child3weight;
    }

    public String getChild4age() {
        return child4age;
    }

    public void setChild4age(String child4age) {
        this.child4age = child4age;
    }

    public String getChild4name() {
        return child4name;
    }

    public void setChild4name(String child4name) {
        this.child4name = child4name;
    }

    public String getChild4sex() {
        return child4sex;
    }

    public void setChild4sex(String child4sex) {
        this.child4sex = child4sex;
    }

    public String getChild4birthday() {
        return child4birthday;
    }

    public void setChild4birthday(String child4birthday) {
        this.child4birthday = child4birthday;
    }

    public String getChild4weight() {
        return child4weight;
    }

    public void setChild4weight(String child4weight) {
        this.child4weight = child4weight;
    }

    public String getBabymotherid() {
        return babymotherid;
    }

    public void setBabymotherid(String babymotherid) {
        this.babymotherid = babymotherid;
    }

    public String getNurseincharge() {
        return nurseincharge;
    }

    public void setNurseincharge(String nurseincharge) {
        this.nurseincharge = nurseincharge;
    }

    public String getArmyidentity() {
        return armyidentity;
    }

    public void setArmyidentity(String armyidentity) {
        this.armyidentity = armyidentity;
    }

    public String getMdrinfected() {
        return mdrinfected;
    }

    public void setMdrinfected(String mdrinfected) {
        this.mdrinfected = mdrinfected;
    }

    public String getNoaccnurlevel() {
        return noaccnurlevel;
    }

    public void setNoaccnurlevel(String noaccnurlevel) {
        this.noaccnurlevel = noaccnurlevel;
    }

    public String getPainscore() {
        return painscore;
    }

    public void setPainscore(String painscore) {
        this.painscore = painscore;
    }

    public String getSickbed() {
        return sickbed;
    }

    public void setSickbed(String sickbed) {
        this.sickbed = sickbed;
    }

    public String getCatheter() {
        return catheter;
    }

    public void setCatheter(String catheter) {
        this.catheter = catheter;
    }

    public String getSelfcare() {
        return selfcare;
    }

    public void setSelfcare(String selfcare) {
        this.selfcare = selfcare;
    }

    public String getOtheritem1() {
        return otheritem1;
    }

    public void setOtheritem1(String otheritem1) {
        this.otheritem1 = otheritem1;
    }

    public String getOtheritem2() {
        return otheritem2;
    }

    public void setOtheritem2(String otheritem2) {
        this.otheritem2 = otheritem2;
    }

    public String getOtheritem4() {
        return otheritem4;
    }

    public void setOtheritem4(String otheritem4) {
        this.otheritem4 = otheritem4;
    }

    public String getOtheritem3() {
        return otheritem3;
    }

    public void setOtheritem3(String otheritem3) {
        this.otheritem3 = otheritem3;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getEscmonitor() {
        return escmonitor;
    }

    public void setEscmonitor(String escmonitor) {
        this.escmonitor = escmonitor;
    }

    public String getOxygen() {
        return oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    public String getStomachtube() {
        return stomachtube;
    }

    public void setStomachtube(String stomachtube) {
        this.stomachtube = stomachtube;
    }

    public String getUrinetube() {
        return urinetube;
    }

    public void setUrinetube(String urinetube) {
        this.urinetube = urinetube;
    }

    public String getDietName() {
        return dietName;
    }

    public void setDietName(String dietName) {
        this.dietName = dietName;
    }

    public String getVte() {
        return vte;
    }

    public void setVte(String vte) {
        this.vte = vte;
    }

    public String getNursecosts() {
        return nursecosts;
    }

    public void setNursecosts(String nursecosts) {
        this.nursecosts = nursecosts;
    }

    public String getTreatmentcosts() {
        return treatmentcosts;
    }

    public void setTreatmentcosts(String treatmentcosts) {
        this.treatmentcosts = treatmentcosts;
    }

    public String getMealcosts() {
        return mealcosts;
    }

    public void setMealcosts(String mealcosts) {
        this.mealcosts = mealcosts;
    }

    public String getBloodproduct() {
        return bloodproduct;
    }

    public void setBloodproduct(String bloodproduct) {
        this.bloodproduct = bloodproduct;
    }

    public String getBraden() {
        return braden;
    }

    public void setBraden(String braden) {
        this.braden = braden;
    }

    public String getYcpf() {
        return ycpf;
    }

    public void setYcpf(String ycpf) {
        this.ycpf = ycpf;
    }

    public String getAdl() {
        return adl;
    }

    public void setAdl(String adl) {
        this.adl = adl;
    }

    public String getDrainage() {
        return drainage;
    }

    public void setDrainage(String drainage) {
        this.drainage = drainage;
    }

    public String getDrainage1() {
        return drainage1;
    }

    public void setDrainage1(String drainage1) {
        this.drainage1 = drainage1;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    //重写equals和hashcode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        HisbedEntity that = (HisbedEntity) object;

        if (!hushisiteid.equals(that.hushisiteid)) return false;
        if (!bedId.equals(that.bedId)) return false;
        if (!roomId.equals(that.roomId)) return false;
        return sickno.equals(that.sickno);
    }

    @Override
    public int hashCode() {
        int result = hushisiteid.hashCode();
        result = 31 * result + bedId.hashCode();
        result = 31 * result + roomId.hashCode();
        result = 31 * result + sickno.hashCode();
        return result;
    }
}
