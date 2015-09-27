package com.example.android.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /* button handler methods */
    public void spotifyBtnClick(View view)
    {
        showMsg( view, "This button will launch the Spotify App!" );

    }
    public void scoresBtnClick(View view)
    {
        showMsg( view, "This button will launch the Scores App!" );
    }

    public void libraryBtnClick(View view)
    {
        showMsg(view, "This button will launch the Library App!" );
    }

    public void buildItBtnClick(View view)
    {
        showMsg(view, "This button will launch the Build It Bigger App!");
    }

    public void xyzBtnClick(View view)
    {
        showMsg(view, "This button will launch the XYZ Reader App!");
    }

    public void capstoneBtnClick(View view)
    {
        showMsg(view, "This button will launch the Capstone App!" );
    }

    private void showMsg(View view, String msg)
    {
        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getTop() + 300);
        toast.show();

    }

}
