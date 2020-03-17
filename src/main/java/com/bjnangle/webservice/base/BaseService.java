package com.bjnangle.webservice.base;


import com.bjnangle.webservice.*;
import com.bjnangle.webservice.helper.Constant;
import com.bjnangle.webservice.helper.PropertiesHelper;
import org.apache.commons.lang3.StringUtils;

import javax.jws.WebService;

@WebService
public class BaseService {

    private PatientBaseInfo patientBaseInfo = new PatientBaseInfo();
    private InPatientEncounterStarted inPatientEncounterStarted = new InPatientEncounterStarted();
    private InPatientEncounterCancel inPatientEncountercancel = new InPatientEncounterCancel();
    private InPatientDischarge inPatientDischarge = new InPatientDischarge();
    private InPatientDischargeCancel inPatientDischargeCancel = new InPatientDischargeCancel();
    private AddOrders addOrders = new AddOrders();
    private UpdateOrdersStatus updateOrdersStatus = new UpdateOrdersStatus();
    private AdmTransaction admTransaction = new AdmTransaction();

    //患者基本信息
    private static String patientRegistry_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.PatientRegistry", "null");
    //住院登记
    private static String inpatientEncounterStarted_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.InpatientEncounterStarted", "null");
    //取消住院登记
    private static String inpatientEncounterCancel_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.InpatientEncounterCancel", "null");
    //接收患者出院信息
    private static String inpatientDischarge_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.InpatientDischarge", "null");
    //取消患者出院
    private static String inpatientDischargeCancel_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.InpatientDischargeCancel", "null");
    //接收医嘱信息
    private static String addOrders_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.AddOrders", "null");
    //医嘱状态变更
    private static String updateOrdersStatus_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.UpdateOrdersStatus", "null");
    //接收转科信息
    private static String admTransaction_json = PropertiesHelper.getValue("application-mapconfig.properties", "anhui.provincial.hospital.AdmTransaction", "null");

    public String HIPMessageServer (String action, String message) {
        String response = "";
        //1.区分出是哪个方法调用
        response = checkInterface(action, message);
        //2.进入相应的子类处理
        //3.返回结果
        return response;
    }

    private String checkInterface(String action, String message) {
        String response = "";
        if (StringUtils.isNoneBlank(action)) {
            switch (action) {
                //患者基本信息
                case Constant.PATIENT_REGISTRY_SERVICE_NO:
                    response = patientBaseInfo.processMessage(patientRegistry_json, message);
                    break;
                //住院登记
                case Constant.IN_PATIENTEN_COUNTER_STARTED_SERVICE_NO:
                    response =  inPatientEncounterStarted.processMessage(inpatientEncounterStarted_json, message);
                    break;
                //取消住院登记
                case Constant.IN_PATIENT_ENCOUNTER_CANCEL_SERVICE_NO:
                    response =  inPatientEncountercancel.processMessage(inpatientEncounterCancel_json, message);
                    break;
                //接收患者出院信息
                case Constant.IN_PATIENT_DISCHARGE_SERVICE_NO:
                    response =  inPatientDischarge.processMessage(inpatientDischarge_json, message);
                    break;
                //取消患者出院
                case Constant.IN_PATIENT_DISCHARGE_CANEL_SERVICE_NO:
                    response =  inPatientDischargeCancel.processMessage(inpatientDischargeCancel_json, message);
                    break;
                //接收医嘱信息
                case Constant.ADD_ORDERS_SERVICE_NO:
                    response =  addOrders.processMessage(addOrders_json, message);
                    break;
                //医嘱状态变更
                case Constant.UPDATE_ORDERS_STATUS_SERVICE_NO:
                    response =  updateOrdersStatus.processMessage(updateOrdersStatus_json, message);
                    break;
                //接收转科信息
                case Constant.ADMTRANSACTION_SERVICE_NO:
                    response =  admTransaction.processMessage(admTransaction_json, message);
                    break;
            }
        }

        return response;

    }

//    protected abstract String processMessage(String message);
}
