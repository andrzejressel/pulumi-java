// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceServerCaCert {
    private final @Nullable String cert;
    private final @Nullable String commonName;
    private final @Nullable String createTime;
    /**
     * The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    private final @Nullable String expirationTime;
    private final @Nullable String sha1Fingerprint;

    @OutputCustomType.Constructor({"cert","commonName","createTime","expirationTime","sha1Fingerprint"})
    private DatabaseInstanceServerCaCert(
        @Nullable String cert,
        @Nullable String commonName,
        @Nullable String createTime,
        @Nullable String expirationTime,
        @Nullable String sha1Fingerprint) {
        this.cert = cert;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    public Optional<String> getCert() {
        return Optional.ofNullable(this.cert);
    }
    public Optional<String> getCommonName() {
        return Optional.ofNullable(this.commonName);
    }
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    /**
     * The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    public Optional<String> getExpirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }
    public Optional<String> getSha1Fingerprint() {
        return Optional.ofNullable(this.sha1Fingerprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceServerCaCert defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cert;
        private @Nullable String commonName;
        private @Nullable String createTime;
        private @Nullable String expirationTime;
        private @Nullable String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceServerCaCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public DatabaseInstanceServerCaCert build() {
            return new DatabaseInstanceServerCaCert(cert, commonName, createTime, expirationTime, sha1Fingerprint);
        }
    }
}
