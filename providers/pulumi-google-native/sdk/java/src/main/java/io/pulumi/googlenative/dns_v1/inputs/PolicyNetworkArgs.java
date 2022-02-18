// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyNetworkArgs Empty = new PolicyNetworkArgs();

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @InputImport(name="networkUrl")
    private final @Nullable Input<String> networkUrl;

    public Input<String> getNetworkUrl() {
        return this.networkUrl == null ? Input.empty() : this.networkUrl;
    }

    public PolicyNetworkArgs(
        @Nullable Input<String> kind,
        @Nullable Input<String> networkUrl) {
        this.kind = kind;
        this.networkUrl = networkUrl;
    }

    private PolicyNetworkArgs() {
        this.kind = Input.empty();
        this.networkUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setNetworkUrl(@Nullable Input<String> networkUrl) {
            this.networkUrl = networkUrl;
            return this;
        }

        public Builder setNetworkUrl(@Nullable String networkUrl) {
            this.networkUrl = Input.ofNullable(networkUrl);
            return this;
        }

        public PolicyNetworkArgs build() {
            return new PolicyNetworkArgs(kind, networkUrl);
        }
    }
}
