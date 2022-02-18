// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2EntityIdResponse {
    /**
     * Composite key indicating which field contains the entity identifier.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse field;

    @OutputCustomType.Constructor({"field"})
    private GooglePrivacyDlpV2EntityIdResponse(GooglePrivacyDlpV2FieldIdResponse field) {
        this.field = Objects.requireNonNull(field);
    }

    /**
     * Composite key indicating which field contains the entity identifier.
     * 
     */
    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2EntityIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2EntityIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public GooglePrivacyDlpV2EntityIdResponse build() {
            return new GooglePrivacyDlpV2EntityIdResponse(field);
        }
    }
}
