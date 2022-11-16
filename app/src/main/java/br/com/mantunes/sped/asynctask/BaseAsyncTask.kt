package br.com.mantunes.sped.asynctask

import android.os.AsyncTask

/**
* Aqui vai uma dica, você usou para aprendizado, tente usar apenas corroutines. Hoje é fortemente ignorado o uso do AsyncTask.
**/
class BaseAsyncTask<T>(
    private val quandoExecuta: () -> T,
    private val quandoFinaliza: (resultado: T) -> Unit
) : AsyncTask<Void, Void, T>() {

    override fun doInBackground(vararg params: Void?) = quandoExecuta()

    override fun onPostExecute(resultado: T) {
        super.onPostExecute(resultado)
        quandoFinaliza(resultado)
    }

}
