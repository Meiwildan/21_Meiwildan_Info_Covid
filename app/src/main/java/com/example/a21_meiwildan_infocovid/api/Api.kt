package com.example.a21_meiwildan_infocovid.api

import com.example.a21_meiwildan_infocovid.model.IndonesiaResponse
import com.example.a21_meiwildan_infocovid.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>

}