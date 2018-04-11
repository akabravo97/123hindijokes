package abhijeet.a123jokes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by MAHE on 11-Apr-18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    ClipboardManager myClipboard;
    ArrayList<String> arrayList=new ArrayList<>();
    public RecyclerAdapter(ArrayList<String> arrayList) {
        this.arrayList=arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.textView.setText(arrayList.get(position));
        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("check","copy!!");
                myClipboard = (ClipboardManager) view.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("copiedJoke", arrayList.get(position));
                myClipboard.setPrimaryClip(clip);
                Toast.makeText(view.getContext(),"Copied!!",Toast.LENGTH_SHORT).show();
            }
        });
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("check","share!!");
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,arrayList.get(position));
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "More funny jokes on http://123hindijokes.com");
                Context context=view.getContext();
                context.startActivity(Intent.createChooser(shareIntent, "Share..."));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        Button share,copy;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.jokeHolder);
            share=(Button)itemView.findViewById(R.id.shareJoke);
            copy=(Button)itemView.findViewById(R.id.copyJoke);
        }
    }

}
