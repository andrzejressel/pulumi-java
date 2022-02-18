// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertificateProviderInstanceResponse {
    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
     * 
     */
    private final String pluginInstance;

    @OutputCustomType.Constructor({"pluginInstance"})
    private CertificateProviderInstanceResponse(String pluginInstance) {
        this.pluginInstance = Objects.requireNonNull(pluginInstance);
    }

    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
     * 
     */
    public String getPluginInstance() {
        return this.pluginInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateProviderInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pluginInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateProviderInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pluginInstance = defaults.pluginInstance;
        }

        public Builder setPluginInstance(String pluginInstance) {
            this.pluginInstance = Objects.requireNonNull(pluginInstance);
            return this;
        }

        public CertificateProviderInstanceResponse build() {
            return new CertificateProviderInstanceResponse(pluginInstance);
        }
    }
}
