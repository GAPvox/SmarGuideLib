package br.com.gabrielandrepiva.smarguidelib

import android.app.Activity import android.view.View
fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}
fun Activity.showKeyboard() {
    showKeyboard()
}