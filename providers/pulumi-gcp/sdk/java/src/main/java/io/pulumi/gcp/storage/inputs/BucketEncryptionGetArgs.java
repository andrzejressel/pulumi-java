// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BucketEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketEncryptionGetArgs Empty = new BucketEncryptionGetArgs();

    @InputImport(name="defaultKmsKeyName", required=true)
    private final Input<String> defaultKmsKeyName;

    public Input<String> getDefaultKmsKeyName() {
        return this.defaultKmsKeyName;
    }

    public BucketEncryptionGetArgs(Input<String> defaultKmsKeyName) {
        this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName, "expected parameter 'defaultKmsKeyName' to be non-null");
    }

    private BucketEncryptionGetArgs() {
        this.defaultKmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> defaultKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKmsKeyName = defaults.defaultKmsKeyName;
        }

        public Builder setDefaultKmsKeyName(Input<String> defaultKmsKeyName) {
            this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName);
            return this;
        }

        public Builder setDefaultKmsKeyName(String defaultKmsKeyName) {
            this.defaultKmsKeyName = Input.of(Objects.requireNonNull(defaultKmsKeyName));
            return this;
        }

        public BucketEncryptionGetArgs build() {
            return new BucketEncryptionGetArgs(defaultKmsKeyName);
        }
    }
}
