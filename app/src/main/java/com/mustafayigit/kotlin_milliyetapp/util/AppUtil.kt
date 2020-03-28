package com.mustafayigit.kotlin_milliyetapp.util

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * Created By MUSTAFA
 * on 28/03/2020
 */

infix fun <T : AppCompatActivity> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, className))
}
