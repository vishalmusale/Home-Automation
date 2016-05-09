package com.example.homeautomation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.Switch;


public class Home extends Activity {

	WebView myWebView;
	Switch toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        myWebView = (WebView) findViewById(R.id.webView1);
        toggle = (Switch) findViewById(R.id.switch1);
        
        myWebView.setVisibility(View.INVISIBLE);
        
        myWebView.loadUrl("http://96.41.46.57/index.php");	// Home Page
        
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                	myWebView.loadUrl("http://96.41.46.57/index.php?on=ON");	//	LED ON
                } else {
                	myWebView.loadUrl("http://96.41.46.57/index.php?off=OFF");	//	LED OFF
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
