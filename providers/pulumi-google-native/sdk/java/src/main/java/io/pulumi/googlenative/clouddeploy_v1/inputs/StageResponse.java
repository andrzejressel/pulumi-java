// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Stage specifies a location to which to deploy.
 * 
 */
public final class StageResponse extends io.pulumi.resources.InvokeArgs {

    public static final StageResponse Empty = new StageResponse();

    /**
     * Skaffold profiles to use when rendering the manifest for this stage's `Target`.
     * 
     */
    @InputImport(name="profiles", required=true)
    private final List<String> profiles;

    public List<String> getProfiles() {
        return this.profiles;
    }

    /**
     * The target_id to which this stage points. This field refers exclusively to the last segment of a target name. For example, this field would just be `my-target` (rather than `projects/project/locations/location/targets/my-target`). The location of the `Target` is inferred to be the same as the location of the `DeliveryPipeline` that contains this `Stage`.
     * 
     */
    @InputImport(name="targetId", required=true)
    private final String targetId;

    public String getTargetId() {
        return this.targetId;
    }

    public StageResponse(
        List<String> profiles,
        String targetId) {
        this.profiles = Objects.requireNonNull(profiles, "expected parameter 'profiles' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
    }

    private StageResponse() {
        this.profiles = List.of();
        this.targetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> profiles;
        private String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(StageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profiles = defaults.profiles;
    	      this.targetId = defaults.targetId;
        }

        public Builder setProfiles(List<String> profiles) {
            this.profiles = Objects.requireNonNull(profiles);
            return this;
        }

        public Builder setTargetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public StageResponse build() {
            return new StageResponse(profiles, targetId);
        }
    }
}
