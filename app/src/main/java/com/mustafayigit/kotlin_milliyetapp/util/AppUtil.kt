package com.mustafayigit.kotlin_milliyetapp.util

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Created By MUSTAFA
 * on 28/03/2020
 */

infix fun <T : AppCompatActivity> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, className))
}

infix fun String.extToast(context: Context) {
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}