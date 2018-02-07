package com.fanshuai.ngsp.nws.jdk8;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by fanshuai on 2017/9/25.
 * 测试类
 */
public class Test {

   static class A{
        private String name;

       private String day;

       private String time;

       private String fhours;

       private String btime;

       private String etime;

       private BigDecimal hours;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

       public String getTime() {
           return time;
       }

       public void setTime(String time) {
           this.time = time;
       }

       public BigDecimal getHours() {
           return hours;
       }

       public void setHours(BigDecimal hours) {
           this.hours = hours;
       }


       public String getFhours() {
           return fhours;
       }

       public void setFhours(String fhours) {
           this.fhours = fhours;
       }

       public String getBtime() {
           return btime;
       }

       public void setBtime(String btime) {
           this.btime = btime;
       }

       public String getEtime() {
           return etime;
       }

       public void setEtime(String etime) {
           this.etime = etime;
       }

       public String getDay() {
           return day;
       }

       public void setDay(String day) {
           this.day = day;
       }
   }




    public static void main(String[] args) throws ParseException {
        BigDecimal time = new BigDecimal("0");
        String str = "{\n" +
                "\n" +
                "    \"2018-01-01\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6216324\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-01\",\n" +
                "                \"WORKTIME\": \"2018-01-01 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-01 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": \"\",\n" +
                "                \"CLASSTWOREMARK\": \"\",\n" +
                "                \"DELAYREMARK\": \"\",\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-02 12:03:15\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:22:59\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126457\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"2\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6254002\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-01\",\n" +
                "                \"WORKTIME\": \"2018-01-01 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-01 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-05 22:48:41\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:22:59\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126458\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"2\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-02\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6229730\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-02\",\n" +
                "                \"WORKTIME\": \"2018-01-02 10:19:49\",\n" +
                "                \"LEAVETIME\": \"2018-01-02 10:19:49\",\n" +
                "                \"CLASSONEREMARK\": \"\",\n" +
                "                \"CLASSTWOREMARK\": \"\",\n" +
                "                \"DELAYREMARK\": \"\",\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-03 10:12:40\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:37:28\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126459\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6268957\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-02\",\n" +
                "                \"WORKTIME\": \"2018-01-02 19:00:58\",\n" +
                "                \"LEAVETIME\": \"2018-01-02 19:00:58\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-05 23:03:16\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:37:28\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126460\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-03\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6236498\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-03\",\n" +
                "                \"WORKTIME\": \"2018-01-03 10:26:28\",\n" +
                "                \"LEAVETIME\": \"2018-01-03 10:26:28\",\n" +
                "                \"CLASSONEREMARK\": \"\",\n" +
                "                \"CLASSTWOREMARK\": \"\",\n" +
                "                \"DELAYREMARK\": \"\",\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-04 08:31:35\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:15:05\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126461\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6279835\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-03\",\n" +
                "                \"WORKTIME\": \"2018-01-03 20:43:43\",\n" +
                "                \"LEAVETIME\": \"2018-01-03 20:43:43\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-05 23:24:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:15:05\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126462\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-04\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6290747\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-04\",\n" +
                "                \"WORKTIME\": \"2018-01-04 13:01:55\",\n" +
                "                \"LEAVETIME\": \"2018-01-04 19:32:43\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-05 23:49:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:21:19\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126463\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6290748\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-04\",\n" +
                "                \"WORKTIME\": \"2018-01-04 13:01:55\",\n" +
                "                \"LEAVETIME\": \"2018-01-04 19:32:43\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-05 23:49:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:21:19\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126464\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-05\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6302501\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-05\",\n" +
                "                \"WORKTIME\": \"2018-01-05 10:14:35\",\n" +
                "                \"LEAVETIME\": \"2018-01-05 10:14:35\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-06 08:31:43\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:27:40\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126465\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6302502\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-05\",\n" +
                "                \"WORKTIME\": \"2018-01-05 20:42:22\",\n" +
                "                \"LEAVETIME\": \"2018-01-05 20:42:22\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-06 08:31:43\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:27:40\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25126466\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-06\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6318605\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-06\",\n" +
                "                \"WORKTIME\": \"2018-01-06 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-06 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-07 08:31:05\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:35:14\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293194\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6318606\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-06\",\n" +
                "                \"WORKTIME\": \"2018-01-06 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-06 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-07 08:31:05\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:35:14\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293195\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-07\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6329501\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-07\",\n" +
                "                \"WORKTIME\": \"2018-01-07 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-07 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-08 08:31:07\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:40:50\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293196\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6329502\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-07\",\n" +
                "                \"WORKTIME\": \"2018-01-07 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-07 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-08 08:31:07\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:40:50\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293197\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-08\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6376671\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-08\",\n" +
                "                \"WORKTIME\": \"2018-01-08 10:14:01\",\n" +
                "                \"LEAVETIME\": \"2018-01-08 10:14:01\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-09 08:31:46\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:47:07\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293198\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6376672\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-08\",\n" +
                "                \"WORKTIME\": \"2018-01-08 18:35:09\",\n" +
                "                \"LEAVETIME\": \"2018-01-08 18:35:09\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-09 08:31:46\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:47:07\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293199\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-09\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6450005\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-09\",\n" +
                "                \"WORKTIME\": \"2018-01-09 10:18:48\",\n" +
                "                \"LEAVETIME\": \"2018-01-09 10:18:48\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-10 08:31:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:56:53\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293200\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6450006\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-09\",\n" +
                "                \"WORKTIME\": \"2018-01-09 19:34:12\",\n" +
                "                \"LEAVETIME\": \"2018-01-09 19:34:12\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-10 08:31:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 12:56:53\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293201\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-10\": {\n" +
                "        \"color\": \"#ddd\",\n" +
                "        \"html\": \"<ul><li>全薪病假4小时</li><li>全薪病假4小时</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6551859\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-10\",\n" +
                "                \"WORKTIME\": \"2018-01-10 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-10 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-15 10:00:49\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:05:55\",\n" +
                "                \"TYPE\": \"21\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"27768802\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6551860\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-10\",\n" +
                "                \"WORKTIME\": \"2018-01-10 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-10 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-15 10:00:49\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:05:55\",\n" +
                "                \"TYPE\": \"21\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"27768803\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-11\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6509367\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-11\",\n" +
                "                \"WORKTIME\": \"2018-01-11 10:12:15\",\n" +
                "                \"LEAVETIME\": \"2018-01-11 10:12:15\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-12 08:31:43\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:53:36\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293204\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6509368\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-11\",\n" +
                "                \"WORKTIME\": \"2018-01-11 19:02:20\",\n" +
                "                \"LEAVETIME\": \"2018-01-11 19:02:20\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-12 08:31:43\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:53:36\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293205\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-12\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7493546\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-12\",\n" +
                "                \"WORKTIME\": \"2018-01-12 22:30:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-12 22:38:06\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"UPDATETIME\": \"2018-02-01 12:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"27946204\",\n" +
                "                \"TYPE_VALUE\": \"4.50\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.50\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-13\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6536555\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-13\",\n" +
                "                \"WORKTIME\": \"2018-01-13 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-13 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-14 08:31:05\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:09:13\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293208\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6536556\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-13\",\n" +
                "                \"WORKTIME\": \"2018-01-13 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-13 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-14 08:31:05\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:09:13\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293209\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-14\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6547474\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-14\",\n" +
                "                \"WORKTIME\": \"2018-01-14 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-14 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-15 08:31:08\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:15:51\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293210\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6547475\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-14\",\n" +
                "                \"WORKTIME\": \"2018-01-14 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-14 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-15 08:31:08\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:15:51\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293211\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-15\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6566466\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-15\",\n" +
                "                \"WORKTIME\": \"2018-01-15 10:19:59\",\n" +
                "                \"LEAVETIME\": \"2018-01-15 10:19:59\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-16 08:31:49\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:26:54\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293212\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6566467\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-15\",\n" +
                "                \"WORKTIME\": \"2018-01-15 18:32:10\",\n" +
                "                \"LEAVETIME\": \"2018-01-15 18:32:10\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-16 08:31:49\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:26:54\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293213\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-16\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6583478\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-16\",\n" +
                "                \"WORKTIME\": \"2018-01-16 10:14:01\",\n" +
                "                \"LEAVETIME\": \"2018-01-16 10:14:01\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-17 08:31:51\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:31:04\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293214\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6583479\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-16\",\n" +
                "                \"WORKTIME\": \"2018-01-16 19:00:42\",\n" +
                "                \"LEAVETIME\": \"2018-01-16 19:00:42\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-17 08:31:51\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:31:04\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293215\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-17\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6622552\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-17\",\n" +
                "                \"WORKTIME\": \"2018-01-17 10:24:40\",\n" +
                "                \"LEAVETIME\": \"2018-01-17 10:24:40\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-18 08:31:46\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293216\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6622553\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-17\",\n" +
                "                \"WORKTIME\": \"2018-01-17 21:38:39\",\n" +
                "                \"LEAVETIME\": \"2018-01-17 21:38:39\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-18 08:31:46\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293217\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7493528\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-17\",\n" +
                "                \"WORKTIME\": \"2018-01-17 21:38:39\",\n" +
                "                \"LEAVETIME\": \"2018-01-17 21:38:39\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"10\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"27946151\",\n" +
                "                \"TYPE_VALUE\": \"2.00\",\n" +
                "                \"classes\": \"3\",\n" +
                "                \"worktime\": \"2.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-18\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6639035\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-18\",\n" +
                "                \"WORKTIME\": \"2018-01-18 10:20:32\",\n" +
                "                \"LEAVETIME\": \"2018-01-18 10:20:32\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-19 08:31:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:15:07\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293218\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6639036\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-18\",\n" +
                "                \"WORKTIME\": \"2018-01-18 19:06:13\",\n" +
                "                \"LEAVETIME\": \"2018-01-18 19:06:13\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-19 08:31:44\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:15:07\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293219\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-19\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6654175\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-19\",\n" +
                "                \"WORKTIME\": \"2018-01-19 10:34:40\",\n" +
                "                \"LEAVETIME\": \"2018-01-19 10:34:40\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-20 08:31:45\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:07:31\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293220\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6654176\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-19\",\n" +
                "                \"WORKTIME\": \"2018-01-19 18:17:31\",\n" +
                "                \"LEAVETIME\": \"2018-01-19 18:17:31\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-20 08:31:45\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:07:31\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293221\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-20\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6664929\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-20\",\n" +
                "                \"WORKTIME\": \"2018-01-20 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-20 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-21 08:31:10\",\n" +
                "                \"UPDATETIME\": \"2018-01-24 16:44:21\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293222\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6664930\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-20\",\n" +
                "                \"WORKTIME\": \"2018-01-20 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-20 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-21 08:31:10\",\n" +
                "                \"UPDATETIME\": \"2018-01-24 16:44:21\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293223\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-21\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6675824\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-21\",\n" +
                "                \"WORKTIME\": \"2018-01-21 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-21 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-22 08:31:11\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:39:14\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293224\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6675825\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-21\",\n" +
                "                \"WORKTIME\": \"2018-01-21 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-21 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-22 08:31:11\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:39:14\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293225\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-22\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6696751\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-22\",\n" +
                "                \"WORKTIME\": \"2018-01-22 10:13:11\",\n" +
                "                \"LEAVETIME\": \"2018-01-22 10:13:26\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-23 08:31:42\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:30:51\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293226\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6696752\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-22\",\n" +
                "                \"WORKTIME\": \"2018-01-22 18:09:22\",\n" +
                "                \"LEAVETIME\": \"2018-01-22 21:40:54\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-23 08:31:42\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:30:51\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293227\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-23\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"6714631\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-23\",\n" +
                "                \"WORKTIME\": \"2018-01-23 10:27:20\",\n" +
                "                \"LEAVETIME\": \"2018-01-23 10:27:37\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-24 08:31:47\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293228\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"6714632\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-23\",\n" +
                "                \"WORKTIME\": \"2018-01-23 18:02:47\",\n" +
                "                \"LEAVETIME\": \"2018-01-23 22:06:15\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-24 08:31:47\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293229\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7493516\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-23\",\n" +
                "                \"WORKTIME\": \"2018-01-23 22:06:15\",\n" +
                "                \"LEAVETIME\": \"2018-01-23 22:06:15\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"10\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"27946143\",\n" +
                "                \"TYPE_VALUE\": \"2.50\",\n" +
                "                \"classes\": \"3\",\n" +
                "                \"worktime\": \"2.50\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-24\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7013096\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-24\",\n" +
                "                \"WORKTIME\": \"2018-01-24 10:27:41\",\n" +
                "                \"LEAVETIME\": \"2018-01-24 10:28:01\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-25 08:31:45\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:15:54\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293230\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7013097\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-24\",\n" +
                "                \"WORKTIME\": \"2018-01-24 19:05:39\",\n" +
                "                \"LEAVETIME\": \"2018-01-24 19:06:09\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-25 08:31:45\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 13:15:54\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293231\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-25\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7029108\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-25\",\n" +
                "                \"WORKTIME\": \"2018-01-25 10:33:44\",\n" +
                "                \"LEAVETIME\": \"2018-01-25 10:34:05\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-26 08:31:51\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:39:41\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293232\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7029109\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-25\",\n" +
                "                \"WORKTIME\": \"2018-01-25 19:03:32\",\n" +
                "                \"LEAVETIME\": \"2018-01-25 19:03:32\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-26 08:31:51\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 14:39:41\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293233\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-26\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7046612\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-26\",\n" +
                "                \"WORKTIME\": \"2018-01-26 10:19:12\",\n" +
                "                \"LEAVETIME\": \"2018-01-26 11:55:35\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-27 08:31:47\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293234\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7046613\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-26\",\n" +
                "                \"WORKTIME\": \"2018-01-26 18:45:07\",\n" +
                "                \"LEAVETIME\": \"2018-01-26 22:10:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-27 08:31:47\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293235\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7493525\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-26\",\n" +
                "                \"WORKTIME\": \"2018-01-26 18:45:07\",\n" +
                "                \"LEAVETIME\": \"2018-01-26 22:10:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 18:00:08\",\n" +
                "                \"TYPE\": \"10\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"27946149\",\n" +
                "                \"TYPE_VALUE\": \"2.50\",\n" +
                "                \"classes\": \"3\",\n" +
                "                \"worktime\": \"2.50\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-27\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7057340\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-27\",\n" +
                "                \"WORKTIME\": \"2018-01-27 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-27 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-28 08:31:09\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:29:03\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293236\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7057341\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-27\",\n" +
                "                \"WORKTIME\": \"2018-01-27 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-27 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-28 08:31:09\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:29:03\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293237\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-28\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>休息</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7068112\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-28\",\n" +
                "                \"WORKTIME\": \"2018-01-28 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-28 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-29 08:31:10\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:23:01\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293238\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7068113\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-28\",\n" +
                "                \"WORKTIME\": \"2018-01-28 00:00:00\",\n" +
                "                \"LEAVETIME\": \"2018-01-28 00:00:00\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-29 08:31:10\",\n" +
                "                \"UPDATETIME\": \"2018-01-29 10:23:01\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293239\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"1\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-29\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7440447\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-29\",\n" +
                "                \"WORKTIME\": \"2018-01-29 10:11:46\",\n" +
                "                \"LEAVETIME\": \"2018-01-29 10:12:12\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-30 08:31:42\",\n" +
                "                \"UPDATETIME\": \"2018-01-30 08:31:42\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293240\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7440448\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-29\",\n" +
                "                \"WORKTIME\": \"2018-01-29 18:33:32\",\n" +
                "                \"LEAVETIME\": \"2018-01-29 18:34:07\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-30 08:31:42\",\n" +
                "                \"UPDATETIME\": \"2018-01-30 08:31:42\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293241\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-30\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7475163\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-30\",\n" +
                "                \"WORKTIME\": \"2018-01-30 10:13:01\",\n" +
                "                \"LEAVETIME\": \"2018-01-30 10:13:28\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-31 08:31:54\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 08:31:54\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293242\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7475164\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-30\",\n" +
                "                \"WORKTIME\": \"2018-01-30 18:32:21\",\n" +
                "                \"LEAVETIME\": \"2018-01-30 18:32:56\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-01-31 08:31:54\",\n" +
                "                \"UPDATETIME\": \"2018-01-31 08:31:54\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293243\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"2018-01-31\": {\n" +
                "        \"color\": null,\n" +
                "        \"html\": \"<ul><li>正常</li></ul>\",\n" +
                "        \"cardtime\": [\n" +
                "            {\n" +
                "                \"ID\": \"7503213\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-31\",\n" +
                "                \"WORKTIME\": \"2018-01-31 10:14:09\",\n" +
                "                \"LEAVETIME\": \"2018-01-31 10:14:38\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-02-01 08:31:46\",\n" +
                "                \"UPDATETIME\": \"2018-02-01 11:10:47\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293244\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"1\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ID\": \"7503214\",\n" +
                "                \"MEMBERID\": \"00019256\",\n" +
                "                \"DATENUM\": \"2018-01-31\",\n" +
                "                \"WORKTIME\": \"2018-01-31 18:41:10\",\n" +
                "                \"LEAVETIME\": \"2018-01-31 18:41:45\",\n" +
                "                \"CLASSONEREMARK\": null,\n" +
                "                \"CLASSTWOREMARK\": null,\n" +
                "                \"DELAYREMARK\": null,\n" +
                "                \"FLAG\": \"0\",\n" +
                "                \"CREATETIME\": \"2018-02-01 08:31:46\",\n" +
                "                \"UPDATETIME\": \"2018-02-01 11:10:47\",\n" +
                "                \"TYPE\": \"0\",\n" +
                "                \"EARLYLEAVE\": \"0\",\n" +
                "                \"LATEARRIVE\": \"0\",\n" +
                "                \"PLAN_WORKTIME_ID\": \"25293245\",\n" +
                "                \"TYPE_VALUE\": \"4.00\",\n" +
                "                \"classes\": \"2\",\n" +
                "                \"worktime\": \"4.00\",\n" +
                "                \"category_id\": \"6\",\n" +
                "                \"datetype\": \"0\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "\n" +
                "}".replaceAll("\\n","");
        Map<String,Object> o = JSONObject.parseObject(str,Map.class);
        List<A> list = new ArrayList<A>();
        for(Map.Entry<String,Object> key: o.entrySet()){
            String keyt = key.getKey();
            Map<String,Object> m = (Map<String, Object>) key.getValue();
            List<Map<String,Object>> m2 = (List<Map<String, Object>>) m.get("cardtime");

            if(CollectionUtils.isEmpty(m2)||m2.size()<2){
                m2.add(m2.get(0));
                System.out.println("打卡器异常数据时间："+keyt);
                m2.get(0).put("WORKTIME","2018-01-12 10:20:00");
                m2.get(1).put("LEAVETIME","2018-01-12 22:38:00");
//                continue;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
            Date end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(m2.get(1).get("LEAVETIME").toString());//下班
            Date begin = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(m2.get(0).get("WORKTIME").toString());//上班
                time = time.add(new BigDecimal(end.getTime()-begin.getTime()));
                A a = new A();
            a.setDay(keyt);
            a.setBtime(m2.get(0).get("WORKTIME").toString().substring(10,m2.get(0).get("WORKTIME").toString().length()));
            a.setEtime(m2.get(1).get("LEAVETIME").toString().substring(10,m2.get(1).get("LEAVETIME").toString().length()));
                a.setTime(m2.get(0).get("WORKTIME").toString()+"----"+m2.get(1).get("LEAVETIME").toString());
                int hour = Long.valueOf (end.getTime()-begin.getTime()).intValue()/(1000*3600);
                int mines = Long.valueOf ((end.getTime()-begin.getTime()-hour*1000*3600)).intValue()/(1000*60);
                int second = Long.valueOf ((end.getTime()-begin.getTime()-hour*1000*3600-mines*60*1000)/1000).intValue();
                a.setFhours(hour+":"+mines+":"+second);
                a.setHours(new BigDecimal(end.getTime()-begin.getTime()).divide( new BigDecimal(1000*3600), 2, RoundingMode.HALF_UP));
                list.add(a);
        }
        Collections.sort(list,new Comparator<A>(){
            @Override
            public int compare(A o1, A o2) {
                return Integer.parseInt(o1.getTime().substring(0,10).replaceAll("-",""))-Integer.parseInt(o2.getTime().substring(0,10).replaceAll("-",""));
            }
        });
        for(A a:list){
//            System.out.println("时间:"+a.getTime()+"工时:"+a.getHours()+"详情:"+a.getFhours());
            System.out.println(a.getFhours());

        }
        System.out.println("出勤天数:"+time.divide( new BigDecimal(1000*3600*9), 2, RoundingMode.HALF_UP));





        //2、使用JSONArray
//

//        A a = new A();
//        a.setName("aaaaaaaaaaaaaaaaa");
//        a.setName(a.getName().substring(0,6));
//        System.out.println(a.getName());
//        System.out.println("==========begin");
//        DefaultMethod d = new DefaultMethod() {
//            @Override
//            public void fun1() {
//                sayHi("测试");
//            }
//        };
//        d.sayHi("测试");
//        System.out.println("==========end");
//        new LambdaDemo().sortFunction1();
//        //函数式接口
//        LambdaFunctionDemo<String, Integer> converter = (from) -> Integer.valueOf(from);
//        Integer converted = converter.convert("123");
//        System.out.println(converted);
//        //方法与构造函数引用
//        LambdaFunctionDemo<String, Integer> converter2 = Integer::valueOf;
//        //Predicate接口
//        Predicate<String> predicate = (s) -> s.length() > 0;
//        predicate.test("foo");              // true
//        predicate.negate().test("foo");     // false
//        Predicate<Boolean> nonNull = Objects::nonNull;
//        //function接口
//        Function<String, Integer> toInteger = Integer::valueOf;
//        Function<String, String> backToString = toInteger.andThen(String::valueOf);
//        backToString.apply("123");     // "123"
//        //Supplier 接口 返回一个任意范型的值
//        Supplier<User> personSupplier = User::new;
//        System.out.println("Supplier:" + personSupplier.get().getName());// new Person
//        //Consumer 接口
//        Consumer<User> greeter = (p) -> System.out.println("Hello, " + p.getName());
//        greeter.accept(new User("Luke", "测试"));
//        //Comparator 接口
//        Comparator<User> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
//        User p1 = new User("John", "Doe");
//        User p2 = new User("Alice", "Wonderland");
//        System.out.println(comparator.compare(p1, p2));// > 0
//        System.out.println(comparator.reversed().compare(p1, p2));// < 0
//        //Optional 接口
//        Optional<String> optional = Optional.of("bam");
//        optional.isPresent();           // true
//        optional.get();                 // "bam"
//        optional.orElse("fallback");    // "bam"
//        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
//        //Stream 接口
//        List<String> stringCollection = new ArrayList<>();
//        stringCollection.add("ddd2");
//        stringCollection.add("aaa2");
//        stringCollection.add("bbb1");
//        stringCollection
//                .stream()
//                .filter((s) -> s.startsWith("a"))
//                .forEach(System.out::println);
//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            //存在性检查
//            map.putIfAbsent(i, "val" + i);
//        }
//        //删除指定key
//        map.getOrDefault(42, "not found");
//        //map值的合并
//        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
//        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
//


    }
}
