// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run SecretEnvSource selects a Secret to populate the environment variables with. The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
 * 
 */
public final class SecretEnvSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretEnvSourceArgs Empty = new SecretEnvSourceArgs();

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    @InputImport(name="localObjectReference")
    private final @Nullable Input<LocalObjectReferenceArgs> localObjectReference;

    public Input<LocalObjectReferenceArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Input.empty() : this.localObjectReference;
    }

    /**
     * The Secret to select from.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * (Optional) Specify whether the Secret must be defined
     * 
     */
    @InputImport(name="optional")
    private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public SecretEnvSourceArgs(
        @Nullable Input<LocalObjectReferenceArgs> localObjectReference,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.name = name;
        this.optional = optional;
    }

    private SecretEnvSourceArgs() {
        this.localObjectReference = Input.empty();
        this.name = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LocalObjectReferenceArgs> localObjectReference;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setLocalObjectReference(@Nullable Input<LocalObjectReferenceArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }

        public Builder setLocalObjectReference(@Nullable LocalObjectReferenceArgs localObjectReference) {
            this.localObjectReference = Input.ofNullable(localObjectReference);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptional(@Nullable Input<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = Input.ofNullable(optional);
            return this;
        }

        public SecretEnvSourceArgs build() {
            return new SecretEnvSourceArgs(localObjectReference, name, optional);
        }
    }
}
