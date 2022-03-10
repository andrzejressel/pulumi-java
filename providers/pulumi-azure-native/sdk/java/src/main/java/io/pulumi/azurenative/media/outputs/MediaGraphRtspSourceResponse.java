// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.MediaGraphClearEndpointResponse;
import io.pulumi.azurenative.media.outputs.MediaGraphTlsEndpointResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MediaGraphRtspSourceResponse {
    /**
     * RTSP endpoint of the stream being connected to.
     * 
     */
    private final Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint;
    /**
     * Source name.
     * 
     */
    private final String name;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphRtspSource'.
     * 
     */
    private final String odataType;
    /**
     * Underlying RTSP transport. This can be used to enable or disable HTTP tunneling.
     * 
     */
    private final String transport;

    @OutputCustomType.Constructor
    private MediaGraphRtspSourceResponse(
        @OutputCustomType.Parameter("endpoint") Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("transport") String transport) {
        this.endpoint = endpoint;
        this.name = name;
        this.odataType = odataType;
        this.transport = transport;
    }

    /**
     * RTSP endpoint of the stream being connected to.
     * 
    */
    public Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> getEndpoint() {
        return this.endpoint;
    }
    /**
     * Source name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphRtspSource'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Underlying RTSP transport. This can be used to enable or disable HTTP tunneling.
     * 
    */
    public String getTransport() {
        return this.transport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphRtspSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint;
        private String name;
        private String odataType;
        private String transport;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphRtspSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
    	      this.odataType = defaults.odataType;
    	      this.transport = defaults.transport;
        }

        public Builder setEndpoint(Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTransport(String transport) {
            this.transport = Objects.requireNonNull(transport);
            return this;
        }
        public MediaGraphRtspSourceResponse build() {
            return new MediaGraphRtspSourceResponse(endpoint, name, odataType, transport);
        }
    }
}
