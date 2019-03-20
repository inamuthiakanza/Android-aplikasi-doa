package developer.ina.aplikasidoa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String nama[] = {

            "Doa Bangun Tidur","Doa Mau Tidur","Doa Turun Hujan"
    };

    String lafadz[] = {
            "اَلْحَمْدُ ِللهِ الَّذِى أَحْيَانَا بَعْدَمَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ" , " بِاسْمِكَ اللّهُمَّ أَحْيَاوَأَمُوتُ" , "اللَّهُمَّ صَيِّبًا نَافِعًا"

    };
    int gambar[] = {
            R.drawable.banguntidur , R.drawable.ingin_tidur , R.drawable.hujan
    };
    String isi[] = {
            String.valueOf(R.string.doabanguntidur),String.valueOf(R.string.doamautidur),
            String.valueOf(R.string.doaturunhujan)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lvdoa);

        Adapter adapterListView = new Adapter(this, gambar, nama, lafadz, isi);
        listView.setAdapter(adapterListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getApplicationContext(), Detail.class);
                a.putExtra("nama",nama[position]);
                a.putExtra("lafadz",lafadz[position]);
                a.putExtra("isi",isi[position]);
                int c = gambar[position];
                a.putExtra("gambar",c);

                startActivity(a);
            }
        });
    }
}
