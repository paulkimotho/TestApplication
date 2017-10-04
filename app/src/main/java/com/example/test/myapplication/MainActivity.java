package com.example.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class HandleJSON {
        public String url =
                "https://api.myjson.com/bins/a9eh1";

        private String name  = "name";
        private String email  = "email";
        private String balance  = "balance";

        public volatile boolean parsingComplete = true;
        public HandleJSON(String url){
            this.url = url;
        }

}
