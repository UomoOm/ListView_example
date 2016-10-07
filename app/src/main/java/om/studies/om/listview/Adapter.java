package om.studies.om.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import static android.R.id.list;


public class Adapter extends ArrayAdapter<String> {


    public Adapter(Context context, List<String> list) {
        super(context, R.layout.list_item, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View root = inflater.inflate(R.layout.list_item, parent, false);
        TextView text = (TextView) root.findViewById(R.id.textView);
        text.setText(getItem(position));

        return root;


    }
}


