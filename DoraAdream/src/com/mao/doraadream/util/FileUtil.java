package com.mao.doraadream.util;

import java.io.File;

import android.os.Environment;

public class FileUtil {

public static String SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath();
	
	static{
		if (!android.os.Environment.getExternalStorageState().equals(
				android.os.Environment.MEDIA_MOUNTED)) {
			SDCARD="mnt/sdcard";
			File file=new File(SDCARD, "temp");
			file.mkdir();
			if(!file.exists()){
				for(int i=0;i<5;i++){
					SDCARD="mnt/sdcard"+i;
					file=new File(SDCARD, "temp");
					file.mkdir();
					if(!file.exists()){
						SDCARD=null;
					}else{
						break;
					}
				}
			}
		}
	}

}
