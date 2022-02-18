// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single zypper package repository. These are added to a repo file that is managed at `/etc/zypp/repos.d/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceZypperRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceRepositoryResourceZypperRepositoryResponse Empty = new OSPolicyResourceRepositoryResourceZypperRepositoryResponse();

    /**
     * The location of the repository directory.
     * 
     */
    @InputImport(name="baseUrl", required=true)
    private final String baseUrl;

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @InputImport(name="gpgKeys", required=true)
    private final List<String> gpgKeys;

    public List<String> getGpgKeys() {
        return this.gpgKeys;
    }

    public OSPolicyResourceRepositoryResourceZypperRepositoryResponse(
        String baseUrl,
        String displayName,
        List<String> gpgKeys) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.gpgKeys = Objects.requireNonNull(gpgKeys, "expected parameter 'gpgKeys' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceZypperRepositoryResponse() {
        this.baseUrl = null;
        this.displayName = null;
        this.gpgKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceZypperRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private String displayName;
        private List<String> gpgKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceZypperRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGpgKeys(List<String> gpgKeys) {
            this.gpgKeys = Objects.requireNonNull(gpgKeys);
            return this;
        }

        public OSPolicyResourceRepositoryResourceZypperRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceZypperRepositoryResponse(baseUrl, displayName, gpgKeys);
        }
    }
}
