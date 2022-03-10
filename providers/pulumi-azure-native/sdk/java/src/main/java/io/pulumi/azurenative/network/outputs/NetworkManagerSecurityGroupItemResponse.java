// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkManagerSecurityGroupItemResponse {
    /**
     * Network manager group Id.
     * 
     */
    private final @Nullable String networkGroupId;

    @OutputCustomType.Constructor
    private NetworkManagerSecurityGroupItemResponse(@OutputCustomType.Parameter("networkGroupId") @Nullable String networkGroupId) {
        this.networkGroupId = networkGroupId;
    }

    /**
     * Network manager group Id.
     * 
    */
    public Optional<String> getNetworkGroupId() {
        return Optional.ofNullable(this.networkGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerSecurityGroupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String networkGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerSecurityGroupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupId = defaults.networkGroupId;
        }

        public Builder setNetworkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }
        public NetworkManagerSecurityGroupItemResponse build() {
            return new NetworkManagerSecurityGroupItemResponse(networkGroupId);
        }
    }
}
