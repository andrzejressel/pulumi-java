// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for the Integration add-on.
 * 
 */
public final class GoogleCloudApigeeV1IntegrationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1IntegrationConfigResponse Empty = new GoogleCloudApigeeV1IntegrationConfigResponse();

    /**
     * Flag that specifies whether the Integration add-on is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GoogleCloudApigeeV1IntegrationConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GoogleCloudApigeeV1IntegrationConfigResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1IntegrationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1IntegrationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public GoogleCloudApigeeV1IntegrationConfigResponse build() {
            return new GoogleCloudApigeeV1IntegrationConfigResponse(enabled);
        }
    }
}
