// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePrivateVisibilityConfigNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZonePrivateVisibilityConfigNetworkResponse Empty = new ManagedZonePrivateVisibilityConfigNetworkResponse();

    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @InputImport(name="networkUrl", required=true)
    private final String networkUrl;

    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public ManagedZonePrivateVisibilityConfigNetworkResponse(
        String kind,
        String networkUrl) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private ManagedZonePrivateVisibilityConfigNetworkResponse() {
        this.kind = null;
        this.networkUrl = null;
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
