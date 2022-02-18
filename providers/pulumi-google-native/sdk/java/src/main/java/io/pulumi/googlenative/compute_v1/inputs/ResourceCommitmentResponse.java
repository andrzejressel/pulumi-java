// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Commitment for a particular resource (a Commitment is composed of one or more of these).
 * 
 */
public final class ResourceCommitmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceCommitmentResponse Empty = new ResourceCommitmentResponse();

    /**
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * 
     */
    @InputImport(name="acceleratorType", required=true)
    private final String acceleratorType;

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
     */
    @InputImport(name="amount", required=true)
    private final String amount;

    public String getAmount() {
        return this.amount;
    }

    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ResourceCommitmentResponse(
        String acceleratorType,
        String amount,
        String type) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourceCommitmentResponse() {
        this.acceleratorType = null;
        this.amount = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCommitmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;
        private String amount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCommitmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.amount = defaults.amount;
    	      this.type = defaults.type;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder setAmount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ResourceCommitmentResponse build() {
            return new ResourceCommitmentResponse(acceleratorType, amount, type);
        }
    }
}
