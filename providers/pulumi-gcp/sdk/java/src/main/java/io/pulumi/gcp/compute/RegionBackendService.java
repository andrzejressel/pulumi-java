// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionBackendServiceArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceState;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceBackend;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceCdnPolicy;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceCircuitBreakers;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceConnectionTrackingPolicy;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceConsistentHash;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceFailoverPolicy;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceIap;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceLogConfig;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceOutlierDetection;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Region Backend Service defines a regionally-scoped group of virtual
 * machines that will serve traffic for load balancing.
 * 
 * To get more information about RegionBackendService, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/regionBackendServices)
 * * How-to Guides
 *     * [Internal TCP/UDP Load Balancing](https://cloud.google.com/compute/docs/load-balancing/internal/)
 * 
 * > **Warning:** All arguments including `iap.oauth2_client_secret` and `iap.oauth2_client_secret_sha256` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionBackendService can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionBackendService:RegionBackendService default projects/{{project}}/regions/{{region}}/backendServices/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionBackendService:RegionBackendService default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionBackendService:RegionBackendService default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionBackendService:RegionBackendService default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionBackendService:RegionBackendService")
public class RegionBackendService extends io.pulumi.resources.CustomResource {
    /**
     * Lifetime of cookies in seconds if session_affinity is
     * GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts
     * only until the end of the browser session (or equivalent). The
     * maximum allowed value for TTL is one day.
     * When the load balancing scheme is INTERNAL, this field is not used.
     * 
     */
    @OutputExport(name="affinityCookieTtlSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> affinityCookieTtlSec;

    /**
     * @return Lifetime of cookies in seconds if session_affinity is
     * GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts
     * only until the end of the browser session (or equivalent). The
     * maximum allowed value for TTL is one day.
     * When the load balancing scheme is INTERNAL, this field is not used.
     * 
     */
    public Output</* @Nullable */ Integer> getAffinityCookieTtlSec() {
        return this.affinityCookieTtlSec;
    }
    /**
     * The set of backends that serve this RegionBackendService.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="backends", type=List.class, parameters={RegionBackendServiceBackend.class})
    private Output</* @Nullable */ List<RegionBackendServiceBackend>> backends;

    /**
     * @return The set of backends that serve this RegionBackendService.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RegionBackendServiceBackend>> getBackends() {
        return this.backends;
    }
    /**
     * Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="cdnPolicy", type=RegionBackendServiceCdnPolicy.class, parameters={})
    private Output<RegionBackendServiceCdnPolicy> cdnPolicy;

    /**
     * @return Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * 
     */
    public Output<RegionBackendServiceCdnPolicy> getCdnPolicy() {
        return this.cdnPolicy;
    }
    /**
     * Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the `load_balancing_scheme` is set to INTERNAL_MANAGED
     * and the `protocol` is set to HTTP, HTTPS, or HTTP2.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="circuitBreakers", type=RegionBackendServiceCircuitBreakers.class, parameters={})
    private Output</* @Nullable */ RegionBackendServiceCircuitBreakers> circuitBreakers;

    /**
     * @return Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the `load_balancing_scheme` is set to INTERNAL_MANAGED
     * and the `protocol` is set to HTTP, HTTPS, or HTTP2.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionBackendServiceCircuitBreakers> getCircuitBreakers() {
        return this.circuitBreakers;
    }
    /**
     * Time for which instance will be drained (not accept new
     * connections, but still work to finish started).
     * 
     */
    @OutputExport(name="connectionDrainingTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> connectionDrainingTimeoutSec;

    /**
     * @return Time for which instance will be drained (not accept new
     * connections, but still work to finish started).
     * 
     */
    public Output</* @Nullable */ Integer> getConnectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec;
    }
    /**
     * Connection Tracking configuration for this BackendService.
     * This is available only for Layer 4 Internal Load Balancing and
     * Network Load Balancing.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="connectionTrackingPolicy", type=RegionBackendServiceConnectionTrackingPolicy.class, parameters={})
    private Output</* @Nullable */ RegionBackendServiceConnectionTrackingPolicy> connectionTrackingPolicy;

    /**
     * @return Connection Tracking configuration for this BackendService.
     * This is available only for Layer 4 Internal Load Balancing and
     * Network Load Balancing.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionBackendServiceConnectionTrackingPolicy> getConnectionTrackingPolicy() {
        return this.connectionTrackingPolicy;
    }
    /**
     * Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing.
     * This field only applies when all of the following are true -
     * 
     */
    @OutputExport(name="consistentHash", type=RegionBackendServiceConsistentHash.class, parameters={})
    private Output</* @Nullable */ RegionBackendServiceConsistentHash> consistentHash;

    /**
     * @return Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing.
     * This field only applies when all of the following are true -
     * 
     */
    public Output</* @Nullable */ RegionBackendServiceConsistentHash> getConsistentHash() {
        return this.consistentHash;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * If true, enable Cloud CDN for this RegionBackendService.
     * 
     */
    @OutputExport(name="enableCdn", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCdn;

    /**
     * @return If true, enable Cloud CDN for this RegionBackendService.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableCdn() {
        return this.enableCdn;
    }
    /**
     * Policy for failovers.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="failoverPolicy", type=RegionBackendServiceFailoverPolicy.class, parameters={})
    private Output</* @Nullable */ RegionBackendServiceFailoverPolicy> failoverPolicy;

    /**
     * @return Policy for failovers.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionBackendServiceFailoverPolicy> getFailoverPolicy() {
        return this.failoverPolicy;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The set of URLs to HealthCheck resources for health checking
     * this RegionBackendService. Currently at most one health
     * check can be specified.
     * A health check must be specified unless the backend service uses an internet
     * or serverless NEG as a backend.
     * 
     */
    @OutputExport(name="healthChecks", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthChecks;

    /**
     * @return The set of URLs to HealthCheck resources for health checking
     * this RegionBackendService. Currently at most one health
     * check can be specified.
     * A health check must be specified unless the backend service uses an internet
     * or serverless NEG as a backend.
     * 
     */
    public Output</* @Nullable */ String> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * Settings for enabling Cloud Identity Aware Proxy
     * Structure is documented below.
     * 
     */
    @OutputExport(name="iap", type=RegionBackendServiceIap.class, parameters={})
    private Output</* @Nullable */ RegionBackendServiceIap> iap;

    /**
     * @return Settings for enabling Cloud Identity Aware Proxy
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionBackendServiceIap> getIap() {
        return this.iap;
    }
    /**
     * Indicates what kind of load balancing this regional backend service
     * will be used for. A backend service created for one type of load
     * balancing cannot be used with the other(s). For more information, refer to
     * [Choosing a load balancer](https://cloud.google.com/load-balancing/docs/backend-service).
     * Default value is `INTERNAL`.
     * Possible values are `EXTERNAL`, `EXTERNAL_MANAGED`, `INTERNAL`, and `INTERNAL_MANAGED`.
     * 
     */
    @OutputExport(name="loadBalancingScheme", type=String.class, parameters={})
    private Output</* @Nullable */ String> loadBalancingScheme;

    /**
     * @return Indicates what kind of load balancing this regional backend service
     * will be used for. A backend service created for one type of load
     * balancing cannot be used with the other(s). For more information, refer to
     * [Choosing a load balancer](https://cloud.google.com/load-balancing/docs/backend-service).
     * Default value is `INTERNAL`.
     * Possible values are `EXTERNAL`, `EXTERNAL_MANAGED`, `INTERNAL`, and `INTERNAL_MANAGED`.
     * 
     */
    public Output</* @Nullable */ String> getLoadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    /**
     * The load balancing algorithm used within the scope of the locality.
     * The possible values are:
     * * `ROUND_ROBIN`: This is a simple policy in which each healthy backend
     *   is selected in round robin order.
     * * `LEAST_REQUEST`: An O(1) algorithm which selects two random healthy
     *   hosts and picks the host which has fewer active requests.
     * * `RING_HASH`: The ring/modulo hash load balancer implements consistent
     *   hashing to backends. The algorithm has the property that the
     *   addition/removal of a host from a set of N hosts only affects
     *   1/N of the requests.
     * * `RANDOM`: The load balancer selects a random healthy host.
     * * `ORIGINAL_DESTINATION`: Backend host is selected based on the client
     *   connection metadata, i.e., connections are opened
     *   to the same address as the destination address of
     *   the incoming connection before the connection
     *   was redirected to the load balancer.
     * * `MAGLEV`: used as a drop in replacement for the ring hash load balancer.
     *   Maglev is not as stable as ring hash but has faster table lookup
     *   build times and host selection times. For more information about
     *   Maglev, refer to https://ai.google/research/pubs/pub44824
     * 
     */
    @OutputExport(name="localityLbPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> localityLbPolicy;

    /**
     * @return The load balancing algorithm used within the scope of the locality.
     * The possible values are:
     * * `ROUND_ROBIN`: This is a simple policy in which each healthy backend
     *   is selected in round robin order.
     * * `LEAST_REQUEST`: An O(1) algorithm which selects two random healthy
     *   hosts and picks the host which has fewer active requests.
     * * `RING_HASH`: The ring/modulo hash load balancer implements consistent
     *   hashing to backends. The algorithm has the property that the
     *   addition/removal of a host from a set of N hosts only affects
     *   1/N of the requests.
     * * `RANDOM`: The load balancer selects a random healthy host.
     * * `ORIGINAL_DESTINATION`: Backend host is selected based on the client
     *   connection metadata, i.e., connections are opened
     *   to the same address as the destination address of
     *   the incoming connection before the connection
     *   was redirected to the load balancer.
     * * `MAGLEV`: used as a drop in replacement for the ring hash load balancer.
     *   Maglev is not as stable as ring hash but has faster table lookup
     *   build times and host selection times. For more information about
     *   Maglev, refer to https://ai.google/research/pubs/pub44824
     * 
     */
    public Output</* @Nullable */ String> getLocalityLbPolicy() {
        return this.localityLbPolicy;
    }
    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="logConfig", type=RegionBackendServiceLogConfig.class, parameters={})
    private Output<RegionBackendServiceLogConfig> logConfig;

    /**
     * @return This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * 
     */
    public Output<RegionBackendServiceLogConfig> getLogConfig() {
        return this.logConfig;
    }
    /**
     * Name of the cookie.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the cookie.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The URL of the network to which this backend service belongs.
     * This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The URL of the network to which this backend service belongs.
     * This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    public Output</* @Nullable */ String> getNetwork() {
        return this.network;
    }
    /**
     * Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the `load_balancing_scheme` is set
     * to INTERNAL_MANAGED and the `protocol` is set to HTTP, HTTPS, or HTTP2.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="outlierDetection", type=RegionBackendServiceOutlierDetection.class, parameters={})
    private Output</* @Nullable */ RegionBackendServiceOutlierDetection> outlierDetection;

    /**
     * @return Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the `load_balancing_scheme` is set
     * to INTERNAL_MANAGED and the `protocol` is set to HTTP, HTTPS, or HTTP2.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionBackendServiceOutlierDetection> getOutlierDetection() {
        return this.outlierDetection;
    }
    /**
     * A named port on a backend instance group representing the port for
     * communication to the backend VMs in that group. Required when the
     * loadBalancingScheme is EXTERNAL, EXTERNAL_MANAGED, INTERNAL_MANAGED, or INTERNAL_SELF_MANAGED
     * and the backends are instance groups. The named port must be defined on each
     * backend instance group. This parameter has no meaning if the backends are NEGs. API sets a
     * default of "http" if not given.
     * Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load Balancing).
     * 
     */
    @OutputExport(name="portName", type=String.class, parameters={})
    private Output<String> portName;

    /**
     * @return A named port on a backend instance group representing the port for
     * communication to the backend VMs in that group. Required when the
     * loadBalancingScheme is EXTERNAL, EXTERNAL_MANAGED, INTERNAL_MANAGED, or INTERNAL_SELF_MANAGED
     * and the backends are instance groups. The named port must be defined on each
     * backend instance group. This parameter has no meaning if the backends are NEGs. API sets a
     * default of "http" if not given.
     * Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load Balancing).
     * 
     */
    public Output<String> getPortName() {
        return this.portName;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The protocol this RegionBackendService uses to communicate with backends.
     * The default is HTTP. **NOTE**: HTTP2 is only valid for beta HTTP/2 load balancer
     * types and may result in errors if used with the GA API.
     * Possible values are `HTTP`, `HTTPS`, `HTTP2`, `SSL`, `TCP`, `UDP`, `GRPC`, and `UNSPECIFIED`.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol this RegionBackendService uses to communicate with backends.
     * The default is HTTP. **NOTE**: HTTP2 is only valid for beta HTTP/2 load balancer
     * types and may result in errors if used with the GA API.
     * Possible values are `HTTP`, `HTTPS`, `HTTP2`, `SSL`, `TCP`, `UDP`, `GRPC`, and `UNSPECIFIED`.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * The Region in which the created backend service should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The Region in which the created backend service should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Type of session affinity to use. The default is NONE. Session affinity is
     * not applicable if the protocol is UDP.
     * Possible values are `NONE`, `CLIENT_IP`, `CLIENT_IP_PORT_PROTO`, `CLIENT_IP_PROTO`, `GENERATED_COOKIE`, `HEADER_FIELD`, `HTTP_COOKIE`, and `CLIENT_IP_NO_DESTINATION`.
     * 
     */
    @OutputExport(name="sessionAffinity", type=String.class, parameters={})
    private Output<String> sessionAffinity;

    /**
     * @return Type of session affinity to use. The default is NONE. Session affinity is
     * not applicable if the protocol is UDP.
     * Possible values are `NONE`, `CLIENT_IP`, `CLIENT_IP_PORT_PROTO`, `CLIENT_IP_PROTO`, `GENERATED_COOKIE`, `HEADER_FIELD`, `HTTP_COOKIE`, and `CLIENT_IP_NO_DESTINATION`.
     * 
     */
    public Output<String> getSessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * How many seconds to wait for the backend before considering it a
     * failed request. Default is 30 seconds. Valid range is [1, 86400].
     * 
     */
    @OutputExport(name="timeoutSec", type=Integer.class, parameters={})
    private Output<Integer> timeoutSec;

    /**
     * @return How many seconds to wait for the backend before considering it a
     * failed request. Default is 30 seconds. Valid range is [1, 86400].
     * 
     */
    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionBackendService(String name, @Nullable RegionBackendServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionBackendService:RegionBackendService", name, args == null ? RegionBackendServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionBackendService(String name, Input<String> id, @Nullable RegionBackendServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionBackendService:RegionBackendService", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionBackendService get(String name, Input<String> id, @Nullable RegionBackendServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionBackendService(name, id, state, options);
    }
}
