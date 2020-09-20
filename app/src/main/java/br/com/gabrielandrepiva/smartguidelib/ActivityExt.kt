package br.com.gabrielandrepiva.smartguidelib

import android.app.Activity import android.view.View
fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}
fun Activity.showKeyboard() {
    showKeyboard()
}