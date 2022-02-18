// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationChannelSensitiveLabelsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationChannelSensitiveLabelsArgs Empty = new NotificationChannelSensitiveLabelsArgs();

    /**
     * An authorization token for a notification channel. Channel types that support this field include: slack
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="authToken")
    private final @Nullable Input<String> authToken;

    public Input<String> getAuthToken() {
        return this.authToken == null ? Input.empty() : this.authToken;
    }

    /**
     * An password for a notification channel. Channel types that support this field include: webhook_basicauth
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * An servicekey token for a notification channel. Channel types that support this field include: pagerduty
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="serviceKey")
    private final @Nullable Input<String> serviceKey;

    public Input<String> getServiceKey() {
        return this.serviceKey == null ? Input.empty() : this.serviceKey;
    }

    public NotificationChannelSensitiveLabelsArgs(
        @Nullable Input<String> authToken,
        @Nullable Input<String> password,
        @Nullable Input<String> serviceKey) {
        this.authToken = authToken;
        this.password = password;
        this.serviceKey = serviceKey;
    }

    private NotificationChannelSensitiveLabelsArgs() {
        this.authToken = Input.empty();
        this.password = Input.empty();
        this.serviceKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelSensitiveLabelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authToken;
        private @Nullable Input<String> password;
        private @Nullable Input<String> serviceKey;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelSensitiveLabelsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authToken = defaults.authToken;
    	      this.password = defaults.password;
    	      this.serviceKey = defaults.serviceKey;
        }

        public Builder setAuthToken(@Nullable Input<String> authToken) {
            this.authToken = authToken;
            return this;
        }

        public Builder setAuthToken(@Nullable String authToken) {
            this.authToken = Input.ofNullable(authToken);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setServiceKey(@Nullable Input<String> serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }

        public Builder setServiceKey(@Nullable String serviceKey) {
            this.serviceKey = Input.ofNullable(serviceKey);
            return this;
        }

        public NotificationChannelSensitiveLabelsArgs build() {
            return new NotificationChannelSensitiveLabelsArgs(authToken, password, serviceKey);
        }
    }
}
