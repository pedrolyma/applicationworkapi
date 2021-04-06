package com.courses.applicationworkapi.api

import android.telecom.Call
import com.courses.applicationworkapi.model.Product
import rettrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}