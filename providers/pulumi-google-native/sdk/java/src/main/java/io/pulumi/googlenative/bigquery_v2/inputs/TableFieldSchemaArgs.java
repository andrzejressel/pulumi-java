// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaCategoriesArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaPolicyTagsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableFieldSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableFieldSchemaArgs Empty = new TableFieldSchemaArgs();

    /**
     * [Optional] The categories attached to this field, used for field-level access control.
     * 
     */
    @InputImport(name="categories")
    private final @Nullable Input<TableFieldSchemaCategoriesArgs> categories;

    public Input<TableFieldSchemaCategoriesArgs> getCategories() {
        return this.categories == null ? Input.empty() : this.categories;
    }

    /**
     * Optional. Collation specification of the field. It only can be set on string type field.
     * 
     */
    @InputImport(name="collationSpec")
    private final @Nullable Input<String> collationSpec;

    public Input<String> getCollationSpec() {
        return this.collationSpec == null ? Input.empty() : this.collationSpec;
    }

    /**
     * [Optional] The field description. The maximum length is 1,024 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * [Optional] Describes the nested schema fields if the type property is set to RECORD.
     * 
     */
    @InputImport(name="fields")
    private final @Nullable Input<List<TableFieldSchemaArgs>> fields;

    public Input<List<TableFieldSchemaArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    /**
     * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = "STRING", then max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES", then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type ≠ "STRING" and ≠ "BYTES".
     * 
     */
    @InputImport(name="maxLength")
    private final @Nullable Input<String> maxLength;

    public Input<String> getMaxLength() {
        return this.maxLength == null ? Input.empty() : this.maxLength;
    }

    /**
     * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="policyTags")
    private final @Nullable Input<TableFieldSchemaPolicyTagsArgs> policyTags;

    public Input<TableFieldSchemaPolicyTagsArgs> getPolicyTags() {
        return this.policyTags == null ? Input.empty() : this.policyTags;
    }

    /**
     * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤ precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is specified but not precision, then it is invalid.
     * 
     */
    @InputImport(name="precision")
    private final @Nullable Input<String> precision;

    public Input<String> getPrecision() {
        return this.precision == null ? Input.empty() : this.precision;
    }

    /**
     * [Optional] See documentation for precision.
     * 
     */
    @InputImport(name="scale")
    private final @Nullable Input<String> scale;

    public Input<String> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    /**
     * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public TableFieldSchemaArgs(
        @Nullable Input<TableFieldSchemaCategoriesArgs> categories,
        @Nullable Input<String> collationSpec,
        @Nullable Input<String> description,
        @Nullable Input<List<TableFieldSchemaArgs>> fields,
        @Nullable Input<String> maxLength,
        @Nullable Input<String> mode,
        @Nullable Input<String> name,
        @Nullable Input<TableFieldSchemaPolicyTagsArgs> policyTags,
        @Nullable Input<String> precision,
        @Nullable Input<String> scale,
        @Nullable Input<String> type) {
        this.categories = categories;
        this.collationSpec = collationSpec;
        this.description = description;
        this.fields = fields;
        this.maxLength = maxLength;
        this.mode = mode;
        this.name = name;
        this.policyTags = policyTags;
        this.precision = precision;
        this.scale = scale;
        this.type = type;
    }

    private TableFieldSchemaArgs() {
        this.categories = Input.empty();
        this.collationSpec = Input.empty();
        this.description = Input.empty();
        this.fields = Input.empty();
        this.maxLength = Input.empty();
        this.mode = Input.empty();
        this.name = Input.empty();
        this.policyTags = Input.empty();
        this.precision = Input.empty();
        this.scale = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TableFieldSchemaCategoriesArgs> categories;
        private @Nullable Input<String> collationSpec;
        private @Nullable Input<String> description;
        private @Nullable Input<List<TableFieldSchemaArgs>> fields;
        private @Nullable Input<String> maxLength;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> name;
        private @Nullable Input<TableFieldSchemaPolicyTagsArgs> policyTags;
        private @Nullable Input<String> precision;
        private @Nullable Input<String> scale;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.collationSpec = defaults.collationSpec;
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.maxLength = defaults.maxLength;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.policyTags = defaults.policyTags;
    	      this.precision = defaults.precision;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder setCategories(@Nullable Input<TableFieldSchemaCategoriesArgs> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setCategories(@Nullable TableFieldSchemaCategoriesArgs categories) {
            this.categories = Input.ofNullable(categories);
            return this;
        }

        public Builder setCollationSpec(@Nullable Input<String> collationSpec) {
            this.collationSpec = collationSpec;
            return this;
        }

        public Builder setCollationSpec(@Nullable String collationSpec) {
            this.collationSpec = Input.ofNullable(collationSpec);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFields(@Nullable Input<List<TableFieldSchemaArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<TableFieldSchemaArgs> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public Builder setMaxLength(@Nullable Input<String> maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public Builder setMaxLength(@Nullable String maxLength) {
            this.maxLength = Input.ofNullable(maxLength);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicyTags(@Nullable Input<TableFieldSchemaPolicyTagsArgs> policyTags) {
            this.policyTags = policyTags;
            return this;
        }

        public Builder setPolicyTags(@Nullable TableFieldSchemaPolicyTagsArgs policyTags) {
            this.policyTags = Input.ofNullable(policyTags);
            return this;
        }

        public Builder setPrecision(@Nullable Input<String> precision) {
            this.precision = precision;
            return this;
        }

        public Builder setPrecision(@Nullable String precision) {
            this.precision = Input.ofNullable(precision);
            return this;
        }

        public Builder setScale(@Nullable Input<String> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable String scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public TableFieldSchemaArgs build() {
            return new TableFieldSchemaArgs(categories, collationSpec, description, fields, maxLength, mode, name, policyTags, precision, scale, type);
        }
    }
}
