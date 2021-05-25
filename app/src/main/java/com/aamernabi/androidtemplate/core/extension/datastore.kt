package com.aamernabi.androidtemplate.core.extension

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

fun <T> DataStore<Preferences>.getValueFlow(
    key: Preferences.Key<T>,
    default: T
): Flow<T> {
    return this.data
        .catch { if (it is IOException) emit(emptyPreferences()) else throw it }
        .map { it[key] ?: default }
}

suspend fun <T> DataStore<Preferences>.setValue(
    key: Preferences.Key<T>,
    value: T
): Preferences = this.edit { it[key] = value }
