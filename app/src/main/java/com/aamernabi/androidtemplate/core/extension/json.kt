package com.aamernabi.androidtemplate.core.extension

import com.squareup.moshi.Moshi
import java.io.IOException

val moshi: Moshi = Moshi.Builder().build()

inline fun <reified T> String?.fromJson(): T? {
    this ?: return null
    return try {
        val adapter = moshi.adapter(T::class.java)
        adapter.fromJson(this)
    } catch (ignored: IOException) {
        null
    }
}

inline fun <reified T> T?.toJson(): String? {
    this ?: return null
    return try {
        val adapter = moshi.adapter(T::class.java)
        adapter.toJson(this)
    } catch (ignored: IOException) {
        null
    }
}
