// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetBackendServiceBackend;
import io.pulumi.gcp.compute.outputs.GetBackendServiceCdnPolicy;
import io.pulumi.gcp.compute.outputs.GetBackendServiceCircuitBreaker;
import io.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHash;
import io.pulumi.gcp.compute.outputs.GetBackendServiceIap;
import io.pulumi.gcp.compute.outputs.GetBackendServiceLogConfig;
import io.pulumi.gcp.compute.outputs.GetBackendServiceOutlierDetection;
import io.pulumi.gcp.compute.outputs.GetBackendServiceSecuritySetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBackendServiceResult {
    private final Integer affinityCookieTtlSec;
    /**
     * The set of backends that serve this Backend Service.
     * 
     */
    private final List<GetBackendServiceBackend> backends;
    private final List<GetBackendServiceCdnPolicy> cdnPolicies;
    private final List<GetBackendServiceCircuitBreaker> circuitBreakers;
    /**
     * Time for which instance will be drained (not accept new connections, but still work to finish started ones).
     * 
     */
    private final Integer connectionDrainingTimeoutSec;
    private final List<GetBackendServiceConsistentHash> consistentHash;
    private final String creationTimestamp;
    private final List<String> customRequestHeaders;
    private final List<String> customResponseHeaders;
    /**
     * Textual description for the Backend Service.
     * 
     */
    private final String description;
    /**
     * Whether or not Cloud CDN is enabled on the Backend Service.
     * 
     */
    private final Boolean enableCdn;
    /**
     * The fingerprint of the Backend Service.
     * 
     */
    private final String fingerprint;
    /**
     * The set of HTTP/HTTPS health checks used by the Backend Service.
     * 
     */
    private final List<String> healthChecks;
    private final List<GetBackendServiceIap> iaps;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String loadBalancingScheme;
    private final String localityLbPolicy;
    private final List<GetBackendServiceLogConfig> logConfigs;
    private final String name;
    private final List<GetBackendServiceOutlierDetection> outlierDetections;
    /**
     * The name of a service that has been added to an instance group in this backend.
     * 
     */
    private final String portName;
    private final @Nullable String project;
    /**
     * The protocol for incoming requests.
     * 
     */
    private final String protocol;
    private final String securityPolicy;
    private final List<GetBackendServiceSecuritySetting> securitySettings;
    /**
     * The URI of the Backend Service.
     * 
     */
    private final String selfLink;
    /**
     * The Backend Service session stickiness configuration.
     * 
     */
    private final String sessionAffinity;
    /**
     * The number of seconds to wait for a backend to respond to a request before considering the request failed.
     * 
     */
    private final Integer timeoutSec;

    @OutputCustomType.Constructor({"affinityCookieTtlSec","backends","cdnPolicies","circuitBreakers","connectionDrainingTimeoutSec","consistentHash","creationTimestamp","customRequestHeaders","customResponseHeaders","description","enableCdn","fingerprint","healthChecks","iaps","id","loadBalancingScheme","localityLbPolicy","logConfigs","name","outlierDetections","portName","project","protocol","securityPolicy","securitySettings","selfLink","sessionAffinity","timeoutSec"})
    private GetBackendServiceResult(
        Integer affinityCookieTtlSec,
        List<GetBackendServiceBackend> backends,
        List<GetBackendServiceCdnPolicy> cdnPolicies,
        List<GetBackendServiceCircuitBreaker> circuitBreakers,
        Integer connectionDrainingTimeoutSec,
        List<GetBackendServiceConsistentHash> consistentHash,
        String creationTimestamp,
        List<String> customRequestHeaders,
        List<String> customResponseHeaders,
        String description,
        Boolean enableCdn,
        String fingerprint,
        List<String> healthChecks,
        List<GetBackendServiceIap> iaps,
        String id,
        String loadBalancingScheme,
        String localityLbPolicy,
        List<GetBackendServiceLogConfig> logConfigs,
        String name,
        List<GetBackendServiceOutlierDetection> outlierDetections,
        String portName,
        @Nullable String project,
        String protocol,
        String securityPolicy,
        List<GetBackendServiceSecuritySetting> securitySettings,
        String selfLink,
        String sessionAffinity,
        Integer timeoutSec) {
        this.affinityCookieTtlSec = Objects.requireNonNull(affinityCookieTtlSec);
        this.backends = Objects.requireNonNull(backends);
        this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
        this.circuitBreakers = Objects.requireNonNull(circuitBreakers);
        this.connectionDrainingTimeoutSec = Objects.requireNonNull(connectionDrainingTimeoutSec);
        this.consistentHash = Objects.requireNonNull(consistentHash);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.customRequestHeaders = Objects.requireNonNull(customRequestHeaders);
        this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
        this.description = Objects.requireNonNull(description);
        this.enableCdn = Objects.requireNonNull(enableCdn);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.healthChecks = Objects.requireNonNull(healthChecks);
        this.iaps = Objects.requireNonNull(iaps);
        this.id = Objects.requireNonNull(id);
        this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
        this.localityLbPolicy = Objects.requireNonNull(localityLbPolicy);
        this.logConfigs = Objects.requireNonNull(logConfigs);
        this.name = Objects.requireNonNull(name);
        this.outlierDetections = Objects.requireNonNull(outlierDetections);
        this.portName = Objects.requireNonNull(portName);
        this.project = project;
        this.protocol = Objects.requireNonNull(protocol);
        this.securityPolicy = Objects.requireNonNull(securityPolicy);
        this.securitySettings = Objects.requireNonNull(securitySettings);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
        this.timeoutSec = Objects.requireNonNull(timeoutSec);
    }

    public Integer getAffinityCookieTtlSec() {
        return this.affinityCookieTtlSec;
    }
    /**
     * The set of backends that serve this Backend Service.
     * 
     */
    public List<GetBackendServiceBackend> getBackends() {
        return this.backends;
    }
    public List<GetBackendServiceCdnPolicy> getCdnPolicies() {
        return this.cdnPolicies;
    }
    public List<GetBackendServiceCircuitBreaker> getCircuitBreakers() {
        return this.circuitBreakers;
    }
    /**
     * Time for which instance will be drained (not accept new connections, but still work to finish started ones).
     * 
     */
    public Integer getConnectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec;
    }
    public List<GetBackendServiceConsistentHash> getConsistentHash() {
        return this.consistentHash;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public List<String> getCustomRequestHeaders() {
        return this.customRequestHeaders;
    }
    public List<String> getCustomResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * Textual description for the Backend Service.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether or not Cloud CDN is enabled on the Backend Service.
     * 
     */
    public Boolean getEnableCdn() {
        return this.enableCdn;
    }
    /**
     * The fingerprint of the Backend Service.
     * 
     */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The set of HTTP/HTTPS health checks used by the Backend Service.
     * 
     */
    public List<String> getHealthChecks() {
        return this.healthChecks;
    }
    public List<GetBackendServiceIap> getIaps() {
        return this.iaps;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getLoadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public String getLocalityLbPolicy() {
        return this.localityLbPolicy;
    }
    public List<GetBackendServiceLogConfig> getLogConfigs() {
        return this.logConfigs;
    }
    public String getName() {
        return this.name;
    }
    public List<GetBackendServiceOutlierDetection> getOutlierDetections() {
        return this.outlierDetections;
    }
    /**
     * The name of a service that has been added to an instance group in this backend.
     * 
     */
    public String getPortName() {
        return this.portName;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    /**
     * The protocol for incoming requests.
     * 
     */
    public String getProtocol() {
        return this.protocol;
    }
    public String getSecurityPolicy() {
        return this.securityPolicy;
    }
    public List<GetBackendServiceSecuritySetting> getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * The URI of the Backend Service.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The Backend Service session stickiness configuration.
     * 
     */
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * The number of seconds to wait for a backend to respond to a request before considering the request failed.
     * 
     */
    public Integer getTimeoutSec() {
        return this.timeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer affinityCookieTtlSec;
        private List<GetBackendServiceBackend> backends;
        private List<GetBackendServiceCdnPolicy> cdnPolicies;
        private List<GetBackendServiceCircuitBreaker> circuitBreakers;
        private Integer connectionDrainingTimeoutSec;
        private List<GetBackendServiceConsistentHash> consistentHash;
        private String creationTimestamp;
        private List<String> customRequestHeaders;
        private List<String> customResponseHeaders;
        private String description;
        private Boolean enableCdn;
        private String fingerprint;
        private List<String> healthChecks;
        private List<GetBackendServiceIap> iaps;
        private String id;
        private String loadBalancingScheme;
        private String localityLbPolicy;
        private List<GetBackendServiceLogConfig> logConfigs;
        private String name;
        private List<GetBackendServiceOutlierDetection> outlierDetections;
        private String portName;
        private @Nullable String project;
        private String protocol;
        private String securityPolicy;
        private List<GetBackendServiceSecuritySetting> securitySettings;
        private String selfLink;
        private String sessionAffinity;
        private Integer timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieTtlSec = defaults.affinityCookieTtlSec;
    	      this.backends = defaults.backends;
    	      this.cdnPolicies = defaults.cdnPolicies;
    	      this.circuitBreakers = defaults.circuitBreakers;
    	      this.connectionDrainingTimeoutSec = defaults.connectionDrainingTimeoutSec;
    	      this.consistentHash = defaults.consistentHash;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customRequestHeaders = defaults.customRequestHeaders;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.fingerprint = defaults.fingerprint;
    	      this.healthChecks = defaults.healthChecks;
    	      this.iaps = defaults.iaps;
    	      this.id = defaults.id;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.localityLbPolicy = defaults.localityLbPolicy;
    	      this.logConfigs = defaults.logConfigs;
    	      this.name = defaults.name;
    	      this.outlierDetections = defaults.outlierDetections;
    	      this.portName = defaults.portName;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.securitySettings = defaults.securitySettings;
    	      this.selfLink = defaults.selfLink;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder setAffinityCookieTtlSec(Integer affinityCookieTtlSec) {
            this.affinityCookieTtlSec = Objects.requireNonNull(affinityCookieTtlSec);
            return this;
        }

        public Builder setBackends(List<GetBackendServiceBackend> backends) {
            this.backends = Objects.requireNonNull(backends);
            return this;
        }

        public Builder setCdnPolicies(List<GetBackendServiceCdnPolicy> cdnPolicies) {
            this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
            return this;
        }

        public Builder setCircuitBreakers(List<GetBackendServiceCircuitBreaker> circuitBreakers) {
            this.circuitBreakers = Objects.requireNonNull(circuitBreakers);
            return this;
        }

        public Builder setConnectionDrainingTimeoutSec(Integer connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = Objects.requireNonNull(connectionDrainingTimeoutSec);
            return this;
        }

        public Builder setConsistentHash(List<GetBackendServiceConsistentHash> consistentHash) {
            this.consistentHash = Objects.requireNonNull(consistentHash);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setCustomRequestHeaders(List<String> customRequestHeaders) {
            this.customRequestHeaders = Objects.requireNonNull(customRequestHeaders);
            return this;
        }

        public Builder setCustomResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setHealthChecks(List<String> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder setIaps(List<GetBackendServiceIap> iaps) {
            this.iaps = Objects.requireNonNull(iaps);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLoadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }

        public Builder setLocalityLbPolicy(String localityLbPolicy) {
            this.localityLbPolicy = Objects.requireNonNull(localityLbPolicy);
            return this;
        }

        public Builder setLogConfigs(List<GetBackendServiceLogConfig> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutlierDetections(List<GetBackendServiceOutlierDetection> outlierDetections) {
            this.outlierDetections = Objects.requireNonNull(outlierDetections);
            return this;
        }

        public Builder setPortName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSecurityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }

        public Builder setSecuritySettings(List<GetBackendServiceSecuritySetting> securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSessionAffinity(String sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }

        public Builder setTimeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }

        public GetBackendServiceResult build() {
            return new GetBackendServiceResult(affinityCookieTtlSec, backends, cdnPolicies, circuitBreakers, connectionDrainingTimeoutSec, consistentHash, creationTimestamp, customRequestHeaders, customResponseHeaders, description, enableCdn, fingerprint, healthChecks, iaps, id, loadBalancingScheme, localityLbPolicy, logConfigs, name, outlierDetections, portName, project, protocol, securityPolicy, securitySettings, selfLink, sessionAffinity, timeoutSec);
        }
    }
}
