package io.github.sunnybird.xlogand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.mars.xlog.Xlog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Xlog.open(true,Xlog.LEVEL_DEBUG,MODE_APPEND,getCacheDir().getAbsolutePath(),getFilesDir().getAbsolutePath(),"XlogAnd",null);
    }
}
