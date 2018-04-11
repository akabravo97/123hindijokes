package abhijeet.a123jokes;

import android.app.ProgressDialog;
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

public class husbandwife extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ProgressDialog progressDialog;
    String url1="http://123hindijokes.com/husband-wife-jokes/";
    String url2="http://123hindijokes.com/husband-wife-jokes/2";
    String url3="http://123hindijokes.com/husband-wife-jokes/3";
    String url4="http://123hindijokes.com/husband-wife-jokes/4";
    String url5="http://123hindijokes.com/husband-wife-jokes/5";
    String url6="http://123hindijokes.com/husband-wife-jokes/6";
    String url7="http://123hindijokes.com/husband-wife-jokes/7";
    String url8="http://123hindijokes.com/husband-wife-jokes/8";
    String url9="http://123hindijokes.com/husband-wife-jokes/9";
    String url10="http://123hindijokes.com/husband-wife-jokes/10";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatherson);
        new husbandwife.getJokes().execute();

    }
    public class getJokes extends AsyncTask<Void,Void,Void> {
        ArrayList<String> arrayList=new ArrayList<>();
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            progressDialog=new ProgressDialog(husbandwife.this);
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
                Document document2= Jsoup.connect(url2).get();
                Elements parentList2=document2.getElementsByClass("statusList").select("li");
                for (Element element : parentList2){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document3= Jsoup.connect(url3).get();
                Elements parentList3=document3.getElementsByClass("statusList").select("li");
                for (Element element : parentList3){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document4= Jsoup.connect(url4).get();
                Elements parentList4=document4.getElementsByClass("statusList").select("li");
                for (Element element : parentList4){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document5= Jsoup.connect(url5).get();
                Elements parentList5=document5.getElementsByClass("statusList").select("li");
                for (Element element : parentList5){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document6= Jsoup.connect(url6).get();
                Elements parentList6=document6.getElementsByClass("statusList").select("li");
                for (Element element : parentList6){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document7= Jsoup.connect(url7).get();
                Elements parentList7=document7.getElementsByClass("statusList").select("li");
                for (Element element : parentList7){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document8= Jsoup.connect(url8).get();
                Elements parentList8=document8.getElementsByClass("statusList").select("li");
                for (Element element : parentList8){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document9= Jsoup.connect(url9).get();
                Elements parentList9=document9.getElementsByClass("statusList").select("li");
                for (Element element : parentList9){
                    String tobeAdded1=element.toString().replaceAll("<br>","\n");
                    String tobeAdded2=tobeAdded1.replaceAll("<li>","");
                    String  tobeAdded3=tobeAdded2.replaceAll("</li>","");
                    arrayList.add(tobeAdded3);
                    Log.d("check",tobeAdded3);
                }
                Document document10= Jsoup.connect(url10).get();
                Elements parentList10=document10.getElementsByClass("statusList").select("li");
                for (Element element : parentList10){
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
            recyclerView.addItemDecoration(new SimpleDividerItemDecoration(husbandwife.this));
            recyclerView.setAdapter(adapter);
            progressDialog.dismiss();
        }
    }
}
