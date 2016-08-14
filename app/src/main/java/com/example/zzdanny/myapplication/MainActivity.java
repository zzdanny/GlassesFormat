package com.example.zzdanny.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button save,model,glass;
    private EditText name,birth,glasses;
    private ScrollView scroll;
int flag;
    final Context context = this;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    String currentDate= sdf.format(new Date());
    String glassword="";
    String changecolor = "";



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date now = new Date();
        android.text.format.DateFormat.format("yyyy-MM-dd-hh:mm:ss", now);
        name = (EditText) findViewById(R.id.Edit_name);
        glasses=(EditText)findViewById(R.id.glasses);
        scroll=(ScrollView)findViewById(R.id.scroll);
        birth = (EditText) findViewById(R.id.Edit_birth);
        save = (Button) findViewById(R.id.save);
      //  model = (Button) findViewById(R.id.Option_model);
        glass = (Button) findViewById(R.id.OPT_GLASS);
        glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                glassword="";
                dialog.setContentView(R.layout.option_model);
                final CheckBox op15, op156, op161, op167,op174, ophoya,opgreen, opis, opsafe,opnai,opglass,opuv,opblack, opbrown, opchange, optrans, opgun, opduo, opblue, optsai, opnikon;
                final Button submit;
                opgreen=(CheckBox)dialog.findViewById(R.id.opgreen);
                op15 = (CheckBox) dialog.findViewById(R.id.CHECK_15);
                op156 = (CheckBox) dialog.findViewById(R.id.CHECK_156);
                op161 = (CheckBox) dialog.findViewById(R.id.CHECK_161);
                op167 = (CheckBox)dialog.findViewById(R.id.CHECK_167);
                op174 = (CheckBox) dialog.findViewById(R.id.CHECK_174);
                opnai=(CheckBox)dialog.findViewById(R.id.opnai);
                ophoya = (CheckBox) dialog.findViewById(R.id.CHECK_HOYA);
                opis = (CheckBox) dialog.findViewById(R.id.CHECK_IS);
                opbrown = (CheckBox) dialog.findViewById(R.id.opbrown);
                opblack = (CheckBox) dialog.findViewById(R.id.opblack);
                optrans = (CheckBox) dialog.findViewById(R.id.optrans);
                opglass=(CheckBox)dialog.findViewById(R.id.CHECK_GLASS);
                opsafe=(CheckBox)dialog.findViewById(R.id.CHECK_SAFE);
                optsai = (CheckBox) dialog.findViewById(R.id.CHECK_TSAI);
                opgun = (CheckBox) dialog.findViewById(R.id.opgun);
                opnikon = (CheckBox) dialog.findViewById(R.id.CHECK_NIKON);
                opchange = (CheckBox) dialog.findViewById(R.id.opchange);
                opuv=(CheckBox)dialog.findViewById(R.id.uv);
                opblue = (CheckBox) dialog.findViewById(R.id.opblue);
                opduo = (CheckBox) dialog.findViewById(R.id.opduo);
                submit = (Button) dialog.findViewById(R.id.submit_GLASS);

                dialog.setTitle("Title...");

                CheckBox.OnCheckedChangeListener chk = new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if (op15.isChecked()) {
                            if (!glassword.contains(op15.getText().toString())) {
                                glassword += op15.getText().toString();
                            }
                        }
                        if (op156.isChecked()) {
                            if (!glassword.contains(op156.getText().toString())) {
                                glassword = glassword + op156.getText().toString();
                            }
                        }
                        if (op161.isChecked()) {
                            if (!glassword.contains(op161.getText().toString())) {
                                glassword += op161.getText().toString();
                            }
                        }
                        if (op167.isChecked()) {
                            if (!glassword.contains(op167.getText().toString())) {
                                glassword += op167.getText().toString();
                            }
                        }
                        if (opgreen.isChecked()) {
                            if (!glassword.contains(opgreen.getText().toString())) {
                                glassword += opgreen.getText().toString();
                            }
                        }
                        if (op174.isChecked()) {
                            if (!glassword.contains(op174.getText().toString())) {
                                glassword += op174.getText().toString();
                            }
                        }
                        if (opnai.isChecked()) {
                            if (!glassword.contains(opnai.getText().toString())) {
                                glassword += opnai.getText().toString();
                            }
                        }
                        if (opglass.isChecked()) {
                            if (!glassword.contains(opglass.getText().toString())) {
                                glassword += opglass.getText().toString();
                            }
                        }
                        if (opsafe.isChecked()) {
                            if (!glassword.contains(opsafe.getText().toString())) {
                                glassword += opsafe.getText().toString();
                            }
                        }
                        if (opis.isChecked()) {
                            if (!glassword.contains(opis.getText().toString())) {
                                glassword += opis.getText().toString();
                            }
                        }
                        if (ophoya.isChecked()) {
                            if (!glassword.contains(ophoya.getText().toString())) {
                                glassword += ophoya.getText().toString();
                            }
                        }
                        if (optsai.isChecked()) {
                            if (!glassword.contains(optsai.getText().toString())) {
                                glassword += optsai.getText().toString();
                            }
                        }
                        if (opnikon.isChecked()) {
                            if (!glassword.contains(opnikon.getText().toString())) {
                                glassword += opnikon.getText().toString();
                            }
                        }
                        if (opduo.isChecked()) {
                            if (!glassword.contains(opduo.getText().toString())) {
                                glassword += opduo.getText().toString();
                            }
                        }

                        if (opbrown.isChecked()) {
                            if (!glassword.contains(opbrown.getText().toString())) {
                                glassword += opbrown.getText().toString();
                                Log.d("glass", glassword);
                            }
                        }
                        if (opblack.isChecked()) {
                            if (!glassword.contains(opblack.getText().toString())) {
                                glassword += opblack.getText().toString();

                            }
                        }
                        if (optrans.isChecked()) {
                            if (!glassword.contains(optrans.getText().toString())) {

                                glassword += optrans.getText().toString();
                                Log.d("glass", glassword);

                            }
                        }
                        if(opuv.isChecked()){
                            if (!glassword.contains(opuv.getText().toString())) {

                                glassword += opuv.getText().toString();
                                Log.d("glass", glassword);

                            }

                        }
                        if (opchange.isChecked()) {
                            if (!glassword.contains(opchange.getText().toString())) {


                                glassword += opchange.getText().toString();
                            }
                        }

                        if (opgun.isChecked()) {
                            if (!glassword.contains(opgun.getText().toString())) {

                                glassword += opgun.getText().toString();
                            }
                        }
                        if (opblue.isChecked()) {
                            if (!glassword.contains(opblue.getText().toString())) {

                                glassword += opblue.getText().toString();
                            }
                        }


                    }
                };
                opblue.setOnCheckedChangeListener(chk);
                op15.setOnCheckedChangeListener(chk);
                op156.setOnCheckedChangeListener(chk);
                op161.setOnCheckedChangeListener(chk);
                op167.setOnCheckedChangeListener(chk);
                op174.setOnCheckedChangeListener(chk);
                ophoya.setOnCheckedChangeListener(chk);
                opis.setOnCheckedChangeListener(chk);
                optsai.setOnCheckedChangeListener(chk);
                opuv.setOnCheckedChangeListener(chk);
                opnikon.setOnCheckedChangeListener(chk);
                opduo.setOnCheckedChangeListener(chk);
                optrans.setOnCheckedChangeListener(chk);
                opchange.setOnCheckedChangeListener(chk);
                opbrown.setOnCheckedChangeListener(chk);
                opblack.setOnCheckedChangeListener(chk);
                opnai.setOnCheckedChangeListener(chk);
                opsafe.setOnCheckedChangeListener(chk);
                opglass.setOnCheckedChangeListener(chk);
                opgreen.setOnCheckedChangeListener(chk);
                ((Button)dialog.findViewById(R.id.submit_GLASS)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("BUGGGGGGGGGGGGGGG","BUG"+glassword);


                        dialog.dismiss();
                        glasses.setText(glassword);

                    }
                });


                dialog.show();

            }
        });


        if(!changecolor.isEmpty()){
            glasses.setText(changecolor);


        }
