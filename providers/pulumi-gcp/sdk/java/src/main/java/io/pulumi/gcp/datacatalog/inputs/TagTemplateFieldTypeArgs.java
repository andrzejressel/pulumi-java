// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateFieldTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeArgs Empty = new TagTemplateFieldTypeArgs();

    /**
     * Represents an enum type.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Structure is documented below.
     * 
     */
    @InputImport(name="enumType")
    private final @Nullable Input<TagTemplateFieldTypeEnumTypeArgs> enumType;

    public Input<TagTemplateFieldTypeEnumTypeArgs> getEnumType() {
        return this.enumType == null ? Input.empty() : this.enumType;
    }

    /**
     * Represents primitive types - string, bool etc.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Possible values are `DOUBLE`, `STRING`, `BOOL`, and `TIMESTAMP`.
     * 
     */
    @InputImport(name="primitiveType")
    private final @Nullable Input<String> primitiveType;

    public Input<String> getPrimitiveType() {
        return this.primitiveType == null ? Input.empty() : this.primitiveType;
    }

    public TagTemplateFieldTypeArgs(
        @Nullable Input<TagTemplateFieldTypeEnumTypeArgs> enumType,
        @Nullable Input<String> primitiveType) {
        this.enumType = enumType;
        this.primitiveType = primitiveType;
    }

    private TagTemplateFieldTypeArgs() {
        this.enumType = Input.empty();
        this.primitiveType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TagTemplateFieldTypeEnumTypeArgs> enumType;
        private @Nullable Input<String> primitiveType;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumType = defaults.enumType;
    	      this.primitiveType = defaults.primitiveType;
        }

        public Builder setEnumType(@Nullable Input<TagTemplateFieldTypeEnumTypeArgs> enumType) {
            this.enumType = enumType;
            return this;
        }

        public Builder setEnumType(@Nullable TagTemplateFieldTypeEnumTypeArgs enumType) {
            this.enumType = Input.ofNullable(enumType);
            return this;
        }

        public Builder setPrimitiveType(@Nullable Input<String> primitiveType) {
            this.primitiveType = primitiveType;
            return this;
        }

        public Builder setPrimitiveType(@Nullable String primitiveType) {
            this.primitiveType = Input.ofNullable(primitiveType);
            return this;
        }

        public TagTemplateFieldTypeArgs build() {
            return new TagTemplateFieldTypeArgs(enumType, primitiveType);
        }
    }
}
