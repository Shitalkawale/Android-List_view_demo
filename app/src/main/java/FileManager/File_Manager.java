package FileManager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.profile.R;

import ListViewDemo.listViewDemo;

public class File_Manager extends AppCompatActivity {

    ListView listView;
    String[] name={"All Files","File safe","Remote management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file__manager);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(File_Manager.this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(arrayAdapter);
    }
}