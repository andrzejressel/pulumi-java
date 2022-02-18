// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ExternalRefResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LicenseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * PackageInfoNote represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 * 
 */
public final class PackageInfoNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageInfoNoteResponse Empty = new PackageInfoNoteResponse();

    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
     * 
     */
    @InputImport(name="analyzed", required=true)
    private final Boolean analyzed;

    public Boolean getAnalyzed() {
        return this.analyzed;
    }

    /**
     * A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    @InputImport(name="attribution", required=true)
    private final String attribution;

    public String getAttribution() {
        return this.attribution;
    }

    /**
     * Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
     * 
     */
    @InputImport(name="checksum", required=true)
    private final String checksum;

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Identify the copyright holders of the package, as well as any dates present
     * 
     */
    @InputImport(name="copyright", required=true)
    private final String copyright;

    public String getCopyright() {
        return this.copyright;
    }

    /**
     * A more detailed description of the package
     * 
     */
    @InputImport(name="detailedDescription", required=true)
    private final String detailedDescription;

    public String getDetailedDescription() {
        return this.detailedDescription;
    }

    /**
     * This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
     * 
     */
    @InputImport(name="downloadLocation", required=true)
    private final String downloadLocation;

    public String getDownloadLocation() {
        return this.downloadLocation;
    }

    /**
     * ExternalRef
     * 
     */
    @InputImport(name="externalRefs", required=true)
    private final List<ExternalRefResponse> externalRefs;

    public List<ExternalRefResponse> getExternalRefs() {
        return this.externalRefs;
    }

    /**
     * Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
     * 
     */
    @InputImport(name="filesLicenseInfo", required=true)
    private final List<String> filesLicenseInfo;

    public List<String> getFilesLicenseInfo() {
        return this.filesLicenseInfo;
    }

    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package's home page
     * 
     */
    @InputImport(name="homePage", required=true)
    private final String homePage;

    public String getHomePage() {
        return this.homePage;
    }

    /**
     * List the licenses that have been declared by the authors of the package
     * 
     */
    @InputImport(name="licenseDeclared", required=true)
    private final LicenseResponse licenseDeclared;

    public LicenseResponse getLicenseDeclared() {
        return this.licenseDeclared;
    }

    /**
     * If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
     * 
     */
    @InputImport(name="originator", required=true)
    private final String originator;

    public String getOriginator() {
        return this.originator;
    }

    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    @InputImport(name="packageType", required=true)
    private final String packageType;

    public String getPackageType() {
        return this.packageType;
    }

    /**
     * A short description of the package
     * 
     */
    @InputImport(name="summaryDescription", required=true)
    private final String summaryDescription;

    public String getSummaryDescription() {
        return this.summaryDescription;
    }

    /**
     * Identify the actual distribution source for the package/directory identified in the SPDX file
     * 
     */
    @InputImport(name="supplier", required=true)
    private final String supplier;

    public String getSupplier() {
        return this.supplier;
    }

    /**
     * Identify the full name of the package as given by the Package Originator
     * 
     */
    @InputImport(name="title", required=true)
    private final String title;

    public String getTitle() {
        return this.title;
    }

    /**
     * This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
     * 
     */
    @InputImport(name="verificationCode", required=true)
    private final String verificationCode;

    public String getVerificationCode() {
        return this.verificationCode;
    }

    /**
     * Identify the version of the package
     * 
     */
    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public PackageInfoNoteResponse(
        Boolean analyzed,
        String attribution,
        String checksum,
        String copyright,
        String detailedDescription,
        String downloadLocation,
        List<ExternalRefResponse> externalRefs,
        List<String> filesLicenseInfo,
        String homePage,
        LicenseResponse licenseDeclared,
        String originator,
        String packageType,
        String summaryDescription,
        String supplier,
        String title,
        String verificationCode,
        String version) {
        this.analyzed = Objects.requireNonNull(analyzed, "expected parameter 'analyzed' to be non-null");
        this.attribution = Objects.requireNonNull(attribution, "expected parameter 'attribution' to be non-null");
        this.checksum = Objects.requireNonNull(checksum, "expected parameter 'checksum' to be non-null");
        this.copyright = Objects.requireNonNull(copyright, "expected parameter 'copyright' to be non-null");
        this.detailedDescription = Objects.requireNonNull(detailedDescription, "expected parameter 'detailedDescription' to be non-null");
        this.downloadLocation = Objects.requireNonNull(downloadLocation, "expected parameter 'downloadLocation' to be non-null");
        this.externalRefs = Objects.requireNonNull(externalRefs, "expected parameter 'externalRefs' to be non-null");
        this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo, "expected parameter 'filesLicenseInfo' to be non-null");
        this.homePage = Objects.requireNonNull(homePage, "expected parameter 'homePage' to be non-null");
        this.licenseDeclared = Objects.requireNonNull(licenseDeclared, "expected parameter 'licenseDeclared' to be non-null");
        this.originator = Objects.requireNonNull(originator, "expected parameter 'originator' to be non-null");
        this.packageType = Objects.requireNonNull(packageType, "expected parameter 'packageType' to be non-null");
        this.summaryDescription = Objects.requireNonNull(summaryDescription, "expected parameter 'summaryDescription' to be non-null");
        this.supplier = Objects.requireNonNull(supplier, "expected parameter 'supplier' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.verificationCode = Objects.requireNonNull(verificationCode, "expected parameter 'verificationCode' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private PackageInfoNoteResponse() {
        this.analyzed = null;
        this.attribution = null;
        this.checksum = null;
        this.copyright = null;
        this.detailedDescription = null;
        this.downloadLocation = null;
        this.externalRefs = List.of();
        this.filesLicenseInfo = List.of();
        this.homePage = null;
        this.licenseDeclared = null;
        this.originator = null;
        this.packageType = null;
        this.summaryDescription = null;
        this.supplier = null;
        this.title = null;
        this.verificationCode = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean analyzed;
        private String attribution;
        private String checksum;
        private String copyright;
        private String detailedDescription;
        private String downloadLocation;
        private List<ExternalRefResponse> externalRefs;
        private List<String> filesLicenseInfo;
        private String homePage;
        private LicenseResponse licenseDeclared;
        private String originator;
        private String packageType;
        private String summaryDescription;
        private String supplier;
        private String title;
        private String verificationCode;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzed = defaults.analyzed;
    	      this.attribution = defaults.attribution;
    	      this.checksum = defaults.checksum;
    	      this.copyright = defaults.copyright;
    	      this.detailedDescription = defaults.detailedDescription;
    	      this.downloadLocation = defaults.downloadLocation;
    	      this.externalRefs = defaults.externalRefs;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.homePage = defaults.homePage;
    	      this.licenseDeclared = defaults.licenseDeclared;
    	      this.originator = defaults.originator;
    	      this.packageType = defaults.packageType;
    	      this.summaryDescription = defaults.summaryDescription;
    	      this.supplier = defaults.supplier;
    	      this.title = defaults.title;
    	      this.verificationCode = defaults.verificationCode;
    	      this.version = defaults.version;
        }

        public Builder setAnalyzed(Boolean analyzed) {
            this.analyzed = Objects.requireNonNull(analyzed);
            return this;
        }

        public Builder setAttribution(String attribution) {
            this.attribution = Objects.requireNonNull(attribution);
            return this;
        }

        public Builder setChecksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }

        public Builder setCopyright(String copyright) {
            this.copyright = Objects.requireNonNull(copyright);
            return this;
        }

        public Builder setDetailedDescription(String detailedDescription) {
            this.detailedDescription = Objects.requireNonNull(detailedDescription);
            return this;
        }

        public Builder setDownloadLocation(String downloadLocation) {
            this.downloadLocation = Objects.requireNonNull(downloadLocation);
            return this;
        }

        public Builder setExternalRefs(List<ExternalRefResponse> externalRefs) {
            this.externalRefs = Objects.requireNonNull(externalRefs);
            return this;
        }

        public Builder setFilesLicenseInfo(List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo);
            return this;
        }

        public Builder setHomePage(String homePage) {
            this.homePage = Objects.requireNonNull(homePage);
            return this;
        }

        public Builder setLicenseDeclared(LicenseResponse licenseDeclared) {
            this.licenseDeclared = Objects.requireNonNull(licenseDeclared);
            return this;
        }

        public Builder setOriginator(String originator) {
            this.originator = Objects.requireNonNull(originator);
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder setSummaryDescription(String summaryDescription) {
            this.summaryDescription = Objects.requireNonNull(summaryDescription);
            return this;
        }

        public Builder setSupplier(String supplier) {
            this.supplier = Objects.requireNonNull(supplier);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setVerificationCode(String verificationCode) {
            this.verificationCode = Objects.requireNonNull(verificationCode);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public PackageInfoNoteResponse build() {
            return new PackageInfoNoteResponse(analyzed, attribution, checksum, copyright, detailedDescription, downloadLocation, externalRefs, filesLicenseInfo, homePage, licenseDeclared, originator, packageType, summaryDescription, supplier, title, verificationCode, version);
        }
    }
}
