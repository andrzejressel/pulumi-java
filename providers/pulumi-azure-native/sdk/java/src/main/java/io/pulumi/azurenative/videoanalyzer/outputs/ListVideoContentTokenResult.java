// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListVideoContentTokenResult {
    /**
     * The content token expiration date in ISO8601 format (eg. 2021-01-01T00:00:00Z).
     * 
     */
    private final String expirationDate;
    /**
     * The content token value to be added to the video content URL as the value for the "token" query string parameter. The token is specific to a single video.
     * 
     */
    private final String token;

    @OutputCustomType.Constructor
    private ListVideoContentTokenResult(
        @OutputCustomType.Parameter("expirationDate") String expirationDate,
        @OutputCustomType.Parameter("token") String token) {
        this.expirationDate = expirationDate;
        this.token = token;
    }

    /**
     * The content token expiration date in ISO8601 format (eg. 2021-01-01T00:00:00Z).
     * 
    */
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The content token value to be added to the video content URL as the value for the "token" query string parameter. The token is specific to a single video.
     * 
    */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListVideoContentTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ListVideoContentTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.token = defaults.token;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public ListVideoContentTokenResult build() {
            return new ListVideoContentTokenResult(expirationDate, token);
        }
    }
}
