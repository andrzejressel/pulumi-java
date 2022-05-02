// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.outputs;

import com.pulumi.awsnative.personalize.outputs.SolutionCategoricalHyperParameterRange;
import com.pulumi.awsnative.personalize.outputs.SolutionContinuousHyperParameterRange;
import com.pulumi.awsnative.personalize.outputs.SolutionIntegerHyperParameterRange;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SolutionConfigHpoConfigPropertiesAlgorithmHyperParameterRangesProperties {
    /**
     * @return The categorical hyperparameters and their ranges.
     * 
     */
    private final @Nullable List<SolutionCategoricalHyperParameterRange> categoricalHyperParameterRanges;
    /**
     * @return The continuous hyperparameters and their ranges.
     * 
     */
    private final @Nullable List<SolutionContinuousHyperParameterRange> continuousHyperParameterRanges;
    /**
     * @return The integer hyperparameters and their ranges.
     * 
     */
    private final @Nullable List<SolutionIntegerHyperParameterRange> integerHyperParameterRanges;

    @CustomType.Constructor
    private SolutionConfigHpoConfigPropertiesAlgorithmHyperParameterRangesProperties(
        @CustomType.Parameter("categoricalHyperParameterRanges") @Nullable List<SolutionCategoricalHyperParameterRange> categoricalHyperParameterRanges,
        @CustomType.Parameter("continuousHyperParameterRanges") @Nullable List<SolutionContinuousHyperParameterRange> continuousHyperParameterRanges,
        @CustomType.Parameter("integerHyperParameterRanges") @Nullable List<SolutionIntegerHyperParameterRange> integerHyperParameterRanges) {
        this.categoricalHyperParameterRanges = categoricalHyperParameterRanges;
        this.continuousHyperParameterRanges = continuousHyperParameterRanges;
        this.integerHyperParameterRanges = integerHyperParameterRanges;
    }

    /**
     * @return The categorical hyperparameters and their ranges.
     * 
     */
    public List<SolutionCategoricalHyperParameterRange> categoricalHyperParameterRanges() {
        return this.categoricalHyperParameterRanges == null ? List.of() : this.categoricalHyperParameterRanges;
    }
    /**
     * @return The continuous hyperparameters and their ranges.
     * 
     */
    public List<SolutionContinuousHyperParameterRange> continuousHyperParameterRanges() {
        return this.continuousHyperParameterRanges == null ? List.of() : this.continuousHyperParameterRanges;
    }
    /**
     * @return The integer hyperparameters and their ranges.
     * 
     */
    public List<SolutionIntegerHyperParameterRange> integerHyperParameterRanges() {
        return this.integerHyperParameterRanges == null ? List.of() : this.integerHyperParameterRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionConfigHpoConfigPropertiesAlgorithmHyperParameterRangesProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SolutionCategoricalHyperParameterRange> categoricalHyperParameterRanges;
        private @Nullable List<SolutionContinuousHyperParameterRange> continuousHyperParameterRanges;
        private @Nullable List<SolutionIntegerHyperParameterRange> integerHyperParameterRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionConfigHpoConfigPropertiesAlgorithmHyperParameterRangesProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalHyperParameterRanges = defaults.categoricalHyperParameterRanges;
    	      this.continuousHyperParameterRanges = defaults.continuousHyperParameterRanges;
    	      this.integerHyperParameterRanges = defaults.integerHyperParameterRanges;
        }

        public Builder categoricalHyperParameterRanges(@Nullable List<SolutionCategoricalHyperParameterRange> categoricalHyperParameterRanges) {
            this.categoricalHyperParameterRanges = categoricalHyperParameterRanges;
            return this;
        }
        public Builder categoricalHyperParameterRanges(SolutionCategoricalHyperParameterRange... categoricalHyperParameterRanges) {
            return categoricalHyperParameterRanges(List.of(categoricalHyperParameterRanges));
        }
        public Builder continuousHyperParameterRanges(@Nullable List<SolutionContinuousHyperParameterRange> continuousHyperParameterRanges) {
            this.continuousHyperParameterRanges = continuousHyperParameterRanges;
            return this;
        }
        public Builder continuousHyperParameterRanges(SolutionContinuousHyperParameterRange... continuousHyperParameterRanges) {
            return continuousHyperParameterRanges(List.of(continuousHyperParameterRanges));
        }
        public Builder integerHyperParameterRanges(@Nullable List<SolutionIntegerHyperParameterRange> integerHyperParameterRanges) {
            this.integerHyperParameterRanges = integerHyperParameterRanges;
            return this;
        }
        public Builder integerHyperParameterRanges(SolutionIntegerHyperParameterRange... integerHyperParameterRanges) {
            return integerHyperParameterRanges(List.of(integerHyperParameterRanges));
        }        public SolutionConfigHpoConfigPropertiesAlgorithmHyperParameterRangesProperties build() {
            return new SolutionConfigHpoConfigPropertiesAlgorithmHyperParameterRangesProperties(categoricalHyperParameterRanges, continuousHyperParameterRanges, integerHyperParameterRanges);
        }
    }
}
