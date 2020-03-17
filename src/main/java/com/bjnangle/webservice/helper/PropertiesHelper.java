package com.bjnangle.webservice.helper;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author weixd
 * @Description //TODO
 * @Date 2018/12/25 17:28
 * @Param
 * @return
 **/
public class PropertiesHelper {

    /**
     * 获得property文件中[name]对应的值
     * @param path 配置文件名
     * @param name 属性名
     * @return properties文件中[name]对应的值
     * @author weixd
     * @data 2018-09-30
     */
    public static String getValue (String path, String name) {
        String value = readContent(path, name);
        if (value != null) {
            Pattern pattern = Pattern.compile("\\$\\{([\\w_]+)\\}");
            Matcher m = pattern.matcher(value);
            while(m.find()) {
                value = value.replace(m.group(), readContent(path, m.group(1)));
            }
        }
        return value;
    }

    /**
     * 获得property文件中[name]对应的值
     * @param path 配置文件名
     * @param name 属性名
     * @param defaultValue 默认值
     * @return
     * @author weixd
     * @data 2018-09-30
     */
    public static String getValue (String path, String name, String defaultValue) {
        String value = readContent(path, name);
        if (null == value) {
            return defaultValue;
        }
        Pattern pattern = Pattern.compile("\\$\\{([\\w_]+)\\}");
        Matcher m = pattern.matcher(value);
        while(m.find()) {
            value = value.replace(m.group(), readContent(path, m.group(1)));
        }
        return value;
    }

    /**
     * 获取properties文件的指定的key值
     * @param filePath 文件路径
     * @param key key名称
     * @return
     * @author weixd
     * @data 2018-09-30
     */
    private static String readContent(String filePath, String key) {
        Properties props = new Properties();
        String value = null;
        URL url = PropertiesHelper.class.getClassLoader().getResource(filePath);
        if (null != url) {
            try {
                props.load(getInputStream(filePath));
                value = props.getProperty(new String(key.getBytes("UTF-8"), "ISO-8859-1"));
                if (value != null) {
                    value =new String(value.getBytes("ISO-8859-1"), "UTF-8"); // 处理中文乱码
                }
            } catch (FileNotFoundException e) {
                LogHelper.error("FileNotFoundException", e.getMessage());
            } catch (IOException e) {
                LogHelper.error("IOException", e.getMessage());
            }
        }
        return value;
    }

    /**
     * properties文件转换成map的形式
     * @param filePath 文件路径
     * @return
     * @author weixd
     * @data 2018-09-30
     */
    public static Map<String, String> getMap(String filePath) {
        Properties props = new Properties();
        URL url = PropertiesHelper.class.getClassLoader().getResource(filePath);
        Map<String, String> map = new HashMap<>();
        if (null != url) {
            try {
                props.load(getInputStream(filePath));
                Set<Entry<Object, Object>> set = props.entrySet();
                for (Entry<Object, Object> entry : set) {
                    String key = (String) entry.getKey();
                    String value = (String) entry.getValue();
                    // key为null则不存储
                    if(key == null || "".equals(key.trim())) {
                        continue;
                    }
                    // 处理中文乱码
                    key = new String(key.trim().getBytes("ISO-8859-1"), "UTF-8");
                    if(key != null || !"".equals(key.trim())) {
                        // 处理中文乱码
                        value = new String(value.trim().getBytes("ISO-8859-1"), "UTF-8");
                    }
                    map.put(key, value);
                }
            } catch (FileNotFoundException e) {
                LogHelper.error("FileNotFoundException", e.getMessage(), e);
            } catch (IOException e) {
                LogHelper.error("IOException", e.getMessage(), e);
            }
        }
        return map;
    }

    /**
     * 根据map和文件路径创建properties文件
     * @param map map值
     * @param filePathAndName 文件路径以及名字
     * @author weixd
     * @data 2018-09-30
     */
    public static void createPropertiesFile(Map<String, String> map, String filePathAndName){
        Properties properties = new Properties();
        for(String key : map.keySet()){
            properties.setProperty(key, map.get(key));
        }
        try {
            properties.store(new FileWriter(filePathAndName),"");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static InputStream getInputStream(String fileName) {
        return PropertiesHelper.class.getClassLoader().getResourceAsStream(fileName);
    }


    public static void main(String[] args){

//        String host = PropertiesHelper.getValue("D:\\work\\workspace\\git\\nics\\nics-api\\nics-api-service\\src\\main\\resources\\tcp.properties", "tcp.host", "127.0.0.11");
//        String port = PropertiesHelper.getValue("D:\\work\\workspace\\git\\nics\\nics-api\\nics-api-service\\src\\main\\resources\\tcp.properties", "tcp.port", "");
//        System.out.println(host);
//        System.out.println(port);
//        Map<String, String> mapp = PropertiesHelper.getMap("D:\\work\\workspace\\git\\nics\\nics-api\\nics-api-service\\src\\main\\resources\\tcp.properties");
        Map<String, String> mapp = PropertiesHelper.getMap("socket.properties");
        System.out.println(mapp.get("tcp.host"));
        System.out.println(mapp.get("tcp.port"));


        Map map1 = PropertiesHelper.getMap("agent.properties");
        Map map2 = PropertiesHelper.getMap("device/bathRoomList.properties");
//        String dir = System.getProperty("user.dir") + "/eaglet-device-agent/src/main/resources/device/roomLampList.properties";
        String dir = "device/roomLampList.properties";
        Map map3 = PropertiesHelper.getMap(dir);
        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        PropertiesHelper.createPropertiesFile(map, dir);


    }
}
