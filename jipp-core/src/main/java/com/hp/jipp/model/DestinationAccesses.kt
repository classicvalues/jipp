// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "destination-accesses" collection as defined in:
 * [IPPWG20180620](https://ftp.pwg.org/pub/pwg/ipp/registrations/ippwg-access-x509-certificate-obsolete-20180620.txt),
 * [PWG5100.17](https://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DestinationAccesses
constructor(
    var accessOauthToken: List<ByteArray>? = null,
    var accessOauthUri: java.net.URI? = null,
    var accessPassword: String? = null,
    var accessPin: String? = null,
    var accessUserName: String? = null
) : AttributeCollection {

    /** Construct an empty [DestinationAccesses]. */
    constructor() : this(null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            accessOauthToken?.let { DestinationAccesses.accessOauthToken.of(it) },
            accessOauthUri?.let { DestinationAccesses.accessOauthUri.of(it) },
            accessPassword?.let { DestinationAccesses.accessPassword.of(it) },
            accessPin?.let { DestinationAccesses.accessPin.of(it) },
            accessUserName?.let { DestinationAccesses.accessUserName.of(it) }
        )

    /** Defines types for each member of [DestinationAccesses]. */
    companion object : AttributeCollection.Converter<DestinationAccesses> {
        override fun convert(attributes: List<Attribute<*>>): DestinationAccesses =
            DestinationAccesses(
                extractAll(attributes, accessOauthToken),
                extractOne(attributes, accessOauthUri),
                extractOne(attributes, accessPassword)?.value,
                extractOne(attributes, accessPin)?.value,
                extractOne(attributes, accessUserName)?.value
            )
        override val cls = DestinationAccesses::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val accessOauthToken = OctetsType.Set("access-oauth-token")
        @JvmField val accessOauthUri = UriType("access-oauth-uri")
        @JvmField val accessPassword = TextType("access-password")
        @JvmField val accessPin = TextType("access-pin")
        @JvmField val accessUserName = TextType("access-user-name")
    }
    override fun toString() = "DestinationAccesses(${attributes.joinToString()})"
}
