package com.example.gdgjetpackcomposeconsumingapi_msql.gdgModele

import kotlinx.serialization.Serializable

@Serializable
data class RequestModel(
    val id:String,
    val name: String,
    val description: String
    )
