package developer.ina.aplikasidoa;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter{
    private final Activity context;
    private final int gambar[];
    private final  String[] nama;
    private final String[] isi;

    public Adapter(Activity context, int[] gambar, String[] nama, String[] lahfadz, String[] isi) {
        super(context, R.layout.list_item,nama);
        this.context = context;
        this.gambar = gambar;
        this.nama = nama;
        this.isi = isi;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.list_item,null,true);
        TextView txt = (TextView)v.findViewById(R.id.txtdoa);
        ImageView img = (ImageView)v.findViewById(R.id.imgdoa);

        txt.setText(nama[position]);
        //img.setImageResource(gambar[position]);
        return v;



    }
}
