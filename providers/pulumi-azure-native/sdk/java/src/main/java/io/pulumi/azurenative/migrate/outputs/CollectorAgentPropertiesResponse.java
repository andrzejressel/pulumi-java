// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.CollectorBodyAgentSpnPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CollectorAgentPropertiesResponse {
    private final String id;
    private final String lastHeartbeatUtc;
    private final @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails;
    private final String version;

    @OutputCustomType.Constructor
    private CollectorAgentPropertiesResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("lastHeartbeatUtc") String lastHeartbeatUtc,
        @OutputCustomType.Parameter("spnDetails") @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails,
        @OutputCustomType.Parameter("version") String version) {
        this.id = id;
        this.lastHeartbeatUtc = lastHeartbeatUtc;
        this.spnDetails = spnDetails;
        this.version = version;
    }

    public String getId() {
        return this.id;
    }
    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    public Optional<CollectorBodyAgentSpnPropertiesResponse> getSpnDetails() {
        return Optional.ofNullable(this.spnDetails);
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorAgentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String lastHeartbeatUtc;
        private @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorAgentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.spnDetails = defaults.spnDetails;
    	      this.version = defaults.version;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder setSpnDetails(@Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails) {
            this.spnDetails = spnDetails;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public CollectorAgentPropertiesResponse build() {
            return new CollectorAgentPropertiesResponse(id, lastHeartbeatUtc, spnDetails, version);
        }
    }
}
