// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single Zypper package repository. This repository is added to a repo file that is stored at `/etc/zypp/repos.d/google_osconfig.repo`.
 * 
 */
public final class ZypperRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final ZypperRepositoryResponse Empty = new ZypperRepositoryResponse();

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

    public ZypperRepositoryResponse(
        String baseUrl,
        String displayName,
        List<String> gpgKeys) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.gpgKeys = Objects.requireNonNull(gpgKeys, "expected parameter 'gpgKeys' to be non-null");
    }

    private ZypperRepositoryResponse() {
        this.baseUrl = null;
        this.displayName = null;
        this.gpgKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZypperRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private String displayName;
        private List<String> gpgKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ZypperRepositoryResponse defaults) {
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

        public ZypperRepositoryResponse build() {
            return new ZypperRepositoryResponse(baseUrl, displayName, gpgKeys);
        }
    }
}
