// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceServerCaCert {
    private final @Nullable String cert;
    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    private final @Nullable String createTime;
    private final @Nullable String expireTime;
    private final @Nullable String serialNumber;
    private final @Nullable String sha1Fingerprint;

    @OutputCustomType.Constructor({"cert","createTime","expireTime","serialNumber","sha1Fingerprint"})
    private InstanceServerCaCert(
        @Nullable String cert,
        @Nullable String createTime,
        @Nullable String expireTime,
        @Nullable String serialNumber,
        @Nullable String sha1Fingerprint) {
        this.cert = cert;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.serialNumber = serialNumber;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    public Optional<String> getCert() {
        return Optional.ofNullable(this.cert);
    }
    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> getExpireTime() {
        return Optional.ofNullable(this.expireTime);
    }
    public Optional<String> getSerialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    public Optional<String> getSha1Fingerprint() {
        return Optional.ofNullable(this.sha1Fingerprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceServerCaCert defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cert;
        private @Nullable String createTime;
        private @Nullable String expireTime;
        private @Nullable String serialNumber;
        private @Nullable String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceServerCaCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setExpireTime(@Nullable String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setSerialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public InstanceServerCaCert build() {
            return new InstanceServerCaCert(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
