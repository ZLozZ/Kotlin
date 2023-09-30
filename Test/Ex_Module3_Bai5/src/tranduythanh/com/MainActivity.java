package tranduythanh.com;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
	implements OnSharedPreferenceChangeListener
{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn=(Button) findViewById(R.id.btnsetting);
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent=new Intent(MainActivity.this,
						MySettingActivity.class);
				startActivityForResult(intent, 113);
			}
		});
		Context ctx=getApplicationContext();
		SharedPreferences pre=PreferenceManager.
				getDefaultSharedPreferences(ctx);
		pre.registerOnSharedPreferenceChangeListener(this);
	}
	public void onSharedPreferenceChanged(
			SharedPreferences sharedPreferences,String key) {
		boolean data=sharedPreferences.getBoolean(key, false);
		TextView txt=(TextView) findViewById(R.id.textView1);
		if(data==true)
		{
			txt.setBackgroundColor(geturces().getColor(android.R.color.holo_red_dark));
		}
		else
		{
			txt.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
		}
	}
}
