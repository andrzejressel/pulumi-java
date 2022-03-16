// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudchannel_v1.EntitlementArgs;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1AssociationInfoResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CommitmentSettingsResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1ParameterResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1ProvisionedServiceResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1TrialSettingsResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an entitlement for a customer. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * There is already a customer entitlement for a SKU from the same product family. * INVALID_VALUE: Make sure the OfferId is valid. If it is, contact Google Channel support for further troubleshooting. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: * The SKU was already purchased for the customer. * The customer's primary email already exists. Retry after changing the customer's primary contact email. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The domain required for purchasing a SKU has not been verified. * A pre-requisite SKU required to purchase an Add-On SKU is missing. For example, Google Workspace Business Starter is required to purchase Vault or Drive. * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:cloudchannel/v1:Entitlement")
public class Entitlement extends io.pulumi.resources.CustomResource {
    /**
     * Association information to other entitlements.
     * 
     */
    @Export(name="associationInfo", type=GoogleCloudChannelV1AssociationInfoResponse.class, parameters={})
    private Output<GoogleCloudChannelV1AssociationInfoResponse> associationInfo;

    /**
     * @return Association information to other entitlements.
     * 
     */
    public Output<GoogleCloudChannelV1AssociationInfoResponse> getAssociationInfo() {
        return this.associationInfo;
    }
    /**
     * Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
     */
    @Export(name="commitmentSettings", type=GoogleCloudChannelV1CommitmentSettingsResponse.class, parameters={})
    private Output<GoogleCloudChannelV1CommitmentSettingsResponse> commitmentSettings;

    /**
     * @return Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
     */
    public Output<GoogleCloudChannelV1CommitmentSettingsResponse> getCommitmentSettings() {
        return this.commitmentSettings;
    }
    /**
     * The time at which the entitlement is created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which the entitlement is created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Resource name of an entitlement in the form: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of an entitlement in the form: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
     */
    @Export(name="offer", type=String.class, parameters={})
    private Output<String> offer;

    /**
     * @return The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
     */
    public Output<String> getOffer() {
        return this.offer;
    }
    /**
     * Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={GoogleCloudChannelV1ParameterResponse.class})
    private Output<List<GoogleCloudChannelV1ParameterResponse>> parameters;

    /**
     * @return Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
     */
    public Output<List<GoogleCloudChannelV1ParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Service provisioning details for the entitlement.
     * 
     */
    @Export(name="provisionedService", type=GoogleCloudChannelV1ProvisionedServiceResponse.class, parameters={})
    private Output<GoogleCloudChannelV1ProvisionedServiceResponse> provisionedService;

    /**
     * @return Service provisioning details for the entitlement.
     * 
     */
    public Output<GoogleCloudChannelV1ProvisionedServiceResponse> getProvisionedService() {
        return this.provisionedService;
    }
    /**
     * Current provisioning state of the entitlement.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current provisioning state of the entitlement.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
     * 
     */
    @Export(name="purchaseOrderId", type=String.class, parameters={})
    private Output<String> purchaseOrderId;

    /**
     * @return Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
     * 
     */
    public Output<String> getPurchaseOrderId() {
        return this.purchaseOrderId;
    }
    /**
     * Enumerable of all current suspension reasons for an entitlement.
     * 
     */
    @Export(name="suspensionReasons", type=List.class, parameters={String.class})
    private Output<List<String>> suspensionReasons;

    /**
     * @return Enumerable of all current suspension reasons for an entitlement.
     * 
     */
    public Output<List<String>> getSuspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * Settings for trial offers.
     * 
     */
    @Export(name="trialSettings", type=GoogleCloudChannelV1TrialSettingsResponse.class, parameters={})
    private Output<GoogleCloudChannelV1TrialSettingsResponse> trialSettings;

    /**
     * @return Settings for trial offers.
     * 
     */
    public Output<GoogleCloudChannelV1TrialSettingsResponse> getTrialSettings() {
        return this.trialSettings;
    }
    /**
     * The time at which the entitlement is updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which the entitlement is updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(EntitlementArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudchannel_v1.EntitlementArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudchannel_v1.EntitlementArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Entitlement(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entitlement(String name) {
        this(name, EntitlementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entitlement(String name, EntitlementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entitlement(String name, EntitlementArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:Entitlement", name, args == null ? EntitlementArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Entitlement(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:Entitlement", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Entitlement get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Entitlement(name, id, options);
    }
}
