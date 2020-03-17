package com.bjnangle.webservice.helper;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: nics
 * @description: ${description}
 * @author: weixd
 * @createTime: 2019-08-15 18:21
 **/
public class JsonHelper {

    public static List<Map<String, String>> json2map (String json) {
        List<Map<String, String>> listMap = new ArrayList<>();

        if (StringUtils.isNotBlank(json)) {
            JSONArray jsonArray = JSONArray.parseArray(json);
            //这里 jsonArray.size >= 0 <= 6
            if (jsonArray != null && jsonArray.size() > 0) {
                for (int i = 0; i < jsonArray.size(); i++) {
                    JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                    Map map = JSONObject.parseObject(jsonObject.toString(), Map.class);
                    listMap.add(map);
                }
            }
        }
        return listMap;
    }
}
