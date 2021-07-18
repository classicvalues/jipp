// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "materials-col" collection as defined in:
 * [PWG5100.21](https://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d11-20190329-5100.21.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MaterialsCol
constructor(
    var materialAmount: Int? = null,
    /** May contain any keyword from [MaterialAmountUnit]. */
    var materialAmountUnits: String? = null,
    /** May contain any keyword from [MediaColor]. */
    var materialColor: String? = null,
    var materialDiameter: Int? = null,
    var materialDiameterTolerance: Int? = null,
    var materialFillDensity: Int? = null,
    var materialKey: String? = null,
    var materialName: String? = null,
    var materialNozzleDiameter: Int? = null,
    /** May contain any keyword from [MaterialPurpose]. */
    var materialPurpose: List<String>? = null,
    var materialRate: Int? = null,
    /** May contain any keyword from [MaterialRateUnit]. */
    var materialRateUnits: String? = null,
    var materialRetraction: Boolean? = null,
    var materialShellThickness: Int? = null,
    var materialTemperature: IntOrIntRange? = null,
    /** May contain any keyword from [MaterialType] or a name. */
    var materialType: KeywordOrName? = null,
) : AttributeCollection {

    /** Construct an empty [MaterialsCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            materialAmount?.let { MaterialsCol.materialAmount.of(it) },
            materialAmountUnits?.let { MaterialsCol.materialAmountUnits.of(it) },
            materialColor?.let { MaterialsCol.materialColor.of(it) },
            materialDiameter?.let { MaterialsCol.materialDiameter.of(it) },
            materialDiameterTolerance?.let { MaterialsCol.materialDiameterTolerance.of(it) },
            materialFillDensity?.let { MaterialsCol.materialFillDensity.of(it) },
            materialKey?.let { MaterialsCol.materialKey.of(it) },
            materialName?.let { MaterialsCol.materialName.of(it) },
            materialNozzleDiameter?.let { MaterialsCol.materialNozzleDiameter.of(it) },
            materialPurpose?.let { MaterialsCol.materialPurpose.of(it) },
            materialRate?.let { MaterialsCol.materialRate.of(it) },
            materialRateUnits?.let { MaterialsCol.materialRateUnits.of(it) },
            materialRetraction?.let { MaterialsCol.materialRetraction.of(it) },
            materialShellThickness?.let { MaterialsCol.materialShellThickness.of(it) },
            materialTemperature?.let { MaterialsCol.materialTemperature.of(it) },
            materialType?.let { MaterialsCol.materialType.of(it) },
        )

    /** Defines types for each member of [MaterialsCol]. */
    companion object : AttributeCollection.Converter<MaterialsCol> {
        override fun convert(attributes: List<Attribute<*>>): MaterialsCol =
            MaterialsCol(
                extractOne(attributes, materialAmount),
                extractOne(attributes, materialAmountUnits),
                extractOne(attributes, materialColor),
                extractOne(attributes, materialDiameter),
                extractOne(attributes, materialDiameterTolerance),
                extractOne(attributes, materialFillDensity),
                extractOne(attributes, materialKey),
                extractOne(attributes, materialName)?.value,
                extractOne(attributes, materialNozzleDiameter),
                extractAll(attributes, materialPurpose),
                extractOne(attributes, materialRate),
                extractOne(attributes, materialRateUnits),
                extractOne(attributes, materialRetraction),
                extractOne(attributes, materialShellThickness),
                extractOne(attributes, materialTemperature),
                extractOne(attributes, materialType),
            )
        override val cls = MaterialsCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val materialAmount = IntType("material-amount")
        @JvmField val materialAmountUnits = KeywordType("material-amount-units")
        @JvmField val materialColor = KeywordType("material-color")
        @JvmField val materialDiameter = IntType("material-diameter")
        @JvmField val materialDiameterTolerance = IntType("material-diameter-tolerance")
        @JvmField val materialFillDensity = IntType("material-fill-density")
        @JvmField val materialKey = KeywordType("material-key")
        @JvmField val materialName = NameType("material-name")
        @JvmField val materialNozzleDiameter = IntType("material-nozzle-diameter")
        @JvmField val materialPurpose = KeywordType.Set("material-purpose")
        @JvmField val materialRate = IntType("material-rate")
        @JvmField val materialRateUnits = KeywordType("material-rate-units")
        @JvmField val materialRetraction = BooleanType("material-retraction")
        @JvmField val materialShellThickness = IntType("material-shell-thickness")
        @JvmField val materialTemperature = IntOrIntRangeType("material-temperature")
        @JvmField val materialType = KeywordOrNameType("material-type")
    }
    override fun toString() = "MaterialsCol(${attributes.joinToString()})"
}
