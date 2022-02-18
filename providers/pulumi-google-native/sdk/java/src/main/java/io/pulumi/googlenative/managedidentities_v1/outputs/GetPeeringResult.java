// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetPeeringResult {
    /**
     * The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    private final String authorizedNetwork;
    /**
     * The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    private final String domainResource;
    /**
     * Optional. Resource labels to represent user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`.
     * 
     */
    private final String name;
    /**
     * The current state of this Peering.
     * 
     */
    private final String state;
    /**
     * Additional information about the current status of this peering, if available.
     * 
     */
    private final String statusMessage;
    /**
     * Last update time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"authorizedNetwork","createTime","domainResource","labels","name","state","statusMessage","updateTime"})
    private GetPeeringResult(
        String authorizedNetwork,
        String createTime,
        String domainResource,
        Map<String,String> labels,
        String name,
        String state,
        String statusMessage,
        String updateTime) {
        this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
        this.createTime = Objects.requireNonNull(createTime);
        this.domainResource = Objects.requireNonNull(domainResource);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.statusMessage = Objects.requireNonNull(statusMessage);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    public String getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * The time the instance was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    public String getDomainResource() {
        return this.domainResource;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of this Peering.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Additional information about the current status of this peering, if available.
     * 
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Last update time.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizedNetwork;
        private String createTime;
        private String domainResource;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String statusMessage;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.createTime = defaults.createTime;
    	      this.domainResource = defaults.domainResource;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAuthorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDomainResource(String domainResource) {
            this.domainResource = Objects.requireNonNull(domainResource);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetPeeringResult build() {
            return new GetPeeringResult(authorizedNetwork, createTime, domainResource, labels, name, state, statusMessage, updateTime);
        }
    }
}
