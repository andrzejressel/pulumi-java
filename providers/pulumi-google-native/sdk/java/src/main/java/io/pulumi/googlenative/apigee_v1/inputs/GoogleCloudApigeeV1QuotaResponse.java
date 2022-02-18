// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Quota contains the essential parameters needed that can be applied on the resources, methods, API source combination associated with this API product. While Quota is optional, setting it prevents requests from exceeding the provisioned parameters.
 * 
 */
public final class GoogleCloudApigeeV1QuotaResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1QuotaResponse Empty = new GoogleCloudApigeeV1QuotaResponse();

    /**
     * Time interval over which the number of request messages is calculated.
     * 
     */
    @InputImport(name="interval", required=true)
    private final String interval;

    public String getInterval() {
        return this.interval;
    }

    /**
     * Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
     * 
     */
    @InputImport(name="limit", required=true)
    private final String limit;

    public String getLimit() {
        return this.limit;
    }

    /**
     * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
     * 
     */
    @InputImport(name="timeUnit", required=true)
    private final String timeUnit;

    public String getTimeUnit() {
        return this.timeUnit;
    }

    public GoogleCloudApigeeV1QuotaResponse(
        String interval,
        String limit,
        String timeUnit) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.timeUnit = Objects.requireNonNull(timeUnit, "expected parameter 'timeUnit' to be non-null");
    }

    private GoogleCloudApigeeV1QuotaResponse() {
        this.interval = null;
        this.limit = null;
        this.timeUnit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interval;
        private String limit;
        private String timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QuotaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.limit = defaults.limit;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder setInterval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setLimit(String limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder setTimeUnit(String timeUnit) {
            this.timeUnit = Objects.requireNonNull(timeUnit);
            return this;
        }

        public GoogleCloudApigeeV1QuotaResponse build() {
            return new GoogleCloudApigeeV1QuotaResponse(interval, limit, timeUnit);
        }
    }
}
