// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.VMResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BastionShareableLinkResponse {
    /**
     * The unique Bastion Shareable Link to the virtual machine.
     * 
     */
    private final String bsl;
    /**
     * The time when the link was created.
     * 
     */
    private final String createdAt;
    /**
     * Optional field indicating the warning or error message related to the vm in case of partial failure.
     * 
     */
    private final String message;
    /**
     * Reference of the virtual machine resource.
     * 
     */
    private final VMResponse vm;

    @OutputCustomType.Constructor
    private BastionShareableLinkResponse(
        @OutputCustomType.Parameter("bsl") String bsl,
        @OutputCustomType.Parameter("createdAt") String createdAt,
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("vm") VMResponse vm) {
        this.bsl = bsl;
        this.createdAt = createdAt;
        this.message = message;
        this.vm = vm;
    }

    /**
     * The unique Bastion Shareable Link to the virtual machine.
     * 
    */
    public String getBsl() {
        return this.bsl;
    }
    /**
     * The time when the link was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Optional field indicating the warning or error message related to the vm in case of partial failure.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Reference of the virtual machine resource.
     * 
    */
    public VMResponse getVm() {
        return this.vm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionShareableLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bsl;
        private String createdAt;
        private String message;
        private VMResponse vm;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionShareableLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bsl = defaults.bsl;
    	      this.createdAt = defaults.createdAt;
    	      this.message = defaults.message;
    	      this.vm = defaults.vm;
        }

        public Builder setBsl(String bsl) {
            this.bsl = Objects.requireNonNull(bsl);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setVm(VMResponse vm) {
            this.vm = Objects.requireNonNull(vm);
            return this;
        }
        public BastionShareableLinkResponse build() {
            return new BastionShareableLinkResponse(bsl, createdAt, message, vm);
        }
    }
}
