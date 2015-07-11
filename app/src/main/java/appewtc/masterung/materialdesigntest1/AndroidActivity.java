package appewtc.masterung.materialdesigntest1;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class AndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        //Initial Toolbar
        android.support.v7.widget.Toolbar objToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbarTop);
        setSupportActionBar(objToolbar);

        //Create Arrow Back
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }   // onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }   // if
        if (id == R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }   // if

        return super.onOptionsItemSelected(item);
    }

}   // Main Class
