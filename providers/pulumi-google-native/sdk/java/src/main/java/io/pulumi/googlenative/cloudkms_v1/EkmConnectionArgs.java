// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudkms_v1.inputs.ServiceResolverArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EkmConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EkmConnectionArgs Empty = new EkmConnectionArgs();

    @InputImport(name="ekmConnectionId", required=true)
    private final Input<String> ekmConnectionId;

    public Input<String> getEkmConnectionId() {
        return this.ekmConnectionId;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported.
     * 
     */
    @InputImport(name="serviceResolvers")
    private final @Nullable Input<List<ServiceResolverArgs>> serviceResolvers;

    public Input<List<ServiceResolverArgs>> getServiceResolvers() {
        return this.serviceResolvers == null ? Input.empty() : this.serviceResolvers;
    }

    public EkmConnectionArgs(
        Input<String> ekmConnectionId,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<List<ServiceResolverArgs>> serviceResolvers) {
        this.ekmConnectionId = Objects.requireNonNull(ekmConnectionId, "expected parameter 'ekmConnectionId' to be non-null");
        this.etag = etag;
        this.location = location;
        this.project = project;
        this.serviceResolvers = serviceResolvers;
    }

    private EkmConnectionArgs() {
        this.ekmConnectionId = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.serviceResolvers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EkmConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ekmConnectionId;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<List<ServiceResolverArgs>> serviceResolvers;

        public Builder() {
    	      // Empty
        }

        public Builder(EkmConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ekmConnectionId = defaults.ekmConnectionId;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.serviceResolvers = defaults.serviceResolvers;
        }

        public Builder setEkmConnectionId(Input<String> ekmConnectionId) {
            this.ekmConnectionId = Objects.requireNonNull(ekmConnectionId);
            return this;
        }

        public Builder setEkmConnectionId(String ekmConnectionId) {
            this.ekmConnectionId = Input.of(Objects.requireNonNull(ekmConnectionId));
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceResolvers(@Nullable Input<List<ServiceResolverArgs>> serviceResolvers) {
            this.serviceResolvers = serviceResolvers;
            return this;
        }

        public Builder setServiceResolvers(@Nullable List<ServiceResolverArgs> serviceResolvers) {
            this.serviceResolvers = Input.ofNullable(serviceResolvers);
            return this;
        }

        public EkmConnectionArgs build() {
            return new EkmConnectionArgs(ekmConnectionId, etag, location, project, serviceResolvers);
        }
    }
}
