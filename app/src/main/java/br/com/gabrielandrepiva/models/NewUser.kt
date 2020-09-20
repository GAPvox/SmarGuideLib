package br.com.gabrielandrepiva.smarguidelib
package br.com.gabrielandrepiva.smarguidelib.models

import com.google.firebase.firestore.Exclude

data class NewUser(
    val username: String? = null,
    val email: String? = null,
    val phone: String? = null,
    @Exclude val terms: Boolean? = false,
    @Exclude val password: String? = null
)