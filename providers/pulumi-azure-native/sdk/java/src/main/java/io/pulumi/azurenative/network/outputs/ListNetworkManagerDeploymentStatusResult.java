// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.NetworkManagerDeploymentStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListNetworkManagerDeploymentStatusResult {
    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    private final @Nullable String skipToken;
    /**
     * Gets a page of Network Manager Deployment Status
     * 
     */
    private final @Nullable List<NetworkManagerDeploymentStatusResponse> value;

    @OutputCustomType.Constructor
    private ListNetworkManagerDeploymentStatusResult(
        @OutputCustomType.Parameter("skipToken") @Nullable String skipToken,
        @OutputCustomType.Parameter("value") @Nullable List<NetworkManagerDeploymentStatusResponse> value) {
        this.skipToken = skipToken;
        this.value = value;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
    */
    public Optional<String> getSkipToken() {
        return Optional.ofNullable(this.skipToken);
    }
    /**
     * Gets a page of Network Manager Deployment Status
     * 
    */
    public List<NetworkManagerDeploymentStatusResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNetworkManagerDeploymentStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String skipToken;
        private @Nullable List<NetworkManagerDeploymentStatusResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNetworkManagerDeploymentStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skipToken = defaults.skipToken;
    	      this.value = defaults.value;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }

        public Builder setValue(@Nullable List<NetworkManagerDeploymentStatusResponse> value) {
            this.value = value;
            return this;
        }
        public ListNetworkManagerDeploymentStatusResult build() {
            return new ListNetworkManagerDeploymentStatusResult(skipToken, value);
        }
    }
}
