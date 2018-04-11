package abhijeet.a123jokes;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ImageButton girlfriend,husband,veryfunny,fatherson,santa,teacher;
    Boolean networkState;
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
        this.registerReceiver(this.mConnReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        final RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        final RotateAnimation noConnection=(RotateAnimation) AnimationUtils.loadAnimation(getApplicationContext(),R.anim.nocon);
        girlfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (networkState) {
                    view.setAnimation(rotateAnimation);
                    Intent intent = new Intent(HomeActivity.this, abhijeet.a123jokes.girlfriend.class);
                    startActivity(intent);
                }else{
                    //do something
                    view.setAnimation(noConnection);
                    Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG).show();
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
                    view.setAnimation(noConnection);
                    Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG).show();
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
                    view.setAnimation(noConnection);
                    Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG).show();
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
                    view.setAnimation(noConnection);
                    Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG).show();
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
                    view.setAnimation(noConnection);
                    Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG).show();
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
                    view.setAnimation(noConnection);
                    Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
    private BroadcastReceiver mConnReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
            String reason = intent.getStringExtra(ConnectivityManager.EXTRA_REASON);
            boolean isFailover = intent.getBooleanExtra(ConnectivityManager.EXTRA_IS_FAILOVER, false);

            NetworkInfo currentNetworkInfo = (NetworkInfo) intent.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);
            NetworkInfo otherNetworkInfo = (NetworkInfo) intent.getParcelableExtra(ConnectivityManager.EXTRA_OTHER_NETWORK_INFO);

            if(currentNetworkInfo.isConnected()){
                //Toast.makeText(getApplicationContext(), "Connected", Toast.LENGTH_LONG).show();
                networkState=true;
            }else{
                //Toast.makeText(getApplicationContext(), "Not Connected", Toast.LENGTH_LONG).show();
                networkState=false;
            }
        }
    };
}
