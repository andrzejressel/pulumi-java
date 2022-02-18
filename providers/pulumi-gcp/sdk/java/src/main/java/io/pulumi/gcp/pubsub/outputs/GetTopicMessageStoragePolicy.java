// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTopicMessageStoragePolicy {
    private final List<String> allowedPersistenceRegions;

    @OutputCustomType.Constructor({"allowedPersistenceRegions"})
    private GetTopicMessageStoragePolicy(List<String> allowedPersistenceRegions) {
        this.allowedPersistenceRegions = Objects.requireNonNull(allowedPersistenceRegions);
    }

    public List<String> getAllowedPersistenceRegions() {
        return this.allowedPersistenceRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicMessageStoragePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedPersistenceRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicMessageStoragePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPersistenceRegions = defaults.allowedPersistenceRegions;
        }

        public Builder setAllowedPersistenceRegions(List<String> allowedPersistenceRegions) {
            this.allowedPersistenceRegions = Objects.requireNonNull(allowedPersistenceRegions);
            return this;
        }

        public GetTopicMessageStoragePolicy build() {
            return new GetTopicMessageStoragePolicy(allowedPersistenceRegions);
        }
    }
}
