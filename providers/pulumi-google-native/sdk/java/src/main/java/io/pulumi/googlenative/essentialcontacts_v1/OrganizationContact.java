// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.essentialcontacts_v1.OrganizationContactArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Adds a new contact for a resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:essentialcontacts/v1:OrganizationContact")
public class OrganizationContact extends io.pulumi.resources.CustomResource {
    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    @Export(name="languageTag", type=String.class, parameters={})
    private Output<String> languageTag;

    /**
     * @return The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    public Output<String> getLanguageTag() {
        return this.languageTag;
    }
    /**
     * The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @Export(name="notificationCategorySubscriptions", type=List.class, parameters={String.class})
    private Output<List<String>> notificationCategorySubscriptions;

    /**
     * @return The categories of notifications that the contact will receive communications for.
     * 
     */
    public Output<List<String>> getNotificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions;
    }
    /**
     * The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    @Export(name="validateTime", type=String.class, parameters={})
    private Output<String> validateTime;

    /**
     * @return The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    public Output<String> getValidateTime() {
        return this.validateTime;
    }
    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    @Export(name="validationState", type=String.class, parameters={})
    private Output<String> validationState;

    /**
     * @return The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    public Output<String> getValidationState() {
        return this.validationState;
    }

    public interface BuilderApplicator {
        public void apply(OrganizationContactArgs.Builder a);
    }
    private static io.pulumi.googlenative.essentialcontacts_v1.OrganizationContactArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.essentialcontacts_v1.OrganizationContactArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OrganizationContact(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationContact(String name) {
        this(name, OrganizationContactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationContact(String name, OrganizationContactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationContact(String name, OrganizationContactArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:essentialcontacts/v1:OrganizationContact", name, args == null ? OrganizationContactArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private OrganizationContact(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:essentialcontacts/v1:OrganizationContact", name, null, makeResourceOptions(options, id));
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
    public static OrganizationContact get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationContact(name, id, options);
    }
}
