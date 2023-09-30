package tranduythanh.com;

import android.os.Bundle;
import android.preference.PreferenceActivity;
@SuppressWarnings("deprecation")
public class MySettingActivity 
		extends PreferenceActivity {
	protected void onCreate
				(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource
			(R.xml.mypreferencelayout);
	}
}
