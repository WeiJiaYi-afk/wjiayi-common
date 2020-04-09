package com.wjiayi.common.utils;

import java.io.File;

//文件工具类
public class FileUtil {

	public static String getExtendName(String fileName){
		
		String url = "aaa.jpg";
		int a = 0;
		//扩展名
		String kname="";
		
		File file = new File(url);
		//System.out.println(file);
		String path = file.getPath();
		System.out.println("path=="+file);
		
		for (int i = 0; i < path.length(); i++) {
			if(path.contains(".")) {
				a = i;
			}
		}
		System.out.println("a=="+a);
		kname = url.substring(a,url.length());
		System.out.println("扩展名=="+kname);
		
		return kname;
	}
	
}
