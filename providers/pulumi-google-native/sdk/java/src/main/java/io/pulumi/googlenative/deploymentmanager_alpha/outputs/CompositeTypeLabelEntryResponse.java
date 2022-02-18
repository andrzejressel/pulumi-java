// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CompositeTypeLabelEntryResponse {
    /**
     * Key of the label
     * 
     */
    private final String key;
    /**
     * Value of the label
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private CompositeTypeLabelEntryResponse(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Key of the label
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Value of the label
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositeTypeLabelEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositeTypeLabelEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public CompositeTypeLabelEntryResponse build() {
            return new CompositeTypeLabelEntryResponse(key, value);
        }
    }
}
