// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterClusterAutoscalingAutoProvisioningDefault;
import io.pulumi.gcp.container.outputs.GetClusterClusterAutoscalingResourceLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterClusterAutoscaling {
    private final List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults;
    private final String autoscalingProfile;
    private final Boolean enabled;
    private final List<GetClusterClusterAutoscalingResourceLimit> resourceLimits;

    @OutputCustomType.Constructor({"autoProvisioningDefaults","autoscalingProfile","enabled","resourceLimits"})
    private GetClusterClusterAutoscaling(
        List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults,
        String autoscalingProfile,
        Boolean enabled,
        List<GetClusterClusterAutoscalingResourceLimit> resourceLimits) {
        this.autoProvisioningDefaults = Objects.requireNonNull(autoProvisioningDefaults);
        this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile);
        this.enabled = Objects.requireNonNull(enabled);
        this.resourceLimits = Objects.requireNonNull(resourceLimits);
    }

    public List<GetClusterClusterAutoscalingAutoProvisioningDefault> getAutoProvisioningDefaults() {
        return this.autoProvisioningDefaults;
    }
    public String getAutoscalingProfile() {
        return this.autoscalingProfile;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public List<GetClusterClusterAutoscalingResourceLimit> getResourceLimits() {
        return this.resourceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults;
        private String autoscalingProfile;
        private Boolean enabled;
        private List<GetClusterClusterAutoscalingResourceLimit> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvisioningDefaults = defaults.autoProvisioningDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enabled = defaults.enabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder setAutoProvisioningDefaults(List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults) {
            this.autoProvisioningDefaults = Objects.requireNonNull(autoProvisioningDefaults);
            return this;
        }

        public Builder setAutoscalingProfile(String autoscalingProfile) {
            this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setResourceLimits(List<GetClusterClusterAutoscalingResourceLimit> resourceLimits) {
            this.resourceLimits = Objects.requireNonNull(resourceLimits);
            return this;
        }

        public GetClusterClusterAutoscaling build() {
            return new GetClusterClusterAutoscaling(autoProvisioningDefaults, autoscalingProfile, enabled, resourceLimits);
        }
    }
}
