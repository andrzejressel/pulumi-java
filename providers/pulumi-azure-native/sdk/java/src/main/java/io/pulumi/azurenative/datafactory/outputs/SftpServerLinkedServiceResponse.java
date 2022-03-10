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
public final class SftpServerLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The authentication type to be used to connect to the FTP server.
     * 
     */
    private final @Nullable String authenticationType;
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
     * The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object host;
    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object hostKeyFingerprint;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase;
    /**
     * Password to logon the SFTP server for Basic authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object port;
    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent;
    /**
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object privateKeyPath;
    /**
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object skipHostKeyValidation;
    /**
     * Type of linked service.
     * Expected value is 'Sftp'.
     * 
     */
    private final String type;
    /**
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @OutputCustomType.Constructor
    private SftpServerLinkedServiceResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @OutputCustomType.Parameter("host") Object host,
        @OutputCustomType.Parameter("hostKeyFingerprint") @Nullable Object hostKeyFingerprint,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("passPhrase") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase,
        @OutputCustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @OutputCustomType.Parameter("port") @Nullable Object port,
        @OutputCustomType.Parameter("privateKeyContent") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent,
        @OutputCustomType.Parameter("privateKeyPath") @Nullable Object privateKeyPath,
        @OutputCustomType.Parameter("skipHostKeyValidation") @Nullable Object skipHostKeyValidation,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userName") @Nullable Object userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.hostKeyFingerprint = hostKeyFingerprint;
        this.parameters = parameters;
        this.passPhrase = passPhrase;
        this.password = password;
        this.port = port;
        this.privateKeyContent = privateKeyContent;
        this.privateKeyPath = privateKeyPath;
        this.skipHostKeyValidation = skipHostKeyValidation;
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
     * The authentication type to be used to connect to the FTP server.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
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
     * The SFTP server host name. Type: string (or Expression with resultType string).
     * 
    */
    public Object getHost() {
        return this.host;
    }
    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getHostKeyFingerprint() {
        return Optional.ofNullable(this.hostKeyFingerprint);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassPhrase() {
        return Optional.ofNullable(this.passPhrase);
    }
    /**
     * Password to logon the SFTP server for Basic authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPrivateKeyContent() {
        return Optional.ofNullable(this.privateKeyContent);
    }
    /**
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPrivateKeyPath() {
        return Optional.ofNullable(this.privateKeyPath);
    }
    /**
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getSkipHostKeyValidation() {
        return Optional.ofNullable(this.skipHostKeyValidation);
    }
    /**
     * Type of linked service.
     * Expected value is 'Sftp'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpServerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Object hostKeyFingerprint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent;
        private @Nullable Object privateKeyPath;
        private @Nullable Object skipHostKeyValidation;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpServerLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.hostKeyFingerprint = defaults.hostKeyFingerprint;
    	      this.parameters = defaults.parameters;
    	      this.passPhrase = defaults.passPhrase;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKeyContent = defaults.privateKeyContent;
    	      this.privateKeyPath = defaults.privateKeyPath;
    	      this.skipHostKeyValidation = defaults.skipHostKeyValidation;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
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

        public Builder setHost(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHostKeyFingerprint(@Nullable Object hostKeyFingerprint) {
            this.hostKeyFingerprint = hostKeyFingerprint;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassPhrase(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase) {
            this.passPhrase = passPhrase;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setPort(@Nullable Object port) {
            this.port = port;
            return this;
        }

        public Builder setPrivateKeyContent(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent) {
            this.privateKeyContent = privateKeyContent;
            return this;
        }

        public Builder setPrivateKeyPath(@Nullable Object privateKeyPath) {
            this.privateKeyPath = privateKeyPath;
            return this;
        }

        public Builder setSkipHostKeyValidation(@Nullable Object skipHostKeyValidation) {
            this.skipHostKeyValidation = skipHostKeyValidation;
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
        public SftpServerLinkedServiceResponse build() {
            return new SftpServerLinkedServiceResponse(annotations, authenticationType, connectVia, description, encryptedCredential, host, hostKeyFingerprint, parameters, passPhrase, password, port, privateKeyContent, privateKeyPath, skipHostKeyValidation, type, userName);
        }
    }
}
