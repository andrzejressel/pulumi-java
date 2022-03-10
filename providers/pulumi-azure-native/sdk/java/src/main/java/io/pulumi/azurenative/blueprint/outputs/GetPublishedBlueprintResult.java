// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.BlueprintStatusResponse;
import io.pulumi.azurenative.blueprint.outputs.ParameterDefinitionResponse;
import io.pulumi.azurenative.blueprint.outputs.ResourceGroupDefinitionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPublishedBlueprintResult {
    /**
     * Name of the published blueprint definition.
     * 
     */
    private final @Nullable String blueprintName;
    /**
     * Version-specific change notes.
     * 
     */
    private final @Nullable String changeNotes;
    /**
     * Multi-line explain this resource.
     * 
     */
    private final @Nullable String description;
    /**
     * One-liner string explain this resource.
     * 
     */
    private final @Nullable String displayName;
    /**
     * String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * Name of this resource.
     * 
     */
    private final String name;
    /**
     * Parameters required by this blueprint definition.
     * 
     */
    private final @Nullable Map<String,ParameterDefinitionResponse> parameters;
    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    private final @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups;
    /**
     * Status of the blueprint. This field is readonly.
     * 
     */
    private final BlueprintStatusResponse status;
    /**
     * The scope where this blueprint definition can be assigned.
     * 
     */
    private final @Nullable String targetScope;
    /**
     * Type of this resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPublishedBlueprintResult(
        @OutputCustomType.Parameter("blueprintName") @Nullable String blueprintName,
        @OutputCustomType.Parameter("changeNotes") @Nullable String changeNotes,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterDefinitionResponse> parameters,
        @OutputCustomType.Parameter("resourceGroups") @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups,
        @OutputCustomType.Parameter("status") BlueprintStatusResponse status,
        @OutputCustomType.Parameter("targetScope") @Nullable String targetScope,
        @OutputCustomType.Parameter("type") String type) {
        this.blueprintName = blueprintName;
        this.changeNotes = changeNotes;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.status = status;
        this.targetScope = targetScope;
        this.type = type;
    }

    /**
     * Name of the published blueprint definition.
     * 
    */
    public Optional<String> getBlueprintName() {
        return Optional.ofNullable(this.blueprintName);
    }
    /**
     * Version-specific change notes.
     * 
    */
    public Optional<String> getChangeNotes() {
        return Optional.ofNullable(this.changeNotes);
    }
    /**
     * Multi-line explain this resource.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * One-liner string explain this resource.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * String Id used to locate any resource on Azure.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of this resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Parameters required by this blueprint definition.
     * 
    */
    public Map<String,ParameterDefinitionResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
    */
    public Map<String,ResourceGroupDefinitionResponse> getResourceGroups() {
        return this.resourceGroups == null ? Map.of() : this.resourceGroups;
    }
    /**
     * Status of the blueprint. This field is readonly.
     * 
    */
    public BlueprintStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The scope where this blueprint definition can be assigned.
     * 
    */
    public Optional<String> getTargetScope() {
        return Optional.ofNullable(this.targetScope);
    }
    /**
     * Type of this resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublishedBlueprintResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blueprintName;
        private @Nullable String changeNotes;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private String name;
        private @Nullable Map<String,ParameterDefinitionResponse> parameters;
        private @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups;
        private BlueprintStatusResponse status;
        private @Nullable String targetScope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublishedBlueprintResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.changeNotes = defaults.changeNotes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.status = defaults.status;
    	      this.targetScope = defaults.targetScope;
    	      this.type = defaults.type;
        }

        public Builder setBlueprintName(@Nullable String blueprintName) {
            this.blueprintName = blueprintName;
            return this;
        }

        public Builder setChangeNotes(@Nullable String changeNotes) {
            this.changeNotes = changeNotes;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterDefinitionResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceGroups(@Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        public Builder setStatus(BlueprintStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetScope(@Nullable String targetScope) {
            this.targetScope = targetScope;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPublishedBlueprintResult build() {
            return new GetPublishedBlueprintResult(blueprintName, changeNotes, description, displayName, id, name, parameters, resourceGroups, status, targetScope, type);
        }
    }
}
