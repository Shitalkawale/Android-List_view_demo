package profile_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import com.example.profile.R;

public class Profileinfo extends AppCompatActivity {

    GridView gridview;
    String[] name={"Creativity","Leadership","Problem-Solving","Teamwork","Problem-Analysis","Creativity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileinfo);
        gridview=findViewById(R.id.gridview);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(Profileinfo.this, android.R.layout.simple_list_item_1,name);
        gridview.setAdapter(arrayAdapter);
    }
}