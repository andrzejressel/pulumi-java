// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Subject describes parts of a distinguished name that, in turn, describes the subject of the certificate.
 * 
 */
public final class SubjectResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubjectResponse Empty = new SubjectResponse();

    /**
     * The country code of the subject.
     * 
     */
    @InputImport(name="countryCode", required=true)
    private final String countryCode;

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * The locality or city of the subject.
     * 
     */
    @InputImport(name="locality", required=true)
    private final String locality;

    public String getLocality() {
        return this.locality;
    }

    /**
     * The organization of the subject.
     * 
     */
    @InputImport(name="organization", required=true)
    private final String organization;

    public String getOrganization() {
        return this.organization;
    }

    /**
     * The organizational_unit of the subject.
     * 
     */
    @InputImport(name="organizationalUnit", required=true)
    private final String organizationalUnit;

    public String getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * The postal code of the subject.
     * 
     */
    @InputImport(name="postalCode", required=true)
    private final String postalCode;

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    @InputImport(name="province", required=true)
    private final String province;

    public String getProvince() {
        return this.province;
    }

    /**
     * The street address of the subject.
     * 
     */
    @InputImport(name="streetAddress", required=true)
    private final String streetAddress;

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public SubjectResponse(
        String countryCode,
        String locality,
        String organization,
        String organizationalUnit,
        String postalCode,
        String province,
        String streetAddress) {
        this.countryCode = Objects.requireNonNull(countryCode, "expected parameter 'countryCode' to be non-null");
        this.locality = Objects.requireNonNull(locality, "expected parameter 'locality' to be non-null");
        this.organization = Objects.requireNonNull(organization, "expected parameter 'organization' to be non-null");
        this.organizationalUnit = Objects.requireNonNull(organizationalUnit, "expected parameter 'organizationalUnit' to be non-null");
        this.postalCode = Objects.requireNonNull(postalCode, "expected parameter 'postalCode' to be non-null");
        this.province = Objects.requireNonNull(province, "expected parameter 'province' to be non-null");
        this.streetAddress = Objects.requireNonNull(streetAddress, "expected parameter 'streetAddress' to be non-null");
    }

    private SubjectResponse() {
        this.countryCode = null;
        this.locality = null;
        this.organization = null;
        this.organizationalUnit = null;
        this.postalCode = null;
        this.province = null;
        this.streetAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String countryCode;
        private String locality;
        private String organization;
        private String organizationalUnit;
        private String postalCode;
        private String province;
        private String streetAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.postalCode = defaults.postalCode;
    	      this.province = defaults.province;
    	      this.streetAddress = defaults.streetAddress;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder setLocality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }

        public Builder setOrganization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }

        public Builder setOrganizationalUnit(String organizationalUnit) {
            this.organizationalUnit = Objects.requireNonNull(organizationalUnit);
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }

        public Builder setProvince(String province) {
            this.province = Objects.requireNonNull(province);
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = Objects.requireNonNull(streetAddress);
            return this;
        }

        public SubjectResponse build() {
            return new SubjectResponse(countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
