// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.WorkspaceKeyDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomerManagedKeyDetailsResponse {
    /**
     * The key object of the workspace
     * 
     */
    private final @Nullable WorkspaceKeyDetailsResponse key;
    /**
     * The customer managed key status on the workspace
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private CustomerManagedKeyDetailsResponse(
        @OutputCustomType.Parameter("key") @Nullable WorkspaceKeyDetailsResponse key,
        @OutputCustomType.Parameter("status") String status) {
        this.key = key;
        this.status = status;
    }

    /**
     * The key object of the workspace
     * 
    */
    public Optional<WorkspaceKeyDetailsResponse> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The customer managed key status on the workspace
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerManagedKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkspaceKeyDetailsResponse key;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerManagedKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder setKey(@Nullable WorkspaceKeyDetailsResponse key) {
            this.key = key;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public CustomerManagedKeyDetailsResponse build() {
            return new CustomerManagedKeyDetailsResponse(key, status);
        }
    }
}
