package com.aamernabi.androidtemplate.core.extension

import com.squareup.moshi.Moshi

val moshi: Moshi = Moshi.Builder().build()

inline fun <reified T> String?.fromJson(): T? {
    this ?: return null
    val adapter = moshi.adapter(T::class.java)
    return adapter.fromJson(this)
}

inline fun <reified T> T?.toJson(): String? {
    this ?: return null
    val adapter = moshi.adapter(T::class.java)
    return adapter.toJson(this)
}

/*
inline fun <reified T> String?.fromJson(): T? {
    this ?: return null
    return try {
        val adapter = moshi.adapter(T::class.java)
        adapter.fromJson(this)
    } catch (e: IOException) {
        null
    }
}

inline fun <reified T> T?.toJson(): String? {
    this ?: return null
    return try {
        val adapter = moshi.adapter(T::class.java)
        adapter.toJson(this)
    } catch (e: IOException) {
        null
    }
}*/
