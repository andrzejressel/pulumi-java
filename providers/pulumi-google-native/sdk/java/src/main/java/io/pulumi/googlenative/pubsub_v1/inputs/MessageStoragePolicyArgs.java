// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy constraining the storage of messages published to the topic.
 * 
 */
public final class MessageStoragePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MessageStoragePolicyArgs Empty = new MessageStoragePolicyArgs();

    /**
     * A list of IDs of GCP regions where messages that are published to the topic may be persisted in storage. Messages published by publishers running in non-allowed GCP regions (or running outside of GCP altogether) will be routed for storage in one of the allowed regions. An empty list means that no regions are allowed, and is not a valid configuration.
     * 
     */
    @InputImport(name="allowedPersistenceRegions")
    private final @Nullable Input<List<String>> allowedPersistenceRegions;

    public Input<List<String>> getAllowedPersistenceRegions() {
        return this.allowedPersistenceRegions == null ? Input.empty() : this.allowedPersistenceRegions;
    }

    public MessageStoragePolicyArgs(@Nullable Input<List<String>> allowedPersistenceRegions) {
        this.allowedPersistenceRegions = allowedPersistenceRegions;
    }

    private MessageStoragePolicyArgs() {
        this.allowedPersistenceRegions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessageStoragePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedPersistenceRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(MessageStoragePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPersistenceRegions = defaults.allowedPersistenceRegions;
        }

        public Builder setAllowedPersistenceRegions(@Nullable Input<List<String>> allowedPersistenceRegions) {
            this.allowedPersistenceRegions = allowedPersistenceRegions;
            return this;
        }

        public Builder setAllowedPersistenceRegions(@Nullable List<String> allowedPersistenceRegions) {
            this.allowedPersistenceRegions = Input.ofNullable(allowedPersistenceRegions);
            return this;
        }

        public MessageStoragePolicyArgs build() {
            return new MessageStoragePolicyArgs(allowedPersistenceRegions);
        }
    }
}
