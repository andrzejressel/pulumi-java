// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.StorageAccountArgs;
import io.pulumi.azurenative.storage.outputs.AzureFilesIdentityBasedAuthenticationResponse;
import io.pulumi.azurenative.storage.outputs.BlobRestoreStatusResponse;
import io.pulumi.azurenative.storage.outputs.CustomDomainResponse;
import io.pulumi.azurenative.storage.outputs.EncryptionResponse;
import io.pulumi.azurenative.storage.outputs.EndpointsResponse;
import io.pulumi.azurenative.storage.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.storage.outputs.GeoReplicationStatsResponse;
import io.pulumi.azurenative.storage.outputs.IdentityResponse;
import io.pulumi.azurenative.storage.outputs.KeyCreationTimeResponse;
import io.pulumi.azurenative.storage.outputs.KeyPolicyResponse;
import io.pulumi.azurenative.storage.outputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.storage.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.storage.outputs.RoutingPreferenceResponse;
import io.pulumi.azurenative.storage.outputs.SasPolicyResponse;
import io.pulumi.azurenative.storage.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The storage account.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:StorageAccount sto4445 /subscriptions/{subscription-id}/resourceGroups/res9101/providers/Microsoft.Storage/storageAccounts/sto4445 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:StorageAccount")
public class StorageAccount extends io.pulumi.resources.CustomResource {
    /**
     * Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    @Export(name="accessTier", type=String.class, parameters={})
    private Output<String> accessTier;

    /**
     * @return Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    public Output<String> getAccessTier() {
        return this.accessTier;
    }
    /**
     * Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    @Export(name="allowBlobPublicAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowBlobPublicAccess;

    /**
     * @return Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowBlobPublicAccess() {
        return this.allowBlobPublicAccess;
    }
    /**
     * Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    @Export(name="allowSharedKeyAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowSharedKeyAccess;

    /**
     * @return Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowSharedKeyAccess() {
        return this.allowSharedKeyAccess;
    }
    /**
     * Provides the identity based authentication settings for Azure Files.
     * 
     */
    @Export(name="azureFilesIdentityBasedAuthentication", type=AzureFilesIdentityBasedAuthenticationResponse.class, parameters={})
    private Output</* @Nullable */ AzureFilesIdentityBasedAuthenticationResponse> azureFilesIdentityBasedAuthentication;

