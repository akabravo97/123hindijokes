package abhijeet.a123jokes;

import android.app.ProgressDialog;
import android.content.ClipboardManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class santa extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ProgressDialog progressDialog;
    String url1="http://123hindijokes.com/santa-banta-jokes/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatherson);
        new santa.getJokes().execute();

    }
    public class getJokes extends AsyncTask<Void,Void,Void> {
        ArrayList<String> arrayList=new ArrayList<>();
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            progressDialog=new ProgressDialog(santa.this);
            progressDialog.setMessage("Getting jokes....");
            progressDialog.setIndeterminate(false);
            progressDialog.show();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document document1= Jsoup.connect(url1).get();
                Elements parentList1=document1.getElementsByClass("statusList").select("li");
                for (Element element : parentList1){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(),"Connection Error!!",Toast.LENGTH_SHORT).show();
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result){
            layoutManager=new LinearLayoutManager(getApplicationContext());
            recyclerView=(RecyclerView)findViewById(R.id.recyleJoke);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layoutManager);
            adapter=new RecyclerAdapter(arrayList);
            recyclerView.addItemDecoration(new SimpleDividerItemDecoration(santa.this));
            recyclerView.setAdapter(adapter);
            progressDialog.dismiss();
        }
    }
}
