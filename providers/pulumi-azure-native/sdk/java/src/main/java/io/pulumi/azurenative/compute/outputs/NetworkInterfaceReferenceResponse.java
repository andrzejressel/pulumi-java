// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInterfaceReferenceResponse {
    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    private final @Nullable String deleteOption;
    /**
     * Resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    private final @Nullable Boolean primary;

    @OutputCustomType.Constructor
    private NetworkInterfaceReferenceResponse(
        @OutputCustomType.Parameter("deleteOption") @Nullable String deleteOption,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("primary") @Nullable Boolean primary) {
        this.deleteOption = deleteOption;
        this.id = id;
        this.primary = primary;
    }

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
    */
    public Optional<String> getDeleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }
    /**
     * Resource Id
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
    */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable String id;
        private @Nullable Boolean primary;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.id = defaults.id;
    	      this.primary = defaults.primary;
        }

        public Builder setDeleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public NetworkInterfaceReferenceResponse build() {
            return new NetworkInterfaceReferenceResponse(deleteOption, id, primary);
        }
    }
}
