package com.daman.toastcustom

import android.content.Context
import android.widget.Toast

object MyUtils {
    fun printToast(context: Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}