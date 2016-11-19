package liveblood.hackathon.com.liveblood;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.parse.Parse;
import com.parse.ParseObject;


public class DonorInfo extends ActionBarActivity
{
    EditText nm;EditText mo;Spinner bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_info);
        nm=(EditText)findViewById(R.id.editTextNameDonor);
        mo=(EditText)findViewById(R.id.editTextMobileDonor);
        bg=(Spinner)findViewById(R.id.spinnerDonorBG);

        //Cloud Sync
        //Parse.enableLocalDatastore(this);
        //Parse.initialize(this, "0yyFo0fOfxdHr1PpZV5nwF5n46AKO6PHN294Gduy", "SEkcwReaoTGGOGneLarRX0Hjowf852if4jKp7iAr");
    }
    public void show(View v)
    {

        final AlertDialog alertDialog = new AlertDialog.Builder(
                this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Registration Sucessfull");

        // Setting Dialog Message
        alertDialog.setMessage("You have sucessfully registered as a Donor.\nWe will notify you when your blood is needed.");

        // Setting Icon to Dialog
        //alertDialog.setIcon(R.drawable.tick);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
                alertDialog.dismiss();
            }
        });
        ParseObject DonorInfo=new ParseObject("Table_DonorInfo");
        DonorInfo.put("Name",nm.getText().toString());
        DonorInfo.put("BloodGroup",bg.getSelectedItem().toString());
        DonorInfo.put("Mobile",mo.getText().toString());
        DonorInfo.put("GPS", nm.getText().toString());
        DonorInfo.saveInBackground();

        // Showing Alert Message
        alertDialog.show();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_donor_info, menu);
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
