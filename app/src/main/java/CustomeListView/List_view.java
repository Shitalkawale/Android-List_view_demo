package CustomeListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.profile.R;

public class List_view extends AppCompatActivity {

    ListView mylistview;

    String[] name={"Siddharth","Ashwati","Anju","Ashwini","Shreya","Neha","Snehal","Supriya","Abhi","Kanishka"};
    int[] images={R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1,R.drawable.butterfly1};

    ViewAdaptor viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mylistview = findViewById(R.id.listview);
        viewAdapter=new ViewAdaptor(this,name,images);
        mylistview.setAdapter(viewAdapter);
    }
}