// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RelationshipLinkFieldMappingResponse {
    /**
     * The field name on the Interaction Type.
     * 
     */
    private final String interactionFieldName;
    /**
     * Link type.
     * 
     */
    private final @Nullable String linkType;
    /**
     * The field name on the Relationship metadata.
     * 
     */
    private final String relationshipFieldName;

    @OutputCustomType.Constructor
    private RelationshipLinkFieldMappingResponse(
        @OutputCustomType.Parameter("interactionFieldName") String interactionFieldName,
        @OutputCustomType.Parameter("linkType") @Nullable String linkType,
        @OutputCustomType.Parameter("relationshipFieldName") String relationshipFieldName) {
        this.interactionFieldName = interactionFieldName;
        this.linkType = linkType;
        this.relationshipFieldName = relationshipFieldName;
    }

    /**
     * The field name on the Interaction Type.
     * 
    */
    public String getInteractionFieldName() {
        return this.interactionFieldName;
    }
    /**
     * Link type.
     * 
    */
    public Optional<String> getLinkType() {
        return Optional.ofNullable(this.linkType);
    }
    /**
     * The field name on the Relationship metadata.
     * 
    */
    public String getRelationshipFieldName() {
        return this.relationshipFieldName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipLinkFieldMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interactionFieldName;
        private @Nullable String linkType;
        private String relationshipFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipLinkFieldMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interactionFieldName = defaults.interactionFieldName;
    	      this.linkType = defaults.linkType;
    	      this.relationshipFieldName = defaults.relationshipFieldName;
        }

        public Builder setInteractionFieldName(String interactionFieldName) {
            this.interactionFieldName = Objects.requireNonNull(interactionFieldName);
            return this;
        }

        public Builder setLinkType(@Nullable String linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setRelationshipFieldName(String relationshipFieldName) {
            this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName);
            return this;
        }
        public RelationshipLinkFieldMappingResponse build() {
            return new RelationshipLinkFieldMappingResponse(interactionFieldName, linkType, relationshipFieldName);
        }
    }
}
