package com.techmart15.vishal.techmart15;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by Vishal Anand on 20-Oct-15.
 */
public class FileService extends IntentService{
    public  static final String TRANSACTION_DONE =  "com.techmart15.TRANSACTION_DONE";
    public FileService(){
        super(FileService.class.getName());
    }
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public FileService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e("FileService", "Service Started");
        String passedURL = intent.getStringExtra("url");
        downloadFile(passedURL);
        Log.e("FileService", "Service Stopped");
        Intent i = new Intent(TRANSACTION_DONE);
        FileService.this.sendBroadcast(i);
    }
    protected void downloadFile(String theURL){
        String fileName = "myFile.txt";
        HttpURLConnection urlConnection;
        byte[] buffer = new byte[1024];
        try{
            FileOutputStream outputStream =
                    openFileOutput(fileName, Context.MODE_PRIVATE);
            URL fileURL = new URL(theURL);
            urlConnection = (HttpURLConnection) fileURL.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();

            int bufferLength = 0;
            while ((bufferLength = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,bufferLength);

            }
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
