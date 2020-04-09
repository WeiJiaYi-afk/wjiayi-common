package com.wjiayi.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//日期工具类
public class DateUtil {

	public static Date getDateByInitMonth(Date src) throws ParseException{
		
		//日期格式
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//得到当前日期
		String string = format.format(new Date());
		System.out.println("当前日期:"+string);
		//得到新的日期
		String str = string.substring(0, 7)+"-01 00:00:00";
		System.out.println("str=="+str);
		
		return format.parse(str);
	}
	
	public static Date getDateByFullMonth(Date src) throws ParseException{
		
		String str1 = "";
		//日期格式
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//得到当前日期
		String string = format.format(new Date());
		System.out.println("当前日期:"+string);
		//获取新的日期
		char c = string.charAt(6);
		System.out.println("c=="+c);
		if(c=='2') {
			 str1 = string.substring(0, 7)+"-28 23:59:59";
		}else if(c=='1'||c=='3'||c=='5'||c=='7'||c=='8'||c=='0') {
			 str1 = string.substring(0, 7)+"-31 23:59:59";
		}else if(c=='4'||c=='6'||c=='9') {
			 str1 = string.substring(0, 7)+"-30 23:59:59";
		}
		//13578 10 12
		//469 11
		//2
		System.out.println("str1=="+str1);
		
		return format.parse(str1);
		
	}
}
