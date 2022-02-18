// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.ReservationShareSettingsProjectMap;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReservationShareSettings {
    /**
     * A map of project number and project config. This is only valid when shareType's value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ReservationShareSettingsProjectMap> projectMaps;
    /**
     * Type of sharing for this shared-reservation
     * Possible values are `LOCAL` and `SPECIFIC_PROJECTS`.
     * 
     */
    private final @Nullable String shareType;

    @OutputCustomType.Constructor({"projectMaps","shareType"})
    private ReservationShareSettings(
        @Nullable List<ReservationShareSettingsProjectMap> projectMaps,
        @Nullable String shareType) {
        this.projectMaps = projectMaps;
        this.shareType = shareType;
    }

    /**
     * A map of project number and project config. This is only valid when shareType's value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    public List<ReservationShareSettingsProjectMap> getProjectMaps() {
        return this.projectMaps == null ? List.of() : this.projectMaps;
    }
    /**
     * Type of sharing for this shared-reservation
     * Possible values are `LOCAL` and `SPECIFIC_PROJECTS`.
     * 
     */
    public Optional<String> getShareType() {
        return Optional.ofNullable(this.shareType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationShareSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReservationShareSettingsProjectMap> projectMaps;
        private @Nullable String shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationShareSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMaps = defaults.projectMaps;
    	      this.shareType = defaults.shareType;
        }

        public Builder setProjectMaps(@Nullable List<ReservationShareSettingsProjectMap> projectMaps) {
            this.projectMaps = projectMaps;
            return this;
        }

        public Builder setShareType(@Nullable String shareType) {
            this.shareType = shareType;
            return this;
        }

        public ReservationShareSettings build() {
            return new ReservationShareSettings(projectMaps, shareType);
        }
    }
}
