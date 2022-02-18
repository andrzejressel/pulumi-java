// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceServerCaCert extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceServerCaCert Empty = new GetInstanceServerCaCert();

    @InputImport(name="cert", required=true)
    private final String cert;

    public String getCert() {
        return this.cert;
    }

    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="expireTime", required=true)
    private final String expireTime;

    public String getExpireTime() {
        return this.expireTime;
    }

    @InputImport(name="serialNumber", required=true)
    private final String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    @InputImport(name="sha1Fingerprint", required=true)
    private final String sha1Fingerprint;

    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public GetInstanceServerCaCert(
        String cert,
        String createTime,
        String expireTime,
        String serialNumber,
        String sha1Fingerprint) {
        this.cert = Objects.requireNonNull(cert, "expected parameter 'cert' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
        this.serialNumber = Objects.requireNonNull(serialNumber, "expected parameter 'serialNumber' to be non-null");
        this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
    }

    private GetInstanceServerCaCert() {
        this.cert = null;
        this.createTime = null;
        this.expireTime = null;
        this.serialNumber = null;
        this.sha1Fingerprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServerCaCert defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cert;
        private String createTime;
        private String expireTime;
        private String serialNumber;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceServerCaCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder setCert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setSha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }

        public GetInstanceServerCaCert build() {
            return new GetInstanceServerCaCert(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
