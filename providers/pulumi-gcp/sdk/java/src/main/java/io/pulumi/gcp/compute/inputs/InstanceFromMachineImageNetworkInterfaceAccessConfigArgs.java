// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageNetworkInterfaceAccessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageNetworkInterfaceAccessConfigArgs Empty = new InstanceFromMachineImageNetworkInterfaceAccessConfigArgs();

    @InputImport(name="natIp")
    private final @Nullable Input<String> natIp;

    public Input<String> getNatIp() {
        return this.natIp == null ? Input.empty() : this.natIp;
    }

    @InputImport(name="networkTier")
    private final @Nullable Input<String> networkTier;

    public Input<String> getNetworkTier() {
        return this.networkTier == null ? Input.empty() : this.networkTier;
    }

    @InputImport(name="publicPtrDomainName")
    private final @Nullable Input<String> publicPtrDomainName;

    public Input<String> getPublicPtrDomainName() {
        return this.publicPtrDomainName == null ? Input.empty() : this.publicPtrDomainName;
    }

    public InstanceFromMachineImageNetworkInterfaceAccessConfigArgs(
        @Nullable Input<String> natIp,
        @Nullable Input<String> networkTier,
        @Nullable Input<String> publicPtrDomainName) {
        this.natIp = natIp;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    private InstanceFromMachineImageNetworkInterfaceAccessConfigArgs() {
        this.natIp = Input.empty();
        this.networkTier = Input.empty();
        this.publicPtrDomainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageNetworkInterfaceAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> natIp;
        private @Nullable Input<String> networkTier;
        private @Nullable Input<String> publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageNetworkInterfaceAccessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder setNatIp(@Nullable Input<String> natIp) {
            this.natIp = natIp;
            return this;
        }

        public Builder setNatIp(@Nullable String natIp) {
            this.natIp = Input.ofNullable(natIp);
            return this;
        }

        public Builder setNetworkTier(@Nullable Input<String> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder setNetworkTier(@Nullable String networkTier) {
            this.networkTier = Input.ofNullable(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable Input<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Input.ofNullable(publicPtrDomainName);
            return this;
        }

        public InstanceFromMachineImageNetworkInterfaceAccessConfigArgs build() {
            return new InstanceFromMachineImageNetworkInterfaceAccessConfigArgs(natIp, networkTier, publicPtrDomainName);
        }
    }
}
