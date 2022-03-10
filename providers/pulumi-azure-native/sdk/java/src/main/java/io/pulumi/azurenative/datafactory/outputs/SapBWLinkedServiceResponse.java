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
public final class SapBWLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    private final Object clientId;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password to access the SAP BW server.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
     */
    private final Object server;
    /**
     * System number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    private final Object systemNumber;
    /**
     * Type of linked service.
     * Expected value is 'SapBW'.
     * 
     */
    private final String type;
    /**
     * Username to access the SAP BW server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @OutputCustomType.Constructor
    private SapBWLinkedServiceResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("clientId") Object clientId,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @OutputCustomType.Parameter("server") Object server,
        @OutputCustomType.Parameter("systemNumber") Object systemNumber,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userName") @Nullable Object userName) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.systemNumber = systemNumber;
        this.type = type;
        this.userName = userName;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
    */
    public Object getClientId() {
        return this.clientId;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password to access the SAP BW server.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
    */
    public Object getServer() {
        return this.server;
    }
    /**
     * System number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
    */
    public Object getSystemNumber() {
        return this.systemNumber;
    }
    /**
     * Type of linked service.
     * Expected value is 'SapBW'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Username to access the SAP BW server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapBWLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object clientId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Object server;
        private Object systemNumber;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapBWLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.systemNumber = defaults.systemNumber;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setClientId(Object clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setServer(Object server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }

        public Builder setSystemNumber(Object systemNumber) {
            this.systemNumber = Objects.requireNonNull(systemNumber);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }
        public SapBWLinkedServiceResponse build() {
            return new SapBWLinkedServiceResponse(annotations, clientId, connectVia, description, encryptedCredential, parameters, password, server, systemNumber, type, userName);
        }
    }
}
