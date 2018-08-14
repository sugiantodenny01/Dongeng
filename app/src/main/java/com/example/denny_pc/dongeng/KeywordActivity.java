package com.example.denny_pc.dongeng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;




import java.util.ArrayList;


public class KeywordActivity extends AppCompatActivity {
    Intent intent;
    String stories;
    EditText txtNama,
    txtCAngka,txtCJam,txtCKerja,txtCProf,txtCNamaOrg,txtCTrans,txtCPakaian,txtCGame,txtTNegara,txtTHewan,txtTWarna,txtTNamaOrang,
    txtTNamaMknan,txtTNamaNgr,txtTNamaBenda,txtTNamaProf,txtTAngka,txtTAcaraTv,txtSBenda,txtSMakanan,txtSTransportasi,txtSNegara,
    txtSTempat,txtSSifat,txtSMajalah;
    String Nama, CAngka,CJam,CKerja,CProf,CNamaOrg,CTrans,CPakaian,CGame,TNegara,THewan,TWarna,TNamaOrang,
            TNamaMknan,TNamaNgr,TNamaBenda,TNamaProf,TAngka,TAcaraTv,SBenda,SMakanan,STransportasi,SNegara,
            STempat,SSifat,SMajalah;
    ArrayList<String> keywordCinderella = new ArrayList<>();
    ArrayList<String> keywordTarzan = new ArrayList<>();
    ArrayList<String> keywordSuperman = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword);
        RelativeLayout layoutCinder = (RelativeLayout) findViewById(R.id.layCinder);
        RelativeLayout layoutTarzan = (RelativeLayout) findViewById(R.id.layTarzan);
        RelativeLayout layoutSupes = (RelativeLayout) findViewById(R.id.laySupes);

        intent = getIntent();

        stories = intent.getStringExtra("story");

        if (stories.equals("Cinderella")){
            layoutCinder.setVisibility(View.VISIBLE);
            layoutTarzan.setVisibility(View.GONE);
            layoutSupes.setVisibility(View.GONE);
        }else if (stories.equals("Tarzan")){
            layoutCinder.setVisibility(View.GONE);
            layoutTarzan.setVisibility(View.VISIBLE);
            layoutSupes.setVisibility(View.GONE);
        }else {
            layoutCinder.setVisibility(View.GONE);
            layoutTarzan.setVisibility(View.GONE);
            layoutSupes.setVisibility(View.VISIBLE);
        }

    }
    public void Generate(View view) {
        txtNama = (EditText) findViewById(R.id.txtNama);
        Nama = txtNama.getText().toString();
        txtCAngka = (EditText) findViewById(R.id.txtCAngka);
        CAngka = txtCAngka.getText().toString();
        keywordCinderella.add(CAngka);
        txtCJam = (EditText) findViewById(R.id.txtCJam);
        CJam = txtCJam.getText().toString();
        keywordCinderella.add(CJam);
        txtCKerja = (EditText) findViewById(R.id.txtCKerja);
        CKerja= txtCKerja.getText().toString();
        keywordCinderella.add(CKerja);
        txtCProf = (EditText) findViewById(R.id.txtCProf);
        CProf= txtCProf.getText().toString();
        keywordCinderella.add(CProf);
        txtCNamaOrg = (EditText) findViewById(R.id.txtCNamaOrg);
        CNamaOrg= txtCNamaOrg.getText().toString();
        keywordCinderella.add(CNamaOrg);
        txtCTrans = (EditText) findViewById(R.id.txtCTrans);
        CTrans= txtCTrans.getText().toString();
        keywordCinderella.add(CTrans);
        txtCPakaian = (EditText) findViewById(R.id.txtCPakaian);
        CPakaian= txtCPakaian.getText().toString();
        keywordCinderella.add(CPakaian);
        txtCGame = (EditText) findViewById(R.id.txtCGame);
        CGame= txtCGame.getText().toString();
        keywordCinderella.add(CGame);
        keywordCinderella.add(Nama);
        //Tarzan
        txtTNegara = (EditText) findViewById(R.id.txtTNegara);
        TNegara = txtTNegara.getText().toString();
        keywordTarzan.add(TNegara);
        txtTHewan = (EditText) findViewById(R.id.txtTHewan);
        THewan = txtTHewan.getText().toString();
        keywordTarzan.add(THewan);
        txtTWarna = (EditText) findViewById(R.id.txtTWarna);
        TWarna = txtTWarna.getText().toString();
        keywordTarzan.add(TWarna);
        txtTNamaOrang = (EditText) findViewById(R.id.txtTNamaOrang);
        TNamaOrang = txtTNamaOrang.getText().toString();
        keywordTarzan.add(TNamaOrang);
        txtTNamaMknan = (EditText) findViewById(R.id.txtTNamaMknan);
        TNamaMknan = txtTNamaMknan.getText().toString();
        keywordTarzan.add(TNamaMknan);
        txtTNamaNgr = (EditText) findViewById(R.id.txtTNamaNgr);
        TNamaNgr = txtTNamaNgr.getText().toString();
        keywordTarzan.add(TNamaNgr);
        txtTNamaBenda = (EditText) findViewById(R.id.txtTNamaBenda);
        TNamaBenda = txtTNamaBenda.getText().toString();
        keywordTarzan.add(TNamaBenda);
        txtTNamaProf = (EditText) findViewById(R.id.txtTNamaProf);
        TNamaProf = txtTNamaProf.getText().toString();
        keywordTarzan.add(TNamaProf);
        txtTAngka = (EditText) findViewById(R.id.txtTAngka);
        TAngka = txtTAngka.getText().toString();
        keywordTarzan.add(TAngka);
        txtTAcaraTv = (EditText) findViewById(R.id.txtTAcaraTv);
        TAcaraTv = txtTAcaraTv.getText().toString();
        keywordTarzan.add(TAcaraTv);
        keywordTarzan.add(Nama);
        //Superman
        txtSBenda = (EditText) findViewById(R.id.txtSBenda);
        SBenda = txtSBenda.getText().toString();
        keywordSuperman.add(SBenda);
        txtSMakanan = (EditText) findViewById(R.id.txtSMakanan);
        SMakanan = txtSMakanan.getText().toString();
        keywordSuperman.add(SMakanan);
        txtSTransportasi = (EditText) findViewById(R.id.txtSTransportasi);
        STransportasi = txtSTransportasi.getText().toString();
        keywordSuperman.add(STransportasi);
        txtSNegara = (EditText) findViewById(R.id.txtSNegara);
        SNegara = txtSNegara.getText().toString();
        keywordSuperman.add(SNegara);
        txtSTempat = (EditText) findViewById(R.id.txtSTempat);
        STempat = txtSTempat.getText().toString();
        keywordSuperman.add(STempat);
        txtSSifat = (EditText) findViewById(R.id.txtSSifat);
        SSifat = txtSSifat.getText().toString();
        keywordSuperman.add(SSifat);
        txtSMajalah = (EditText) findViewById(R.id.txtSMajalah);
        SMajalah = txtSMajalah.getText().toString();
        keywordSuperman.add(SMajalah);
        keywordSuperman.add(Nama);

        if (stories.equals("Cinderella")){
            intent = new Intent(this,StoriesActivity.class);
            intent.putExtra("hashKey", keywordCinderella);
            intent.putExtra("story", "Cinderella");
            startActivity(intent);
        }else if (stories.equals("Tarzan")){
            intent = new Intent(this,StoriesActivity.class);
            intent.putExtra("hashKey", keywordTarzan);
            intent.putExtra("story", "Tarzan");
            startActivity(intent);
        }else {
            intent = new Intent(this,StoriesActivity.class);
            intent.putExtra("hashKey", keywordSuperman);
            intent.putExtra("story", "Superman");
            startActivity(intent);
        }
    }
}
