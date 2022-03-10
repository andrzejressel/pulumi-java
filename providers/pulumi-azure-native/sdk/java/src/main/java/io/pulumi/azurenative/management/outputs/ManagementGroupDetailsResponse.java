// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.azurenative.management.outputs.ManagementGroupPathElementResponse;
import io.pulumi.azurenative.management.outputs.ParentGroupInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementGroupDetailsResponse {
    /**
     * (Optional) The ID of the parent management group.
     * 
     */
    private final @Nullable ParentGroupInfoResponse parent;
    /**
     * The path from the root to the current group.
     * 
     */
    private final @Nullable List<ManagementGroupPathElementResponse> path;
    /**
     * The identity of the principal or process that updated the object.
     * 
     */
    private final @Nullable String updatedBy;
    /**
     * The date and time when this object was last updated.
     * 
     */
    private final @Nullable String updatedTime;
    /**
     * The version number of the object.
     * 
     */
    private final @Nullable Double version;

    @OutputCustomType.Constructor
    private ManagementGroupDetailsResponse(
        @OutputCustomType.Parameter("parent") @Nullable ParentGroupInfoResponse parent,
        @OutputCustomType.Parameter("path") @Nullable List<ManagementGroupPathElementResponse> path,
        @OutputCustomType.Parameter("updatedBy") @Nullable String updatedBy,
        @OutputCustomType.Parameter("updatedTime") @Nullable String updatedTime,
        @OutputCustomType.Parameter("version") @Nullable Double version) {
        this.parent = parent;
        this.path = path;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.version = version;
    }

    /**
     * (Optional) The ID of the parent management group.
     * 
    */
    public Optional<ParentGroupInfoResponse> getParent() {
        return Optional.ofNullable(this.parent);
    }
    /**
     * The path from the root to the current group.
     * 
    */
    public List<ManagementGroupPathElementResponse> getPath() {
        return this.path == null ? List.of() : this.path;
    }
    /**
     * The identity of the principal or process that updated the object.
     * 
    */
    public Optional<String> getUpdatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    /**
     * The date and time when this object was last updated.
     * 
    */
    public Optional<String> getUpdatedTime() {
        return Optional.ofNullable(this.updatedTime);
    }
    /**
     * The version number of the object.
     * 
    */
    public Optional<Double> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ParentGroupInfoResponse parent;
        private @Nullable List<ManagementGroupPathElementResponse> path;
        private @Nullable String updatedBy;
        private @Nullable String updatedTime;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
    	      this.path = defaults.path;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedTime = defaults.updatedTime;
    	      this.version = defaults.version;
        }

        public Builder setParent(@Nullable ParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPath(@Nullable List<ManagementGroupPathElementResponse> path) {
            this.path = path;
            return this;
        }

        public Builder setUpdatedBy(@Nullable String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder setUpdatedTime(@Nullable String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = version;
            return this;
        }
        public ManagementGroupDetailsResponse build() {
            return new ManagementGroupDetailsResponse(parent, path, updatedBy, updatedTime, version);
        }
    }
}
