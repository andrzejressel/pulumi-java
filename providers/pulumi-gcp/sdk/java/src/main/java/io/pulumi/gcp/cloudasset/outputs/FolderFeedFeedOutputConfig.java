// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudasset.outputs.FolderFeedFeedOutputConfigPubsubDestination;
import java.util.Objects;

@OutputCustomType
public final class FolderFeedFeedOutputConfig {
    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    private final FolderFeedFeedOutputConfigPubsubDestination pubsubDestination;

    @OutputCustomType.Constructor({"pubsubDestination"})
    private FolderFeedFeedOutputConfig(FolderFeedFeedOutputConfigPubsubDestination pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
    }

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    public FolderFeedFeedOutputConfigPubsubDestination getPubsubDestination() {
        return this.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedFeedOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderFeedFeedOutputConfigPubsubDestination pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedFeedOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(FolderFeedFeedOutputConfigPubsubDestination pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public FolderFeedFeedOutputConfig build() {
            return new FolderFeedFeedOutputConfig(pubsubDestination);
        }
    }
}
