// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAppend;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAspectCrop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationBackgroundColor;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationBlur;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationChromaKey;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationComposite;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationCompound;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationContrast;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationCrop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationFaceCrop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationFeatureCrop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationFitAndFill;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationGoop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationGrayscale;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationHsl;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationHsv;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationIfDimension;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationIfOrientation;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationImQuery;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationMaxColor;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationMirror;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationMonoHue;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationOpacity;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCrop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationRelativeCrop;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationRemoveColor;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationResize;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationRotate;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationScale;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationShears;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationTrim;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationUnsharpMask;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformation {
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppend> appends;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAspectCrop> aspectCrops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationBackgroundColor> backgroundColors;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationBlur> blurs;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationChromaKey> chromaKeys;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationComposite> composites;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationCompound> compounds;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationContrast> contrasts;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationCrop> crops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationFaceCrop> faceCrops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationFeatureCrop> featureCrops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationFitAndFill> fitAndFills;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationGoop> goops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationGrayscale> grayscales;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationHsl> hsls;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationHsv> hsvs;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationIfDimension> ifDimensions;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationIfOrientation> ifOrientations;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationImQuery> imQueries;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationMaxColor> maxColors;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationMirror> mirrors;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationMonoHue> monoHues;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationOpacity> opacities;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCrop> regionOfInterestCrops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationRelativeCrop> relativeCrops;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationRemoveColor> removeColors;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationResize> resizes;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationRotate> rotates;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationScale> scales;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationShears> shears;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationTrim> trims;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationUnsharpMask> unsharpMasks;

    private GetImagingPolicyImagePolicyTransformation() {}
    public List<GetImagingPolicyImagePolicyTransformationAppend> appends() {
        return this.appends == null ? List.of() : this.appends;
    }
    public List<GetImagingPolicyImagePolicyTransformationAspectCrop> aspectCrops() {
        return this.aspectCrops == null ? List.of() : this.aspectCrops;
    }
    public List<GetImagingPolicyImagePolicyTransformationBackgroundColor> backgroundColors() {
        return this.backgroundColors == null ? List.of() : this.backgroundColors;
    }
    public List<GetImagingPolicyImagePolicyTransformationBlur> blurs() {
        return this.blurs == null ? List.of() : this.blurs;
    }
    public List<GetImagingPolicyImagePolicyTransformationChromaKey> chromaKeys() {
        return this.chromaKeys == null ? List.of() : this.chromaKeys;
    }
    public List<GetImagingPolicyImagePolicyTransformationComposite> composites() {
        return this.composites == null ? List.of() : this.composites;
    }
    public List<GetImagingPolicyImagePolicyTransformationCompound> compounds() {
        return this.compounds == null ? List.of() : this.compounds;
    }
    public List<GetImagingPolicyImagePolicyTransformationContrast> contrasts() {
        return this.contrasts == null ? List.of() : this.contrasts;
    }
    public List<GetImagingPolicyImagePolicyTransformationCrop> crops() {
        return this.crops == null ? List.of() : this.crops;
    }
    public List<GetImagingPolicyImagePolicyTransformationFaceCrop> faceCrops() {
        return this.faceCrops == null ? List.of() : this.faceCrops;
    }
    public List<GetImagingPolicyImagePolicyTransformationFeatureCrop> featureCrops() {
        return this.featureCrops == null ? List.of() : this.featureCrops;
    }
    public List<GetImagingPolicyImagePolicyTransformationFitAndFill> fitAndFills() {
        return this.fitAndFills == null ? List.of() : this.fitAndFills;
    }
    public List<GetImagingPolicyImagePolicyTransformationGoop> goops() {
        return this.goops == null ? List.of() : this.goops;
    }
    public List<GetImagingPolicyImagePolicyTransformationGrayscale> grayscales() {
        return this.grayscales == null ? List.of() : this.grayscales;
    }
    public List<GetImagingPolicyImagePolicyTransformationHsl> hsls() {
        return this.hsls == null ? List.of() : this.hsls;
    }
    public List<GetImagingPolicyImagePolicyTransformationHsv> hsvs() {
        return this.hsvs == null ? List.of() : this.hsvs;
    }
    public List<GetImagingPolicyImagePolicyTransformationIfDimension> ifDimensions() {
        return this.ifDimensions == null ? List.of() : this.ifDimensions;
    }
    public List<GetImagingPolicyImagePolicyTransformationIfOrientation> ifOrientations() {
        return this.ifOrientations == null ? List.of() : this.ifOrientations;
    }
    public List<GetImagingPolicyImagePolicyTransformationImQuery> imQueries() {
        return this.imQueries == null ? List.of() : this.imQueries;
    }
    public List<GetImagingPolicyImagePolicyTransformationMaxColor> maxColors() {
        return this.maxColors == null ? List.of() : this.maxColors;
    }
    public List<GetImagingPolicyImagePolicyTransformationMirror> mirrors() {
        return this.mirrors == null ? List.of() : this.mirrors;
    }
    public List<GetImagingPolicyImagePolicyTransformationMonoHue> monoHues() {
        return this.monoHues == null ? List.of() : this.monoHues;
    }
    public List<GetImagingPolicyImagePolicyTransformationOpacity> opacities() {
        return this.opacities == null ? List.of() : this.opacities;
    }
    public List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCrop> regionOfInterestCrops() {
        return this.regionOfInterestCrops == null ? List.of() : this.regionOfInterestCrops;
    }
    public List<GetImagingPolicyImagePolicyTransformationRelativeCrop> relativeCrops() {
        return this.relativeCrops == null ? List.of() : this.relativeCrops;
    }
    public List<GetImagingPolicyImagePolicyTransformationRemoveColor> removeColors() {
        return this.removeColors == null ? List.of() : this.removeColors;
    }
    public List<GetImagingPolicyImagePolicyTransformationResize> resizes() {
        return this.resizes == null ? List.of() : this.resizes;
    }
    public List<GetImagingPolicyImagePolicyTransformationRotate> rotates() {
        return this.rotates == null ? List.of() : this.rotates;
    }
    public List<GetImagingPolicyImagePolicyTransformationScale> scales() {
        return this.scales == null ? List.of() : this.scales;
    }
    public List<GetImagingPolicyImagePolicyTransformationShears> shears() {
        return this.shears == null ? List.of() : this.shears;
    }
    public List<GetImagingPolicyImagePolicyTransformationTrim> trims() {
        return this.trims == null ? List.of() : this.trims;
    }
    public List<GetImagingPolicyImagePolicyTransformationUnsharpMask> unsharpMasks() {
        return this.unsharpMasks == null ? List.of() : this.unsharpMasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetImagingPolicyImagePolicyTransformationAppend> appends;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationAspectCrop> aspectCrops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationBackgroundColor> backgroundColors;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationBlur> blurs;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationChromaKey> chromaKeys;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationComposite> composites;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationCompound> compounds;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationContrast> contrasts;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationCrop> crops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationFaceCrop> faceCrops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationFeatureCrop> featureCrops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationFitAndFill> fitAndFills;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationGoop> goops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationGrayscale> grayscales;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationHsl> hsls;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationHsv> hsvs;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationIfDimension> ifDimensions;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationIfOrientation> ifOrientations;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationImQuery> imQueries;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationMaxColor> maxColors;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationMirror> mirrors;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationMonoHue> monoHues;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationOpacity> opacities;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCrop> regionOfInterestCrops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationRelativeCrop> relativeCrops;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationRemoveColor> removeColors;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationResize> resizes;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationRotate> rotates;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationScale> scales;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationShears> shears;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationTrim> trims;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationUnsharpMask> unsharpMasks;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appends = defaults.appends;
    	      this.aspectCrops = defaults.aspectCrops;
    	      this.backgroundColors = defaults.backgroundColors;
    	      this.blurs = defaults.blurs;
    	      this.chromaKeys = defaults.chromaKeys;
    	      this.composites = defaults.composites;
    	      this.compounds = defaults.compounds;
    	      this.contrasts = defaults.contrasts;
    	      this.crops = defaults.crops;
    	      this.faceCrops = defaults.faceCrops;
    	      this.featureCrops = defaults.featureCrops;
    	      this.fitAndFills = defaults.fitAndFills;
    	      this.goops = defaults.goops;
    	      this.grayscales = defaults.grayscales;
    	      this.hsls = defaults.hsls;
    	      this.hsvs = defaults.hsvs;
    	      this.ifDimensions = defaults.ifDimensions;
    	      this.ifOrientations = defaults.ifOrientations;
    	      this.imQueries = defaults.imQueries;
    	      this.maxColors = defaults.maxColors;
    	      this.mirrors = defaults.mirrors;
    	      this.monoHues = defaults.monoHues;
    	      this.opacities = defaults.opacities;
    	      this.regionOfInterestCrops = defaults.regionOfInterestCrops;
    	      this.relativeCrops = defaults.relativeCrops;
    	      this.removeColors = defaults.removeColors;
    	      this.resizes = defaults.resizes;
    	      this.rotates = defaults.rotates;
    	      this.scales = defaults.scales;
    	      this.shears = defaults.shears;
    	      this.trims = defaults.trims;
    	      this.unsharpMasks = defaults.unsharpMasks;
        }

        @CustomType.Setter
        public Builder appends(@Nullable List<GetImagingPolicyImagePolicyTransformationAppend> appends) {
            this.appends = appends;
            return this;
        }
        public Builder appends(GetImagingPolicyImagePolicyTransformationAppend... appends) {
            return appends(List.of(appends));
        }
        @CustomType.Setter
        public Builder aspectCrops(@Nullable List<GetImagingPolicyImagePolicyTransformationAspectCrop> aspectCrops) {
            this.aspectCrops = aspectCrops;
            return this;
        }
        public Builder aspectCrops(GetImagingPolicyImagePolicyTransformationAspectCrop... aspectCrops) {
            return aspectCrops(List.of(aspectCrops));
        }
        @CustomType.Setter
        public Builder backgroundColors(@Nullable List<GetImagingPolicyImagePolicyTransformationBackgroundColor> backgroundColors) {
            this.backgroundColors = backgroundColors;
            return this;
        }
        public Builder backgroundColors(GetImagingPolicyImagePolicyTransformationBackgroundColor... backgroundColors) {
            return backgroundColors(List.of(backgroundColors));
        }
        @CustomType.Setter
        public Builder blurs(@Nullable List<GetImagingPolicyImagePolicyTransformationBlur> blurs) {
            this.blurs = blurs;
            return this;
        }
        public Builder blurs(GetImagingPolicyImagePolicyTransformationBlur... blurs) {
            return blurs(List.of(blurs));
        }
        @CustomType.Setter
        public Builder chromaKeys(@Nullable List<GetImagingPolicyImagePolicyTransformationChromaKey> chromaKeys) {
            this.chromaKeys = chromaKeys;
            return this;
        }
        public Builder chromaKeys(GetImagingPolicyImagePolicyTransformationChromaKey... chromaKeys) {
            return chromaKeys(List.of(chromaKeys));
        }
        @CustomType.Setter
        public Builder composites(@Nullable List<GetImagingPolicyImagePolicyTransformationComposite> composites) {
            this.composites = composites;
            return this;
        }
        public Builder composites(GetImagingPolicyImagePolicyTransformationComposite... composites) {
            return composites(List.of(composites));
        }
        @CustomType.Setter
        public Builder compounds(@Nullable List<GetImagingPolicyImagePolicyTransformationCompound> compounds) {
            this.compounds = compounds;
            return this;
        }
        public Builder compounds(GetImagingPolicyImagePolicyTransformationCompound... compounds) {
            return compounds(List.of(compounds));
        }
        @CustomType.Setter
        public Builder contrasts(@Nullable List<GetImagingPolicyImagePolicyTransformationContrast> contrasts) {
            this.contrasts = contrasts;
            return this;
        }
        public Builder contrasts(GetImagingPolicyImagePolicyTransformationContrast... contrasts) {
            return contrasts(List.of(contrasts));
        }
        @CustomType.Setter
        public Builder crops(@Nullable List<GetImagingPolicyImagePolicyTransformationCrop> crops) {
            this.crops = crops;
            return this;
        }
        public Builder crops(GetImagingPolicyImagePolicyTransformationCrop... crops) {
            return crops(List.of(crops));
        }
        @CustomType.Setter
        public Builder faceCrops(@Nullable List<GetImagingPolicyImagePolicyTransformationFaceCrop> faceCrops) {
            this.faceCrops = faceCrops;
            return this;
        }
        public Builder faceCrops(GetImagingPolicyImagePolicyTransformationFaceCrop... faceCrops) {
            return faceCrops(List.of(faceCrops));
        }
        @CustomType.Setter
        public Builder featureCrops(@Nullable List<GetImagingPolicyImagePolicyTransformationFeatureCrop> featureCrops) {
            this.featureCrops = featureCrops;
            return this;
        }
        public Builder featureCrops(GetImagingPolicyImagePolicyTransformationFeatureCrop... featureCrops) {
            return featureCrops(List.of(featureCrops));
        }
        @CustomType.Setter
        public Builder fitAndFills(@Nullable List<GetImagingPolicyImagePolicyTransformationFitAndFill> fitAndFills) {
            this.fitAndFills = fitAndFills;
            return this;
        }
        public Builder fitAndFills(GetImagingPolicyImagePolicyTransformationFitAndFill... fitAndFills) {
            return fitAndFills(List.of(fitAndFills));
        }
        @CustomType.Setter
        public Builder goops(@Nullable List<GetImagingPolicyImagePolicyTransformationGoop> goops) {
            this.goops = goops;
            return this;
        }
        public Builder goops(GetImagingPolicyImagePolicyTransformationGoop... goops) {
            return goops(List.of(goops));
        }
        @CustomType.Setter
        public Builder grayscales(@Nullable List<GetImagingPolicyImagePolicyTransformationGrayscale> grayscales) {
            this.grayscales = grayscales;
            return this;
        }
        public Builder grayscales(GetImagingPolicyImagePolicyTransformationGrayscale... grayscales) {
            return grayscales(List.of(grayscales));
        }
        @CustomType.Setter
        public Builder hsls(@Nullable List<GetImagingPolicyImagePolicyTransformationHsl> hsls) {
            this.hsls = hsls;
            return this;
        }
        public Builder hsls(GetImagingPolicyImagePolicyTransformationHsl... hsls) {
            return hsls(List.of(hsls));
        }
        @CustomType.Setter
        public Builder hsvs(@Nullable List<GetImagingPolicyImagePolicyTransformationHsv> hsvs) {
            this.hsvs = hsvs;
            return this;
        }
        public Builder hsvs(GetImagingPolicyImagePolicyTransformationHsv... hsvs) {
            return hsvs(List.of(hsvs));
        }
        @CustomType.Setter
        public Builder ifDimensions(@Nullable List<GetImagingPolicyImagePolicyTransformationIfDimension> ifDimensions) {
            this.ifDimensions = ifDimensions;
            return this;
        }
        public Builder ifDimensions(GetImagingPolicyImagePolicyTransformationIfDimension... ifDimensions) {
            return ifDimensions(List.of(ifDimensions));
        }
        @CustomType.Setter
        public Builder ifOrientations(@Nullable List<GetImagingPolicyImagePolicyTransformationIfOrientation> ifOrientations) {
            this.ifOrientations = ifOrientations;
            return this;
        }
        public Builder ifOrientations(GetImagingPolicyImagePolicyTransformationIfOrientation... ifOrientations) {
            return ifOrientations(List.of(ifOrientations));
        }
        @CustomType.Setter
        public Builder imQueries(@Nullable List<GetImagingPolicyImagePolicyTransformationImQuery> imQueries) {
            this.imQueries = imQueries;
            return this;
        }
        public Builder imQueries(GetImagingPolicyImagePolicyTransformationImQuery... imQueries) {
            return imQueries(List.of(imQueries));
        }
        @CustomType.Setter
        public Builder maxColors(@Nullable List<GetImagingPolicyImagePolicyTransformationMaxColor> maxColors) {
            this.maxColors = maxColors;
            return this;
        }
        public Builder maxColors(GetImagingPolicyImagePolicyTransformationMaxColor... maxColors) {
            return maxColors(List.of(maxColors));
        }
        @CustomType.Setter
        public Builder mirrors(@Nullable List<GetImagingPolicyImagePolicyTransformationMirror> mirrors) {
            this.mirrors = mirrors;
            return this;
        }
        public Builder mirrors(GetImagingPolicyImagePolicyTransformationMirror... mirrors) {
            return mirrors(List.of(mirrors));
        }
        @CustomType.Setter
        public Builder monoHues(@Nullable List<GetImagingPolicyImagePolicyTransformationMonoHue> monoHues) {
            this.monoHues = monoHues;
            return this;
        }
        public Builder monoHues(GetImagingPolicyImagePolicyTransformationMonoHue... monoHues) {
            return monoHues(List.of(monoHues));
        }
        @CustomType.Setter
        public Builder opacities(@Nullable List<GetImagingPolicyImagePolicyTransformationOpacity> opacities) {
            this.opacities = opacities;
            return this;
        }
        public Builder opacities(GetImagingPolicyImagePolicyTransformationOpacity... opacities) {
            return opacities(List.of(opacities));
        }
        @CustomType.Setter
        public Builder regionOfInterestCrops(@Nullable List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCrop> regionOfInterestCrops) {
            this.regionOfInterestCrops = regionOfInterestCrops;
            return this;
        }
        public Builder regionOfInterestCrops(GetImagingPolicyImagePolicyTransformationRegionOfInterestCrop... regionOfInterestCrops) {
            return regionOfInterestCrops(List.of(regionOfInterestCrops));
        }
        @CustomType.Setter
        public Builder relativeCrops(@Nullable List<GetImagingPolicyImagePolicyTransformationRelativeCrop> relativeCrops) {
            this.relativeCrops = relativeCrops;
            return this;
        }
        public Builder relativeCrops(GetImagingPolicyImagePolicyTransformationRelativeCrop... relativeCrops) {
            return relativeCrops(List.of(relativeCrops));
        }
        @CustomType.Setter
        public Builder removeColors(@Nullable List<GetImagingPolicyImagePolicyTransformationRemoveColor> removeColors) {
            this.removeColors = removeColors;
            return this;
        }
        public Builder removeColors(GetImagingPolicyImagePolicyTransformationRemoveColor... removeColors) {
            return removeColors(List.of(removeColors));
        }
        @CustomType.Setter
        public Builder resizes(@Nullable List<GetImagingPolicyImagePolicyTransformationResize> resizes) {
            this.resizes = resizes;
            return this;
        }
        public Builder resizes(GetImagingPolicyImagePolicyTransformationResize... resizes) {
            return resizes(List.of(resizes));
        }
        @CustomType.Setter
        public Builder rotates(@Nullable List<GetImagingPolicyImagePolicyTransformationRotate> rotates) {
            this.rotates = rotates;
            return this;
        }
        public Builder rotates(GetImagingPolicyImagePolicyTransformationRotate... rotates) {
            return rotates(List.of(rotates));
        }
        @CustomType.Setter
        public Builder scales(@Nullable List<GetImagingPolicyImagePolicyTransformationScale> scales) {
            this.scales = scales;
            return this;
        }
        public Builder scales(GetImagingPolicyImagePolicyTransformationScale... scales) {
            return scales(List.of(scales));
        }
        @CustomType.Setter
        public Builder shears(@Nullable List<GetImagingPolicyImagePolicyTransformationShears> shears) {
            this.shears = shears;
            return this;
        }
        public Builder shears(GetImagingPolicyImagePolicyTransformationShears... shears) {
            return shears(List.of(shears));
        }
        @CustomType.Setter
        public Builder trims(@Nullable List<GetImagingPolicyImagePolicyTransformationTrim> trims) {
            this.trims = trims;
            return this;
        }
        public Builder trims(GetImagingPolicyImagePolicyTransformationTrim... trims) {
            return trims(List.of(trims));
        }
        @CustomType.Setter
        public Builder unsharpMasks(@Nullable List<GetImagingPolicyImagePolicyTransformationUnsharpMask> unsharpMasks) {
            this.unsharpMasks = unsharpMasks;
            return this;
        }
        public Builder unsharpMasks(GetImagingPolicyImagePolicyTransformationUnsharpMask... unsharpMasks) {
            return unsharpMasks(List.of(unsharpMasks));
        }
        public GetImagingPolicyImagePolicyTransformation build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformation();
            _resultValue.appends = appends;
            _resultValue.aspectCrops = aspectCrops;
            _resultValue.backgroundColors = backgroundColors;
            _resultValue.blurs = blurs;
            _resultValue.chromaKeys = chromaKeys;
            _resultValue.composites = composites;
            _resultValue.compounds = compounds;
            _resultValue.contrasts = contrasts;
            _resultValue.crops = crops;
            _resultValue.faceCrops = faceCrops;
            _resultValue.featureCrops = featureCrops;
            _resultValue.fitAndFills = fitAndFills;
            _resultValue.goops = goops;
            _resultValue.grayscales = grayscales;
            _resultValue.hsls = hsls;
            _resultValue.hsvs = hsvs;
            _resultValue.ifDimensions = ifDimensions;
            _resultValue.ifOrientations = ifOrientations;
            _resultValue.imQueries = imQueries;
            _resultValue.maxColors = maxColors;
            _resultValue.mirrors = mirrors;
            _resultValue.monoHues = monoHues;
            _resultValue.opacities = opacities;
            _resultValue.regionOfInterestCrops = regionOfInterestCrops;
            _resultValue.relativeCrops = relativeCrops;
            _resultValue.removeColors = removeColors;
            _resultValue.resizes = resizes;
            _resultValue.rotates = rotates;
            _resultValue.scales = scales;
            _resultValue.shears = shears;
            _resultValue.trims = trims;
            _resultValue.unsharpMasks = unsharpMasks;
            return _resultValue;
        }
    }
}
