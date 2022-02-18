// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1.outputs.Hl7SchemaConfigResponse;
import io.pulumi.googlenative.healthcare_v1.outputs.Hl7TypesConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SchemaPackageResponse {
    /**
     * Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    private final Boolean ignoreMinOccurs;
    /**
     * Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    private final List<Hl7SchemaConfigResponse> schemas;
    /**
     * Determines how messages that fail to parse are handled.
     * 
     */
    private final String schematizedParsingType;
    /**
     * Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    private final List<Hl7TypesConfigResponse> types;
    /**
     * Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    private final String unexpectedSegmentHandling;

    @OutputCustomType.Constructor({"ignoreMinOccurs","schemas","schematizedParsingType","types","unexpectedSegmentHandling"})
    private SchemaPackageResponse(
        Boolean ignoreMinOccurs,
        List<Hl7SchemaConfigResponse> schemas,
        String schematizedParsingType,
        List<Hl7TypesConfigResponse> types,
        String unexpectedSegmentHandling) {
        this.ignoreMinOccurs = Objects.requireNonNull(ignoreMinOccurs);
        this.schemas = Objects.requireNonNull(schemas);
        this.schematizedParsingType = Objects.requireNonNull(schematizedParsingType);
        this.types = Objects.requireNonNull(types);
        this.unexpectedSegmentHandling = Objects.requireNonNull(unexpectedSegmentHandling);
    }

    /**
     * Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    public Boolean getIgnoreMinOccurs() {
        return this.ignoreMinOccurs;
    }
    /**
     * Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    public List<Hl7SchemaConfigResponse> getSchemas() {
        return this.schemas;
    }
    /**
     * Determines how messages that fail to parse are handled.
     * 
     */
    public String getSchematizedParsingType() {
        return this.schematizedParsingType;
    }
    /**
     * Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    public List<Hl7TypesConfigResponse> getTypes() {
        return this.types;
    }
    /**
     * Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    public String getUnexpectedSegmentHandling() {
        return this.unexpectedSegmentHandling;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreMinOccurs;
        private List<Hl7SchemaConfigResponse> schemas;
        private String schematizedParsingType;
        private List<Hl7TypesConfigResponse> types;
        private String unexpectedSegmentHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMinOccurs = defaults.ignoreMinOccurs;
    	      this.schemas = defaults.schemas;
    	      this.schematizedParsingType = defaults.schematizedParsingType;
    	      this.types = defaults.types;
    	      this.unexpectedSegmentHandling = defaults.unexpectedSegmentHandling;
        }

        public Builder setIgnoreMinOccurs(Boolean ignoreMinOccurs) {
            this.ignoreMinOccurs = Objects.requireNonNull(ignoreMinOccurs);
            return this;
        }

        public Builder setSchemas(List<Hl7SchemaConfigResponse> schemas) {
            this.schemas = Objects.requireNonNull(schemas);
            return this;
        }

        public Builder setSchematizedParsingType(String schematizedParsingType) {
            this.schematizedParsingType = Objects.requireNonNull(schematizedParsingType);
            return this;
        }

        public Builder setTypes(List<Hl7TypesConfigResponse> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public Builder setUnexpectedSegmentHandling(String unexpectedSegmentHandling) {
            this.unexpectedSegmentHandling = Objects.requireNonNull(unexpectedSegmentHandling);
            return this;
        }

        public SchemaPackageResponse build() {
            return new SchemaPackageResponse(ignoreMinOccurs, schemas, schematizedParsingType, types, unexpectedSegmentHandling);
        }
    }
}
