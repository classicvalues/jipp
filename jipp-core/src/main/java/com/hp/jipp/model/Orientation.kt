// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "orientation-requested" enum as defined in:
 * [PWG5100.13](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class Orientation(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [Orientation] attribute. */
    class Type(name: String) : EnumType<Orientation>(name, { get(it) })

    /** An [AttributeType] for multiple [Orientation] attributes. */
    class SetType(name: String) : EnumType.Set<Orientation>(name, { get(it) })

    object Code {
        const val portrait = 3
        const val landscape = 4
        const val reverseLandscape = 5
        const val reversePortrait = 6
        const val none = 7
    }

    companion object {
        @JvmField val portrait = Orientation(Code.portrait, "portrait")
        @JvmField val landscape = Orientation(Code.landscape, "landscape")
        @JvmField val reverseLandscape = Orientation(Code.reverseLandscape, "reverse-landscape")
        @JvmField val reversePortrait = Orientation(Code.reversePortrait, "reverse-portrait")
        @JvmField val none = Orientation(Code.none, "none")

        @JvmField val all = listOf(
            portrait,
            landscape,
            reverseLandscape,
            reversePortrait,
            none,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): Orientation =
            all[value] ?: Orientation(value, "???")
    }
}
