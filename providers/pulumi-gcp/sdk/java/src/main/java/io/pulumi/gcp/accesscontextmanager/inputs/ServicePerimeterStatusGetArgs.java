// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusGetArgs Empty = new ServicePerimeterStatusGetArgs();

    /**
     * A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    @InputImport(name="accessLevels")
    private final @Nullable Input<List<String>> accessLevels;

    public Input<List<String>> getAccessLevels() {
        return this.accessLevels == null ? Input.empty() : this.accessLevels;
    }

    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressPolicies")
    private final @Nullable Input<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;

    public Input<List<ServicePerimeterStatusEgressPolicyGetArgs>> getEgressPolicies() {
        return this.egressPolicies == null ? Input.empty() : this.egressPolicies;
    }

    /**
     * List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressPolicies")
    private final @Nullable Input<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;

    public Input<List<ServicePerimeterStatusIngressPolicyGetArgs>> getIngressPolicies() {
        return this.ingressPolicies == null ? Input.empty() : this.ingressPolicies;
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @InputImport(name="resources")
    private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter's access
     * restrictions.
     * 
     */
    @InputImport(name="restrictedServices")
    private final @Nullable Input<List<String>> restrictedServices;

    public Input<List<String>> getRestrictedServices() {
        return this.restrictedServices == null ? Input.empty() : this.restrictedServices;
    }

    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    @InputImport(name="vpcAccessibleServices")
    private final @Nullable Input<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

    public Input<ServicePerimeterStatusVpcAccessibleServicesGetArgs> getVpcAccessibleServices() {
        return this.vpcAccessibleServices == null ? Input.empty() : this.vpcAccessibleServices;
    }

    public ServicePerimeterStatusGetArgs(
        @Nullable Input<List<String>> accessLevels,
        @Nullable Input<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies,
        @Nullable Input<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies,
        @Nullable Input<List<String>> resources,
        @Nullable Input<List<String>> restrictedServices,
        @Nullable Input<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
        this.accessLevels = accessLevels;
        this.egressPolicies = egressPolicies;
        this.ingressPolicies = ingressPolicies;
        this.resources = resources;
        this.restrictedServices = restrictedServices;
        this.vpcAccessibleServices = vpcAccessibleServices;
    }

    private ServicePerimeterStatusGetArgs() {
        this.accessLevels = Input.empty();
        this.egressPolicies = Input.empty();
        this.ingressPolicies = Input.empty();
        this.resources = Input.empty();
        this.restrictedServices = Input.empty();
        this.vpcAccessibleServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accessLevels;
        private @Nullable Input<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;
        private @Nullable Input<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;
        private @Nullable Input<List<String>> resources;
        private @Nullable Input<List<String>> restrictedServices;
        private @Nullable Input<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder setAccessLevels(@Nullable Input<List<String>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder setAccessLevels(@Nullable List<String> accessLevels) {
            this.accessLevels = Input.ofNullable(accessLevels);
            return this;
        }

        public Builder setEgressPolicies(@Nullable Input<List<ServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies) {
            this.egressPolicies = egressPolicies;
            return this;
        }

        public Builder setEgressPolicies(@Nullable List<ServicePerimeterStatusEgressPolicyGetArgs> egressPolicies) {
            this.egressPolicies = Input.ofNullable(egressPolicies);
            return this;
        }

        public Builder setIngressPolicies(@Nullable Input<List<ServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies) {
            this.ingressPolicies = ingressPolicies;
            return this;
        }

        public Builder setIngressPolicies(@Nullable List<ServicePerimeterStatusIngressPolicyGetArgs> ingressPolicies) {
            this.ingressPolicies = Input.ofNullable(ingressPolicies);
            return this;
        }

        public Builder setResources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder setRestrictedServices(@Nullable Input<List<String>> restrictedServices) {
            this.restrictedServices = restrictedServices;
            return this;
        }

        public Builder setRestrictedServices(@Nullable List<String> restrictedServices) {
            this.restrictedServices = Input.ofNullable(restrictedServices);
            return this;
        }

        public Builder setVpcAccessibleServices(@Nullable Input<ServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
            this.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }

        public Builder setVpcAccessibleServices(@Nullable ServicePerimeterStatusVpcAccessibleServicesGetArgs vpcAccessibleServices) {
            this.vpcAccessibleServices = Input.ofNullable(vpcAccessibleServices);
            return this;
        }

        public ServicePerimeterStatusGetArgs build() {
            return new ServicePerimeterStatusGetArgs(accessLevels, egressPolicies, ingressPolicies, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
