// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GoogleAdWordsLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * The Client customer ID of the AdWords account that you want to fetch report data for.
     * 
     */
    private final @Nullable Object clientCustomerID;
    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object clientId;
    /**
     * The client secret of the google application used to acquire the refresh token.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Properties used to connect to GoogleAds. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    private final @Nullable Object connectionProperties;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The developer token associated with the manager account that you use to grant access to the AdWords API.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> developerToken;
    /**
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    private final @Nullable Object email;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    private final @Nullable Object keyFilePath;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The refresh token obtained from Google for authorizing access to AdWords for UserAuthentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    private final @Nullable Object trustedCertPath;
    /**
     * Type of linked service.
     * Expected value is 'GoogleAdWords'.
     * 
     */
    private final String type;
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    private final @Nullable Object useSystemTrustStore;

    @OutputCustomType.Constructor
    private GoogleAdWordsLinkedServiceResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @OutputCustomType.Parameter("clientCustomerID") @Nullable Object clientCustomerID,
        @OutputCustomType.Parameter("clientId") @Nullable Object clientId,
        @OutputCustomType.Parameter("clientSecret") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("connectionProperties") @Nullable Object connectionProperties,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("developerToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> developerToken,
        @OutputCustomType.Parameter("email") @Nullable Object email,
        @OutputCustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @OutputCustomType.Parameter("keyFilePath") @Nullable Object keyFilePath,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("refreshToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken,
        @OutputCustomType.Parameter("trustedCertPath") @Nullable Object trustedCertPath,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("useSystemTrustStore") @Nullable Object useSystemTrustStore) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.clientCustomerID = clientCustomerID;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.developerToken = developerToken;
        this.email = email;
        this.encryptedCredential = encryptedCredential;
        this.keyFilePath = keyFilePath;
        this.parameters = parameters;
        this.refreshToken = refreshToken;
        this.trustedCertPath = trustedCertPath;
        this.type = type;
        this.useSystemTrustStore = useSystemTrustStore;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The Client customer ID of the AdWords account that you want to fetch report data for.
     * 
    */
    public Optional<Object> getClientCustomerID() {
        return Optional.ofNullable(this.clientCustomerID);
    }
    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The client secret of the google application used to acquire the refresh token.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Properties used to connect to GoogleAds. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
    */
    public Optional<Object> getConnectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The developer token associated with the manager account that you use to grant access to the AdWords API.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getDeveloperToken() {
        return Optional.ofNullable(this.developerToken);
    }
    /**
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
    */
    public Optional<Object> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
    */
    public Optional<Object> getKeyFilePath() {
        return Optional.ofNullable(this.keyFilePath);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The refresh token obtained from Google for authorizing access to AdWords for UserAuthentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
    */
    public Optional<Object> getTrustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    /**
     * Type of linked service.
     * Expected value is 'GoogleAdWords'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
    */
    public Optional<Object> getUseSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAdWordsLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable Object clientCustomerID;
        private @Nullable Object clientId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionProperties;
        private @Nullable String description;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> developerToken;
        private @Nullable Object email;
        private @Nullable Object encryptedCredential;
        private @Nullable Object keyFilePath;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAdWordsLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientCustomerID = defaults.clientCustomerID;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.developerToken = defaults.developerToken;
    	      this.email = defaults.email;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.keyFilePath = defaults.keyFilePath;
    	      this.parameters = defaults.parameters;
    	      this.refreshToken = defaults.refreshToken;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setClientCustomerID(@Nullable Object clientCustomerID) {
            this.clientCustomerID = clientCustomerID;
            return this;
        }

        public Builder setClientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDeveloperToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> developerToken) {
            this.developerToken = developerToken;
            return this;
        }

        public Builder setEmail(@Nullable Object email) {
            this.email = email;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setKeyFilePath(@Nullable Object keyFilePath) {
            this.keyFilePath = keyFilePath;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setRefreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }
        public GoogleAdWordsLinkedServiceResponse build() {
            return new GoogleAdWordsLinkedServiceResponse(annotations, authenticationType, clientCustomerID, clientId, clientSecret, connectVia, connectionProperties, description, developerToken, email, encryptedCredential, keyFilePath, parameters, refreshToken, trustedCertPath, type, useSystemTrustStore);
        }
    }
}
