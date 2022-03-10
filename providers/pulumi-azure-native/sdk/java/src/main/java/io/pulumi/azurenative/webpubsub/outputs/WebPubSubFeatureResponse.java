// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebPubSubFeatureResponse {
    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     *  - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     *  - EnableMessagingLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     *  - EnableLiveTrace: Live Trace allows you to know what's happening inside Azure SignalR service, it will give you live traces in real time, it will be helpful when you developing your own Azure SignalR based web application or self-troubleshooting some issues. Please note that live traces are counted as outbound messages that will be charged. Values allowed: "true"/"false", to enable/disable live trace feature.
     * 
     */
    private final String flag;
    /**
     * Optional properties related to this feature.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private WebPubSubFeatureResponse(
        @OutputCustomType.Parameter("flag") String flag,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("value") String value) {
        this.flag = flag;
        this.properties = properties;
        this.value = value;
    }

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     *  - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     *  - EnableMessagingLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     *  - EnableLiveTrace: Live Trace allows you to know what's happening inside Azure SignalR service, it will give you live traces in real time, it will be helpful when you developing your own Azure SignalR based web application or self-troubleshooting some issues. Please note that live traces are counted as outbound messages that will be charged. Values allowed: "true"/"false", to enable/disable live trace feature.
     * 
    */
    public String getFlag() {
        return this.flag;
    }
    /**
     * Optional properties related to this feature.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flag;
        private @Nullable Map<String,String> properties;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flag = defaults.flag;
    	      this.properties = defaults.properties;
    	      this.value = defaults.value;
        }

        public Builder setFlag(String flag) {
            this.flag = Objects.requireNonNull(flag);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public WebPubSubFeatureResponse build() {
            return new WebPubSubFeatureResponse(flag, properties, value);
        }
    }
}
