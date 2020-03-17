package com.bjnangle.webservice.helper;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.InputSource;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @program: nics
 * @description: ${description}
 * @author: weixd
 * @createTime: 2019-03-26 15:53
 **/

@RestController
public class XmlHelper {

    public static String InpatientEncounterStartedXml = "<Request>\n" +
            "    <Header>\n" +
            "        <SourceSystem></SourceSystem>\n" +
            "        <MessageID></MessageID>\n" +
            "    </Header>\n" +
            "    <Body>\n" +
            "        <InpatientEncounterStartedRt>\n" +
            "            <PATPatientID>00001</PATPatientID>\n" +
            "            <PAADMVisitNumber>11111</PAADMVisitNumber>\n" +
            "            <PAADMEncounterTypeCode>22222</PAADMEncounterTypeCode>\n" +
            "            <PAADMEncounterTypeDesc>33333</PAADMEncounterTypeDesc>\n" +
            "            <FeeTypeCode>44444</FeeTypeCode>\n" +
            "            <FeeTypeDesc>55555</FeeTypeDesc>\n" +
            "            <PAADMVisitTimes>66666</PAADMVisitTimes>\n" +
            "            <PAADMAdmitDocCode>77777</PAADMAdmitDocCode>\n" +
            "            <PAADMAdmitDocDesc>88888</PAADMAdmitDocDesc>\n" +
            "            <PAADMStartDate>99999</PAADMStartDate>\n" +
            "            <PAADMStartTime>2020-03-17</PAADMStartTime>\n" +
            "            <PAADMAdmDeptCode>病区</PAADMAdmDeptCode>\n" +
            "            <PAADMAdmDeptDesc>12121</PAADMAdmDeptDesc>\n" +
            "            <PAADMAdmWardCode>1212</PAADMAdmWardCode>\n" +
            "            <PAADMAdmWardDesc>2121</PAADMAdmWardDesc>\n" +
            "            <PAADMCurBedNo>病床01</PAADMCurBedNo>\n" +
            "            <PAADMDiagnoseList>\n" +
            "                <PAADMDiagnose>\n" +
            "                    <PADDiagCode>12</PADDiagCode>\n" +
            "                    <PADDiagDesc>34</PADDiagDesc>\n" +
            "                    <PADDiagType>56</PADDiagType>\n" +
            "                    <PADDiagDocCode>78</PADDiagDocCode>\n" +
            "                    <PADDiagDocDesc>90</PADDiagDocDesc>\n" +
            "                    <PADDiagCategory>111</PADDiagCategory>\n" +
            "                    <PADDiagDate>222</PADDiagDate>\n" +
            "                    <PADDiagTime>333</PADDiagTime>\n" +
            "                    <PADRemarks>444</PADRemarks>\n" +
            "                </PAADMDiagnose>\n" +
            "            </PAADMDiagnoseList>\n" +
            "            <UpdateUserCode>2020-03-17</UpdateUserCode>\n" +
            "            <UpdateDate>2020-03-17</UpdateDate>\n" +
            "            <UpdateTime>2020-03-17</UpdateTime>\n" +
            "        </InpatientEncounterStartedRt>\n" +
            "    </Body>\n" +
            "</Request>\n";
    public static String PatientRegistryXml = "<Request>\n" +
            "    <Header>\n" +
            "        <SourceSystem></SourceSystem>\n" +
            "        <MessageID></MessageID>\n" +
            "    </Header>\n" +
            "    <Body>\n" +
            "        <PatientRegistryRt>\n" +
            "            <PATPatientID>00001</PATPatientID>\n" +
            "            <PATName>测试病人1</PATName>\n" +
            "            <PATDob>2020-03-09</PATDob>\n" +
            "            <PATSexCode>1</PATSexCode>\n" +
            "            <PATSexDesc>男</PATSexDesc>\n" +
            "            <PATMaritalStatusCode>1</PATMaritalStatusCode>\n" +
            "            <PATMaritalStatusDesc>未婚</PATMaritalStatusDesc>\n" +
            "            <PATNationCode>01</PATNationCode>\n" +
            "            <PATNationDesc>汉</PATNationDesc>\n" +
            "            <PATCountryCode>86</PATCountryCode>\n" +
            "            <PATCountryDesc>中国</PATCountryDesc>\n" +
            "            <PATDeceasedDate>2120-03-09</PATDeceasedDate>\n" +
            "            <PATDeceasedTime>12:00:00</PATDeceasedTime>\n" +
            "            <PATHealthCardID>123456789</PATHealthCardID>\n" +
            "            <PATMotherID>12221</PATMotherID>\n" +
            "            <PATOccupationCode>1</PATOccupationCode>\n" +
            "            <PATOccupationDesc>1</PATOccupationDesc>\n" +
            "            <PATWorkPlaceName>1</PATWorkPlaceName>\n" +
            "            <PATWorkPlaceTelNum>2222222</PATWorkPlaceTelNum>\n" +
            "            <PATAddresses>\n" +
            "                <PATAddress>\n" +
            "                    <PATAddressType>中国</PATAddressType>\n" +
            "                    <PATAddressDesc>中</PATAddressDesc>\n" +
            "                    <PATHouseNum>北京</PATHouseNum>\n" +
            "                    <PATVillage>海淀</PATVillage>\n" +
            "                    <PATCountryside>中关村</PATCountryside>\n" +
            "                    <PATCountyCode>北京</PATCountyCode>\n" +
            "                    <PATCountyDesc>海淀</PATCountyDesc>\n" +
            "                    <PATCityCode>中关村</PATCityCode>\n" +
            "                    <PATCityDesc>111</PATCityDesc>\n" +
            "                    <PATProvinceCode>111</PATProvinceCode>\n" +
            "                    <PATProvinceDesc>111</PATProvinceDesc>\n" +
            "                    <PATPostalCode>222</PATPostalCode>\n" +
            "                </PATAddress>\n" +
            "                <PATAddress>\n" +
            "                    <PATAddressType>中国</PATAddressType>\n" +
            "                    <PATAddressDesc>中</PATAddressDesc>\n" +
            "                    <PATHouseNum>北京</PATHouseNum>\n" +
            "                    <PATVillage>海淀</PATVillage>\n" +
            "                    <PATCountryside>中关村</PATCountryside>\n" +
            "                    <PATCountyCode>北京</PATCountyCode>\n" +
            "                    <PATCountyDesc>海淀</PATCountyDesc>\n" +
            "                    <PATCityCode>中关村</PATCityCode>\n" +
            "                    <PATCityDesc>111</PATCityDesc>\n" +
            "                    <PATProvinceCode>111</PATProvinceCode>\n" +
            "                    <PATProvinceDesc>111</PATProvinceDesc>\n" +
            "                    <PATPostalCode>222</PATPostalCode>\n" +
            "                </PATAddress>\n" +
            "            </PATAddresses>\n" +
            "            <PATIdentityList>\n" +
            "                <PATIdentity>\n" +
            "                    <PATIdentityNum>PATIdentityNum</PATIdentityNum>\n" +
            "                    <PATIdTypeCode>PATIdTypeCode</PATIdTypeCode>\n" +
            "                    <PATIdTypeDesc>PATIdTypeDesc</PATIdTypeDesc>\n" +
            "                </PATIdentity>\n" +
            "                <PATIdentity>\n" +
            "                    <PATIdentityNum>PATIdentityNum</PATIdentityNum>\n" +
            "                    <PATIdTypeCode>PATIdTypeCode</PATIdTypeCode>\n" +
            "                    <PATIdTypeDesc>PATIdTypeDesc</PATIdTypeDesc>\n" +
            "                </PATIdentity>\n" +
            "            </PATIdentityList>\n" +
            "            <PATRelationList>\n" +
            "               <PATRelation>\n" +
            "                  <PATRelationCode/>\n" +
            "                  <PATRelationDesc/>\n" +
            "                  <PATRelationName/>\n" +
            "                  <PATRelationPhone/>\n" +
            "                  <PATRelationAddressList>\n" +
            "                    <PATRelationAddress>\n" +
            "                      <PATRelationAddressDesc/>\n" +
            "                      <PATRelationHouseNum/>\n" +
            "                      <PATRelationVillage/>\n" +
            "                      <PATRelationCountryside/>\n" +
            "                      <PATRelationCountyCode/>\n" +
            "                      <PATRelationCountyDesc/>\n" +
            "                      <PATRelationCityCode/>\n" +
            "                      <PATRelationCityDesc/>\n" +
            "                      <PATRelationProvinceCode/>\n" +
            "                      <PATRelationProvinceDesc/>\n" +
            "                      <PATRelationPostalCode/>\n" +
            "                  </PATRelationAddress>\n" +
            "                </PATRelationAddressList>\n" +
            "              </PATRelation>\n" +
            "               <PATRelation>\n" +
            "                  <PATRelationCode/>\n" +
            "                  <PATRelationDesc/>\n" +
            "                  <PATRelationName/>\n" +
            "                  <PATRelationPhone/>\n" +
            "                  <PATRelationAddressList>\n" +
            "                    <PATRelationAddress>\n" +
            "                      <PATRelationAddressDesc/>\n" +
            "                      <PATRelationHouseNum/>\n" +
            "                      <PATRelationVillage/>\n" +
            "                      <PATRelationCountryside/>\n" +
            "                      <PATRelationCountyCode/>\n" +
            "                      <PATRelationCountyDesc/>\n" +
            "                      <PATRelationCityCode/>\n" +
            "                      <PATRelationCityDesc/>\n" +
            "                      <PATRelationProvinceCode/>\n" +
            "                      <PATRelationProvinceDesc/>\n" +
            "                      <PATRelationPostalCode/>\n" +
            "                  </PATRelationAddress>\n" +
            "                </PATRelationAddressList>\n" +
            "              </PATRelation>\n" +
            "            </PATRelationList>\n" +
            "            <PATTelephone>13111111111</PATTelephone>\n" +
            "            <PATRemarks>备注</PATRemarks>\n" +
            "            <UpdateUserCode>code</UpdateUserCode>\n" +
            "            <UpdateUserDesc>desc</UpdateUserDesc>\n" +
            "            <UpdateDate>2020-03-09</UpdateDate>\n" +
            "            <UpdateTime>12:00:00</UpdateTime>\n" +
            "        </PatientRegistryRt>\n" +
            "    </Body>\n" +
            "</Request>\n";

