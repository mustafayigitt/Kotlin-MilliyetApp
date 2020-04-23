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

infix fun Context.extSaveNewsToSharedPref(title: String) {
    val pref = this.getSharedPreferences(packageName, Context.MODE_PRIVATE)
    var set = pref.getStringSet("keySavedNews", null)

    if (set == null) {
        set = HashSet<String>()
        set.add(title)
        pref.edit().putStringSet("keySavedNews", set).apply()
    } else {
        set.add(title)
        pref.edit()
            .remove("keySavedNews")
            .putStringSet("keySavedNews", set)
            .apply()
    }
}

// TODO: Implement Show Saved News in New View
// TODO: Add Detail View for News and open when click