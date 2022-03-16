// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.DeveloperArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a developer. Once created, the developer can register an app and obtain an API key. At creation time, a developer is set as `active`. To change the developer status, use the SetDeveloperStatus API.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Developer")
public class Developer extends io.pulumi.resources.CustomResource {
    /**
     * Access type.
     * 
     */
    @Export(name="accessType", type=String.class, parameters={})
    private Output<String> accessType;

    /**
     * @return Access type.
     * 
     */
    public Output<String> getAccessType() {
        return this.accessType;
    }
    /**
     * Developer app family.
     * 
     */
    @Export(name="appFamily", type=String.class, parameters={})
    private Output<String> appFamily;

    /**
     * @return Developer app family.
     * 
     */
    public Output<String> getAppFamily() {
        return this.appFamily;
    }
    /**
     * List of apps associated with the developer.
     * 
     */
    @Export(name="apps", type=List.class, parameters={String.class})
    private Output<List<String>> apps;

    /**
     * @return List of apps associated with the developer.
     * 
     */
    public Output<List<String>> getApps() {
        return this.apps;
    }
    /**
     * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
     * 
     */
    @Export(name="attributes", type=List.class, parameters={GoogleCloudApigeeV1AttributeResponse.class})
    private Output<List<GoogleCloudApigeeV1AttributeResponse>> attributes;

    /**
     * @return Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
     * 
     */
    public Output<List<GoogleCloudApigeeV1AttributeResponse>> getAttributes() {
        return this.attributes;
    }
    /**
     * List of companies associated with the developer.
     * 
     */
    @Export(name="companies", type=List.class, parameters={String.class})
    private Output<List<String>> companies;

    /**
     * @return List of companies associated with the developer.
     * 
     */
    public Output<List<String>> getCompanies() {
        return this.companies;
    }
    /**
     * Time at which the developer was created in milliseconds since epoch.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time at which the developer was created in milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to stay the same over time.
     * 
     */
    @Export(name="developerId", type=String.class, parameters={})
    private Output<String> developerId;

    /**
     * @return ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to stay the same over time.
     * 
     */
    public Output<String> getDeveloperId() {
        return this.developerId;
    }
    /**
     * Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * First name of the developer.
     * 
     */
    @Export(name="firstName", type=String.class, parameters={})
    private Output<String> firstName;

    /**
     * @return First name of the developer.
     * 
     */
    public Output<String> getFirstName() {
        return this.firstName;
    }
    /**
     * Time at which the developer was last modified in milliseconds since epoch.
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return Time at which the developer was last modified in milliseconds since epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Last name of the developer.
     * 
     */
    @Export(name="lastName", type=String.class, parameters={})
    private Output<String> lastName;

    /**
     * @return Last name of the developer.
     * 
     */
    public Output<String> getLastName() {
        return this.lastName;
    }
    /**
     * Name of the Apigee organization in which the developer resides.
     * 
     */
    @Export(name="organizationName", type=String.class, parameters={})
    private Output<String> organizationName;

    /**
     * @return Name of the Apigee organization in which the developer resides.
     * 
     */
    public Output<String> getOrganizationName() {
        return this.organizationName;
    }
    /**
     * Status of the developer. Valid values are `active` and `inactive`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the developer. Valid values are `active` and `inactive`.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * User name of the developer. Not used by Apigee hybrid.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return User name of the developer. Not used by Apigee hybrid.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(DeveloperArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.DeveloperArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.DeveloperArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Developer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Developer(String name) {
        this(name, DeveloperArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Developer(String name, DeveloperArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Developer(String name, DeveloperArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Developer", name, args == null ? DeveloperArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Developer(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Developer", name, null, makeResourceOptions(options, id));
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
    public static Developer get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Developer(name, id, options);
    }
}
