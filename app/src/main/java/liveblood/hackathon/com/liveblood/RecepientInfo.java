package liveblood.hackathon.com.liveblood;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class RecepientInfo extends ActionBarActivity
{
    private String[] arraySpinner;
    Spinner spinner;
    SeekBar radiuscontrol;
    TextView t1;
    int progressChanged = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepient_info);
        radiuscontrol = (SeekBar) findViewById(R.id.seekBarDonor);
        t1 = (TextView) findViewById(R.id.textValue);
        radiuscontrol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                t1.setText(progress+" km.");
                progressChanged=progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
                t1.setText(progressChanged+" km.");
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                //t1.setText(progress+" km.");
            }
        });
    }
    public void searchDonors(View v)
    {
        //Toast.makeText(this,radiuscontrol.getProgress()+"",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this,DonorsList.class);
        i.putExtra("seekvalue",radiuscontrol.getProgress()+"");
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recepient_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
