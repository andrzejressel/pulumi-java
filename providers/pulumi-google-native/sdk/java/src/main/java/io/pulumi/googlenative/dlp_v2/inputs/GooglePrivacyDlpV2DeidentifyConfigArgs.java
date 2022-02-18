// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeTransformationsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordTransformationsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TransformationErrorHandlingArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration that controls how the data will change.
 * 
 */
public final class GooglePrivacyDlpV2DeidentifyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2DeidentifyConfigArgs Empty = new GooglePrivacyDlpV2DeidentifyConfigArgs();

    /**
     * Treat the dataset as free-form text and apply the same free text transformation everywhere.
     * 
     */
    @InputImport(name="infoTypeTransformations")
    private final @Nullable Input<GooglePrivacyDlpV2InfoTypeTransformationsArgs> infoTypeTransformations;

    public Input<GooglePrivacyDlpV2InfoTypeTransformationsArgs> getInfoTypeTransformations() {
        return this.infoTypeTransformations == null ? Input.empty() : this.infoTypeTransformations;
    }

    /**
     * Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     * 
     */
    @InputImport(name="recordTransformations")
    private final @Nullable Input<GooglePrivacyDlpV2RecordTransformationsArgs> recordTransformations;

    public Input<GooglePrivacyDlpV2RecordTransformationsArgs> getRecordTransformations() {
        return this.recordTransformations == null ? Input.empty() : this.recordTransformations;
    }

    /**
     * Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
     * 
     */
    @InputImport(name="transformationErrorHandling")
    private final @Nullable Input<GooglePrivacyDlpV2TransformationErrorHandlingArgs> transformationErrorHandling;

    public Input<GooglePrivacyDlpV2TransformationErrorHandlingArgs> getTransformationErrorHandling() {
        return this.transformationErrorHandling == null ? Input.empty() : this.transformationErrorHandling;
    }

    public GooglePrivacyDlpV2DeidentifyConfigArgs(
        @Nullable Input<GooglePrivacyDlpV2InfoTypeTransformationsArgs> infoTypeTransformations,
        @Nullable Input<GooglePrivacyDlpV2RecordTransformationsArgs> recordTransformations,
        @Nullable Input<GooglePrivacyDlpV2TransformationErrorHandlingArgs> transformationErrorHandling) {
        this.infoTypeTransformations = infoTypeTransformations;
        this.recordTransformations = recordTransformations;
        this.transformationErrorHandling = transformationErrorHandling;
    }

    private GooglePrivacyDlpV2DeidentifyConfigArgs() {
        this.infoTypeTransformations = Input.empty();
        this.recordTransformations = Input.empty();
        this.transformationErrorHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeidentifyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2InfoTypeTransformationsArgs> infoTypeTransformations;
        private @Nullable Input<GooglePrivacyDlpV2RecordTransformationsArgs> recordTransformations;
        private @Nullable Input<GooglePrivacyDlpV2TransformationErrorHandlingArgs> transformationErrorHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeidentifyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
    	      this.recordTransformations = defaults.recordTransformations;
    	      this.transformationErrorHandling = defaults.transformationErrorHandling;
        }

        public Builder setInfoTypeTransformations(@Nullable Input<GooglePrivacyDlpV2InfoTypeTransformationsArgs> infoTypeTransformations) {
            this.infoTypeTransformations = infoTypeTransformations;
            return this;
        }

        public Builder setInfoTypeTransformations(@Nullable GooglePrivacyDlpV2InfoTypeTransformationsArgs infoTypeTransformations) {
            this.infoTypeTransformations = Input.ofNullable(infoTypeTransformations);
            return this;
        }

        public Builder setRecordTransformations(@Nullable Input<GooglePrivacyDlpV2RecordTransformationsArgs> recordTransformations) {
            this.recordTransformations = recordTransformations;
            return this;
        }

        public Builder setRecordTransformations(@Nullable GooglePrivacyDlpV2RecordTransformationsArgs recordTransformations) {
            this.recordTransformations = Input.ofNullable(recordTransformations);
            return this;
        }

        public Builder setTransformationErrorHandling(@Nullable Input<GooglePrivacyDlpV2TransformationErrorHandlingArgs> transformationErrorHandling) {
            this.transformationErrorHandling = transformationErrorHandling;
            return this;
        }

        public Builder setTransformationErrorHandling(@Nullable GooglePrivacyDlpV2TransformationErrorHandlingArgs transformationErrorHandling) {
            this.transformationErrorHandling = Input.ofNullable(transformationErrorHandling);
            return this;
        }

        public GooglePrivacyDlpV2DeidentifyConfigArgs build() {
            return new GooglePrivacyDlpV2DeidentifyConfigArgs(infoTypeTransformations, recordTransformations, transformationErrorHandling);
        }
    }
}
