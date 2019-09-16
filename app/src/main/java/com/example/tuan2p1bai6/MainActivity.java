package com.example.tuan2p1bai6;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    String [] presidents;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kq=findViewById(R.id.textView_kq);
        ListView listView=getListView();
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listView.setTextFilterEnabled(true);
        presidents=getResources().getStringArray(R.array.presidents_array);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,presidents));
    }

    public void onListItemClick(ListView parent, View v, int position, long id){
        kq.setText("Position: "+position+",Value: "+presidents[position]);
    }

}
