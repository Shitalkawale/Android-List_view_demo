package CustomeListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.profile.R;

import java.text.BreakIterator;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewAdaptor extends BaseAdapter {

    Context mcontext;
    String[] name;
    int[] profiles;


    public ViewAdaptor(Context mcontext, String[] name, int[] profiles) {
        this.mcontext = mcontext;
        this.name = name;
        this.profiles = profiles;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewgroup) {


            View myview;
            if (view == null) {
                LayoutInflater inflater = LayoutInflater.from(mcontext);
                myview = inflater.inflate(R.layout.view_adaptor, null);
            } else {
                myview = view;
            }
            CircleImageView circleImageView = myview.findViewById(R.id.image);
            TextView textView = myview.findViewById(R.id.name1);
            circleImageView.setImageResource(profiles[i]);

            textView.setText(name[i]);

        return myview;
    }
}
