// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OsConstraintResponse {
    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
     * 
     */
    private final String minimumVersion;
    /**
     * The allowed OS type.
     * 
     */
    private final String osType;
    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    private final Boolean requireVerifiedChromeOs;

    @OutputCustomType.Constructor({"minimumVersion","osType","requireVerifiedChromeOs"})
    private OsConstraintResponse(
        String minimumVersion,
        String osType,
        Boolean requireVerifiedChromeOs) {
        this.minimumVersion = Objects.requireNonNull(minimumVersion);
        this.osType = Objects.requireNonNull(osType);
        this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs);
    }

    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
     * 
     */
    public String getMinimumVersion() {
        return this.minimumVersion;
    }
    /**
     * The allowed OS type.
     * 
     */
    public String getOsType() {
        return this.osType;
    }
    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    public Boolean getRequireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minimumVersion;
        private String osType;
        private Boolean requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(OsConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder setMinimumVersion(String minimumVersion) {
            this.minimumVersion = Objects.requireNonNull(minimumVersion);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setRequireVerifiedChromeOs(Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs);
            return this;
        }

        public OsConstraintResponse build() {
            return new OsConstraintResponse(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}
