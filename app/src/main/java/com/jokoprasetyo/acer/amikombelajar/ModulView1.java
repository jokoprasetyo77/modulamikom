package com.jokoprasetyo.acer.amikombelajar;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import android.os.Bundle;

public class ModulView1 extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul_view1);
        pdfView = findViewById(R.id.pdfView);


        pdfView.fromAsset("1intro.pdf")
                .enableSwipe(true)
                .load();
    }
}
