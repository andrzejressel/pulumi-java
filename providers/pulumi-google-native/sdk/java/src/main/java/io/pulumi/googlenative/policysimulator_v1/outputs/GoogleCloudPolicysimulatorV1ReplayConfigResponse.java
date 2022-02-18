// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudPolicysimulatorV1ReplayConfigResponse {
    /**
     * The logs to use as input for the Replay.
     * 
     */
    private final String logSource;
    /**
     * A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
     * 
     */
    private final Map<String,String> policyOverlay;

    @OutputCustomType.Constructor({"logSource","policyOverlay"})
    private GoogleCloudPolicysimulatorV1ReplayConfigResponse(
        String logSource,
        Map<String,String> policyOverlay) {
        this.logSource = Objects.requireNonNull(logSource);
        this.policyOverlay = Objects.requireNonNull(policyOverlay);
    }

    /**
     * The logs to use as input for the Replay.
     * 
     */
    public String getLogSource() {
        return this.logSource;
    }
    /**
     * A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
     * 
     */
    public Map<String,String> getPolicyOverlay() {
        return this.policyOverlay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudPolicysimulatorV1ReplayConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logSource;
        private Map<String,String> policyOverlay;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudPolicysimulatorV1ReplayConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logSource = defaults.logSource;
    	      this.policyOverlay = defaults.policyOverlay;
        }

        public Builder setLogSource(String logSource) {
            this.logSource = Objects.requireNonNull(logSource);
            return this;
        }

        public Builder setPolicyOverlay(Map<String,String> policyOverlay) {
            this.policyOverlay = Objects.requireNonNull(policyOverlay);
            return this;
        }

        public GoogleCloudPolicysimulatorV1ReplayConfigResponse build() {
            return new GoogleCloudPolicysimulatorV1ReplayConfigResponse(logSource, policyOverlay);
        }
    }
}
