// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceBusResponse {
    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    private final String createdTime;
    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String deadLetterSecret;
    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    private final @Nullable String deadLetterUri;
    /**
     * The type of Digital Twins endpoint
     * Expected value is 'ServiceBus'.
     * 
     */
    private final String endpointType;
    /**
     * The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    private final @Nullable String endpointUri;
    /**
     * The ServiceBus Topic name for identity-based authentication
     * 
     */
    private final @Nullable String entityPath;
    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String primaryConnectionString;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String secondaryConnectionString;

    @OutputCustomType.Constructor
    private ServiceBusResponse(
        @OutputCustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @OutputCustomType.Parameter("createdTime") String createdTime,
        @OutputCustomType.Parameter("deadLetterSecret") @Nullable String deadLetterSecret,
        @OutputCustomType.Parameter("deadLetterUri") @Nullable String deadLetterUri,
        @OutputCustomType.Parameter("endpointType") String endpointType,
        @OutputCustomType.Parameter("endpointUri") @Nullable String endpointUri,
        @OutputCustomType.Parameter("entityPath") @Nullable String entityPath,
        @OutputCustomType.Parameter("primaryConnectionString") @Nullable String primaryConnectionString,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("secondaryConnectionString") @Nullable String secondaryConnectionString) {
        this.authenticationType = authenticationType;
        this.createdTime = createdTime;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = endpointType;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.primaryConnectionString = primaryConnectionString;
        this.provisioningState = provisioningState;
        this.secondaryConnectionString = secondaryConnectionString;
    }

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> getDeadLetterSecret() {
        return Optional.ofNullable(this.deadLetterSecret);
    }
    /**
     * Dead letter storage URL for identity-based authentication.
     * 
    */
    public Optional<String> getDeadLetterUri() {
        return Optional.ofNullable(this.deadLetterUri);
    }
    /**
     * The type of Digital Twins endpoint
     * Expected value is 'ServiceBus'.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
     * 
    */
    public Optional<String> getEndpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    /**
     * The ServiceBus Topic name for identity-based authentication
     * 
    */
    public Optional<String> getEntityPath() {
        return Optional.ofNullable(this.entityPath);
    }
    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> getPrimaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }
    /**
     * The provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> getSecondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private String createdTime;
        private @Nullable String deadLetterSecret;
        private @Nullable String deadLetterUri;
        private String endpointType;
        private @Nullable String endpointUri;
        private @Nullable String entityPath;
        private @Nullable String primaryConnectionString;
        private String provisioningState;
        private @Nullable String secondaryConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.createdTime = defaults.createdTime;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.provisioningState = defaults.provisioningState;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder setDeadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder setEntityPath(@Nullable String entityPath) {
            this.entityPath = entityPath;
            return this;
        }

        public Builder setPrimaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSecondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }
        public ServiceBusResponse build() {
            return new ServiceBusResponse(authenticationType, createdTime, deadLetterSecret, deadLetterUri, endpointType, endpointUri, entityPath, primaryConnectionString, provisioningState, secondaryConnectionString);
        }
    }
}