//宣告一個Handler

//幾秒後(delaySec)呼叫runTimerStop這個Runnable，再由這個Runnable去呼叫你想要做的事情


//移除

//主體


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scroll.smoothScrollTo(0,0);
                View view = getCurrentFocus();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                save.setVisibility(View.INVISIBLE);
                ((Button)findViewById(R.id.OPT_GLASS)).setVisibility(View.INVISIBLE);

                if (view != null) {
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                    // image naming and path  to include sd card  appending name you choose for file

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            File sdFile = android.os.Environment.getExternalStorageDirectory();
                            try {


                                // Do something after 5s = 5000ms
                                String folderath = sdFile.getPath() + File.separator + "data/" + currentDate.toString();

                                File dirFile = new File(folderath);
                                if (!dirFile.exists()) {
                                    dirFile.mkdir();
                                    Log.e("HERE", "HERE");
                                }
                                String folderath2 = sdFile.getPath() + File.separator + "data/" + currentDate.toString() + "/" + name.getText().toString();

                                File dirFile2 = new File(folderath2);
                                if (!dirFile2.exists()) {
                                    dirFile2.mkdir();
                                    Log.e("HERE2", "HERE2");
                                }

                                String imgPath = dirFile2.getPath() + "/" + name.getText().toString() + birth.getText().toString() + "DATE" + currentDate.toString() + ".jpg";
                                File imageFile = new File(imgPath);

                                View v1 = getWindow().getDecorView().getRootView();
                                v1.setDrawingCacheEnabled(true);
                                Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
                                v1.setDrawingCacheEnabled(false);
                                Log.d("print", "print");
                                FileOutputStream outputStream = new FileOutputStream(imageFile);
                                int quality = 100;
                                bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
                                outputStream.flush();
                                outputStream.close();
                            }catch  (Throwable e) {
                                // Several error may come out with file handling or OOM
                                Toast.makeText(MainActivity.this,"尚未儲存",Toast.LENGTH_LONG);
                                e.printStackTrace();
                        }
                        }
                    }, 1000);






                    // create bitmap screen capture










                save.setVisibility(View.VISIBLE);
                ((Button)findViewById(R.id.OPT_GLASS)).setVisibility(View.INVISIBLE);




            }
        });

    }
}

