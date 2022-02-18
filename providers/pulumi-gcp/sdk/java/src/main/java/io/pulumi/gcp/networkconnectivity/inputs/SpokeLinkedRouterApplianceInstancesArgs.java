// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


public final class SpokeLinkedRouterApplianceInstancesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedRouterApplianceInstancesArgs Empty = new SpokeLinkedRouterApplianceInstancesArgs();

    /**
     * The list of router appliance instances
     * 
     */
    @InputImport(name="instances", required=true)
    private final Input<List<SpokeLinkedRouterApplianceInstancesInstanceArgs>> instances;

    public Input<List<SpokeLinkedRouterApplianceInstancesInstanceArgs>> getInstances() {
        return this.instances;
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    @InputImport(name="siteToSiteDataTransfer", required=true)
    private final Input<Boolean> siteToSiteDataTransfer;

    public Input<Boolean> getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    public SpokeLinkedRouterApplianceInstancesArgs(
        Input<List<SpokeLinkedRouterApplianceInstancesInstanceArgs>> instances,
        Input<Boolean> siteToSiteDataTransfer) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer, "expected parameter 'siteToSiteDataTransfer' to be non-null");
    }

    private SpokeLinkedRouterApplianceInstancesArgs() {
        this.instances = Input.empty();
        this.siteToSiteDataTransfer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<SpokeLinkedRouterApplianceInstancesInstanceArgs>> instances;
        private Input<Boolean> siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstancesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder setInstances(Input<List<SpokeLinkedRouterApplianceInstancesInstanceArgs>> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setInstances(List<SpokeLinkedRouterApplianceInstancesInstanceArgs> instances) {
            this.instances = Input.of(Objects.requireNonNull(instances));
            return this;
        }

        public Builder setSiteToSiteDataTransfer(Input<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }

        public Builder setSiteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Input.of(Objects.requireNonNull(siteToSiteDataTransfer));
            return this;
        }

        public SpokeLinkedRouterApplianceInstancesArgs build() {
            return new SpokeLinkedRouterApplianceInstancesArgs(instances, siteToSiteDataTransfer);
        }
    }
}
