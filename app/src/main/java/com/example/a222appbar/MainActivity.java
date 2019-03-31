package com.example.a222appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        } else if (id == R.id.action_open_spinner) {
            Intent intentSpinner = new Intent(MainActivity.this,
                    SpinnerActivity.class);
            startActivity(intentSpinner);
            return true;
        } else if (id == R.id.action_open_checkbox) {
            Intent intentCheckBox = new Intent(MainActivity.this,
                    CheckBoxActivity.class);
            startActivity(intentCheckBox);
            return true;
        } else if (id == R.id.action_open_calendarview) {
            Intent intentCalendarView = new Intent(MainActivity.this,
                    CalendarViewActivity.class);
            startActivity(intentCalendarView);
            return true;
        } else if (id == R.id.action_open_helloworld) {
            Intent intentHelloWorld = new Intent(MainActivity.this,
                    HelloWorldActivity.class);
            startActivity(intentHelloWorld);
            return true;
        } else if (id == R.id.action_open_viewphoto) {
            Intent intentViewPhoto = new Intent(MainActivity.this,
                    ViewPhotoActivity.class);
            startActivity(intentViewPhoto);
            return true;
        } else if (id == R.id.action_open_androidkozlov) {
            Intent intentSplashScreen = new Intent(MainActivity.this,
                    SplashScreenActivity.class);
            startActivity(intentSplashScreen);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
