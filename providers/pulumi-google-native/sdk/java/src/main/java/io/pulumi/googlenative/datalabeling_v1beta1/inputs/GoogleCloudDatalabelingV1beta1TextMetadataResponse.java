// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata for the text.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1TextMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1TextMetadataResponse Empty = new GoogleCloudDatalabelingV1beta1TextMetadataResponse();

    /**
     * The language of this text, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US.
     * 
     */
    @InputImport(name="languageCode", required=true)
    private final String languageCode;

    public String getLanguageCode() {
        return this.languageCode;
    }

    public GoogleCloudDatalabelingV1beta1TextMetadataResponse(String languageCode) {
        this.languageCode = Objects.requireNonNull(languageCode, "expected parameter 'languageCode' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1TextMetadataResponse() {
        this.languageCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1TextMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String languageCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1TextMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.languageCode = defaults.languageCode;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1TextMetadataResponse build() {
            return new GoogleCloudDatalabelingV1beta1TextMetadataResponse(languageCode);
        }
    }
}
