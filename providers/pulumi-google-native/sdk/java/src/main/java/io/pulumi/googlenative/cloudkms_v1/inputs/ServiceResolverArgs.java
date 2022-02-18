// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudkms_v1.inputs.CertificateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A ServiceResolver represents an EKM replica that can be reached within an EkmConnection.
 * 
 */
public final class ServiceResolverArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceResolverArgs Empty = new ServiceResolverArgs();

    /**
     * Optional. The filter applied to the endpoints of the resolved service. If no filter is specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the filtered list for each request. For endpoint filter syntax and examples, see https://cloud.google.com/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
     * 
     */
    @InputImport(name="endpointFilter")
    private final @Nullable Input<String> endpointFilter;

    public Input<String> getEndpointFilter() {
        return this.endpointFilter == null ? Input.empty() : this.endpointFilter;
    }

    /**
     * The hostname of the EKM replica used at TLS and HTTP layers.
     * 
     */
    @InputImport(name="hostname", required=true)
    private final Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname;
    }

    /**
     * A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica.
     * 
     */
    @InputImport(name="serverCertificates", required=true)
    private final Input<List<CertificateArgs>> serverCertificates;

    public Input<List<CertificateArgs>> getServerCertificates() {
        return this.serverCertificates;
    }

    /**
     * The resource name of the Service Directory service pointing to an EKM replica, in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    @InputImport(name="serviceDirectoryService", required=true)
    private final Input<String> serviceDirectoryService;

    public Input<String> getServiceDirectoryService() {
        return this.serviceDirectoryService;
    }

    public ServiceResolverArgs(
        @Nullable Input<String> endpointFilter,
        Input<String> hostname,
        Input<List<CertificateArgs>> serverCertificates,
        Input<String> serviceDirectoryService) {
        this.endpointFilter = endpointFilter;
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.serverCertificates = Objects.requireNonNull(serverCertificates, "expected parameter 'serverCertificates' to be non-null");
        this.serviceDirectoryService = Objects.requireNonNull(serviceDirectoryService, "expected parameter 'serviceDirectoryService' to be non-null");
    }

    private ServiceResolverArgs() {
        this.endpointFilter = Input.empty();
        this.hostname = Input.empty();
        this.serverCertificates = Input.empty();
        this.serviceDirectoryService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResolverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endpointFilter;
        private Input<String> hostname;
        private Input<List<CertificateArgs>> serverCertificates;
        private Input<String> serviceDirectoryService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResolverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointFilter = defaults.endpointFilter;
    	      this.hostname = defaults.hostname;
    	      this.serverCertificates = defaults.serverCertificates;
    	      this.serviceDirectoryService = defaults.serviceDirectoryService;
        }

        public Builder setEndpointFilter(@Nullable Input<String> endpointFilter) {
            this.endpointFilter = endpointFilter;
            return this;
        }

        public Builder setEndpointFilter(@Nullable String endpointFilter) {
            this.endpointFilter = Input.ofNullable(endpointFilter);
            return this;
        }

        public Builder setHostname(Input<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Input.of(Objects.requireNonNull(hostname));
            return this;
        }

        public Builder setServerCertificates(Input<List<CertificateArgs>> serverCertificates) {
            this.serverCertificates = Objects.requireNonNull(serverCertificates);
            return this;
        }

        public Builder setServerCertificates(List<CertificateArgs> serverCertificates) {
            this.serverCertificates = Input.of(Objects.requireNonNull(serverCertificates));
            return this;
        }

        public Builder setServiceDirectoryService(Input<String> serviceDirectoryService) {
            this.serviceDirectoryService = Objects.requireNonNull(serviceDirectoryService);
            return this;
        }

        public Builder setServiceDirectoryService(String serviceDirectoryService) {
            this.serviceDirectoryService = Input.of(Objects.requireNonNull(serviceDirectoryService));
            return this;
        }

        public ServiceResolverArgs build() {
            return new ServiceResolverArgs(endpointFilter, hostname, serverCertificates, serviceDirectoryService);
        }
    }
}
