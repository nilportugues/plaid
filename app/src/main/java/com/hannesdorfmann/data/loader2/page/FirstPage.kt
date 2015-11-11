package com.hannesdorfmann.data.loader2.page

import com.hannesdorfmann.data.loader2.BackendCallFactory
import io.plaidapp.data.PlaidItem
import rx.Observable

/**
 *
 * A [Page] that loads older pages by using [BackendCallFactory]
 *
 * @author Hannes Dorfmann
 */
class FirstPage<T>(backendCalls: List<BackendCallFactory<T>>) : Page<T>(backendCalls) {

    override fun getBackendCall(callFactory: BackendCallFactory<T>): Observable<T> {
        return callFactory.getFirst();
    }
}