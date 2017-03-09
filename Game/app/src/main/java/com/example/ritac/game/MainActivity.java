package com.example.ritac.game;
import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button buttonStart;
    public void init (){

        buttonStart = (Button)findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent game = new Intent(MainActivity.this, GamePage.class);
                startActivity(game);
            }
        });
    };


    public Button buttonExit;
    public void exitApp (){
        buttonExit = (Button)findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    public View item;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.feedback:
                Intent comment = new Intent(MainActivity.this, Comment.class);
                startActivity(comment);
                return true;
            case R.id.app_bar_search:
                return true;
            case R.id.share:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        exitApp();


    }


}