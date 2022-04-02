package com.example.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button b5;
    int request_Code = 1;
    Activity activity;
    /** Called when the activity is first created . */

    @Override
    public void onCreate(Bundle savedInstanceState) {

        activity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            b5 = (Button) findViewById(R.id.btn_launchMyBrowser);
		b5.setOnClickListener(new OnClickListener()
        {			 public void onClick(View arg0)
            {
                Intent i = new Intent(activity, MyBrowserActivity.class);;
                i.setData(Uri.parse("https://www.google.co.th/"));
                startActivity(i);
            }
        });
        }
        public void onActivityResult(int requestCode, int resultCode, Intent data)
        {		 //...
        }
    }


