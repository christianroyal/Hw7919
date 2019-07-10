package com.example.hw7919;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // new NoparamsAsyncTask().execute();
        // new AsyncTaskwithParams().execute(10,0,1,30,2,4,3,2);
        // new AsyncTaskwithResults().execute();
        new AsyncExcercise().execute(1,2,3);

        //new DownloadImage().execute();
    }

    private class NoparamsAsyncTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute: ");

        }

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Thread.sleep(5000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
                Log.d(TAG, "doInBackground: ");
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d(TAG, "onPostExecute: ");
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.d(TAG, "onProgressUpdate: ");
        }
    }

    private class AsyncTaskwithParams extends AsyncTask<Integer,Void,Void>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute: ");

        }

        @Override
        protected Void doInBackground(Integer... num) {

            int count= num [3];
            try {
                Thread.sleep(count*1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
                Log.d(TAG, "doInBackground: ");
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d(TAG, "onPostExecute: ");
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.d(TAG, "onProgressUpdate: ");
        }

    }

    private class AsyncTaskwithResults extends AsyncTask<Void,Void,String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute: ");

        }

        @Override
        protected String doInBackground(Void... voids) {

            try {
                Thread.sleep(5000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
                Log.d(TAG, "doInBackground: ");
            }

            return "You need some milk!";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: ");
            Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.d(TAG, "onProgressUpdate: ");
        }

    }

    private class AsyncExcercise extends AsyncTask<Integer,Void,String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute: ");

        }

        @Override
        protected String doInBackground(Integer... num) {

            int count= num [3];
            try {
                Thread.sleep(count*1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
                Log.d(TAG, "doInBackground: ");
            }

            return "res.mipmap.ai.png.jpg";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: ");
            Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.d(TAG, "onProgressUpdate: ");
        }

    }




}
