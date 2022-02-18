// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.VpcPeeringConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateConnectionArgs Empty = new PrivateConnectionArgs();

    /**
     * Display name.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="privateConnectionId", required=true)
    private final Input<String> privateConnectionId;

    public Input<String> getPrivateConnectionId() {
        return this.privateConnectionId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * VPC Peering Config
     * 
     */
    @InputImport(name="vpcPeeringConfig")
    private final @Nullable Input<VpcPeeringConfigArgs> vpcPeeringConfig;

    public Input<VpcPeeringConfigArgs> getVpcPeeringConfig() {
        return this.vpcPeeringConfig == null ? Input.empty() : this.vpcPeeringConfig;
    }

    public PrivateConnectionArgs(
        Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        Input<String> privateConnectionId,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<VpcPeeringConfigArgs> vpcPeeringConfig) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.labels = labels;
        this.location = location;
        this.privateConnectionId = Objects.requireNonNull(privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
        this.project = project;
        this.requestId = requestId;
        this.vpcPeeringConfig = vpcPeeringConfig;
    }

    private PrivateConnectionArgs() {
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.privateConnectionId = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.vpcPeeringConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private Input<String> privateConnectionId;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<VpcPeeringConfigArgs> vpcPeeringConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.privateConnectionId = defaults.privateConnectionId;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.vpcPeeringConfig = defaults.vpcPeeringConfig;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPrivateConnectionId(Input<String> privateConnectionId) {
            this.privateConnectionId = Objects.requireNonNull(privateConnectionId);
            return this;
        }

        public Builder setPrivateConnectionId(String privateConnectionId) {
            this.privateConnectionId = Input.of(Objects.requireNonNull(privateConnectionId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setVpcPeeringConfig(@Nullable Input<VpcPeeringConfigArgs> vpcPeeringConfig) {
            this.vpcPeeringConfig = vpcPeeringConfig;
            return this;
        }

        public Builder setVpcPeeringConfig(@Nullable VpcPeeringConfigArgs vpcPeeringConfig) {
            this.vpcPeeringConfig = Input.ofNullable(vpcPeeringConfig);
            return this;
        }

        public PrivateConnectionArgs build() {
            return new PrivateConnectionArgs(displayName, labels, location, privateConnectionId, project, requestId, vpcPeeringConfig);
        }
    }
}
