// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NotificationEndpointGrpcSettingsResponse {
    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
     */
    private final String authority;
    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
     */
    private final String endpoint;
    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
     */
    private final String payloadName;
    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
     */
    private final DurationResponse resendInterval;
    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
     */
    private final Integer retryDurationSec;

    @OutputCustomType.Constructor({"authority","endpoint","payloadName","resendInterval","retryDurationSec"})
    private NotificationEndpointGrpcSettingsResponse(
        String authority,
        String endpoint,
        String payloadName,
        DurationResponse resendInterval,
        Integer retryDurationSec) {
        this.authority = Objects.requireNonNull(authority);
        this.endpoint = Objects.requireNonNull(endpoint);
        this.payloadName = Objects.requireNonNull(payloadName);
        this.resendInterval = Objects.requireNonNull(resendInterval);
        this.retryDurationSec = Objects.requireNonNull(retryDurationSec);
    }

    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
     */
    public String getAuthority() {
        return this.authority;
    }
    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
     */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
     */
    public String getPayloadName() {
        return this.payloadName;
    }
    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
     */
    public DurationResponse getResendInterval() {
        return this.resendInterval;
    }
    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
     */
    public Integer getRetryDurationSec() {
        return this.retryDurationSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointGrpcSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authority;
        private String endpoint;
        private String payloadName;
        private DurationResponse resendInterval;
        private Integer retryDurationSec;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointGrpcSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.endpoint = defaults.endpoint;
    	      this.payloadName = defaults.payloadName;
    	      this.resendInterval = defaults.resendInterval;
    	      this.retryDurationSec = defaults.retryDurationSec;
        }

        public Builder setAuthority(String authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setPayloadName(String payloadName) {
            this.payloadName = Objects.requireNonNull(payloadName);
            return this;
        }

        public Builder setResendInterval(DurationResponse resendInterval) {
            this.resendInterval = Objects.requireNonNull(resendInterval);
            return this;
        }

        public Builder setRetryDurationSec(Integer retryDurationSec) {
            this.retryDurationSec = Objects.requireNonNull(retryDurationSec);
            return this;
        }

        public NotificationEndpointGrpcSettingsResponse build() {
            return new NotificationEndpointGrpcSettingsResponse(authority, endpoint, payloadName, resendInterval, retryDurationSec);
        }
    }
}
