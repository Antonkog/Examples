package com.example.android_servicenotifications;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
  
  public void onClickStart(View v) {
    startService(new Intent(this, SimpleService.class));
    this.finish();
  }
  
  public void onClickStop(View v) {
    stopService(new Intent(this, SimpleService.class));
  }
}
