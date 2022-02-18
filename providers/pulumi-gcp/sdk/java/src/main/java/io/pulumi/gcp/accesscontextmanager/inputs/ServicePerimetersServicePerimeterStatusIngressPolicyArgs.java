// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressFrom")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom;

    public Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs> getIngressFrom() {
        return this.ingressFrom == null ? Input.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressTo")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo;

    public Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs> getIngressTo() {
        return this.ingressTo == null ? Input.empty() : this.ingressTo;
    }

    public ServicePerimetersServicePerimeterStatusIngressPolicyArgs(
        @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyArgs() {
        this.ingressFrom = Input.empty();
        this.ingressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(@Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder setIngressFrom(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs ingressFrom) {
            this.ingressFrom = Input.ofNullable(ingressFrom);
            return this;
        }

        public Builder setIngressTo(@Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }

        public Builder setIngressTo(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs ingressTo) {
            this.ingressTo = Input.ofNullable(ingressTo);
            return this;
        }

        public ServicePerimetersServicePerimeterStatusIngressPolicyArgs build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyArgs(ingressFrom, ingressTo);
        }
    }
}
