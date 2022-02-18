// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleProtobufEmptyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A column with a semantic tag attached.
 * 
 */
public final class GooglePrivacyDlpV2TaggedFieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TaggedFieldResponse Empty = new GooglePrivacyDlpV2TaggedFieldResponse();

    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
     */
    @InputImport(name="customTag", required=true)
    private final String customTag;

    public String getCustomTag() {
        return this.customTag;
    }

    /**
     * Identifies the column.
     * 
     */
    @InputImport(name="field", required=true)
    private final GooglePrivacyDlpV2FieldIdResponse field;

    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    /**
     * If no semantic tag is indicated, we infer the statistical model from the distribution of values in the input data
     * 
     */
    @InputImport(name="inferred", required=true)
    private final GoogleProtobufEmptyResponse inferred;

    public GoogleProtobufEmptyResponse getInferred() {
        return this.inferred;
    }

    /**
     * A column can be tagged with a InfoType to use the relevant public dataset as a statistical model of population, if available. We currently support US ZIP codes, region codes, ages and genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
     * 
     */
    @InputImport(name="infoType", required=true)
    private final GooglePrivacyDlpV2InfoTypeResponse infoType;

    public GooglePrivacyDlpV2InfoTypeResponse getInfoType() {
        return this.infoType;
    }

    public GooglePrivacyDlpV2TaggedFieldResponse(
        String customTag,
        GooglePrivacyDlpV2FieldIdResponse field,
        GoogleProtobufEmptyResponse inferred,
        GooglePrivacyDlpV2InfoTypeResponse infoType) {
        this.customTag = Objects.requireNonNull(customTag, "expected parameter 'customTag' to be non-null");
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.inferred = Objects.requireNonNull(inferred, "expected parameter 'inferred' to be non-null");
        this.infoType = Objects.requireNonNull(infoType, "expected parameter 'infoType' to be non-null");
    }

    private GooglePrivacyDlpV2TaggedFieldResponse() {
        this.customTag = null;
        this.field = null;
        this.inferred = null;
        this.infoType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TaggedFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customTag;
        private GooglePrivacyDlpV2FieldIdResponse field;
        private GoogleProtobufEmptyResponse inferred;
        private GooglePrivacyDlpV2InfoTypeResponse infoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TaggedFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
    	      this.inferred = defaults.inferred;
    	      this.infoType = defaults.infoType;
        }

        public Builder setCustomTag(String customTag) {
            this.customTag = Objects.requireNonNull(customTag);
            return this;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setInferred(GoogleProtobufEmptyResponse inferred) {
            this.inferred = Objects.requireNonNull(inferred);
            return this;
        }

        public Builder setInfoType(GooglePrivacyDlpV2InfoTypeResponse infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }

        public GooglePrivacyDlpV2TaggedFieldResponse build() {
            return new GooglePrivacyDlpV2TaggedFieldResponse(customTag, field, inferred, infoType);
        }
    }
}
