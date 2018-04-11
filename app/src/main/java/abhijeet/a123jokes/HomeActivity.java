package abhijeet.a123jokes;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ImageButton girlfriend,husband,veryfunny,fatherson,santa,teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        girlfriend=(ImageButton)findViewById(R.id.girlfirend);
        husband=(ImageButton)findViewById(R.id.husband);
        veryfunny=(ImageButton)findViewById(R.id.funny);
        fatherson=(ImageButton)findViewById(R.id.father);
        santa=(ImageButton)findViewById(R.id.santa);
        teacher=(ImageButton)findViewById(R.id.teacher);
        final RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        final Boolean networkState=isNetworkAvailable();
        Log.d("network",networkState.toString());
        girlfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, abhijeet.a123jokes.girlfriend.class);
                    startActivity(intent);
                }else{
                    //do something
                }
            }
        });
        husband.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, husbandwife.class);
                    startActivity(intent);
                }else{
                    //do
                }
            }
        });
        veryfunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, abhijeet.a123jokes.veryfunny.class);
                    startActivity(intent);
                }else{

                }
            }
        });
        fatherson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, abhijeet.a123jokes.fatherson.class);
                    startActivity(intent);
                }else{

                }
            }
        });
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, abhijeet.a123jokes.teacher.class);
                    startActivity(intent);
                }else{

                }
            }
        });
        santa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, abhijeet.a123jokes.santa.class);
                    startActivity(intent);
                }else{

                }
            }
        });
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
