// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperCapacitiesCapacityAssigned extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperCapacitiesCapacityAssigned Empty = new GetCloudwrapperCapacitiesCapacityAssigned();

    @Import(name="unit", required=true)
    private String unit;

    public String unit() {
        return this.unit;
    }

    @Import(name="value", required=true)
    private Integer value;

    public Integer value() {
        return this.value;
    }

    private GetCloudwrapperCapacitiesCapacityAssigned() {}

    private GetCloudwrapperCapacitiesCapacityAssigned(GetCloudwrapperCapacitiesCapacityAssigned $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperCapacitiesCapacityAssigned defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperCapacitiesCapacityAssigned $;

        public Builder() {
            $ = new GetCloudwrapperCapacitiesCapacityAssigned();
        }

        public Builder(GetCloudwrapperCapacitiesCapacityAssigned defaults) {
            $ = new GetCloudwrapperCapacitiesCapacityAssigned(Objects.requireNonNull(defaults));
        }

        public Builder unit(String unit) {
            $.unit = unit;
            return this;
        }

        public Builder value(Integer value) {
            $.value = value;
            return this;
        }

        public GetCloudwrapperCapacitiesCapacityAssigned build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
