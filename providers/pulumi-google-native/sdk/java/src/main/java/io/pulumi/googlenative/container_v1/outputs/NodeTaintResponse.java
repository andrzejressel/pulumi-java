// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeTaintResponse {
    /**
     * Effect for taint.
     * 
     */
    private final String effect;
    /**
     * Key for taint.
     * 
     */
    private final String key;
    /**
     * Value for taint.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"effect","key","value"})
    private NodeTaintResponse(
        String effect,
        String key,
        String value) {
        this.effect = Objects.requireNonNull(effect);
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Effect for taint.
     * 
     */
    public String getEffect() {
        return this.effect;
    }
    /**
     * Key for taint.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Value for taint.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTaintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTaintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEffect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public NodeTaintResponse build() {
            return new NodeTaintResponse(effect, key, value);
        }
    }
}
