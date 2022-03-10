// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementGroupChildInfoResponse {
    /**
     * The list of children.
     * 
     */
    private final @Nullable List<ManagementGroupChildInfoResponse> children;
    /**
     * The friendly name of the child resource.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the child entity.
     * 
     */
    private final @Nullable String name;
    /**
     * The fully qualified resource type which includes provider namespace (e.g. Microsoft.Management/managementGroups)
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private ManagementGroupChildInfoResponse(
        @OutputCustomType.Parameter("children") @Nullable List<ManagementGroupChildInfoResponse> children,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.children = children;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * The list of children.
     * 
    */
    public List<ManagementGroupChildInfoResponse> getChildren() {
        return this.children == null ? List.of() : this.children;
    }
    /**
     * The friendly name of the child resource.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the child entity.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The fully qualified resource type which includes provider namespace (e.g. Microsoft.Management/managementGroups)
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupChildInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagementGroupChildInfoResponse> children;
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupChildInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setChildren(@Nullable List<ManagementGroupChildInfoResponse> children) {
            this.children = children;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ManagementGroupChildInfoResponse build() {
            return new ManagementGroupChildInfoResponse(children, displayName, id, name, type);
        }
    }
}
