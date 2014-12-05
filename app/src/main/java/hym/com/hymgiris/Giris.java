/*Copyright (c) <2014>, Milets
-- Company:				---
-- Engineers: 			Ömer Naci Soydemir
-- Create Date:			05/12/2014
-- Project Name: 		HYM
-- Project Manager		Suhap SAHIN, Adnan KAVAK
-- Target Devices:  	Google Nexus 4
-- Android Versions: 	Jelly Bean (API level 16)
-- Description: 		HYM Giris Activity
-- Dependencies: 		--
 */

package hym.com.hymgiris;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Giris extends Activity implements View.OnClickListener{

    private static final String TAG = "_HYMGiris";

    Button BtnConfig;
    Button BtnGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        Log.i(TAG,"onCreate");

        fontType();

        initialize();

    }

    private void fontType() {

        Log.i(TAG, "fontType metodu");

        Typeface font = Typeface.createFromAsset(getAssets(), "verdana.ttf");

        int actionBarTitleId = Resources.getSystem().getIdentifier(
                "action_bar_title", "id", "android");
        if (actionBarTitleId > 0) {
            TextView title = (TextView) findViewById(actionBarTitleId);
            if (title != null) {
                title.setTypeface(font);

            }
        }

    }

    private void initialize() {

        Log.i(TAG, "initialize metodu");

        BtnConfig = (Button)findViewById(R.id.button);
        BtnGiris = (Button)findViewById(R.id.button2);

        BtnConfig.setOnClickListener(this);
        BtnGiris.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button){

            // BtnConfig Click i

            Log.i(TAG, "BtnConfig Click i");

            Toast.makeText(getApplicationContext(),"Config", Toast.LENGTH_SHORT).show();

        }

        if (v.getId() == R.id.button2){

            // BtnGiris Click i

            Log.i(TAG, "BtnGiris Click i");



        }


    }
}
