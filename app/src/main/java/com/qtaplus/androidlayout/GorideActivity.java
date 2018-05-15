package com.qtaplus.androidlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GorideActivity extends AppCompatActivity {

    EditText et_kilometer;
    Button btnHitung;
    TextView tvHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goride);

        et_kilometer = (EditText) findViewById(R.id.et_kilometer);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        tvHarga = (TextView) findViewById(R.id.tvHarga);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_kilometer.getText().toString().length() == 0){
                    et_kilometer.setError("Masukkan Kilometer Terlebih Dahulu");
                } else {
                    Integer harga = 3000;
                    Integer kilometer = Integer.parseInt(et_kilometer
                            .getText().toString());
                    Integer total = harga* kilometer;
                    tvHarga.setText("Rp. " + total + " ,-");
                }
            }
        });

    }
}
