// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAttachmentArgs Empty = new InstanceAttachmentArgs();

    /**
     * ID of the attached environment.
     * 
     */
    @InputImport(name="environment")
    private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    @InputImport(name="instanceId", required=true)
    private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    public InstanceAttachmentArgs(
        @Nullable Input<String> environment,
        Input<String> instanceId,
        Input<String> organizationId) {
        this.environment = environment;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private InstanceAttachmentArgs() {
        this.environment = Input.empty();
        this.instanceId = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> environment;
        private Input<String> instanceId;
        private Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.instanceId = defaults.instanceId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setEnvironment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public InstanceAttachmentArgs build() {
            return new InstanceAttachmentArgs(environment, instanceId, organizationId);
        }
    }
}
