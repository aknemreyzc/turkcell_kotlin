package com.works.days_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CustomToast(var context: Context, var message : String)
{
    lateinit var customToastView: View
    lateinit var txtToast: TextView

    fun createToast() : Toast
    {
        customToastView = LayoutInflater.from(context).inflate(R.layout.custom_toast,null)
        txtToast = customToastView.findViewById(R.id.txtToast)
        txtToast.text = message
        var toast = Toast(context)
        toast.duration = Toast.LENGTH_LONG
        toast.view = customToastView
        return toast

    }
}