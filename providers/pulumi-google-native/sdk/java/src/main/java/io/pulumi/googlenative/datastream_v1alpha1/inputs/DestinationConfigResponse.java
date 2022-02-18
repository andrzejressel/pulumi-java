// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.GcsDestinationConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration of the stream destination.
 * 
 */
public final class DestinationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DestinationConfigResponse Empty = new DestinationConfigResponse();

    /**
     * Destination connection profile identifier.
     * 
     */
    @InputImport(name="destinationConnectionProfileName", required=true)
    private final String destinationConnectionProfileName;

    public String getDestinationConnectionProfileName() {
        return this.destinationConnectionProfileName;
    }

    /**
     * GCS destination configuration.
     * 
     */
    @InputImport(name="gcsDestinationConfig", required=true)
    private final GcsDestinationConfigResponse gcsDestinationConfig;

    public GcsDestinationConfigResponse getGcsDestinationConfig() {
        return this.gcsDestinationConfig;
    }

    public DestinationConfigResponse(
        String destinationConnectionProfileName,
        GcsDestinationConfigResponse gcsDestinationConfig) {
        this.destinationConnectionProfileName = Objects.requireNonNull(destinationConnectionProfileName, "expected parameter 'destinationConnectionProfileName' to be non-null");
        this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig, "expected parameter 'gcsDestinationConfig' to be non-null");
    }

    private DestinationConfigResponse() {
        this.destinationConnectionProfileName = null;
        this.gcsDestinationConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationConnectionProfileName;
        private GcsDestinationConfigResponse gcsDestinationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationConnectionProfileName = defaults.destinationConnectionProfileName;
    	      this.gcsDestinationConfig = defaults.gcsDestinationConfig;
        }

        public Builder setDestinationConnectionProfileName(String destinationConnectionProfileName) {
            this.destinationConnectionProfileName = Objects.requireNonNull(destinationConnectionProfileName);
            return this;
        }

        public Builder setGcsDestinationConfig(GcsDestinationConfigResponse gcsDestinationConfig) {
            this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig);
            return this;
        }

        public DestinationConfigResponse build() {
            return new DestinationConfigResponse(destinationConnectionProfileName, gcsDestinationConfig);
        }
    }
}
