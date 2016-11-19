package liveblood.hackathon.com.liveblood;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DonorsList extends ActionBarActivity
{
    Button btnDonate;
    Button cal1;Button cal2;Button cal3;
    Button notify1;Button notify2;Button notify3;
    TextView nm1;TextView nm2;TextView nm3;
    TextView d1;TextView d2;TextView d3;
    int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donors_list);
        btnDonate=(Button)findViewById(R.id.buttonDonate);
        cal1=(Button)findViewById(R.id.callDonor1);
        cal2=(Button)findViewById(R.id.callDonor2);
        cal3=(Button)findViewById(R.id.callDonor3);
        notify1=(Button)findViewById(R.id.donorNotify1);
        notify2=(Button)findViewById(R.id.donorNotify2);
        notify3=(Button)findViewById(R.id.donorNotify3);
        cal1.setEnabled(false);cal2.setEnabled(false);cal3.setEnabled(false);
        nm1=(TextView)findViewById(R.id.textName1);nm2=(TextView)findViewById(R.id.textName2);
        nm3=(TextView)findViewById(R.id.textName3);d1=(TextView)findViewById(R.id.textViewD1);
        d2=(TextView)findViewById(R.id.textViewD2);d3=(TextView)findViewById(R.id.textViewD3);
        nm1.setVisibility(View.INVISIBLE);nm2.setVisibility(View.INVISIBLE);nm3.setVisibility(View.INVISIBLE);
        d1.setVisibility(View.INVISIBLE);d2.setVisibility(View.INVISIBLE);d3.setVisibility(View.INVISIBLE);
        cal1.setVisibility(View.INVISIBLE);cal2.setVisibility(View.INVISIBLE);cal3.setVisibility(View.INVISIBLE);
        notify1.setVisibility(View.INVISIBLE);notify2.setVisibility(View.INVISIBLE);notify3.setVisibility(View.INVISIBLE);
        val=Integer.parseInt(getIntent().getStringExtra("seekvalue")+"");
        //Toast.makeText(this,val,Toast.LENGTH_SHORT).show();
        if(val>=2)
        {
            nm1.setVisibility(View.VISIBLE);d1.setVisibility(View.VISIBLE);
            cal1.setVisibility(View.VISIBLE);notify1.setVisibility(View.VISIBLE);
        }
        if(val>=6)
        {
            nm1.setVisibility(View.VISIBLE);d1.setVisibility(View.VISIBLE);
            cal1.setVisibility(View.VISIBLE);notify1.setVisibility(View.VISIBLE);
            nm2.setVisibility(View.VISIBLE);d2.setVisibility(View.VISIBLE);
            cal2.setVisibility(View.VISIBLE);notify2.setVisibility(View.VISIBLE);
        }
        if(val>=8)
        {
            nm1.setVisibility(View.VISIBLE);d1.setVisibility(View.VISIBLE);
            cal1.setVisibility(View.VISIBLE);notify1.setVisibility(View.VISIBLE);
            nm2.setVisibility(View.VISIBLE);d2.setVisibility(View.VISIBLE);
            cal2.setVisibility(View.VISIBLE);notify2.setVisibility(View.VISIBLE);
            nm3.setVisibility(View.VISIBLE);d3.setVisibility(View.VISIBLE);
            cal3.setVisibility(View.VISIBLE);notify3.setVisibility(View.VISIBLE);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_donors_list, menu);
        return true;
    }
    public void notify1(View v)
    {
        try{
            Thread.sleep(5000);
            cal1.setEnabled(true);
        }
        catch(Exception e)
        {

        }

    }
    public void notify2(View v)
    {
        try{
            Thread.sleep(5000);
            cal2.setEnabled(true);
        }
        catch(Exception e)
        {

        }
    }
    public void notify3(View v)
    {
        try{
            Thread.sleep(5000);
            cal3.setEnabled(true);
        }
        catch(Exception e)
        {

        }
    }
    public void call1(View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:09739788688"));
        startActivity(intent);
    }
    public void call2(View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:08197334488"));
        startActivity(intent);
    }
    public void call3(View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:08100934320"));
        startActivity(intent);
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
