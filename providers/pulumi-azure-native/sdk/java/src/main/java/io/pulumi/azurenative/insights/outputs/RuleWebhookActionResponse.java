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
public final class RuleWebhookActionResponse {
    /**
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleWebhookAction'.
     * 
     */
    private final String odataType;
    /**
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * the service uri to Post the notification when the alert activates or resolves.
     * 
     */
    private final @Nullable String serviceUri;

    @OutputCustomType.Constructor
    private RuleWebhookActionResponse(
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("serviceUri") @Nullable String serviceUri) {
        this.odataType = odataType;
        this.properties = properties;
        this.serviceUri = serviceUri;
    }

    /**
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleWebhookAction'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * the service uri to Post the notification when the alert activates or resolves.
     * 
    */
    public Optional<String> getServiceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleWebhookActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private @Nullable Map<String,String> properties;
        private @Nullable String serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleWebhookActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.properties = defaults.properties;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setServiceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }
        public RuleWebhookActionResponse build() {
            return new RuleWebhookActionResponse(odataType, properties, serviceUri);
        }
    }
}
