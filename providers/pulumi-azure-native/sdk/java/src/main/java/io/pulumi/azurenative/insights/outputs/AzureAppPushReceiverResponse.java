// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureAppPushReceiverResponse {
    /**
     * The email address registered for the Azure mobile app.
     * 
     */
    private final String emailAddress;
    /**
     * The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private AzureAppPushReceiverResponse(
        @OutputCustomType.Parameter("emailAddress") String emailAddress,
        @OutputCustomType.Parameter("name") String name) {
        this.emailAddress = emailAddress;
        this.name = name;
    }

    /**
     * The email address registered for the Azure mobile app.
     * 
    */
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureAppPushReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureAppPushReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AzureAppPushReceiverResponse build() {
            return new AzureAppPushReceiverResponse(emailAddress, name);
        }
    }
}
