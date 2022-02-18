// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A GroupPlacementPolicy specifies resource placement configuration. It specifies the failure bucket separation as well as network locality
 * 
 */
public final class ResourcePolicyGroupPlacementPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyGroupPlacementPolicyResponse Empty = new ResourcePolicyGroupPlacementPolicyResponse();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    @InputImport(name="availabilityDomainCount", required=true)
    private final Integer availabilityDomainCount;

    public Integer getAvailabilityDomainCount() {
        return this.availabilityDomainCount;
    }

    /**
     * Specifies network collocation
     * 
     */
    @InputImport(name="collocation", required=true)
    private final String collocation;

    public String getCollocation() {
        return this.collocation;
    }

    /**
     * Specifies network locality
     * 
     */
    @InputImport(name="locality", required=true)
    private final String locality;

    public String getLocality() {
        return this.locality;
    }

    /**
     * Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    /**
     * Specifies instances to hosts placement relationship
     * 
     */
    @InputImport(name="style", required=true)
    private final String style;

    public String getStyle() {
        return this.style;
    }

    /**
     * Number of vms in this placement group
     * 
     */
    @InputImport(name="vmCount", required=true)
    private final Integer vmCount;

    public Integer getVmCount() {
        return this.vmCount;
    }

    public ResourcePolicyGroupPlacementPolicyResponse(
        Integer availabilityDomainCount,
        String collocation,
        String locality,
        String scope,
        String style,
        Integer vmCount) {
        this.availabilityDomainCount = Objects.requireNonNull(availabilityDomainCount, "expected parameter 'availabilityDomainCount' to be non-null");
        this.collocation = Objects.requireNonNull(collocation, "expected parameter 'collocation' to be non-null");
        this.locality = Objects.requireNonNull(locality, "expected parameter 'locality' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.style = Objects.requireNonNull(style, "expected parameter 'style' to be non-null");
        this.vmCount = Objects.requireNonNull(vmCount, "expected parameter 'vmCount' to be non-null");
    }

    private ResourcePolicyGroupPlacementPolicyResponse() {
        this.availabilityDomainCount = null;
        this.collocation = null;
        this.locality = null;
        this.scope = null;
        this.style = null;
        this.vmCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availabilityDomainCount;
        private String collocation;
        private String locality;
        private String scope;
        private String style;
        private Integer vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.locality = defaults.locality;
    	      this.scope = defaults.scope;
    	      this.style = defaults.style;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder setAvailabilityDomainCount(Integer availabilityDomainCount) {
            this.availabilityDomainCount = Objects.requireNonNull(availabilityDomainCount);
            return this;
        }

        public Builder setCollocation(String collocation) {
            this.collocation = Objects.requireNonNull(collocation);
            return this;
        }

        public Builder setLocality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setStyle(String style) {
            this.style = Objects.requireNonNull(style);
            return this;
        }

        public Builder setVmCount(Integer vmCount) {
            this.vmCount = Objects.requireNonNull(vmCount);
            return this;
        }

        public ResourcePolicyGroupPlacementPolicyResponse build() {
            return new ResourcePolicyGroupPlacementPolicyResponse(availabilityDomainCount, collocation, locality, scope, style, vmCount);
        }
    }
}