    public static String PatientRegistryXml_json = "{\"PATPatientID\":\"00001\",\"PATName\":\"测试病人1\",\"PATDob\":\"2020-03-09\",\"PATSexCode\":\"1\",\"PATSexDesc\":\"男\",\"PATMaritalStatusCode\":\"1\",\"PATMaritalStatusDesc\":\"未婚\",\"PATNationCode\":\"01\",\"PATNationDesc\":\"汉\",\"PATCountryCode\":\"86\",\"PATCountryDesc\":\"中国\",\"PATDeceasedDate\":\"2120-03-09\",\"PATDeceasedTime\":\"12:00:00\",\"PATHealthCardID\":\"123456789\",\"PATMotherID\":\"12221\",\"PATOccupationCode\":\"1\",\"PATOccupationDesc\":\"1\",\"PATWorkPlaceName\":\"1\",\"PATWorkPlaceTelNum\":\"2222222\",\"PATAddresses\":\"[{\\\"PATAddress\\\":\\\"{\\\\\\\"PATAddressType\\\\\\\":\\\\\\\"中国\\\\\\\",\\\\\\\"PATAddressDesc\\\\\\\":\\\\\\\"中\\\\\\\",\\\\\\\"PATHouseNum\\\\\\\":\\\\\\\"北京\\\\\\\",\\\\\\\"PATVillage\\\\\\\":\\\\\\\"海淀\\\\\\\",\\\\\\\"PATCountryside\\\\\\\":\\\\\\\"中关村\\\\\\\",\\\\\\\"PATCountyCode\\\\\\\":\\\\\\\"北京\\\\\\\",\\\\\\\"PATCountyDesc\\\\\\\":\\\\\\\"海淀\\\\\\\",\\\\\\\"PATCityCode\\\\\\\":\\\\\\\"中关村\\\\\\\",\\\\\\\"PATCityDesc\\\\\\\":\\\\\\\"111\\\\\\\",\\\\\\\"PATProvinceCode\\\\\\\":\\\\\\\"111\\\\\\\",\\\\\\\"PATProvinceDesc\\\\\\\":\\\\\\\"111\\\\\\\",\\\\\\\"PATPostalCode\\\\\\\":\\\\\\\"222\\\\\\\"}\\\"},{\\\"PATAddress\\\":\\\"{\\\\\\\"PATAddressType\\\\\\\":\\\\\\\"中国\\\\\\\",\\\\\\\"PATAddressDesc\\\\\\\":\\\\\\\"中\\\\\\\",\\\\\\\"PATHouseNum\\\\\\\":\\\\\\\"北京\\\\\\\",\\\\\\\"PATVillage\\\\\\\":\\\\\\\"海淀\\\\\\\",\\\\\\\"PATCountryside\\\\\\\":\\\\\\\"中关村\\\\\\\",\\\\\\\"PATCountyCode\\\\\\\":\\\\\\\"北京\\\\\\\",\\\\\\\"PATCountyDesc\\\\\\\":\\\\\\\"海淀\\\\\\\",\\\\\\\"PATCityCode\\\\\\\":\\\\\\\"中关村\\\\\\\",\\\\\\\"PATCityDesc\\\\\\\":\\\\\\\"111\\\\\\\",\\\\\\\"PATProvinceCode\\\\\\\":\\\\\\\"111\\\\\\\",\\\\\\\"PATProvinceDesc\\\\\\\":\\\\\\\"111\\\\\\\",\\\\\\\"PATPostalCode\\\\\\\":\\\\\\\"222\\\\\\\"}\\\"}]\",\"PATIdentityList\":\"[{\\\"PATIdentity\\\":\\\"{\\\\\\\"PATIdentityNum\\\\\\\":\\\\\\\"PATIdentityNum\\\\\\\",\\\\\\\"PATIdTypeCode\\\\\\\":\\\\\\\"PATIdTypeCode\\\\\\\",\\\\\\\"PATIdTypeDesc\\\\\\\":\\\\\\\"PATIdTypeDesc\\\\\\\"}\\\"},{\\\"PATIdentity\\\":\\\"{\\\\\\\"PATIdentityNum\\\\\\\":\\\\\\\"PATIdentityNum\\\\\\\",\\\\\\\"PATIdTypeCode\\\\\\\":\\\\\\\"PATIdTypeCode\\\\\\\",\\\\\\\"PATIdTypeDesc\\\\\\\":\\\\\\\"PATIdTypeDesc\\\\\\\"}\\\"}]\",\"PATRelationList\":\"[{\\\"PATRelation\\\":\\\"{\\\\\\\"PATRelationCode\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationDesc\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationName\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationPhone\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationAddressList\\\\\\\":\\\\\\\"\\\\\\\"}\\\"},{\\\"PATRelation\\\":\\\"{\\\\\\\"PATRelationCode\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationDesc\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationName\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationPhone\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"PATRelationAddressList\\\\\\\":\\\\\\\"\\\\\\\"}\\\"}]\",\"PATTelephone\":\"13111111111\",\"PATRemarks\":\"备注\",\"UpdateUserCode\":\"code\",\"UpdateUserDesc\":\"desc\",\"UpdateDate\":\"2020-03-09\",\"UpdateTime\":\"12:00:00\"}";

