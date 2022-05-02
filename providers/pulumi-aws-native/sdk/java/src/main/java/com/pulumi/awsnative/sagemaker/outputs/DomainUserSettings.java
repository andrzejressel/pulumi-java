// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.DomainJupyterServerAppSettings;
import com.pulumi.awsnative.sagemaker.outputs.DomainKernelGatewayAppSettings;
import com.pulumi.awsnative.sagemaker.outputs.DomainRStudioServerProAppSettings;
import com.pulumi.awsnative.sagemaker.outputs.DomainSharingSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainUserSettings {
    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String executionRole;
    /**
     * @return The Jupyter server&#39;s app settings.
     * 
     */
    private final @Nullable DomainJupyterServerAppSettings jupyterServerAppSettings;
    /**
     * @return The kernel gateway app settings.
     * 
     */
    private final @Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings;
    private final @Nullable DomainRStudioServerProAppSettings rStudioServerProAppSettings;
    /**
     * @return The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * @return The sharing settings.
     * 
     */
    private final @Nullable DomainSharingSettings sharingSettings;

    @CustomType.Constructor
    private DomainUserSettings(
        @CustomType.Parameter("executionRole") @Nullable String executionRole,
        @CustomType.Parameter("jupyterServerAppSettings") @Nullable DomainJupyterServerAppSettings jupyterServerAppSettings,
        @CustomType.Parameter("kernelGatewayAppSettings") @Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings,
        @CustomType.Parameter("rStudioServerProAppSettings") @Nullable DomainRStudioServerProAppSettings rStudioServerProAppSettings,
        @CustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @CustomType.Parameter("sharingSettings") @Nullable DomainSharingSettings sharingSettings) {
        this.executionRole = executionRole;
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.rStudioServerProAppSettings = rStudioServerProAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
    }

    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    public Optional<String> executionRole() {
        return Optional.ofNullable(this.executionRole);
    }
    /**
     * @return The Jupyter server&#39;s app settings.
     * 
     */
    public Optional<DomainJupyterServerAppSettings> jupyterServerAppSettings() {
        return Optional.ofNullable(this.jupyterServerAppSettings);
    }
    /**
     * @return The kernel gateway app settings.
     * 
     */
    public Optional<DomainKernelGatewayAppSettings> kernelGatewayAppSettings() {
        return Optional.ofNullable(this.kernelGatewayAppSettings);
    }
    public Optional<DomainRStudioServerProAppSettings> rStudioServerProAppSettings() {
        return Optional.ofNullable(this.rStudioServerProAppSettings);
    }
    /**
     * @return The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The sharing settings.
     * 
     */
    public Optional<DomainSharingSettings> sharingSettings() {
        return Optional.ofNullable(this.sharingSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainUserSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executionRole;
        private @Nullable DomainJupyterServerAppSettings jupyterServerAppSettings;
        private @Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings;
        private @Nullable DomainRStudioServerProAppSettings rStudioServerProAppSettings;
        private @Nullable List<String> securityGroups;
        private @Nullable DomainSharingSettings sharingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainUserSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.rStudioServerProAppSettings = defaults.rStudioServerProAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
        }

        public Builder executionRole(@Nullable String executionRole) {
            this.executionRole = executionRole;
            return this;
        }
        public Builder jupyterServerAppSettings(@Nullable DomainJupyterServerAppSettings jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }
        public Builder kernelGatewayAppSettings(@Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }
        public Builder rStudioServerProAppSettings(@Nullable DomainRStudioServerProAppSettings rStudioServerProAppSettings) {
            this.rStudioServerProAppSettings = rStudioServerProAppSettings;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sharingSettings(@Nullable DomainSharingSettings sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }        public DomainUserSettings build() {
            return new DomainUserSettings(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, rStudioServerProAppSettings, securityGroups, sharingSettings);
        }
    }
}
