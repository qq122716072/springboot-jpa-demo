package com.bjnangle.webservice.helper;

public class Constant {

    //3.1.3-患者基本信息-服务编号
    public static final String PATIENT_REGISTRY_SERVICE_NO = "MES0001";

    //3.1.3-患者基本信息-服务名称
    public static final String PATIENT_REGISTRY_SERVICE_NAME = "PatientRegistry";

    //3.1.5-住院登记-服务编号
    public static final String IN_PATIENTEN_COUNTER_STARTED_SERVICE_NO = "MES0004";

    //3.1.5-住院登记-服务名称
    public static final String IN_PATIENTEN_COUNTER_STARTED_SERVICE_NAME = "InpatientEncounterStarted";

    //3.1.6-取消住院登记-服务编号
    public static final String IN_PATIENT_ENCOUNTER_CANCEL_SERVICE_NO = "MES0005";

    //3.1.6-取消住院登记-服务名称
    public static final String IN_PATIENT_ENCOUNTER_CANCEL_SERVICE_NAME = "InpatientEncounterCancel";

    //3.1.7-接收患者出院信息-服务编号
    public static final String IN_PATIENT_DISCHARGE_SERVICE_NO = "MES0006";

    //3.1.7-接收患者出院信息-服务名称
    public static final String IN_PATIENT_DISCHARGE_SERVICE_NAME = "InpatientDischarge";

    //3.1.8-取消患者出院-服务编号
    public static final String IN_PATIENT_DISCHARGE_CANEL_SERVICE_NO = "MES0007";

    //3.1.8-取消患者出院-服务名称
    public static final String IN_PATIENT_DISCHARGE_CANEL_SERVICE_NAME = "InpatientDischargeCancel";

    //3.1.1-接收医嘱信息-服务编号
    public static final String ADD_ORDERS_SERVICE_NO = "MES0008";

    //3.1.1-接收医嘱信息-服务名称
    public static final String ADD_ORDERS_SERVICE_NAME = "AddOrders";

    //3.1.2-医嘱状态变更-服务编号
    public static final String UPDATE_ORDERS_STATUS_SERVICE_NO = "MES0009";

    //3.1.2-医嘱状态变更-服务名称
    public static final String UPDATE_ORDERS_STATUS_SERVICE_NAME = "UpdateOrdersStatus";

    //3.1.4-接收转科信息-服务编号
    public static final String ADMTRANSACTION_SERVICE_NO = "MES0010";

    //3.1.4-接收转科信息-服务名称
    public static final String ADMTRANSACTION_SERVICE_NAME = "AdmTransaction";


    public static final String WEBSERVICE_RESPONSE_RESULTCODE_SUCCESS = "0";
    public static final String WEBSERVICE_RESPONSE_RESULTCONTENT_SUCCESS = "成功";

    public static final String WEBSERVICE_RESPONSE_RESULTCODE_FAIL = "1";
    public static final String WEBSERVICE_RESPONSE_RESULTCONTENT_FAIL = "失败";

    public static String WEBSERVICE_RESPONSE = "<Response>\n" +
            "\t<Header>\n" +
            "\t\t<SourceSystem></SourceSystem> \n" +
            "\t\t<MessageID></MessageID>\n" +
            "\t</Header>\n" +
            "\t<Body>\n" +
            "\t\t<ResultCode>%s</ResultCode>\n" +
            "\t\t<ResultContent>%s</ResultContent>\t\n" +
            "\t</Body>\n" +
            "</Response>\n";

    //患者状态(在院)
    public static int PATIENT_STATUS_IN = 0;
    //患者状态(出院)
    public static int PATIENT_STATUS_OUT = 1;

}
