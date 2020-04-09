package com.wjiayi.common.utils.test;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.wjiayi.common.utils.DateUtil;

public class DateTest {

	@Test
	public void DateTest() {
		
		try {
			Date initMonth = DateUtil.getDateByInitMonth(new Date());
			//System.out.println("str :" +initMonth);
			
			Date fullMonth = DateUtil.getDateByFullMonth(new Date());
			//System.out.println("fullMonth:"+fullMonth);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
