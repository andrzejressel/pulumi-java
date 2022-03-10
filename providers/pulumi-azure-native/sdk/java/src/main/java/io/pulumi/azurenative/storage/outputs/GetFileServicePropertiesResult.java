// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import io.pulumi.azurenative.storage.outputs.DeleteRetentionPolicyResponse;
import io.pulumi.azurenative.storage.outputs.ProtocolSettingsResponse;
import io.pulumi.azurenative.storage.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFileServicePropertiesResult {
    /**
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    private final @Nullable CorsRulesResponse cors;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Protocol settings for file service
     * 
     */
    private final @Nullable ProtocolSettingsResponse protocolSettings;
    /**
     * The file service properties for share soft delete.
     * 
     */
    private final @Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy;
    /**
     * Sku name and tier.
     * 
     */
    private final SkuResponse sku;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetFileServicePropertiesResult(
        @OutputCustomType.Parameter("cors") @Nullable CorsRulesResponse cors,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("protocolSettings") @Nullable ProtocolSettingsResponse protocolSettings,
        @OutputCustomType.Parameter("shareDeleteRetentionPolicy") @Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy,
        @OutputCustomType.Parameter("sku") SkuResponse sku,
        @OutputCustomType.Parameter("type") String type) {
        this.cors = cors;
        this.id = id;
        this.name = name;
        this.protocolSettings = protocolSettings;
        this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        this.sku = sku;
        this.type = type;
    }

    /**
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
    */
    public Optional<CorsRulesResponse> getCors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Protocol settings for file service
     * 
    */
    public Optional<ProtocolSettingsResponse> getProtocolSettings() {
        return Optional.ofNullable(this.protocolSettings);
    }
    /**
     * The file service properties for share soft delete.
     * 
    */
    public Optional<DeleteRetentionPolicyResponse> getShareDeleteRetentionPolicy() {
        return Optional.ofNullable(this.shareDeleteRetentionPolicy);
    }
    /**
     * Sku name and tier.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileServicePropertiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CorsRulesResponse cors;
        private String id;
        private String name;
        private @Nullable ProtocolSettingsResponse protocolSettings;
        private @Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy;
        private SkuResponse sku;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileServicePropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.shareDeleteRetentionPolicy = defaults.shareDeleteRetentionPolicy;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
        }

        public Builder setCors(@Nullable CorsRulesResponse cors) {
            this.cors = cors;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtocolSettings(@Nullable ProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = protocolSettings;
            return this;
        }

        public Builder setShareDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy) {
            this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFileServicePropertiesResult build() {
            return new GetFileServicePropertiesResult(cors, id, name, protocolSettings, shareDeleteRetentionPolicy, sku, type);
        }
    }
}
