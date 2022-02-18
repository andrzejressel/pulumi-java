// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyGetArgs Empty = new ServicePerimeterStatusIngressPolicyGetArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressFrom")
    private final @Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;

    public Input<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> getIngressFrom() {
        return this.ingressFrom == null ? Input.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressTo")
    private final @Nullable Input<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

    public Input<ServicePerimeterStatusIngressPolicyIngressToGetArgs> getIngressTo() {
        return this.ingressTo == null ? Input.empty() : this.ingressTo;
    }

    public ServicePerimeterStatusIngressPolicyGetArgs(
        @Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom,
        @Nullable Input<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimeterStatusIngressPolicyGetArgs() {
        this.ingressFrom = Input.empty();
        this.ingressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;
        private @Nullable Input<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(@Nullable Input<ServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder setIngressFrom(@Nullable ServicePerimeterStatusIngressPolicyIngressFromGetArgs ingressFrom) {
            this.ingressFrom = Input.ofNullable(ingressFrom);
            return this;
        }

        public Builder setIngressTo(@Nullable Input<ServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }

        public Builder setIngressTo(@Nullable ServicePerimeterStatusIngressPolicyIngressToGetArgs ingressTo) {
            this.ingressTo = Input.ofNullable(ingressTo);
            return this;
        }

        public ServicePerimeterStatusIngressPolicyGetArgs build() {
            return new ServicePerimeterStatusIngressPolicyGetArgs(ingressFrom, ingressTo);
        }
    }
}
