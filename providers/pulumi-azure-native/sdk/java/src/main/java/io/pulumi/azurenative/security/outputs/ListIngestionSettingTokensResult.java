// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListIngestionSettingTokensResult {
    /**
     * The token is used for correlating security data and logs with the resources in the subscription.
     * 
     */
    private final String token;

    @OutputCustomType.Constructor
    private ListIngestionSettingTokensResult(@OutputCustomType.Parameter("token") String token) {
        this.token = token;
    }

    /**
     * The token is used for correlating security data and logs with the resources in the subscription.
     * 
    */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIngestionSettingTokensResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIngestionSettingTokensResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public ListIngestionSettingTokensResult build() {
            return new ListIngestionSettingTokensResult(token);
        }
    }
}
