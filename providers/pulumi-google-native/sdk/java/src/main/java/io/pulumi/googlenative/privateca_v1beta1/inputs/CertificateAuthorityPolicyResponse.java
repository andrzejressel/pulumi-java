// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.AllowedConfigListResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.AllowedSubjectAltNamesResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.IssuanceModesResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The issuing policy for a CertificateAuthority. Certificates will not be successfully issued from this CertificateAuthority if they violate the policy.
 * 
 */
public final class CertificateAuthorityPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateAuthorityPolicyResponse Empty = new CertificateAuthorityPolicyResponse();

    /**
     * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    @InputImport(name="allowedCommonNames", required=true)
    private final List<String> allowedCommonNames;

    public List<String> getAllowedCommonNames() {
        return this.allowedCommonNames;
    }

    /**
     * Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    @InputImport(name="allowedConfigList", required=true)
    private final AllowedConfigListResponse allowedConfigList;

    public AllowedConfigListResponse getAllowedConfigList() {
        return this.allowedConfigList;
    }

    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    @InputImport(name="allowedIssuanceModes", required=true)
    private final IssuanceModesResponse allowedIssuanceModes;

    public IssuanceModesResponse getAllowedIssuanceModes() {
        return this.allowedIssuanceModes;
    }

    /**
     * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    @InputImport(name="allowedLocationsAndOrganizations", required=true)
    private final List<SubjectResponse> allowedLocationsAndOrganizations;

    public List<SubjectResponse> getAllowedLocationsAndOrganizations() {
        return this.allowedLocationsAndOrganizations;
    }

    /**
     * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    @InputImport(name="allowedSans", required=true)
    private final AllowedSubjectAltNamesResponse allowedSans;

    public AllowedSubjectAltNamesResponse getAllowedSans() {
        return this.allowedSans;
    }

    /**
     * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    @InputImport(name="maximumLifetime", required=true)
    private final String maximumLifetime;

    public String getMaximumLifetime() {
        return this.maximumLifetime;
    }

    /**
     * Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    @InputImport(name="overwriteConfigValues", required=true)
    private final ReusableConfigWrapperResponse overwriteConfigValues;

    public ReusableConfigWrapperResponse getOverwriteConfigValues() {
        return this.overwriteConfigValues;
    }

    public CertificateAuthorityPolicyResponse(
        List<String> allowedCommonNames,
        AllowedConfigListResponse allowedConfigList,
        IssuanceModesResponse allowedIssuanceModes,
        List<SubjectResponse> allowedLocationsAndOrganizations,
        AllowedSubjectAltNamesResponse allowedSans,
        String maximumLifetime,
        ReusableConfigWrapperResponse overwriteConfigValues) {
        this.allowedCommonNames = Objects.requireNonNull(allowedCommonNames, "expected parameter 'allowedCommonNames' to be non-null");
        this.allowedConfigList = Objects.requireNonNull(allowedConfigList, "expected parameter 'allowedConfigList' to be non-null");
        this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes, "expected parameter 'allowedIssuanceModes' to be non-null");
        this.allowedLocationsAndOrganizations = Objects.requireNonNull(allowedLocationsAndOrganizations, "expected parameter 'allowedLocationsAndOrganizations' to be non-null");
        this.allowedSans = Objects.requireNonNull(allowedSans, "expected parameter 'allowedSans' to be non-null");
        this.maximumLifetime = Objects.requireNonNull(maximumLifetime, "expected parameter 'maximumLifetime' to be non-null");
        this.overwriteConfigValues = Objects.requireNonNull(overwriteConfigValues, "expected parameter 'overwriteConfigValues' to be non-null");
    }

    private CertificateAuthorityPolicyResponse() {
        this.allowedCommonNames = List.of();
        this.allowedConfigList = null;
        this.allowedIssuanceModes = null;
        this.allowedLocationsAndOrganizations = List.of();
        this.allowedSans = null;
        this.maximumLifetime = null;
        this.overwriteConfigValues = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCommonNames;
        private AllowedConfigListResponse allowedConfigList;
        private IssuanceModesResponse allowedIssuanceModes;
        private List<SubjectResponse> allowedLocationsAndOrganizations;
        private AllowedSubjectAltNamesResponse allowedSans;
        private String maximumLifetime;
        private ReusableConfigWrapperResponse overwriteConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCommonNames = defaults.allowedCommonNames;
    	      this.allowedConfigList = defaults.allowedConfigList;
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedLocationsAndOrganizations = defaults.allowedLocationsAndOrganizations;
    	      this.allowedSans = defaults.allowedSans;
    	      this.maximumLifetime = defaults.maximumLifetime;
    	      this.overwriteConfigValues = defaults.overwriteConfigValues;
        }

        public Builder setAllowedCommonNames(List<String> allowedCommonNames) {
            this.allowedCommonNames = Objects.requireNonNull(allowedCommonNames);
            return this;
        }

        public Builder setAllowedConfigList(AllowedConfigListResponse allowedConfigList) {
            this.allowedConfigList = Objects.requireNonNull(allowedConfigList);
            return this;
        }

        public Builder setAllowedIssuanceModes(IssuanceModesResponse allowedIssuanceModes) {
            this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes);
            return this;
        }

        public Builder setAllowedLocationsAndOrganizations(List<SubjectResponse> allowedLocationsAndOrganizations) {
            this.allowedLocationsAndOrganizations = Objects.requireNonNull(allowedLocationsAndOrganizations);
            return this;
        }

        public Builder setAllowedSans(AllowedSubjectAltNamesResponse allowedSans) {
            this.allowedSans = Objects.requireNonNull(allowedSans);
            return this;
        }

        public Builder setMaximumLifetime(String maximumLifetime) {
            this.maximumLifetime = Objects.requireNonNull(maximumLifetime);
            return this;
        }

        public Builder setOverwriteConfigValues(ReusableConfigWrapperResponse overwriteConfigValues) {
            this.overwriteConfigValues = Objects.requireNonNull(overwriteConfigValues);
            return this;
        }

        public CertificateAuthorityPolicyResponse build() {
            return new CertificateAuthorityPolicyResponse(allowedCommonNames, allowedConfigList, allowedIssuanceModes, allowedLocationsAndOrganizations, allowedSans, maximumLifetime, overwriteConfigValues);
        }
    }
}
