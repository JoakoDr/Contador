package com.example.joaco.contador

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         DownloadFilesTask().execute()
    }

    inner class DownloadFilesTask : AsyncTask<Void, Int, Long>() {
        override fun doInBackground(vararg params: Void?): Long? {
                //for desde 0 a 100 para poner la cuenta hacia delante
                for (i in 0..100)
                {
                    //Espera un segundo
                    SystemClock.sleep(1000)
                    //Muestra el toast por cada segundo
                    publishProgress(i)


                }
            return 0
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            Toast.makeText(this@MainActivity,"Progreso  ${values.first()}",Toast.LENGTH_SHORT).show()

        }

    }

}

