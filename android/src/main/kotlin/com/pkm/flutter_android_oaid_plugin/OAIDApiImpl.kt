package com.pkm.flutter_android_oaid_plugin

import OAIDApi
import android.content.Context
import com.github.gzuliyujiang.oaid.DeviceID
import com.github.gzuliyujiang.oaid.IGetter

class OAIDApiImpl(private val context: Context) : OAIDApi {
    override fun getOAID(callback: (Result<String>) -> Unit) {
        DeviceID.getOAID(context, object : IGetter {
            override fun onOAIDGetComplete(oaid: String) {
                callback(Result.success(oaid))
            }

            override fun onOAIDGetError(error: java.lang.Exception?) {
                if (error != null) {
                    callback(Result.failure(error))
                } else {
                    callback(Result.failure(Exception("Unknown error")))
                }
            }
        })
    }
}