package com.niemietz.everis.beca.login.repository

import com.niemietz.everis.beca.login.interfaces.LoginAPI
import com.niemietz.everis.beca.login.model.AuthenticateRequest
import com.niemietz.everis.beca.login.model.GETSessionRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginRepository(private val api: LoginAPI) {
    suspend fun getSession(request: GETSessionRequest) =
        withContext(Dispatchers.IO) {
            api.getSession(request)
        }

    suspend fun authenticate(request: AuthenticateRequest) =
        withContext(Dispatchers.IO) {
            api.authenticate(request)
        }
}