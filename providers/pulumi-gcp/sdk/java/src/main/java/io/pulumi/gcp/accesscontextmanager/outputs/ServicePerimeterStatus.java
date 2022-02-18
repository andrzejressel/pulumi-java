// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusEgressPolicy;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusIngressPolicy;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusVpcAccessibleServices;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimeterStatus {
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
    private final @Nullable List<String> accessLevels;
    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimeterStatusEgressPolicy> egressPolicies;
    /**
     * List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimeterStatusIngressPolicy> ingressPolicies;
    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    private final @Nullable List<String> resources;
    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter's access
     * restrictions.
     * 
     */
    private final @Nullable List<String> restrictedServices;
    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusVpcAccessibleServices vpcAccessibleServices;

    @OutputCustomType.Constructor({"accessLevels","egressPolicies","ingressPolicies","resources","restrictedServices","vpcAccessibleServices"})
    private ServicePerimeterStatus(
        @Nullable List<String> accessLevels,
        @Nullable List<ServicePerimeterStatusEgressPolicy> egressPolicies,
        @Nullable List<ServicePerimeterStatusIngressPolicy> ingressPolicies,
        @Nullable List<String> resources,
        @Nullable List<String> restrictedServices,
        @Nullable ServicePerimeterStatusVpcAccessibleServices vpcAccessibleServices) {
        this.accessLevels = accessLevels;
        this.egressPolicies = egressPolicies;
        this.ingressPolicies = ingressPolicies;
        this.resources = resources;
        this.restrictedServices = restrictedServices;
        this.vpcAccessibleServices = vpcAccessibleServices;
    }

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
    public List<String> getAccessLevels() {
        return this.accessLevels == null ? List.of() : this.accessLevels;
    }
    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimeterStatusEgressPolicy> getEgressPolicies() {
        return this.egressPolicies == null ? List.of() : this.egressPolicies;
    }
    /**
     * List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimeterStatusIngressPolicy> getIngressPolicies() {
        return this.ingressPolicies == null ? List.of() : this.ingressPolicies;
    }
    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter's access
     * restrictions.
     * 
     */
    public List<String> getRestrictedServices() {
        return this.restrictedServices == null ? List.of() : this.restrictedServices;
    }
    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimeterStatusVpcAccessibleServices> getVpcAccessibleServices() {
        return Optional.ofNullable(this.vpcAccessibleServices);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accessLevels;
        private @Nullable List<ServicePerimeterStatusEgressPolicy> egressPolicies;
        private @Nullable List<ServicePerimeterStatusIngressPolicy> ingressPolicies;
        private @Nullable List<String> resources;
        private @Nullable List<String> restrictedServices;
        private @Nullable ServicePerimeterStatusVpcAccessibleServices vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder setAccessLevels(@Nullable List<String> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder setEgressPolicies(@Nullable List<ServicePerimeterStatusEgressPolicy> egressPolicies) {
            this.egressPolicies = egressPolicies;
            return this;
        }

        public Builder setIngressPolicies(@Nullable List<ServicePerimeterStatusIngressPolicy> ingressPolicies) {
            this.ingressPolicies = ingressPolicies;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setRestrictedServices(@Nullable List<String> restrictedServices) {
            this.restrictedServices = restrictedServices;
            return this;
        }

        public Builder setVpcAccessibleServices(@Nullable ServicePerimeterStatusVpcAccessibleServices vpcAccessibleServices) {
            this.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }

        public ServicePerimeterStatus build() {
            return new ServicePerimeterStatus(accessLevels, egressPolicies, ingressPolicies, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
