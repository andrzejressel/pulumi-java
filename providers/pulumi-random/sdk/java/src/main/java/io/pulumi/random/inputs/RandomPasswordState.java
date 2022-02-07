// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomPasswordState extends io.pulumi.resources.ResourceArgs {

    public static final RandomPasswordState Empty = new RandomPasswordState();

    @InputImport(name="keepers")
    private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    @InputImport(name="length")
    private final @Nullable Input<Integer> length;

    public Input<Integer> getLength() {
        return this.length == null ? Input.empty() : this.length;
    }

    @InputImport(name="lower")
    private final @Nullable Input<Boolean> lower;

    public Input<Boolean> getLower() {
        return this.lower == null ? Input.empty() : this.lower;
    }

    @InputImport(name="minLower")
    private final @Nullable Input<Integer> minLower;

    public Input<Integer> getMinLower() {
        return this.minLower == null ? Input.empty() : this.minLower;
    }

    @InputImport(name="minNumeric")
    private final @Nullable Input<Integer> minNumeric;

    public Input<Integer> getMinNumeric() {
        return this.minNumeric == null ? Input.empty() : this.minNumeric;
    }

    @InputImport(name="minSpecial")
    private final @Nullable Input<Integer> minSpecial;

    public Input<Integer> getMinSpecial() {
        return this.minSpecial == null ? Input.empty() : this.minSpecial;
    }

    @InputImport(name="minUpper")
    private final @Nullable Input<Integer> minUpper;

    public Input<Integer> getMinUpper() {
        return this.minUpper == null ? Input.empty() : this.minUpper;
    }

    @InputImport(name="number")
    private final @Nullable Input<Boolean> number;

    public Input<Boolean> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    @InputImport(name="overrideSpecial")
    private final @Nullable Input<String> overrideSpecial;

    public Input<String> getOverrideSpecial() {
        return this.overrideSpecial == null ? Input.empty() : this.overrideSpecial;
    }

    @InputImport(name="result")
    private final @Nullable Input<String> result;

    public Input<String> getResult() {
        return this.result == null ? Input.empty() : this.result;
    }

    @InputImport(name="special")
    private final @Nullable Input<Boolean> special;

    public Input<Boolean> getSpecial() {
        return this.special == null ? Input.empty() : this.special;
    }

    @InputImport(name="upper")
    private final @Nullable Input<Boolean> upper;

    public Input<Boolean> getUpper() {
        return this.upper == null ? Input.empty() : this.upper;
    }

    public RandomPasswordState(
        @Nullable Input<Map<String,Object>> keepers,
        @Nullable Input<Integer> length,
        @Nullable Input<Boolean> lower,
        @Nullable Input<Integer> minLower,
        @Nullable Input<Integer> minNumeric,
        @Nullable Input<Integer> minSpecial,
        @Nullable Input<Integer> minUpper,
        @Nullable Input<Boolean> number,
        @Nullable Input<String> overrideSpecial,
        @Nullable Input<String> result,
        @Nullable Input<Boolean> special,
        @Nullable Input<Boolean> upper) {
        this.keepers = keepers;
        this.length = length;
        this.lower = lower;
        this.minLower = minLower;
        this.minNumeric = minNumeric;
        this.minSpecial = minSpecial;
        this.minUpper = minUpper;
        this.number = number;
        this.overrideSpecial = overrideSpecial;
        this.result = result;
        this.special = special;
        this.upper = upper;
    }

    private RandomPasswordState() {
        this.keepers = Input.empty();
        this.length = Input.empty();
        this.lower = Input.empty();
        this.minLower = Input.empty();
        this.minNumeric = Input.empty();
        this.minSpecial = Input.empty();
        this.minUpper = Input.empty();
        this.number = Input.empty();
        this.overrideSpecial = Input.empty();
        this.result = Input.empty();
        this.special = Input.empty();
        this.upper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomPasswordState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> keepers;
        private @Nullable Input<Integer> length;
        private @Nullable Input<Boolean> lower;
        private @Nullable Input<Integer> minLower;
        private @Nullable Input<Integer> minNumeric;
        private @Nullable Input<Integer> minSpecial;
        private @Nullable Input<Integer> minUpper;
        private @Nullable Input<Boolean> number;
        private @Nullable Input<String> overrideSpecial;
        private @Nullable Input<String> result;
        private @Nullable Input<Boolean> special;
        private @Nullable Input<Boolean> upper;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomPasswordState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.length = defaults.length;
    	      this.lower = defaults.lower;
    	      this.minLower = defaults.minLower;
    	      this.minNumeric = defaults.minNumeric;
    	      this.minSpecial = defaults.minSpecial;
    	      this.minUpper = defaults.minUpper;
    	      this.number = defaults.number;
    	      this.overrideSpecial = defaults.overrideSpecial;
    	      this.result = defaults.result;
    	      this.special = defaults.special;
    	      this.upper = defaults.upper;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public Builder setLength(@Nullable Input<Integer> length) {
            this.length = length;
            return this;
        }

        public Builder setLength(@Nullable Integer length) {
            this.length = Input.ofNullable(length);
            return this;
        }

        public Builder setLower(@Nullable Input<Boolean> lower) {
            this.lower = lower;
            return this;
        }

        public Builder setLower(@Nullable Boolean lower) {
            this.lower = Input.ofNullable(lower);
            return this;
        }

        public Builder setMinLower(@Nullable Input<Integer> minLower) {
            this.minLower = minLower;
            return this;
        }

        public Builder setMinLower(@Nullable Integer minLower) {
            this.minLower = Input.ofNullable(minLower);
            return this;
        }

        public Builder setMinNumeric(@Nullable Input<Integer> minNumeric) {
            this.minNumeric = minNumeric;
            return this;
        }

        public Builder setMinNumeric(@Nullable Integer minNumeric) {
            this.minNumeric = Input.ofNullable(minNumeric);
            return this;
        }

        public Builder setMinSpecial(@Nullable Input<Integer> minSpecial) {
            this.minSpecial = minSpecial;
            return this;
        }

        public Builder setMinSpecial(@Nullable Integer minSpecial) {
            this.minSpecial = Input.ofNullable(minSpecial);
            return this;
        }

        public Builder setMinUpper(@Nullable Input<Integer> minUpper) {
            this.minUpper = minUpper;
            return this;
        }

        public Builder setMinUpper(@Nullable Integer minUpper) {
            this.minUpper = Input.ofNullable(minUpper);
            return this;
        }

        public Builder setNumber(@Nullable Input<Boolean> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Boolean number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public Builder setOverrideSpecial(@Nullable Input<String> overrideSpecial) {
            this.overrideSpecial = overrideSpecial;
            return this;
        }

        public Builder setOverrideSpecial(@Nullable String overrideSpecial) {
            this.overrideSpecial = Input.ofNullable(overrideSpecial);
            return this;
        }

        public Builder setResult(@Nullable Input<String> result) {
            this.result = result;
            return this;
        }

        public Builder setResult(@Nullable String result) {
            this.result = Input.ofNullable(result);
            return this;
        }

        public Builder setSpecial(@Nullable Input<Boolean> special) {
            this.special = special;
            return this;
        }

        public Builder setSpecial(@Nullable Boolean special) {
            this.special = Input.ofNullable(special);
            return this;
        }

        public Builder setUpper(@Nullable Input<Boolean> upper) {
            this.upper = upper;
            return this;
        }

        public Builder setUpper(@Nullable Boolean upper) {
            this.upper = Input.ofNullable(upper);
            return this;
        }

        public RandomPasswordState build() {
            return new RandomPasswordState(keepers, length, lower, minLower, minNumeric, minSpecial, minUpper, number, overrideSpecial, result, special, upper);
        }
    }
}
