// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2FulfillmentFeatureResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2FulfillmentResponse {
    /**
     * Optional. The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
     */
    private final String displayName;
    /**
     * Optional. Whether fulfillment is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * Optional. The field defines whether the fulfillment is enabled for certain features.
     * 
     */
    private final List<GoogleCloudDialogflowV2FulfillmentFeatureResponse> features;
    /**
     * Configuration for a generic web service.
     * 
     */
    private final GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse genericWebService;
    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"displayName","enabled","features","genericWebService","name"})
    private GoogleCloudDialogflowV2FulfillmentResponse(
        String displayName,
        Boolean enabled,
        List<GoogleCloudDialogflowV2FulfillmentFeatureResponse> features,
        GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse genericWebService,
        String name) {
        this.displayName = Objects.requireNonNull(displayName);
        this.enabled = Objects.requireNonNull(enabled);
        this.features = Objects.requireNonNull(features);
        this.genericWebService = Objects.requireNonNull(genericWebService);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Optional. The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Whether fulfillment is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Optional. The field defines whether the fulfillment is enabled for certain features.
     * 
     */
    public List<GoogleCloudDialogflowV2FulfillmentFeatureResponse> getFeatures() {
        return this.features;
    }
    /**
     * Configuration for a generic web service.
     * 
     */
    public GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse getGenericWebService() {
        return this.genericWebService;
    }
    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Boolean enabled;
        private List<GoogleCloudDialogflowV2FulfillmentFeatureResponse> features;
        private GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse genericWebService;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setFeatures(List<GoogleCloudDialogflowV2FulfillmentFeatureResponse> features) {
            this.features = Objects.requireNonNull(features);
            return this;
        }

        public Builder setGenericWebService(GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GoogleCloudDialogflowV2FulfillmentResponse build() {
            return new GoogleCloudDialogflowV2FulfillmentResponse(displayName, enabled, features, genericWebService, name);
        }
    }
}
