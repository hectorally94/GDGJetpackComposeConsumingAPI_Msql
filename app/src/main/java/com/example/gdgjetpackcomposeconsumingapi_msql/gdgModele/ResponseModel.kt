package com.example.gdgjetpackcomposeconsumingapi_msql.gdgModele
import kotlinx.serialization.Serializable

@Serializable
data class ResponseModel(
    val id:String,
    val name: String,
    val description: String
    )
