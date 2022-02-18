// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2QuasiIdResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2StatisticalTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse {
    /**
     * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table.
     * 
     */
    private final List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables;
    /**
     * Fields considered to be quasi-identifiers. No two fields can have the same tag.
     * 
     */
    private final List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds;
    /**
     * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
     * 
     */
    private final String regionCode;

    @OutputCustomType.Constructor({"auxiliaryTables","quasiIds","regionCode"})
    private GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse(
        List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables,
        List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds,
        String regionCode) {
        this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables);
        this.quasiIds = Objects.requireNonNull(quasiIds);
        this.regionCode = Objects.requireNonNull(regionCode);
    }

    /**
     * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table.
     * 
     */
    public List<GooglePrivacyDlpV2StatisticalTableResponse> getAuxiliaryTables() {
        return this.auxiliaryTables;
    }
    /**
     * Fields considered to be quasi-identifiers. No two fields can have the same tag.
     * 
     */
    public List<GooglePrivacyDlpV2QuasiIdResponse> getQuasiIds() {
        return this.quasiIds;
    }
    /**
     * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
     * 
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables;
        private List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds;
        private String regionCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTables = defaults.auxiliaryTables;
    	      this.quasiIds = defaults.quasiIds;
    	      this.regionCode = defaults.regionCode;
        }

        public Builder setAuxiliaryTables(List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables) {
            this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables);
            return this;
        }

        public Builder setQuasiIds(List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }

        public Builder setRegionCode(String regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }

        public GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse build() {
            return new GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse(auxiliaryTables, quasiIds, regionCode);
        }
    }
}
