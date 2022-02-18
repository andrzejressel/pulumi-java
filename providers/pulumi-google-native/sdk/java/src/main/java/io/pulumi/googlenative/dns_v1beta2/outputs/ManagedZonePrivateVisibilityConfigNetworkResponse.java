// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZonePrivateVisibilityConfigNetworkResponse {
    private final String kind;
    /**
     * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    private final String networkUrl;

    @OutputCustomType.Constructor({"kind","networkUrl"})
    private ManagedZonePrivateVisibilityConfigNetworkResponse(
        String kind,
        String networkUrl) {
        this.kind = Objects.requireNonNull(kind);
        this.networkUrl = Objects.requireNonNull(networkUrl);
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }

        public ManagedZonePrivateVisibilityConfigNetworkResponse build() {
            return new ManagedZonePrivateVisibilityConfigNetworkResponse(kind, networkUrl);
        }
    }
}
