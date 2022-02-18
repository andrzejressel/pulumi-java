// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DistributionResponse {
    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    private final String architecture;
    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    private final String cpeUri;
    /**
     * The distribution channel-specific description of this package.
     * 
     */
    private final String description;
    /**
     * The latest available version of this package in this distribution channel.
     * 
     */
    private final VersionResponse latestVersion;
    /**
     * A freeform string denoting the maintainer of this package.
     * 
     */
    private final String maintainer;
    /**
     * The distribution channel-specific homepage for this package.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"architecture","cpeUri","description","latestVersion","maintainer","url"})
    private DistributionResponse(
        String architecture,
        String cpeUri,
        String description,
        VersionResponse latestVersion,
        String maintainer,
        String url) {
        this.architecture = Objects.requireNonNull(architecture);
        this.cpeUri = Objects.requireNonNull(cpeUri);
        this.description = Objects.requireNonNull(description);
        this.latestVersion = Objects.requireNonNull(latestVersion);
        this.maintainer = Objects.requireNonNull(maintainer);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    public String getArchitecture() {
        return this.architecture;
    }
    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    public String getCpeUri() {
        return this.cpeUri;
    }
    /**
     * The distribution channel-specific description of this package.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The latest available version of this package in this distribution channel.
     * 
     */
    public VersionResponse getLatestVersion() {
        return this.latestVersion;
    }
    /**
     * A freeform string denoting the maintainer of this package.
     * 
     */
    public String getMaintainer() {
        return this.maintainer;
    }
    /**
     * The distribution channel-specific homepage for this package.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String cpeUri;
        private String description;
        private VersionResponse latestVersion;
        private String maintainer;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.latestVersion = defaults.latestVersion;
    	      this.maintainer = defaults.maintainer;
    	      this.url = defaults.url;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLatestVersion(VersionResponse latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }

        public Builder setMaintainer(String maintainer) {
            this.maintainer = Objects.requireNonNull(maintainer);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public DistributionResponse build() {
            return new DistributionResponse(architecture, cpeUri, description, latestVersion, maintainer, url);
        }
    }
}
