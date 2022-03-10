// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteFilterRuleResponse {
    /**
     * The access type of the rule.
     * 
     */
    private final String access;
    /**
     * The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     * 
     */
    private final List<String> communities;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the route filter rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * The rule type of the rule.
     * 
     */
    private final String routeFilterRuleType;

    @OutputCustomType.Constructor
    private RouteFilterRuleResponse(
        @OutputCustomType.Parameter("access") String access,
        @OutputCustomType.Parameter("communities") List<String> communities,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("routeFilterRuleType") String routeFilterRuleType) {
        this.access = access;
        this.communities = communities;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.routeFilterRuleType = routeFilterRuleType;
    }

    /**
     * The access type of the rule.
     * 
    */
    public String getAccess() {
        return this.access;
    }
    /**
     * The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     * 
    */
    public List<String> getCommunities() {
        return this.communities;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the route filter rule resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The rule type of the rule.
     * 
    */
    public String getRouteFilterRuleType() {
        return this.routeFilterRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private List<String> communities;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable String name;
        private String provisioningState;
        private String routeFilterRuleType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.communities = defaults.communities;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routeFilterRuleType = defaults.routeFilterRuleType;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setCommunities(List<String> communities) {
            this.communities = Objects.requireNonNull(communities);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRouteFilterRuleType(String routeFilterRuleType) {
            this.routeFilterRuleType = Objects.requireNonNull(routeFilterRuleType);
            return this;
        }
        public RouteFilterRuleResponse build() {
            return new RouteFilterRuleResponse(access, communities, etag, id, location, name, provisioningState, routeFilterRuleType);
        }
    }
}
