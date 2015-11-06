package com.hannesdorfmann.data.source

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import com.hannesdorfmann.sqlbrite.objectmapper.annotation.Column
import com.hannesdorfmann.sqlbrite.objectmapper.annotation.ObjectMappable

/**
 * Represents an source that can be selected
 * @author Hannes Dorfmann
 */
@ObjectMappable
class Source() { // Unfortunately data class not supported yet by sqlbrite-dao

    companion object ID {
        internal const val UNKNOWN_ID = -1L
    }

    @Column(SourceDaoImpl.COL.ID)
    var id: Long = UNKNOWN_ID

    @Column(SourceDaoImpl.COL.ORDER)
    var order: Int = 0

    @Column(SourceDaoImpl.COL.ENABLED)
    var enabled: Boolean = false

    @Column(SourceDaoImpl.COL.AUTH_REQUIRED)
    var authenticationRequired = false

    @Column(SourceDaoImpl.COL.BACKEND_ID)
    var backendId: Int = -1

    constructor(id: Long = UNKNOWN_ID, order: Int, enabled: Boolean, backendId: Int, authenticationRequired: Boolean) : this() {
        this.id = id
        this.order = order
        this.enabled = enabled
        this.authenticationRequired = authenticationRequired
        this.backendId = backendId
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Source

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

}