    private static String encoding = "UTF-8";

    public static String parseXML (String xml) {
        xml = processXML(xml);
        String json = null;
        //可以处理多个病人,暂时没用,以后好扩展
        List<Object> list = new ArrayList<>();
        Map<String, String> map = new LinkedHashMap<>();
        if (StringUtils.isNotBlank(xml)) {
            SAXReader reader = new SAXReader(false);
            InputSource source = new InputSource(new ByteArrayInputStream(xml.getBytes(Charset.forName(encoding))));
            source.setEncoding(encoding);

            try {
                Document doc = reader.read(source);
                Iterator iterator = doc.getRootElement().elementIterator();

                while (iterator.hasNext()) {
                    Element e1 = (Element) iterator.next();
                    Iterator iter1 = e1.elementIterator();
                    while (iter1.hasNext()) {
                        Element e = (Element) iter1.next();
                        Iterator iter = e.elementIterator();
                        if (e.getName().equals("PATAddresses") || e.getName().equals("PATIdentityList") || e.getName().equals("PATRelationList")) {
                            Iterator iterInner = e.elementIterator();
                            List<Map<String, String>> innerList = new ArrayList<>();

                            while (iterInner.hasNext()) {
                                Map<String, String> mapInner = new LinkedHashMap<>();
                                Map<String, String> mapInnerInner = new LinkedHashMap<>();
                                Element eInner = (Element) iterInner.next();
                                //PATAddress PATIdentity PATRelation 下面的节点
                                Iterator iteratorInnerInner = eInner.elementIterator();
                                while (iteratorInnerInner.hasNext()) {
                                    Element eInnerInner = (Element) iteratorInnerInner.next();
                                    mapInnerInner.put(eInnerInner.getName(), eInnerInner.getTextTrim());
                                }
                                mapInner.put(eInner.getName(), JSONObject.toJSONString(mapInnerInner));
                                innerList.add(mapInner);
                            }
                            map.put(e.getName(), JSONObject.toJSONString(innerList));
                        } else {
                            map.put(e.getName(), e.getTextTrim());
                        }

                    }
                    list.add(map);

                }
            } catch (Exception e) {
                e.printStackTrace();
                LogHelper.error(XmlHelper.class, "", e);
            }

        }

        return JSONObject.toJSONString(list);
    }


    public static String processXML (String xml) {
        String startStr = "<Body>";
        String endStr = "</Body>";
        String noData = "";
        if (xml.contains(startStr) && xml.contains(endStr)) {
            StringBuilder sb = new StringBuilder(xml);
            String str = sb.toString().split(startStr)[1].split(endStr)[0];
            return "<InPatInfos>" + str + "</InPatInfos>";
        }
        if (!xml.contains(startStr) && !xml.contains(endStr) && xml.contains(noData)) {
            return "";
        }
        return "";
    }

    public static void main(String[] args) {
        String parseXML = parseXML(PatientRegistryXml);
//        System.out.println(parseXML);
        List<Map<String, String>> mapList = JsonHelper.json2map(parseXML);
        System.out.println(mapList);
    }
}
