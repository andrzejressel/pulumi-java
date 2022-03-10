// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImportCollectorPropertiesResponse {
    private final String createdTimestamp;
    private final @Nullable String discoverySiteId;
    private final String updatedTimestamp;

    @OutputCustomType.Constructor
    private ImportCollectorPropertiesResponse(
        @OutputCustomType.Parameter("createdTimestamp") String createdTimestamp,
        @OutputCustomType.Parameter("discoverySiteId") @Nullable String discoverySiteId,
        @OutputCustomType.Parameter("updatedTimestamp") String updatedTimestamp) {
        this.createdTimestamp = createdTimestamp;
        this.discoverySiteId = discoverySiteId;
        this.updatedTimestamp = updatedTimestamp;
    }

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }
    public Optional<String> getDiscoverySiteId() {
        return Optional.ofNullable(this.discoverySiteId);
    }
    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportCollectorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdTimestamp;
        private @Nullable String discoverySiteId;
        private String updatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportCollectorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.discoverySiteId = defaults.discoverySiteId;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
        }

        public Builder setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }

        public Builder setDiscoverySiteId(@Nullable String discoverySiteId) {
            this.discoverySiteId = discoverySiteId;
            return this;
        }

        public Builder setUpdatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }
        public ImportCollectorPropertiesResponse build() {
            return new ImportCollectorPropertiesResponse(createdTimestamp, discoverySiteId, updatedTimestamp);
        }
    }
}
