// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayConnectionDrainingResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayBackendHttpSettingsResponse {
    /**
     * Cookie name to use for the affinity cookie.
     * 
     */
    private final @Nullable String affinityCookieName;
    /**
     * Array of references to application gateway authentication certificates.
     * 
     */
    private final @Nullable List<SubResourceResponse> authenticationCertificates;
    /**
     * Connection draining of the backend http settings resource.
     * 
     */
    private final @Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining;
    /**
     * Cookie based affinity.
     * 
     */
    private final @Nullable String cookieBasedAffinity;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Host header to be sent to the backend servers.
     * 
     */
    private final @Nullable String hostName;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the backend http settings that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Path which should be used as a prefix for all HTTP requests. Null means no path will be prefixed. Default value is null.
     * 
     */
    private final @Nullable String path;
    /**
     * Whether to pick host header should be picked from the host name of the backend server. Default value is false.
     * 
     */
    private final @Nullable Boolean pickHostNameFromBackendAddress;
    /**
     * The destination port on the backend.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Probe resource of an application gateway.
     * 
     */
    private final @Nullable SubResourceResponse probe;
    /**
     * Whether the probe is enabled. Default value is false.
     * 
     */
    private final @Nullable Boolean probeEnabled;
    /**
     * The protocol used to communicate with the backend.
     * 
     */
    private final @Nullable String protocol;
    /**
     * The provisioning state of the backend HTTP settings resource.
     * 
     */
    private final String provisioningState;
    /**
     * Request timeout in seconds. Application Gateway will fail the request if response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    private final @Nullable Integer requestTimeout;
    /**
     * Array of references to application gateway trusted root certificates.
     * 
     */
    private final @Nullable List<SubResourceResponse> trustedRootCertificates;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ApplicationGatewayBackendHttpSettingsResponse(
        @OutputCustomType.Parameter("affinityCookieName") @Nullable String affinityCookieName,
        @OutputCustomType.Parameter("authenticationCertificates") @Nullable List<SubResourceResponse> authenticationCertificates,
        @OutputCustomType.Parameter("connectionDraining") @Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining,
        @OutputCustomType.Parameter("cookieBasedAffinity") @Nullable String cookieBasedAffinity,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("hostName") @Nullable String hostName,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("pickHostNameFromBackendAddress") @Nullable Boolean pickHostNameFromBackendAddress,
        @OutputCustomType.Parameter("port") @Nullable Integer port,
        @OutputCustomType.Parameter("probe") @Nullable SubResourceResponse probe,
        @OutputCustomType.Parameter("probeEnabled") @Nullable Boolean probeEnabled,
        @OutputCustomType.Parameter("protocol") @Nullable String protocol,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("requestTimeout") @Nullable Integer requestTimeout,
        @OutputCustomType.Parameter("trustedRootCertificates") @Nullable List<SubResourceResponse> trustedRootCertificates,
        @OutputCustomType.Parameter("type") String type) {
        this.affinityCookieName = affinityCookieName;
        this.authenticationCertificates = authenticationCertificates;
        this.connectionDraining = connectionDraining;
        this.cookieBasedAffinity = cookieBasedAffinity;
        this.etag = etag;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
        this.port = port;
        this.probe = probe;
        this.probeEnabled = probeEnabled;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.requestTimeout = requestTimeout;
        this.trustedRootCertificates = trustedRootCertificates;
        this.type = type;
    }

    /**
     * Cookie name to use for the affinity cookie.
     * 
    */
    public Optional<String> getAffinityCookieName() {
        return Optional.ofNullable(this.affinityCookieName);
    }
    /**
     * Array of references to application gateway authentication certificates.
     * 
    */
    public List<SubResourceResponse> getAuthenticationCertificates() {
        return this.authenticationCertificates == null ? List.of() : this.authenticationCertificates;
    }
    /**
     * Connection draining of the backend http settings resource.
     * 
    */
    public Optional<ApplicationGatewayConnectionDrainingResponse> getConnectionDraining() {
        return Optional.ofNullable(this.connectionDraining);
    }
    /**
     * Cookie based affinity.
     * 
    */
    public Optional<String> getCookieBasedAffinity() {
        return Optional.ofNullable(this.cookieBasedAffinity);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Host header to be sent to the backend servers.
     * 
    */
    public Optional<String> getHostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the backend http settings that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Path which should be used as a prefix for all HTTP requests. Null means no path will be prefixed. Default value is null.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Whether to pick host header should be picked from the host name of the backend server. Default value is false.
     * 
    */
    public Optional<Boolean> getPickHostNameFromBackendAddress() {
        return Optional.ofNullable(this.pickHostNameFromBackendAddress);
    }
    /**
     * The destination port on the backend.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Probe resource of an application gateway.
     * 
    */
    public Optional<SubResourceResponse> getProbe() {
        return Optional.ofNullable(this.probe);
    }
    /**
     * Whether the probe is enabled. Default value is false.
     * 
    */
    public Optional<Boolean> getProbeEnabled() {
        return Optional.ofNullable(this.probeEnabled);
    }
    /**
     * The protocol used to communicate with the backend.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * The provisioning state of the backend HTTP settings resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Request timeout in seconds. Application Gateway will fail the request if response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     * 
    */
    public Optional<Integer> getRequestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }
    /**
     * Array of references to application gateway trusted root certificates.
     * 
    */
    public List<SubResourceResponse> getTrustedRootCertificates() {
        return this.trustedRootCertificates == null ? List.of() : this.trustedRootCertificates;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHttpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String affinityCookieName;
        private @Nullable List<SubResourceResponse> authenticationCertificates;
        private @Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining;
        private @Nullable String cookieBasedAffinity;
        private String etag;
        private @Nullable String hostName;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable Boolean pickHostNameFromBackendAddress;
        private @Nullable Integer port;
        private @Nullable SubResourceResponse probe;
        private @Nullable Boolean probeEnabled;
        private @Nullable String protocol;
        private String provisioningState;
        private @Nullable Integer requestTimeout;
        private @Nullable List<SubResourceResponse> trustedRootCertificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHttpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieName = defaults.affinityCookieName;
    	      this.authenticationCertificates = defaults.authenticationCertificates;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.cookieBasedAffinity = defaults.cookieBasedAffinity;
    	      this.etag = defaults.etag;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendAddress = defaults.pickHostNameFromBackendAddress;
    	      this.port = defaults.port;
    	      this.probe = defaults.probe;
    	      this.probeEnabled = defaults.probeEnabled;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.trustedRootCertificates = defaults.trustedRootCertificates;
    	      this.type = defaults.type;
        }

        public Builder setAffinityCookieName(@Nullable String affinityCookieName) {
            this.affinityCookieName = affinityCookieName;
            return this;
        }

        public Builder setAuthenticationCertificates(@Nullable List<SubResourceResponse> authenticationCertificates) {
            this.authenticationCertificates = authenticationCertificates;
            return this;
        }

        public Builder setConnectionDraining(@Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }

        public Builder setCookieBasedAffinity(@Nullable String cookieBasedAffinity) {
            this.cookieBasedAffinity = cookieBasedAffinity;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPickHostNameFromBackendAddress(@Nullable Boolean pickHostNameFromBackendAddress) {
            this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProbe(@Nullable SubResourceResponse probe) {
            this.probe = probe;
            return this;
        }

        public Builder setProbeEnabled(@Nullable Boolean probeEnabled) {
            this.probeEnabled = probeEnabled;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRequestTimeout(@Nullable Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        public Builder setTrustedRootCertificates(@Nullable List<SubResourceResponse> trustedRootCertificates) {
            this.trustedRootCertificates = trustedRootCertificates;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayBackendHttpSettingsResponse build() {
            return new ApplicationGatewayBackendHttpSettingsResponse(affinityCookieName, authenticationCertificates, connectionDraining, cookieBasedAffinity, etag, hostName, id, name, path, pickHostNameFromBackendAddress, port, probe, probeEnabled, protocol, provisioningState, requestTimeout, trustedRootCertificates, type);
        }
    }
}
