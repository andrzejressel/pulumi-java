// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The field type of `value` and `field` do not need to match to be considered equal, but not all comparisons are possible. EQUAL_TO and NOT_EQUAL_TO attempt to compare even with incompatible types, but all other comparisons are invalid with incompatible types. A `value` of type: - `string` can be compared against all other types - `boolean` can only be compared against other booleans - `integer` can be compared against doubles or a string if the string value can be parsed as an integer. - `double` can be compared against integers or a string if the string can be parsed as a double. - `Timestamp` can be compared against strings in RFC 3339 date string format. - `TimeOfDay` can be compared against timestamps and strings in the format of 'HH:mm:ss'. If we fail to compare do to type mismatch, a warning will be given and the condition will evaluate to false.
 * 
 */
public final class GooglePrivacyDlpV2ConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ConditionResponse Empty = new GooglePrivacyDlpV2ConditionResponse();

    /**
     * Field within the record this condition is evaluated against.
     * 
     */
    @InputImport(name="field", required=true)
    private final GooglePrivacyDlpV2FieldIdResponse field;

    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    /**
     * Operator used to compare the field or infoType to the value.
     * 
     */
    @InputImport(name="operator", required=true)
    private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * Value to compare against. [Mandatory, except for `EXISTS` tests.]
     * 
     */
    @InputImport(name="value", required=true)
    private final GooglePrivacyDlpV2ValueResponse value;

    public GooglePrivacyDlpV2ValueResponse getValue() {
        return this.value;
    }

    public GooglePrivacyDlpV2ConditionResponse(
        GooglePrivacyDlpV2FieldIdResponse field,
        String operator,
        GooglePrivacyDlpV2ValueResponse value) {
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GooglePrivacyDlpV2ConditionResponse() {
        this.field = null;
        this.operator = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;
        private String operator;
        private GooglePrivacyDlpV2ValueResponse value;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValue(GooglePrivacyDlpV2ValueResponse value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GooglePrivacyDlpV2ConditionResponse build() {
            return new GooglePrivacyDlpV2ConditionResponse(field, operator, value);
        }
    }
}
