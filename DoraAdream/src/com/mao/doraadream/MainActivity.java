package com.mao.doraadream;

import java.io.IOException;

import com.mao.doraadream.office.WriteReadExcel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		try {
			WriteReadExcel.createExcelBook();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
