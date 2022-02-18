// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyArgs Empty = new ServicePerimeterStatusIngressPolicyArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressFrom")
    private final @Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom;

    public Input<ServicePerimeterStatusIngressPolicyIngressFromArgs> getIngressFrom() {
        return this.ingressFrom == null ? Input.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressTo")
    private final @Nullable Input<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo;

    public Input<ServicePerimeterStatusIngressPolicyIngressToArgs> getIngressTo() {
        return this.ingressTo == null ? Input.empty() : this.ingressTo;
    }

    public ServicePerimeterStatusIngressPolicyArgs(
        @Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom,
        @Nullable Input<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimeterStatusIngressPolicyArgs() {
        this.ingressFrom = Input.empty();
        this.ingressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom;
        private @Nullable Input<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(@Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder setIngressFrom(@Nullable ServicePerimeterStatusIngressPolicyIngressFromArgs ingressFrom) {
            this.ingressFrom = Input.ofNullable(ingressFrom);
            return this;
        }

        public Builder setIngressTo(@Nullable Input<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }

        public Builder setIngressTo(@Nullable ServicePerimeterStatusIngressPolicyIngressToArgs ingressTo) {
            this.ingressTo = Input.ofNullable(ingressTo);
            return this;
        }

        public ServicePerimeterStatusIngressPolicyArgs build() {
            return new ServicePerimeterStatusIngressPolicyArgs(ingressFrom, ingressTo);
        }
    }
}
