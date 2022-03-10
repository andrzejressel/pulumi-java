// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendPoolsSettingsResponse {
    /**
     * Whether to enforce certificate name check on HTTPS requests to all backend pools. No effect on non-HTTPS requests.
     * 
     */
    private final @Nullable String enforceCertificateNameCheck;
    /**
     * Send and receive timeout on forwarding request to the backend. When timeout is reached, the request fails and returns.
     * 
     */
    private final @Nullable Integer sendRecvTimeoutSeconds;

    @OutputCustomType.Constructor
    private BackendPoolsSettingsResponse(
        @OutputCustomType.Parameter("enforceCertificateNameCheck") @Nullable String enforceCertificateNameCheck,
        @OutputCustomType.Parameter("sendRecvTimeoutSeconds") @Nullable Integer sendRecvTimeoutSeconds) {
        this.enforceCertificateNameCheck = enforceCertificateNameCheck;
        this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
    }

    /**
     * Whether to enforce certificate name check on HTTPS requests to all backend pools. No effect on non-HTTPS requests.
     * 
    */
    public Optional<String> getEnforceCertificateNameCheck() {
        return Optional.ofNullable(this.enforceCertificateNameCheck);
    }
    /**
     * Send and receive timeout on forwarding request to the backend. When timeout is reached, the request fails and returns.
     * 
    */
    public Optional<Integer> getSendRecvTimeoutSeconds() {
        return Optional.ofNullable(this.sendRecvTimeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPoolsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enforceCertificateNameCheck;
        private @Nullable Integer sendRecvTimeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPoolsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceCertificateNameCheck = defaults.enforceCertificateNameCheck;
    	      this.sendRecvTimeoutSeconds = defaults.sendRecvTimeoutSeconds;
        }

        public Builder setEnforceCertificateNameCheck(@Nullable String enforceCertificateNameCheck) {
            this.enforceCertificateNameCheck = enforceCertificateNameCheck;
            return this;
        }

        public Builder setSendRecvTimeoutSeconds(@Nullable Integer sendRecvTimeoutSeconds) {
            this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
            return this;
        }
        public BackendPoolsSettingsResponse build() {
            return new BackendPoolsSettingsResponse(enforceCertificateNameCheck, sendRecvTimeoutSeconds);
        }
    }
}
