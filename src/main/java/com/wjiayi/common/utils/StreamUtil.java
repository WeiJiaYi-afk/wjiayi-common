package com.wjiayi.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

//流处理工具类
public class StreamUtil {

	public static void closeAll(File FileInputStream){

		String fileName = "";
		File file = new File(fileName);		
		Reader in = null;

		try {
			BufferedReader reader = new BufferedReader(in);
			//关闭
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static String readTextFile(InputStream src) throws IOException{
		String str = "";
		byte[] b = null;
		int read = src.read(b);
		Reader in = null;
		try {
			BufferedReader reader = new BufferedReader(in);
			//关闭
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
	}
	
	public static String readTextFile(File txtFile){
		String str = "";
		File file = new File(str);
		Reader in = null;
		try {
			BufferedReader reader = new BufferedReader(in);
			//关闭
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
	}
}
