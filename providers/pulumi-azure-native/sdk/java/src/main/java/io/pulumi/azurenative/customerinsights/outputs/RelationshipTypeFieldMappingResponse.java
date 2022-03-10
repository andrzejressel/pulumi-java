// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RelationshipTypeFieldMappingResponse {
    /**
     * Specifies the fieldName in profile.
     * 
     */
    private final String profileFieldName;
    /**
     * Specifies the KeyProperty (from StrongId) of the related profile.
     * 
     */
    private final String relatedProfileKeyProperty;

    @OutputCustomType.Constructor
    private RelationshipTypeFieldMappingResponse(
        @OutputCustomType.Parameter("profileFieldName") String profileFieldName,
        @OutputCustomType.Parameter("relatedProfileKeyProperty") String relatedProfileKeyProperty) {
        this.profileFieldName = profileFieldName;
        this.relatedProfileKeyProperty = relatedProfileKeyProperty;
    }

    /**
     * Specifies the fieldName in profile.
     * 
    */
    public String getProfileFieldName() {
        return this.profileFieldName;
    }
    /**
     * Specifies the KeyProperty (from StrongId) of the related profile.
     * 
    */
    public String getRelatedProfileKeyProperty() {
        return this.relatedProfileKeyProperty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipTypeFieldMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileFieldName;
        private String relatedProfileKeyProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipTypeFieldMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileFieldName = defaults.profileFieldName;
    	      this.relatedProfileKeyProperty = defaults.relatedProfileKeyProperty;
        }

        public Builder setProfileFieldName(String profileFieldName) {
            this.profileFieldName = Objects.requireNonNull(profileFieldName);
            return this;
        }

        public Builder setRelatedProfileKeyProperty(String relatedProfileKeyProperty) {
            this.relatedProfileKeyProperty = Objects.requireNonNull(relatedProfileKeyProperty);
            return this;
        }
        public RelationshipTypeFieldMappingResponse build() {
            return new RelationshipTypeFieldMappingResponse(profileFieldName, relatedProfileKeyProperty);
        }
    }
}
