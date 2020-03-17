package com.bjnangle.webservice.bootstrap;

import com.bjnangle.webservice.base.BaseService;
import com.bjnangle.webservice.helper.LogHelper;
import com.bjnangle.webservice.helper.PropertiesHelper;

import javax.xml.ws.Endpoint;

public class StartWebservices {

    private String url = PropertiesHelper.getValue("application.properties", "webservice.url");

    public void startWebservices() {
        Endpoint.publish(url, new BaseService());
        LogHelper.info(getClass(), url + "?wsdl");
        LogHelper.info(Bootstrap.class, "webservice started success");
        System.out.println("service started success");
    }
}
