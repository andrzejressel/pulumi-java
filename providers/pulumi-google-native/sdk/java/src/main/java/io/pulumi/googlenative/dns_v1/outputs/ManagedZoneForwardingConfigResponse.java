// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZoneForwardingConfigNameServerTargetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedZoneForwardingConfigResponse {
    private final String kind;
    /**
     * List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
     * 
     */
    private final List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers;

    @OutputCustomType.Constructor({"kind","targetNameServers"})
    private ManagedZoneForwardingConfigResponse(
        String kind,
        List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers) {
        this.kind = Objects.requireNonNull(kind);
        this.targetNameServers = Objects.requireNonNull(targetNameServers);
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
     * 
     */
    public List<ManagedZoneForwardingConfigNameServerTargetResponse> getTargetNameServers() {
        return this.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setTargetNameServers(List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }

        public ManagedZoneForwardingConfigResponse build() {
            return new ManagedZoneForwardingConfigResponse(kind, targetNameServers);
        }
    }
}
