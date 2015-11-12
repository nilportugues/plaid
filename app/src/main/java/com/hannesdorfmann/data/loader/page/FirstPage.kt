package com.hannesdorfmann.data.loader.page

import com.hannesdorfmann.data.loader.BackendCaller
import io.plaidapp.data.PlaidItem
import rx.Observable

/**
 *
 * A [Page] that loads older pages by using [BackendCaller]
 *
 * @author Hannes Dorfmann
 */
class FirstPage<T>(backendCalls: List<BackendCaller<T>>) : Page<T>(backendCalls) {

    override fun getBackendCall(callFactory: BackendCaller<T>): Observable<T> {
        return callFactory.getFirst();
    }
}