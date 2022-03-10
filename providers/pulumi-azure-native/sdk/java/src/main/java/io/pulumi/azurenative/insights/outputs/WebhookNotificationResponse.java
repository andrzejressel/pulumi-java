// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookNotificationResponse {
    /**
     * a property bag of settings. This value can be empty.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * the service address to receive the notification.
     * 
     */
    private final @Nullable String serviceUri;

    @OutputCustomType.Constructor
    private WebhookNotificationResponse(
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("serviceUri") @Nullable String serviceUri) {
        this.properties = properties;
        this.serviceUri = serviceUri;
    }

    /**
     * a property bag of settings. This value can be empty.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * the service address to receive the notification.
     * 
    */
    public Optional<String> getServiceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> properties;
        private @Nullable String serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setServiceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }
        public WebhookNotificationResponse build() {
            return new WebhookNotificationResponse(properties, serviceUri);
        }
    }
}
