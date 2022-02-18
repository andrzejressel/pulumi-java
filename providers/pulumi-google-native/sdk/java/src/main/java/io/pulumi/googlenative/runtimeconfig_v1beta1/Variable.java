// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.runtimeconfig_v1beta1.VariableArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a variable within the given configuration. You cannot create a variable with a name that is a prefix of an existing variable name, or a name that has an existing variable name as a prefix. To learn more about creating a variable, read the [Setting and Getting Data](/deployment-manager/runtime-configurator/set-and-get-variables) documentation.
 * 
 */
@ResourceType(type="google-native:runtimeconfig/v1beta1:Variable")
public class Variable extends io.pulumi.resources.CustomResource {
    /**
     * The name of the variable resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple slashes are coalesced into single slash character. Each path segment should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot change the variable name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the variable resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple slashes are coalesced into single slash character. Each path segment should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot change the variable name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current state of the variable. The variable state indicates the outcome of the `variables().watch` call and is visible through the `get` and `list` calls.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the variable. The variable state indicates the outcome of the `variables().watch` call and is visible through the `get` and `list` calls.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The string value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
     * 
     */
    @OutputExport(name="text", type=String.class, parameters={})
    private Output<String> text;

    /**
     * @return The string value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
     * 
     */
    public Output<String> getText() {
        return this.text;
    }
    /**
     * The time of the last variable update. Timestamp will be UTC timestamp.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time of the last variable update. Timestamp will be UTC timestamp.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648 (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The binary value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648 (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Variable(String name, VariableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:runtimeconfig/v1beta1:Variable", name, args == null ? VariableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Variable(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:runtimeconfig/v1beta1:Variable", name, null, makeResourceOptions(options, id));
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
    public static Variable get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Variable(name, id, options);
    }
}
