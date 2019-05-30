package br.com.etecia.appestrela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produto_layout);

        Toolbar toolbar=(Toolbar) findViewById(R.id.idToolbar);
        setContentView(R.layout.produto_layout);

        getSupportActionBar().setIcon(R.drawable.ic_arrow_back_dp);
        getSupportActionBar().setTitle("EstrelaApp");
    }
}
