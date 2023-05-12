package com.morefun.androidframe;

import org.junit.Test;


import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp{
    OkHttpClient okHttpClient = new OkHttpClient();
    
    @Test
    public void AccessingHeaders() throws Exception {
        Request request = new Request.Builder()
                .url("https://api.github.com/repos/square/okhttp/issues")
                .header("User-Agent", "OKHttp Headers.java")
                .addHeader("Accept", "application/json;q=0.5")
                .addHeader("Accept", "application/vnd.github.v3+json")
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexcepted code" + response);
        }
    }
    
    public void run() throws Exception{
    
    }
}
