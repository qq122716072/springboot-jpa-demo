package com.bjnangle.webservice.helper;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 自动生成javaBean工具类
 */
public class OrmHelper {

    private static String url;
    private static String username;
    private static String pwd;
    private static String driver;
    static {
        url = PropertiesHelper.getValue("application.properties", "sqlserver.url", null);
        username = PropertiesHelper.getValue("application.properties", "sqlserver.username", null);
        pwd = PropertiesHelper.getValue("application.properties", "sqlserver.password", null);
        driver = PropertiesHelper.getValue("application.properties", "sqlserver.driverClassName", null);
    }

    public static String getJavaBean(String tables,String packageName){
        StringBuilder sb = null;
        String[] split = tables.split(",");
        for (String tableName : split) {
			String className = toLower(tableName);
//            String className = toLower(tableName).substring(tableName.indexOf("_"));
            sb = new StringBuilder("package " + packageName + ";\n\n");
            StringBuilder sbColumn = new StringBuilder();
            StringBuilder sbGetSet = new StringBuilder();
            StringBuilder sbConstructor = new StringBuilder();
            StringBuilder sbToString = new StringBuilder();
            sb.append("public class " + tuoFeng(className) + " implements java.io.Serializable {\n\n");
            sb.append("\tprivate static final long serialVersionUID = 1L;\n\n");
            StringBuilder constract = new StringBuilder();
            StringBuilder constract1 = new StringBuilder();
            StringBuilder constractThis = new StringBuilder();
            String sql = "SELECT TOP 1 * FROM "  + tableName;
            try {
                Class<?> forName = Class.forName(driver);
                Connection conn = DriverManager.getConnection(url, username, pwd);
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData data = rs.getMetaData();
                for (int i=1;i<data.getColumnCount();i++) {
                    String columnTypeName = data.getColumnTypeName(i);
                    String oracleSqlType2javaType = sqlserverSqlType2javaType(columnTypeName);
                    String lower = toLower(data.getColumnName(i));
                    if(i == data.getColumnCount() - 1) {
                        sbColumn.append(lower)
                                .append("=\" + ")
                                .append(lower)
                                .append(" + \",");
                    }else {
                        sbColumn.append(lower)
                                .append("=\" + ")
                                .append(lower)
                                .append(" + \", \"\n\t\t\t\t+ \"");
                    }
                    sb.append("\tprivate " + oracleSqlType2javaType + "  " + lower + ";\n");
                    /**
                     * public String getUpdateDate() {
                     *		return updateDate;
                     *	}
                     *
                     *	public void setUpdateDate(String updateDate) {
                     *		this.updateDate = updateDate;
                     *	}
                     */
                    sbGetSet.append("\tpublic ")
                            .append(oracleSqlType2javaType)
                            .append(" ")
                            .append("get").append(lower.substring(0,1).toUpperCase() + lower.substring(1, lower.length()))
                            .append("() {\n")
                            .append("\t\treturn " + lower + ";\n")
                            .append("\t}\n");

                    sbGetSet.append("\tpublic void set")
                            .append(lower.substring(0,1).toUpperCase() + lower.substring(1, lower.length()))
                            .append("(")
                            .append(oracleSqlType2javaType)
                            .append(" ")
                            .append(lower)
                            .append(") {")
                            .append("\n")
                            .append("\t\tthis.")
                            .append(lower)
                            .append(" = ")
                            .append(lower)
                            .append(";\n\t}\n\n");
                    constract1.append(oracleSqlType2javaType)
                            .append(" ")
                            .append(lower)
                            .append(", ");
                    constractThis.append("\t\tthis." + lower + " = " + lower + ";\n");
                }
                sbColumn.deleteCharAt(sbColumn.length() - 1);
                sbColumn.append("]\";")
                        .append("\n\t}\n");
                /**
                 * public OpHomepage() {}
                 */
                sb.append("\n").append(sbGetSet.toString());
                sbConstructor.append("\tpublic " + tuoFeng(className) + "() {}").append("\n\n");
                /**
                 *   public OpHomepage(Long id, String templetName, String platformName, Integer platformCode, Integer valid, String log,
                 *   			Long createBy, String createDate, Long updateBy, String updateDate, Integer type, String state,
                 *   			String containModule) {
                 *   		super();
                 *   		this.id = id;
                 *   		this.templetName = templetName;
                 *   		this.platformName = platformName;
                 *   		this.platformCode = platformCode;
                 *   		this.valid = valid;
                 *   		this.log = log;
                 *   		this.createBy = createBy;
                 *   		this.createDate = createDate;
                 *   		this.updateBy = updateBy;
                 *   		this.updateDate = updateDate;
                 *   		this.type = type;
                 *   		this.state = state;
                 *   		this.containModules = containModules;
                 *   	}
                 */
                sbConstructor.append("\tpublic " + tuoFeng(className))
                        .append("(" + constract1.substring(0, constract1.length() - 2) + ") {\n")
                        .append("\t\tsuper();\n")
                        .append(constractThis)
                        .append("\t}");

                sbToString.append("\n\t@Override")
                        .append("\n\tpublic String toString() {")
                        .append("\n\t\t return \"" + tuoFeng(className) + " [")
                        .append("");

                sb.append(sbConstructor.toString());
                sb.append(sbToString.toString());
                sb.append(sbColumn.toString());
                sb.append("\n\n}");

                //创建文件
                write2File(sb.toString(),tuoFeng(className),packageName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

		return sb.toString();
    }

    private static String sqlserverSqlType2javaType(String columnTypeName) {
        Map<String,String> map = new HashMap<>();
        String json = PropertiesHelper.getValue("operation/SqlType2javaType.properties", "sqlserver");
        map = JSON.parseObject(json, map.getClass());
        return map.get(columnTypeName);
    }

    private static void write2File(String fileContent,String fileName,String packageName) {
        String property = System.getProperty("user.dir");
        PrintWriter writer = null;
        // 将读取的数据按照规则写入TXT
        packageName = property + "\\src\\main\\java\\"+ packageName.replace(".", "\\");
        checkCreateDirector(packageName);
        fileName = packageName + "\\" + fileName + ".java";
        File file = new File(fileName); // 创建txt文本
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
            writer.write(fileContent);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) writer.close();
        }
    }

    private static void checkCreateDirector(String packageName) {
        File dir = new File(packageName);
        if(!dir.exists()) {
            if(!packageName.endsWith(File.separator)) {
                dir.mkdirs();
            }
        }
    }

    /**
     * 数据库表列转换为java字段 新
     * @author GeekPlusA 20180709
     * @param column
     * @return
     */
    public static String toLower (String column) {
        column = column.toLowerCase();
        Pattern p = Pattern.compile("_(\\w)");
        Matcher m = p.matcher(column);
        while (m.find()) {
            String s = m.group(0);
            String s2 = m.group(1);
            column = column.replace(s, s2.toUpperCase());
        }
        return column;
    }

    private static String tuoFeng(String lower) {
        return lower.substring(0, 1).toUpperCase() + lower.substring(1);
    }

//    private static String _




    public static void main(String[] args) throws Exception {
        String AHSL_Patient_PATIdentity = "AHSL_Patient_PATIdentity";
        String AHSL_Patient_PATAddress = "AHSL_Patient_PATAddress";
        String AHSL_Patient = "AHSL_Patient";
        String AHSL_InpatientDischargeCancel = "AHSL_InpatientDischargeCancel";
        String AHSL_InpatientDischarge = "AHSL_InpatientDischarge";
        String AHSL_InpatientCancel = "AHSL_InpatientCancel";
        String AHSL_Inpatient_PAADMDiagnose = "AHSL_Inpatient_PAADMDiagnose";
        String AHSL_Inpatient = "AHSL_Inpatient";
        String AHSL_AdmTransaction = "AHSL_AdmTransaction";
        String AHSL_AddOrders_OEORIInfo = "AHSL_AddOrders_OEORIInfo";
        String AHSL_AddOrders = "AHSL_AddOrders";
        String sqlinfo = "sqlinfo";
        String AHSL_Patient_PATRelation = "AHSL_Patient_PATRelation";
        String AHSL_Patient_PATRelationAddress = "AHSL_Patient_PATRelationAddress";
        String AHSL_UpdateOrdersStatus = "AHSL_UpdateOrdersStatus";
        String AHSL_UpdateOrdersStatus_OEORIInfo = "AHSL_UpdateOrdersStatus_OEORIInfo";
        String packageName = "com.bjnangle.webservice.model";
//		String tableAllColums = OrmUtils.getTableAllColums("t_op_homepage_module_style");
//
//		System.out.println(tableAllColums);

//		String str = "column_name_id_jk_op_sd"; //column_name_idAj
//		String lower = toLower(str);
//		System.out.println(lower);
//		String insertSql = insertSql(tableName);
//		System.out.println(insertSql);
//		String querySql = querySql(tableName);
//		System.out.println(querySql);
//		System.out.println("111" +"\n"+ "222");
//		String updateSql = updateSql(tableName);
//		System.out.println(updateSql);

        getJavaBean(AHSL_Patient_PATIdentity, packageName);
        getJavaBean(AHSL_Patient_PATAddress, packageName);
        getJavaBean(AHSL_Patient, packageName);
        getJavaBean(AHSL_InpatientDischargeCancel, packageName);
        getJavaBean(AHSL_InpatientDischarge, packageName);
        getJavaBean(AHSL_InpatientCancel, packageName);
        getJavaBean(AHSL_Inpatient_PAADMDiagnose, packageName);
        getJavaBean(AHSL_Inpatient, packageName);
        getJavaBean(AHSL_AdmTransaction, packageName);
        getJavaBean(AHSL_AddOrders_OEORIInfo, packageName);
        getJavaBean(AHSL_AddOrders, packageName);
        getJavaBean(sqlinfo, packageName);
        getJavaBean(AHSL_Patient_PATRelation, packageName);
        getJavaBean(AHSL_Patient_PATRelationAddress, packageName);
        getJavaBean(AHSL_UpdateOrdersStatus, packageName);
        getJavaBean(AHSL_UpdateOrdersStatus_OEORIInfo, packageName);
    }
}
