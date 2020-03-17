package com.bjnangle.webservice.base;

import com.alibaba.fastjson.JSON;
import com.bjnangle.webservice.helper.Constant;
import com.bjnangle.webservice.helper.JsonHelper;
import com.bjnangle.webservice.helper.LogHelper;
import com.bjnangle.webservice.helper.XmlHelper;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CommonService {

    public String processMessage(String propertiesMapJson, String message) {
        String resultCode = "";
        String resultContent = "";
        try {
            //todo 测试数据
          message = XmlHelper.InpatientEncounterStartedXml;
            LogHelper.info(getClass(), String.format("接收到的消息字符串:{%s}", message.trim()));
            //解析响应字符串,格式化为map的json的形式
            String jsonStr = XmlHelper.parseXML(message);
            //todo 测试数据
//          jsonStr = XmlHelper.PatientRegistryXml_json;
            List<Map<String, String>> listMap = JsonHelper.json2map(jsonStr);
            listMap = changeMapKey(propertiesMapJson, listMap);
            Boolean flag = listMap2ObjectAndUpdateDB(listMap, Object.class);
            resultCode = Constant.WEBSERVICE_RESPONSE_RESULTCODE_SUCCESS;
            resultContent = Constant.WEBSERVICE_RESPONSE_RESULTCONTENT_SUCCESS;
        } catch (Exception e) {
            resultCode = Constant.WEBSERVICE_RESPONSE_RESULTCODE_FAIL;
            resultContent = Constant.WEBSERVICE_RESPONSE_RESULTCONTENT_FAIL;
            LogHelper.error(getClass(), e.getMessage(), e);
        }

        String result = String.format(Constant.WEBSERVICE_RESPONSE, resultCode, resultContent);
        return result;
    }

    private List<Map<String,String>> changeMapKey(String propertiesMapJson, List<Map<String,String>> listMap) {
        List<Map<String,String>> result = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(listMap)) {
            // 使用fastjson将properties中的文件映射为map对象
            Map<String, String> mapper  = JSON.parseObject(propertiesMapJson, new HashMap<String, String>(128).getClass());
            for (Map<String,String> map : listMap) {
                Map<String, String> newMap = new HashMap<>();
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (mapper.containsKey(key)) {
                            newMap.put(mapper.get(key), entry.getValue());
                        }
                    }
                }
                result.add(newMap);
            }
        }
        return result;
    }

    protected abstract Boolean listMap2ObjectAndUpdateDB(List<Map<String, String>> listMap, Class<Object> objectClass);
}
