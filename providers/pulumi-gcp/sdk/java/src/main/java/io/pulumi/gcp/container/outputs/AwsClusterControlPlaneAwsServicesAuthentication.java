// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AwsClusterControlPlaneAwsServicesAuthentication {
    /**
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    private final String roleArn;
    /**
     * Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    private final @Nullable String roleSessionName;

    @OutputCustomType.Constructor({"roleArn","roleSessionName"})
    private AwsClusterControlPlaneAwsServicesAuthentication(
        String roleArn,
        @Nullable String roleSessionName) {
        this.roleArn = Objects.requireNonNull(roleArn);
        this.roleSessionName = roleSessionName;
    }

    /**
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    public Optional<String> getRoleSessionName() {
        return Optional.ofNullable(this.roleSessionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneAwsServicesAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private @Nullable String roleSessionName;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneAwsServicesAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleSessionName = defaults.roleSessionName;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleSessionName(@Nullable String roleSessionName) {
            this.roleSessionName = roleSessionName;
            return this;
        }

        public AwsClusterControlPlaneAwsServicesAuthentication build() {
            return new AwsClusterControlPlaneAwsServicesAuthentication(roleArn, roleSessionName);
        }
    }
}
