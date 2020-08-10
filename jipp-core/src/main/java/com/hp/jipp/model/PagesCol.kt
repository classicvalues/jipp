// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "pages-col" collection as defined in:
 * [APRIL2015F2F](https://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PagesCol
constructor(
    var fullColor: Int? = null,
    var monochrome: Int? = null
) : AttributeCollection {

    /** Construct an empty [PagesCol]. */
    constructor() : this(null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            fullColor?.let { PagesCol.fullColor.of(it) },
            monochrome?.let { PagesCol.monochrome.of(it) }
        )

    /** Defines types for each member of [PagesCol]. */
    companion object : AttributeCollection.Converter<PagesCol> {
        override fun convert(attributes: List<Attribute<*>>): PagesCol =
            PagesCol(
                extractOne(attributes, fullColor),
                extractOne(attributes, monochrome)
            )
        override val cls = PagesCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val fullColor = IntType("full-color")
        @JvmField val monochrome = IntType("monochrome")
    }
    override fun toString() = "PagesCol(${attributes.joinToString()})"
}
