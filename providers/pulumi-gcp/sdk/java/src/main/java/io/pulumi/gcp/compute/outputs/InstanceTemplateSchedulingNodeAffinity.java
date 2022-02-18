// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InstanceTemplateSchedulingNodeAffinity {
    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    private final String key;
    /**
     * The operator. Can be `IN` for node-affinities
     * or `NOT_IN` for anti-affinities.
     * 
     */
    private final String operator;
    /**
     * Corresponds to the label values of a reservation resource.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"key","operator","values"})
    private InstanceTemplateSchedulingNodeAffinity(
        String key,
        String operator,
        List<String> values) {
        this.key = Objects.requireNonNull(key);
        this.operator = Objects.requireNonNull(operator);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The operator. Can be `IN` for node-affinities
     * or `NOT_IN` for anti-affinities.
     * 
     */
    public String getOperator() {
        return this.operator;
    }
    /**
     * Corresponds to the label values of a reservation resource.
     * 
     */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateSchedulingNodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateSchedulingNodeAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public InstanceTemplateSchedulingNodeAffinity build() {
            return new InstanceTemplateSchedulingNodeAffinity(key, operator, values);
        }
    }
}
