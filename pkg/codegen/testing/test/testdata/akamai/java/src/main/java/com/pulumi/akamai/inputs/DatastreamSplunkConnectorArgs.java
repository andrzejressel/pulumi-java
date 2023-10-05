// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamSplunkConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamSplunkConnectorArgs Empty = new DatastreamSplunkConnectorArgs();

    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    @Import(name="compressLogs")
    private @Nullable Output<Boolean> compressLogs;

    public Optional<Output<Boolean>> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }

    @Import(name="customHeaderName")
    private @Nullable Output<String> customHeaderName;

    public Optional<Output<String>> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    @Import(name="customHeaderValue")
    private @Nullable Output<String> customHeaderValue;

    public Optional<Output<String>> customHeaderValue() {
        return Optional.ofNullable(this.customHeaderValue);
    }

    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }

    @Import(name="eventCollectorToken", required=true)
    private Output<String> eventCollectorToken;

    public Output<String> eventCollectorToken() {
        return this.eventCollectorToken;
    }

    @Import(name="mTls")
    private @Nullable Output<Boolean> mTls;

    public Optional<Output<Boolean>> mTls() {
        return Optional.ofNullable(this.mTls);
    }

    @Import(name="tlsHostname")
    private @Nullable Output<String> tlsHostname;

    public Optional<Output<String>> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }

    private DatastreamSplunkConnectorArgs() {}

    private DatastreamSplunkConnectorArgs(DatastreamSplunkConnectorArgs $) {
        this.caCert = $.caCert;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.compressLogs = $.compressLogs;
        this.customHeaderName = $.customHeaderName;
        this.customHeaderValue = $.customHeaderValue;
        this.displayName = $.displayName;
        this.endpoint = $.endpoint;
        this.eventCollectorToken = $.eventCollectorToken;
        this.mTls = $.mTls;
        this.tlsHostname = $.tlsHostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamSplunkConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamSplunkConnectorArgs $;

        public Builder() {
            $ = new DatastreamSplunkConnectorArgs();
        }

        public Builder(DatastreamSplunkConnectorArgs defaults) {
            $ = new DatastreamSplunkConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        public Builder compressLogs(@Nullable Output<Boolean> compressLogs) {
            $.compressLogs = compressLogs;
            return this;
        }

        public Builder compressLogs(Boolean compressLogs) {
            return compressLogs(Output.of(compressLogs));
        }

        public Builder customHeaderName(@Nullable Output<String> customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        public Builder customHeaderName(String customHeaderName) {
            return customHeaderName(Output.of(customHeaderName));
        }

        public Builder customHeaderValue(@Nullable Output<String> customHeaderValue) {
            $.customHeaderValue = customHeaderValue;
            return this;
        }

        public Builder customHeaderValue(String customHeaderValue) {
            return customHeaderValue(Output.of(customHeaderValue));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder eventCollectorToken(Output<String> eventCollectorToken) {
            $.eventCollectorToken = eventCollectorToken;
            return this;
        }

        public Builder eventCollectorToken(String eventCollectorToken) {
            return eventCollectorToken(Output.of(eventCollectorToken));
        }

        public Builder mTls(@Nullable Output<Boolean> mTls) {
            $.mTls = mTls;
            return this;
        }

        public Builder mTls(Boolean mTls) {
            return mTls(Output.of(mTls));
        }

        public Builder tlsHostname(@Nullable Output<String> tlsHostname) {
            $.tlsHostname = tlsHostname;
            return this;
        }

        public Builder tlsHostname(String tlsHostname) {
            return tlsHostname(Output.of(tlsHostname));
        }

        public DatastreamSplunkConnectorArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.eventCollectorToken = Objects.requireNonNull($.eventCollectorToken, "expected parameter 'eventCollectorToken' to be non-null");
            return $;
        }
    }

}
