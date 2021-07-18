// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "finishings-col" collection as defined in:
 * [PWG5100.1](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class FinishingsCol
constructor(
    var baling: Baling? = null,
    var binding: Binding? = null,
    var coating: Coating? = null,
    var covering: Covering? = null,
    /** May contain any keyword from [FinishingTemplate] or a name. */
    var finishingTemplate: KeywordOrName? = null,
    var folding: List<Folding>? = null,
    /** May contain any keyword from [ImpositionTemplate] or a name. */
    var impositionTemplate: KeywordOrName? = null,
    var laminating: Laminating? = null,
    var mediaSheetsSupported: IntRange? = null,
    var mediaSize: MediaSize? = null,
    /** May contain any keyword from [Media]. */
    var mediaSizeName: String? = null,
    var punching: Punching? = null,
    var stitching: Stitching? = null,
    var trimming: List<Trimming>? = null,
) : AttributeCollection {

    /** Construct an empty [FinishingsCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            baling?.let { FinishingsCol.baling.of(it) },
            binding?.let { FinishingsCol.binding.of(it) },
            coating?.let { FinishingsCol.coating.of(it) },
            covering?.let { FinishingsCol.covering.of(it) },
            finishingTemplate?.let { FinishingsCol.finishingTemplate.of(it) },
            folding?.let { FinishingsCol.folding.of(it) },
            impositionTemplate?.let { FinishingsCol.impositionTemplate.of(it) },
            laminating?.let { FinishingsCol.laminating.of(it) },
            mediaSheetsSupported?.let { FinishingsCol.mediaSheetsSupported.of(it) },
            mediaSize?.let { FinishingsCol.mediaSize.of(it) },
            mediaSizeName?.let { FinishingsCol.mediaSizeName.of(it) },
            punching?.let { FinishingsCol.punching.of(it) },
            stitching?.let { FinishingsCol.stitching.of(it) },
            trimming?.let { FinishingsCol.trimming.of(it) },
        )

    /** Defines types for each member of [FinishingsCol]. */
    companion object : AttributeCollection.Converter<FinishingsCol> {
        override fun convert(attributes: List<Attribute<*>>): FinishingsCol =
            FinishingsCol(
                extractOne(attributes, baling),
                extractOne(attributes, binding),
                extractOne(attributes, coating),
                extractOne(attributes, covering),
                extractOne(attributes, finishingTemplate),
                extractAll(attributes, folding),
                extractOne(attributes, impositionTemplate),
                extractOne(attributes, laminating),
                extractOne(attributes, mediaSheetsSupported),
                extractOne(attributes, mediaSize),
                extractOne(attributes, mediaSizeName),
                extractOne(attributes, punching),
                extractOne(attributes, stitching),
                extractAll(attributes, trimming),
            )
        override val cls = FinishingsCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val baling = AttributeCollection.Type("baling", Baling)
        @JvmField val binding = AttributeCollection.Type("binding", Binding)
        @JvmField val coating = AttributeCollection.Type("coating", Coating)
        @JvmField val covering = AttributeCollection.Type("covering", Covering)
        @JvmField val finishingTemplate = KeywordOrNameType("finishing-template")
        @JvmField val folding = AttributeCollection.SetType("folding", Folding)
        @JvmField val impositionTemplate = KeywordOrNameType("imposition-template")
        @JvmField val laminating = AttributeCollection.Type("laminating", Laminating)
        @JvmField val mediaSheetsSupported = IntRangeType("media-sheets-supported")
        @JvmField val mediaSize = AttributeCollection.Type("media-size", MediaSize)
        @JvmField val mediaSizeName = KeywordType("media-size-name")
        @JvmField val punching = AttributeCollection.Type("punching", Punching)
        @JvmField val stitching = AttributeCollection.Type("stitching", Stitching)
        @JvmField val trimming = AttributeCollection.SetType("trimming", Trimming)
    }

    /**
     * Data object corresponding to a "baling" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Baling
    constructor(
        /** May contain any keyword from [BalingType] or a name. */
        var balingType: KeywordOrName? = null,
        /** May contain any keyword from [BalingWhen]. */
        var balingWhen: String? = null,
    ) : AttributeCollection {

        /** Construct an empty [Baling]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                balingType?.let { Baling.balingType.of(it) },
                balingWhen?.let { Baling.balingWhen.of(it) },
            )

        /** Defines types for each member of [Baling]. */
        companion object : AttributeCollection.Converter<Baling> {
            override fun convert(attributes: List<Attribute<*>>): Baling =
                Baling(
                    extractOne(attributes, balingType),
                    extractOne(attributes, balingWhen),
                )
            override val cls = Baling::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val balingType = KeywordOrNameType("baling-type")
            @JvmField val balingWhen = KeywordType("baling-when")
        }
        override fun toString() = "Baling(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "binding" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Binding
    constructor(
        /** May contain any keyword from [BindingReferenceEdge]. */
        var bindingReferenceEdge: String? = null,
        /** May contain any keyword from [BindingType] or a name. */
        var bindingType: KeywordOrName? = null,
    ) : AttributeCollection {

        /** Construct an empty [Binding]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                bindingReferenceEdge?.let { Binding.bindingReferenceEdge.of(it) },
                bindingType?.let { Binding.bindingType.of(it) },
            )

        /** Defines types for each member of [Binding]. */
        companion object : AttributeCollection.Converter<Binding> {
            override fun convert(attributes: List<Attribute<*>>): Binding =
                Binding(
                    extractOne(attributes, bindingReferenceEdge),
                    extractOne(attributes, bindingType),
                )
            override val cls = Binding::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val bindingReferenceEdge = KeywordType("binding-reference-edge")
            @JvmField val bindingType = KeywordOrNameType("binding-type")
        }
        override fun toString() = "Binding(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "coating" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Coating
    constructor(
        /** May contain any keyword from [CoatingSides]. */
        var coatingSides: String? = null,
        /** May contain any keyword from [CoatingType] or a name. */
        var coatingType: KeywordOrName? = null,
    ) : AttributeCollection {

        /** Construct an empty [Coating]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                coatingSides?.let { Coating.coatingSides.of(it) },
                coatingType?.let { Coating.coatingType.of(it) },
            )

        /** Defines types for each member of [Coating]. */
        companion object : AttributeCollection.Converter<Coating> {
            override fun convert(attributes: List<Attribute<*>>): Coating =
                Coating(
                    extractOne(attributes, coatingSides),
                    extractOne(attributes, coatingType),
                )
            override val cls = Coating::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val coatingSides = KeywordType("coating-sides")
            @JvmField val coatingType = KeywordOrNameType("coating-type")
        }
        override fun toString() = "Coating(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "covering" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Covering
    constructor(
        /** May contain any keyword from [CoveringName] or a name. */
        var coveringName: KeywordOrName? = null,
    ) : AttributeCollection {

        /** Construct an empty [Covering]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                coveringName?.let { Covering.coveringName.of(it) },
            )

        /** Defines types for each member of [Covering]. */
        companion object : AttributeCollection.Converter<Covering> {
            override fun convert(attributes: List<Attribute<*>>): Covering =
                Covering(
                    extractOne(attributes, coveringName),
                )
            override val cls = Covering::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val coveringName = KeywordOrNameType("covering-name")
        }
        override fun toString() = "Covering(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "folding" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Folding
    constructor(
        /** May contain any keyword from [FoldingDirection]. */
        var foldingDirection: String? = null,
        var foldingOffset: Int? = null,
        /** May contain any keyword from [FoldingReferenceEdge]. */
        var foldingReferenceEdge: String? = null,
    ) : AttributeCollection {

        /** Construct an empty [Folding]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                foldingDirection?.let { Folding.foldingDirection.of(it) },
                foldingOffset?.let { Folding.foldingOffset.of(it) },
                foldingReferenceEdge?.let { Folding.foldingReferenceEdge.of(it) },
            )

        /** Defines types for each member of [Folding]. */
        companion object : AttributeCollection.Converter<Folding> {
            override fun convert(attributes: List<Attribute<*>>): Folding =
                Folding(
                    extractOne(attributes, foldingDirection),
                    extractOne(attributes, foldingOffset),
                    extractOne(attributes, foldingReferenceEdge),
                )
            override val cls = Folding::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val foldingDirection = KeywordType("folding-direction")
            @JvmField val foldingOffset = IntType("folding-offset")
            @JvmField val foldingReferenceEdge = KeywordType("folding-reference-edge")
        }
        override fun toString() = "Folding(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "laminating" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Laminating
    constructor(
        /** May contain any keyword from [LaminatingSides]. */
        var laminatingSides: String? = null,
        /** May contain any keyword from [LaminatingType] or a name. */
        var laminatingType: KeywordOrName? = null,
    ) : AttributeCollection {

        /** Construct an empty [Laminating]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                laminatingSides?.let { Laminating.laminatingSides.of(it) },
                laminatingType?.let { Laminating.laminatingType.of(it) },
            )

        /** Defines types for each member of [Laminating]. */
        companion object : AttributeCollection.Converter<Laminating> {
            override fun convert(attributes: List<Attribute<*>>): Laminating =
                Laminating(
                    extractOne(attributes, laminatingSides),
                    extractOne(attributes, laminatingType),
                )
            override val cls = Laminating::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val laminatingSides = KeywordType("laminating-sides")
            @JvmField val laminatingType = KeywordOrNameType("laminating-type")
        }
        override fun toString() = "Laminating(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "media-size" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSize
    constructor(
        var xDimension: Int? = null,
        var yDimension: Int? = null,
    ) : AttributeCollection {

        /** Construct an empty [MediaSize]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                xDimension?.let { MediaSize.xDimension.of(it) },
                yDimension?.let { MediaSize.yDimension.of(it) },
            )

        /** Defines types for each member of [MediaSize]. */
        companion object : AttributeCollection.Converter<MediaSize> {
            override fun convert(attributes: List<Attribute<*>>): MediaSize =
                MediaSize(
                    extractOne(attributes, xDimension),
                    extractOne(attributes, yDimension),
                )
            override val cls = MediaSize::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val xDimension = IntType("x-dimension")
            @JvmField val yDimension = IntType("y-dimension")
        }
        override fun toString() = "MediaSize(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "punching" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Punching
    constructor(
        var punchingLocations: List<Int>? = null,
        var punchingOffset: Int? = null,
        /** May contain any keyword from [PunchingReferenceEdge]. */
        var punchingReferenceEdge: String? = null,
    ) : AttributeCollection {

        /** Construct an empty [Punching]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                punchingLocations?.let { Punching.punchingLocations.of(it) },
                punchingOffset?.let { Punching.punchingOffset.of(it) },
                punchingReferenceEdge?.let { Punching.punchingReferenceEdge.of(it) },
            )

        /** Defines types for each member of [Punching]. */
        companion object : AttributeCollection.Converter<Punching> {
            override fun convert(attributes: List<Attribute<*>>): Punching =
                Punching(
                    extractAll(attributes, punchingLocations),
                    extractOne(attributes, punchingOffset),
                    extractOne(attributes, punchingReferenceEdge),
                )
            override val cls = Punching::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val punchingLocations = IntType.Set("punching-locations")
            @JvmField val punchingOffset = IntType("punching-offset")
            @JvmField val punchingReferenceEdge = KeywordType("punching-reference-edge")
        }
        override fun toString() = "Punching(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "stitching" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Stitching
    constructor(
        var stitchingAngle: Int? = null,
        var stitchingLocations: List<Int>? = null,
        /** May contain any keyword from [StitchingMethod]. */
        var stitchingMethod: String? = null,
        var stitchingOffset: Int? = null,
        /** May contain any keyword from [StitchingReferenceEdge]. */
        var stitchingReferenceEdge: String? = null,
    ) : AttributeCollection {

        /** Construct an empty [Stitching]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                stitchingAngle?.let { Stitching.stitchingAngle.of(it) },
                stitchingLocations?.let { Stitching.stitchingLocations.of(it) },
                stitchingMethod?.let { Stitching.stitchingMethod.of(it) },
                stitchingOffset?.let { Stitching.stitchingOffset.of(it) },
                stitchingReferenceEdge?.let { Stitching.stitchingReferenceEdge.of(it) },
            )

        /** Defines types for each member of [Stitching]. */
        companion object : AttributeCollection.Converter<Stitching> {
            override fun convert(attributes: List<Attribute<*>>): Stitching =
                Stitching(
                    extractOne(attributes, stitchingAngle),
                    extractAll(attributes, stitchingLocations),
                    extractOne(attributes, stitchingMethod),
                    extractOne(attributes, stitchingOffset),
                    extractOne(attributes, stitchingReferenceEdge),
                )
            override val cls = Stitching::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val stitchingAngle = IntType("stitching-angle")
            @JvmField val stitchingLocations = IntType.Set("stitching-locations")
            @JvmField val stitchingMethod = KeywordType("stitching-method")
            @JvmField val stitchingOffset = IntType("stitching-offset")
            @JvmField val stitchingReferenceEdge = KeywordType("stitching-reference-edge")
        }
        override fun toString() = "Stitching(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "trimming" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Trimming
    constructor(
        var trimmingOffset: Int? = null,
        /** May contain any keyword from [TrimmingReferenceEdge]. */
        var trimmingReferenceEdge: String? = null,
        /** May contain any keyword from [TrimmingType] or a name. */
        var trimmingType: KeywordOrName? = null,
        /** May contain any keyword from [TrimmingWhen]. */
        var trimmingWhen: String? = null,
    ) : AttributeCollection {

        /** Construct an empty [Trimming]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                trimmingOffset?.let { Trimming.trimmingOffset.of(it) },
                trimmingReferenceEdge?.let { Trimming.trimmingReferenceEdge.of(it) },
                trimmingType?.let { Trimming.trimmingType.of(it) },
                trimmingWhen?.let { Trimming.trimmingWhen.of(it) },
            )

        /** Defines types for each member of [Trimming]. */
        companion object : AttributeCollection.Converter<Trimming> {
            override fun convert(attributes: List<Attribute<*>>): Trimming =
                Trimming(
                    extractOne(attributes, trimmingOffset),
                    extractOne(attributes, trimmingReferenceEdge),
                    extractOne(attributes, trimmingType),
                    extractOne(attributes, trimmingWhen),
                )
            override val cls = Trimming::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val trimmingOffset = IntType("trimming-offset")
            @JvmField val trimmingReferenceEdge = KeywordType("trimming-reference-edge")
            @JvmField val trimmingType = KeywordOrNameType("trimming-type")
            @JvmField val trimmingWhen = KeywordType("trimming-when")
        }
        override fun toString() = "Trimming(${attributes.joinToString()})"
    }
    override fun toString() = "FinishingsCol(${attributes.joinToString()})"
}
