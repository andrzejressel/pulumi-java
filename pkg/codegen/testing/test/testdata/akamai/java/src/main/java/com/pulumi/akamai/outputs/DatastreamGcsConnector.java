// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatastreamGcsConnector {
    private String bucket;
    private @Nullable Boolean compressLogs;
    private String displayName;
    private @Nullable String path;
    private String privateKey;
    private String projectId;
    private String serviceAccountName;

    private DatastreamGcsConnector() {}
    public String bucket() {
        return this.bucket;
    }
    public Optional<Boolean> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }
    public String displayName() {
        return this.displayName;
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public String privateKey() {
        return this.privateKey;
    }
    public String projectId() {
        return this.projectId;
    }
    public String serviceAccountName() {
        return this.serviceAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastreamGcsConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private @Nullable Boolean compressLogs;
        private String displayName;
        private @Nullable String path;
        private String privateKey;
        private String projectId;
        private String serviceAccountName;
        public Builder() {}
        public Builder(DatastreamGcsConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.compressLogs = defaults.compressLogs;
    	      this.displayName = defaults.displayName;
    	      this.path = defaults.path;
    	      this.privateKey = defaults.privateKey;
    	      this.projectId = defaults.projectId;
    	      this.serviceAccountName = defaults.serviceAccountName;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder compressLogs(@Nullable Boolean compressLogs) {
            this.compressLogs = compressLogs;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = Objects.requireNonNull(serviceAccountName);
            return this;
        }
        public DatastreamGcsConnector build() {
            final var _resultValue = new DatastreamGcsConnector();
            _resultValue.bucket = bucket;
            _resultValue.compressLogs = compressLogs;
            _resultValue.displayName = displayName;
            _resultValue.path = path;
            _resultValue.privateKey = privateKey;
            _resultValue.projectId = projectId;
            _resultValue.serviceAccountName = serviceAccountName;
            return _resultValue;
        }
    }
}
