package com.niemietz.everis.beca.login.events

sealed class LoginEvents {
    object StartLoading: LoginEvents()
    object NoInternet: LoginEvents()
    object NoSession : LoginEvents()
}