    /**
     * @return Provides the identity based authentication settings for Azure Files.
     * 
     */
    public Output</* @Nullable */ AzureFilesIdentityBasedAuthenticationResponse> getAzureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }
    /**
     * Blob restore status
     * 
     */
    @Export(name="blobRestoreStatus", type=BlobRestoreStatusResponse.class, parameters={})
    private Output<BlobRestoreStatusResponse> blobRestoreStatus;

    /**
     * @return Blob restore status
     * 
     */
    public Output<BlobRestoreStatusResponse> getBlobRestoreStatus() {
        return this.blobRestoreStatus;
    }
    /**
     * Gets the creation date and time of the storage account in UTC.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Gets the creation date and time of the storage account in UTC.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets the custom domain the user assigned to this storage account.
     * 
     */
    @Export(name="customDomain", type=CustomDomainResponse.class, parameters={})
    private Output<CustomDomainResponse> customDomain;

    /**
     * @return Gets the custom domain the user assigned to this storage account.
     * 
     */
    public Output<CustomDomainResponse> getCustomDomain() {
        return this.customDomain;
    }
    /**
     * Allows https traffic only to storage service if sets to true.
     * 
     */
    @Export(name="enableHttpsTrafficOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableHttpsTrafficOnly;

    /**
     * @return Allows https traffic only to storage service if sets to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }
    /**
     * NFS 3.0 protocol support enabled if set to true.
     * 
     */
    @Export(name="enableNfsV3", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNfsV3;

    /**
     * @return NFS 3.0 protocol support enabled if set to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableNfsV3() {
        return this.enableNfsV3;
    }
    /**
     * Gets the encryption settings on the account. If unspecified, the account is unencrypted.
     * 
     */
    @Export(name="encryption", type=EncryptionResponse.class, parameters={})
    private Output<EncryptionResponse> encryption;

    /**
     * @return Gets the encryption settings on the account. If unspecified, the account is unencrypted.
     * 
     */
    public Output<EncryptionResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * The extendedLocation of the resource.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extendedLocation of the resource.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * If the failover is in progress, the value will be true, otherwise, it will be null.
     * 
     */
    @Export(name="failoverInProgress", type=Boolean.class, parameters={})
    private Output<Boolean> failoverInProgress;

    /**
     * @return If the failover is in progress, the value will be true, otherwise, it will be null.
     * 
     */
    public Output<Boolean> getFailoverInProgress() {
        return this.failoverInProgress;
    }
    /**
     * Geo Replication Stats
     * 
     */
    @Export(name="geoReplicationStats", type=GeoReplicationStatsResponse.class, parameters={})
    private Output<GeoReplicationStatsResponse> geoReplicationStats;

    /**
     * @return Geo Replication Stats
     * 
     */
    public Output<GeoReplicationStatsResponse> getGeoReplicationStats() {
        return this.geoReplicationStats;
    }
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    @Export(name="isHnsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isHnsEnabled;

    /**
     * @return Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsHnsEnabled() {
        return this.isHnsEnabled;
    }
    /**
     * Storage account keys creation time.
     * 
     */
    @Export(name="keyCreationTime", type=KeyCreationTimeResponse.class, parameters={})
    private Output<KeyCreationTimeResponse> keyCreationTime;

    /**
     * @return Storage account keys creation time.
     * 
     */
    public Output<KeyCreationTimeResponse> getKeyCreationTime() {
        return this.keyCreationTime;
    }
    /**
     * KeyPolicy assigned to the storage account.
     * 
     */
    @Export(name="keyPolicy", type=KeyPolicyResponse.class, parameters={})
    private Output<KeyPolicyResponse> keyPolicy;

    /**
     * @return KeyPolicy assigned to the storage account.
     * 
     */
    public Output<KeyPolicyResponse> getKeyPolicy() {
        return this.keyPolicy;
    }
    /**
     * Gets the Kind.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Gets the Kind.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    @Export(name="largeFileSharesState", type=String.class, parameters={})
    private Output</* @Nullable */ String> largeFileSharesState;

    /**
     * @return Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    public Output</* @Nullable */ String> getLargeFileSharesState() {
        return this.largeFileSharesState;
    }
    /**
     * Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    @Export(name="lastGeoFailoverTime", type=String.class, parameters={})
    private Output<String> lastGeoFailoverTime;

    /**
     * @return Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    public Output<String> getLastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    @Export(name="minimumTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimumTlsVersion;

    /**
     * @return Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    public Output</* @Nullable */ String> getMinimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network rule set
     * 
     */
    @Export(name="networkRuleSet", type=NetworkRuleSetResponse.class, parameters={})
    private Output<NetworkRuleSetResponse> networkRuleSet;

    /**
     * @return Network rule set
     * 
     */
    public Output<NetworkRuleSetResponse> getNetworkRuleSet() {
        return this.networkRuleSet;
    }
    /**
     * Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     * 
     */
    @Export(name="primaryEndpoints", type=EndpointsResponse.class, parameters={})
    private Output<EndpointsResponse> primaryEndpoints;

    /**
     * @return Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     * 
     */
    public Output<EndpointsResponse> getPrimaryEndpoints() {
        return this.primaryEndpoints;
    }
    /**
     * Gets the location of the primary data center for the storage account.
     * 
     */
    @Export(name="primaryLocation", type=String.class, parameters={})
    private Output<String> primaryLocation;

    /**
     * @return Gets the location of the primary data center for the storage account.
     * 
     */
    public Output<String> getPrimaryLocation() {
        return this.primaryLocation;
    }
    /**
     * List of private endpoint connection associated with the specified storage account
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connection associated with the specified storage account
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Gets the status of the storage account at the time the operation was called.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets the status of the storage account at the time the operation was called.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    @Export(name="routingPreference", type=RoutingPreferenceResponse.class, parameters={})
    private Output</* @Nullable */ RoutingPreferenceResponse> routingPreference;

    /**
     * @return Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    public Output</* @Nullable */ RoutingPreferenceResponse> getRoutingPreference() {
        return this.routingPreference;
    }
    /**
     * SasPolicy assigned to the storage account.
     * 
     */
    @Export(name="sasPolicy", type=SasPolicyResponse.class, parameters={})
    private Output<SasPolicyResponse> sasPolicy;

    /**
     * @return SasPolicy assigned to the storage account.
     * 
     */
    public Output<SasPolicyResponse> getSasPolicy() {
        return this.sasPolicy;
    }
    /**
     * Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     * 
     */
    @Export(name="secondaryEndpoints", type=EndpointsResponse.class, parameters={})
    private Output<EndpointsResponse> secondaryEndpoints;

    /**
     * @return Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     * 
     */
    public Output<EndpointsResponse> getSecondaryEndpoints() {
        return this.secondaryEndpoints;
    }
    /**
     * Gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    @Export(name="secondaryLocation", type=String.class, parameters={})
    private Output<String> secondaryLocation;

    /**
     * @return Gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    public Output<String> getSecondaryLocation() {
        return this.secondaryLocation;
    }
    /**
     * Gets the SKU.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return Gets the SKU.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Gets the status indicating whether the primary location of the storage account is available or unavailable.
     * 
     */
    @Export(name="statusOfPrimary", type=String.class, parameters={})
    private Output<String> statusOfPrimary;

    /**
     * @return Gets the status indicating whether the primary location of the storage account is available or unavailable.
     * 
     */
    public Output<String> getStatusOfPrimary() {
        return this.statusOfPrimary;
    }
    /**
     * Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     * 
     */
    @Export(name="statusOfSecondary", type=String.class, parameters={})
    private Output<String> statusOfSecondary;

    /**
     * @return Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     * 
     */
    public Output<String> getStatusOfSecondary() {
        return this.statusOfSecondary;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(StorageAccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.storage.StorageAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storage.StorageAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StorageAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageAccount(String name) {
        this(name, StorageAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageAccount(String name, StorageAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageAccount(String name, StorageAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:StorageAccount", name, args == null ? StorageAccountArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private StorageAccount(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:StorageAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20150501preview:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20150615:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20160101:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20160501:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20161201:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20170601:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20171001:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20180201:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20180301preview:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20180701:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20181101:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190401:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190601:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:StorageAccount").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:StorageAccount").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StorageAccount get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StorageAccount(name, id, options);
    }
}
