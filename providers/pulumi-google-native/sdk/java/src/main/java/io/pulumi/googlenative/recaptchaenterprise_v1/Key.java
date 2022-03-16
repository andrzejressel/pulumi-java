// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.recaptchaenterprise_v1.KeyArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1WafSettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new reCAPTCHA Enterprise key.
 * 
 */
@ResourceType(type="google-native:recaptchaenterprise/v1:Key")
public class Key extends io.pulumi.resources.CustomResource {
    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    @Export(name="androidSettings", type=GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse> androidSettings;

    /**
     * @return Settings for keys that can be used by Android apps.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse> getAndroidSettings() {
        return this.androidSettings;
    }
    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp corresponding to the creation of this Key.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-readable display name of this key. Modifiable by user.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    @Export(name="iosSettings", type=GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse> iosSettings;

    /**
     * @return Settings for keys that can be used by iOS apps.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse> getIosSettings() {
        return this.iosSettings;
    }
    /**
     * See Creating and managing labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return See Creating and managing labels.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Options for user acceptance testing.
     * 
     */
    @Export(name="testingOptions", type=GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse> testingOptions;

    /**
     * @return Options for user acceptance testing.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse> getTestingOptions() {
        return this.testingOptions;
    }
    /**
     * Settings for WAF
     * 
     */
    @Export(name="wafSettings", type=GoogleCloudRecaptchaenterpriseV1WafSettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsResponse> wafSettings;

    /**
     * @return Settings for WAF
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsResponse> getWafSettings() {
        return this.wafSettings;
    }
    /**
     * Settings for keys that can be used by websites.
     * 
     */
    @Export(name="webSettings", type=GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse> webSettings;

    /**
     * @return Settings for keys that can be used by websites.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse> getWebSettings() {
        return this.webSettings;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable KeyArgs.Builder a);
    }
    private static io.pulumi.googlenative.recaptchaenterprise_v1.KeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.recaptchaenterprise_v1.KeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Key(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, @Nullable KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, @Nullable KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recaptchaenterprise/v1:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Key(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recaptchaenterprise/v1:Key", name, null, makeResourceOptions(options, id));
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
    public static Key get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
