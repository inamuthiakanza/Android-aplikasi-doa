package developer.ina.aplikasidoa;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView img = (ImageView) findViewById(R.id.imgdetail);
        TextView txtJudul =(TextView) findViewById(R.id.txtdetail);
        TextView txtLafadz = (TextView) findViewById(R.id.lafadzdetail);
        TextView txtIsi = (TextView) findViewById(R.id.isidetail);


        Intent a = getIntent();
        String nama = a.getStringExtra("nama");
        int image = a.getIntExtra("gambar",0);
        String lafadz = a.getStringExtra("lafadz");
        String isi = a.getStringExtra("isi");

        img.setImageResource(image);
        txtJudul.setText(nama);
        txtLafadz.setText(lafadz);
        txtIsi.setText(getString(Integer.parseInt(isi)));


    }
}
