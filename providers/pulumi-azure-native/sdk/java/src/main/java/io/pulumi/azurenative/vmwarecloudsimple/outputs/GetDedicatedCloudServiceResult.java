// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDedicatedCloudServiceResult {
    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
     */
    private final String gatewaySubnet;
    /**
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/dedicatedCloudServices/{dedicatedCloudServiceName}
     * 
     */
    private final String id;
    /**
     * indicates whether account onboarded or not in a given region
     * 
     */
    private final String isAccountOnboarded;
    /**
     * Azure region
     * 
     */
    private final String location;
    /**
     * {dedicatedCloudServiceName}
     * 
     */
    private final String name;
    /**
     * total nodes purchased
     * 
     */
    private final Integer nodes;
    /**
     * link to a service management web portal
     * 
     */
    private final String serviceURL;
    /**
     * The list of tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetDedicatedCloudServiceResult(
        @OutputCustomType.Parameter("gatewaySubnet") String gatewaySubnet,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isAccountOnboarded") String isAccountOnboarded,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("nodes") Integer nodes,
        @OutputCustomType.Parameter("serviceURL") String serviceURL,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.gatewaySubnet = gatewaySubnet;
        this.id = id;
        this.isAccountOnboarded = isAccountOnboarded;
        this.location = location;
        this.name = name;
        this.nodes = nodes;
        this.serviceURL = serviceURL;
        this.tags = tags;
        this.type = type;
    }

    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
    */
    public String getGatewaySubnet() {
        return this.gatewaySubnet;
    }
    /**
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/dedicatedCloudServices/{dedicatedCloudServiceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * indicates whether account onboarded or not in a given region
     * 
    */
    public String getIsAccountOnboarded() {
        return this.isAccountOnboarded;
    }
    /**
     * Azure region
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * {dedicatedCloudServiceName}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * total nodes purchased
     * 
    */
    public Integer getNodes() {
        return this.nodes;
    }
    /**
     * link to a service management web portal
     * 
    */
    public String getServiceURL() {
        return this.serviceURL;
    }
    /**
     * The list of tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedCloudServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewaySubnet;
        private String id;
        private String isAccountOnboarded;
        private String location;
        private String name;
        private Integer nodes;
        private String serviceURL;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedCloudServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewaySubnet = defaults.gatewaySubnet;
    	      this.id = defaults.id;
    	      this.isAccountOnboarded = defaults.isAccountOnboarded;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.serviceURL = defaults.serviceURL;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setGatewaySubnet(String gatewaySubnet) {
            this.gatewaySubnet = Objects.requireNonNull(gatewaySubnet);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsAccountOnboarded(String isAccountOnboarded) {
            this.isAccountOnboarded = Objects.requireNonNull(isAccountOnboarded);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodes(Integer nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }

        public Builder setServiceURL(String serviceURL) {
            this.serviceURL = Objects.requireNonNull(serviceURL);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDedicatedCloudServiceResult build() {
            return new GetDedicatedCloudServiceResult(gatewaySubnet, id, isAccountOnboarded, location, name, nodes, serviceURL, tags, type);
        }
    }
}
