package com.samuelZhan.circleprogress; 

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoadingDialog extends Dialog {

	private String message;
	
	public LoadingDialog(Context context, String message) {
		// TODO Auto-generated constructor stub
		//使用刚才定义好dialog风格
		super(context, R.style.loading_dialog_style);
		this.message=message;
	}	

	public LoadingDialog(Context context) {
		this(context, "");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_loading);
				
		//可以选择性添加等待对话框的内容文本
		if(message!=null && !message.equals("")){
			((TextView)findViewById(R.id.loading_dialog_tv)).setText(message);
		}else{
			((TextView)findViewById(R.id.loading_dialog_tv)).setVisibility(View.GONE);
		}
	}

}
