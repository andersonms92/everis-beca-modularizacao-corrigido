package com.niemietz.everis.beca.login.interfaces

import com.niemietz.everis.beca.login.constants.APIConstants.AUTHENTICATE
import com.niemietz.everis.beca.login.constants.APIConstants.GET_SESSION
import com.niemietz.everis.beca.login.model.GETSessionResponse
import com.niemietz.everis.beca.login.model.GETSessionRequest
import com.niemietz.everis.beca.login.model.AuthenticateResponse
import com.niemietz.everis.beca.login.model.AuthenticateRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginAPI {
    @POST(GET_SESSION)
    suspend fun getSession(
        @Body request: GETSessionRequest
    ): GETSessionResponse

    @POST(AUTHENTICATE)
    suspend fun authenticate(
        @Body request: AuthenticateRequest
    ): AuthenticateResponse
}