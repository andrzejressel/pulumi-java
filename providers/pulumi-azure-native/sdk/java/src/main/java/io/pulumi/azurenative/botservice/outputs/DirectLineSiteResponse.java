// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectLineSiteResponse {
    /**
     * Whether this site is enabled for block user upload.
     * 
     */
    private final @Nullable Boolean isBlockUserUploadEnabled;
    /**
     * Whether this site is enabled for DirectLine channel.
     * 
     */
    private final Boolean isEnabled;
    /**
     * Whether this site is enabled for authentication with Bot Framework.
     * 
     */
    private final @Nullable Boolean isSecureSiteEnabled;
    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    private final Boolean isV1Enabled;
    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    private final Boolean isV3Enabled;
    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final String key;
    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final String key2;
    /**
     * Site Id
     * 
     */
    private final String siteId;
    /**
     * Site name
     * 
     */
    private final String siteName;
    /**
     * List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
     */
    private final @Nullable List<String> trustedOrigins;

    @OutputCustomType.Constructor
    private DirectLineSiteResponse(
        @OutputCustomType.Parameter("isBlockUserUploadEnabled") @Nullable Boolean isBlockUserUploadEnabled,
        @OutputCustomType.Parameter("isEnabled") Boolean isEnabled,
        @OutputCustomType.Parameter("isSecureSiteEnabled") @Nullable Boolean isSecureSiteEnabled,
        @OutputCustomType.Parameter("isV1Enabled") Boolean isV1Enabled,
        @OutputCustomType.Parameter("isV3Enabled") Boolean isV3Enabled,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("key2") String key2,
        @OutputCustomType.Parameter("siteId") String siteId,
        @OutputCustomType.Parameter("siteName") String siteName,
        @OutputCustomType.Parameter("trustedOrigins") @Nullable List<String> trustedOrigins) {
        this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
        this.isEnabled = isEnabled;
        this.isSecureSiteEnabled = isSecureSiteEnabled;
        this.isV1Enabled = isV1Enabled;
        this.isV3Enabled = isV3Enabled;
        this.key = key;
        this.key2 = key2;
        this.siteId = siteId;
        this.siteName = siteName;
        this.trustedOrigins = trustedOrigins;
    }

    /**
     * Whether this site is enabled for block user upload.
     * 
    */
    public Optional<Boolean> getIsBlockUserUploadEnabled() {
        return Optional.ofNullable(this.isBlockUserUploadEnabled);
    }
    /**
     * Whether this site is enabled for DirectLine channel.
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Whether this site is enabled for authentication with Bot Framework.
     * 
    */
    public Optional<Boolean> getIsSecureSiteEnabled() {
        return Optional.ofNullable(this.isSecureSiteEnabled);
    }
    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
    */
    public Boolean getIsV1Enabled() {
        return this.isV1Enabled;
    }
    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
    */
    public Boolean getIsV3Enabled() {
        return this.isV3Enabled;
    }
    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
    */
    public String getKey2() {
        return this.key2;
    }
    /**
     * Site Id
     * 
    */
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Site name
     * 
    */
    public String getSiteName() {
        return this.siteName;
    }
    /**
     * List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
    */
    public List<String> getTrustedOrigins() {
        return this.trustedOrigins == null ? List.of() : this.trustedOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isBlockUserUploadEnabled;
        private Boolean isEnabled;
        private @Nullable Boolean isSecureSiteEnabled;
        private Boolean isV1Enabled;
        private Boolean isV3Enabled;
        private String key;
        private String key2;
        private String siteId;
        private String siteName;
        private @Nullable List<String> trustedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSiteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isBlockUserUploadEnabled = defaults.isBlockUserUploadEnabled;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isSecureSiteEnabled = defaults.isSecureSiteEnabled;
    	      this.isV1Enabled = defaults.isV1Enabled;
    	      this.isV3Enabled = defaults.isV3Enabled;
    	      this.key = defaults.key;
    	      this.key2 = defaults.key2;
    	      this.siteId = defaults.siteId;
    	      this.siteName = defaults.siteName;
    	      this.trustedOrigins = defaults.trustedOrigins;
        }

        public Builder setIsBlockUserUploadEnabled(@Nullable Boolean isBlockUserUploadEnabled) {
            this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsSecureSiteEnabled(@Nullable Boolean isSecureSiteEnabled) {
            this.isSecureSiteEnabled = isSecureSiteEnabled;
            return this;
        }

        public Builder setIsV1Enabled(Boolean isV1Enabled) {
            this.isV1Enabled = Objects.requireNonNull(isV1Enabled);
            return this;
        }

        public Builder setIsV3Enabled(Boolean isV3Enabled) {
            this.isV3Enabled = Objects.requireNonNull(isV3Enabled);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey2(String key2) {
            this.key2 = Objects.requireNonNull(key2);
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public Builder setSiteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }

        public Builder setTrustedOrigins(@Nullable List<String> trustedOrigins) {
            this.trustedOrigins = trustedOrigins;
            return this;
        }
        public DirectLineSiteResponse build() {
            return new DirectLineSiteResponse(isBlockUserUploadEnabled, isEnabled, isSecureSiteEnabled, isV1Enabled, isV3Enabled, key, key2, siteId, siteName, trustedOrigins);
        }
    }
}
