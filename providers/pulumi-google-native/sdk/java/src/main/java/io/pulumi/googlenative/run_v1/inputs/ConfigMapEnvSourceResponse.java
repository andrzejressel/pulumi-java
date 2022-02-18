// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Not supported by Cloud Run ConfigMapEnvSource selects a ConfigMap to populate the environment variables with. The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
 * 
 */
public final class ConfigMapEnvSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigMapEnvSourceResponse Empty = new ConfigMapEnvSourceResponse();

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    @InputImport(name="localObjectReference", required=true)
    private final LocalObjectReferenceResponse localObjectReference;

    public LocalObjectReferenceResponse getLocalObjectReference() {
        return this.localObjectReference;
    }

    /**
     * The ConfigMap to select from.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * (Optional) Specify whether the ConfigMap must be defined
     * 
     */
    @InputImport(name="optional", required=true)
    private final Boolean optional;

    public Boolean getOptional() {
        return this.optional;
    }

    public ConfigMapEnvSourceResponse(
        LocalObjectReferenceResponse localObjectReference,
        String name,
        Boolean optional) {
        this.localObjectReference = Objects.requireNonNull(localObjectReference, "expected parameter 'localObjectReference' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.optional = Objects.requireNonNull(optional, "expected parameter 'optional' to be non-null");
    }

    private ConfigMapEnvSourceResponse() {
        this.localObjectReference = null;
        this.name = null;
        this.optional = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapEnvSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalObjectReferenceResponse localObjectReference;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapEnvSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setLocalObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }

        public ConfigMapEnvSourceResponse build() {
            return new ConfigMapEnvSourceResponse(localObjectReference, name, optional);
        }
    }
}
