// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Compute numerical stats over an individual column, including min, max, and quantiles.
 * 
 */
public final class GooglePrivacyDlpV2NumericalStatsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2NumericalStatsConfigArgs Empty = new GooglePrivacyDlpV2NumericalStatsConfigArgs();

    /**
     * Field to compute numerical stats on. Supported types are integer, float, date, datetime, timestamp, time.
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field;

    public Input<GooglePrivacyDlpV2FieldIdArgs> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    public GooglePrivacyDlpV2NumericalStatsConfigArgs(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field) {
        this.field = field;
    }

    private GooglePrivacyDlpV2NumericalStatsConfigArgs() {
        this.field = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2NumericalStatsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2NumericalStatsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable GooglePrivacyDlpV2FieldIdArgs field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public GooglePrivacyDlpV2NumericalStatsConfigArgs build() {
            return new GooglePrivacyDlpV2NumericalStatsConfigArgs(field);
        }
    }
}
