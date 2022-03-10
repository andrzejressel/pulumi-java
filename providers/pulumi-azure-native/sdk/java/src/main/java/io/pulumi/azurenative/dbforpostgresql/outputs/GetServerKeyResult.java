// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerKeyResult {
    /**
     * The key creation date.
     * 
     */
    private final String creationDate;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Kind of encryption protector used to protect the key.
     * 
     */
    private final String kind;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The key type like 'AzureKeyVault'.
     * 
     */
    private final String serverKeyType;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The URI of the key.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor
    private GetServerKeyResult(
        @OutputCustomType.Parameter("creationDate") String creationDate,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("serverKeyType") String serverKeyType,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uri") @Nullable String uri) {
        this.creationDate = creationDate;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.serverKeyType = serverKeyType;
        this.type = type;
        this.uri = uri;
    }

    /**
     * The key creation date.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of encryption protector used to protect the key.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The key type like 'AzureKeyVault'.
     * 
    */
    public String getServerKeyType() {
        return this.serverKeyType;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The URI of the key.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationDate;
        private String id;
        private String kind;
        private String name;
        private String serverKeyType;
        private String type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.serverKeyType = defaults.serverKeyType;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServerKeyType(String serverKeyType) {
            this.serverKeyType = Objects.requireNonNull(serverKeyType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public GetServerKeyResult build() {
            return new GetServerKeyResult(creationDate, id, kind, name, serverKeyType, type, uri);
        }
    }
}
