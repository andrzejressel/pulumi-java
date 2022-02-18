// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebasehosting_v1beta1.SiteArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Hosting Site in the specified parent Firebase project. Note that Hosting sites can take several minutes to propagate through Firebase systems.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:firebasehosting/v1beta1:Site")
public class Site extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id) associated with the Hosting site.
     * 
     */
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id) associated with the Hosting site.
     * 
     */
    public Output<String> getAppId() {
        return this.appId;
    }
    /**
     * The default URL for the Hosting site.
     * 
     */
    @OutputExport(name="defaultUrl", type=String.class, parameters={})
    private Output<String> defaultUrl;

    /**
     * @return The default URL for the Hosting site.
     * 
     */
    public Output<String> getDefaultUrl() {
        return this.defaultUrl;
    }
    /**
     * Optional. User-specified labels for the Hosting site.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. User-specified labels for the Hosting site.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The fully-qualified resource name of the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project's [`ProjectNumber`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully-qualified resource name of the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project's [`ProjectNumber`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of Hosting site. Every Firebase project has a `DEFAULT_SITE`, which is created when Hosting is provisioned for the project. All additional sites are `USER_SITE`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Hosting site. Every Firebase project has a `DEFAULT_SITE`, which is created when Hosting is provisioned for the project. All additional sites are `USER_SITE`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Site(String name, SiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasehosting/v1beta1:Site", name, args == null ? SiteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Site(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasehosting/v1beta1:Site", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Site get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Site(name, id, options);
    }
}
