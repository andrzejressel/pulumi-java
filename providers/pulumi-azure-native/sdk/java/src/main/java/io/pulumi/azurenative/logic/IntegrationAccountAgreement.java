// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationAccountAgreementArgs;
import io.pulumi.azurenative.logic.outputs.AgreementContentResponse;
import io.pulumi.azurenative.logic.outputs.BusinessIdentityResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The integration account agreement.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountAgreement <IntegrationAccountAgreementName> /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/IntegrationAccount4533/agreements/<IntegrationAccountAgreementName> 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountAgreement")
public class IntegrationAccountAgreement extends io.pulumi.resources.CustomResource {
    /**
     * The agreement type.
     * 
     */
    @Export(name="agreementType", type=String.class, parameters={})
    private Output<String> agreementType;

    /**
     * @return The agreement type.
     * 
     */
    public Output<String> getAgreementType() {
        return this.agreementType;
    }
    /**
     * The changed time.
     * 
     */
    @Export(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return The changed time.
     * 
     */
    public Output<String> getChangedTime() {
        return this.changedTime;
    }
    /**
     * The agreement content.
     * 
     */
    @Export(name="content", type=AgreementContentResponse.class, parameters={})
    private Output<AgreementContentResponse> content;

    /**
     * @return The agreement content.
     * 
     */
    public Output<AgreementContentResponse> getContent() {
        return this.content;
    }
    /**
     * The created time.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The business identity of the guest partner.
     * 
     */
    @Export(name="guestIdentity", type=BusinessIdentityResponse.class, parameters={})
    private Output<BusinessIdentityResponse> guestIdentity;

    /**
     * @return The business identity of the guest partner.
     * 
     */
    public Output<BusinessIdentityResponse> getGuestIdentity() {
        return this.guestIdentity;
    }
    /**
     * The integration account partner that is set as guest partner for this agreement.
     * 
     */
    @Export(name="guestPartner", type=String.class, parameters={})
    private Output<String> guestPartner;

    /**
     * @return The integration account partner that is set as guest partner for this agreement.
     * 
     */
    public Output<String> getGuestPartner() {
        return this.guestPartner;
    }
    /**
     * The business identity of the host partner.
     * 
     */
    @Export(name="hostIdentity", type=BusinessIdentityResponse.class, parameters={})
    private Output<BusinessIdentityResponse> hostIdentity;

    /**
     * @return The business identity of the host partner.
     * 
     */
    public Output<BusinessIdentityResponse> getHostIdentity() {
        return this.hostIdentity;
    }
    /**
     * The integration account partner that is set as host partner for this agreement.
     * 
     */
    @Export(name="hostPartner", type=String.class, parameters={})
    private Output<String> hostPartner;

    /**
     * @return The integration account partner that is set as host partner for this agreement.
     * 
     */
    public Output<String> getHostPartner() {
        return this.hostPartner;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The metadata.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output</* @Nullable */ Object> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationAccountAgreementArgs.Builder a);
    }
    private static io.pulumi.azurenative.logic.IntegrationAccountAgreementArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logic.IntegrationAccountAgreementArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IntegrationAccountAgreement(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountAgreement(String name) {
        this(name, IntegrationAccountAgreementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountAgreement(String name, IntegrationAccountAgreementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountAgreement(String name, IntegrationAccountAgreementArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountAgreement", name, args == null ? IntegrationAccountAgreementArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IntegrationAccountAgreement(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountAgreement", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20150801preview:IntegrationAccountAgreement").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountAgreement").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountAgreement").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountAgreement").build())
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
    public static IntegrationAccountAgreement get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountAgreement(name, id, options);
    }
}
