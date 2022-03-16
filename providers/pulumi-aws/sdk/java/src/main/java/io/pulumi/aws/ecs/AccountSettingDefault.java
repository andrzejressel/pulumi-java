// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.AccountSettingDefaultArgs;
import io.pulumi.aws.ecs.inputs.AccountSettingDefaultState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an ECS default account setting for a specific ECS Resource name within a specific region. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html).
 * 
 * > **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.
 * 
 * > **NOTE:** Your AWS account may not support disabling `containerInstanceLongArnFormat`, `serviceLongArnFormat`, and `taskLongArnFormat`. If your account does not support disabling these, "destroying" this resource will not disable the setting nor cause a provider error. However, the AWS Provider will log an AWS error: `InvalidParameterException: You can no longer disable Long Arn settings`.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECS Account Setting defaults can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecs/accountSettingDefault:AccountSettingDefault example taskLongArnFormat
 * ```
 * 
 */
@ResourceType(type="aws:ecs/accountSettingDefault:AccountSettingDefault")
public class AccountSettingDefault extends io.pulumi.resources.CustomResource {
    /**
     * Name of the account setting to set. Valid values are `serviceLongArnFormat`, `taskLongArnFormat`, `containerInstanceLongArnFormat`, `awsvpcTrunking` and `containerInsights`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the account setting to set. Valid values are `serviceLongArnFormat`, `taskLongArnFormat`, `containerInstanceLongArnFormat`, `awsvpcTrunking` and `containerInsights`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="principalArn", type=String.class, parameters={})
    private Output<String> principalArn;

    public Output<String> getPrincipalArn() {
        return this.principalArn;
    }
    /**
     * State of the setting. Valid values are `enabled` and `disabled`.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return State of the setting. Valid values are `enabled` and `disabled`.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(AccountSettingDefaultArgs.Builder a);
    }
    private static io.pulumi.aws.ecs.AccountSettingDefaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecs.AccountSettingDefaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccountSettingDefault(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountSettingDefault(String name) {
        this(name, AccountSettingDefaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountSettingDefault(String name, AccountSettingDefaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountSettingDefault(String name, AccountSettingDefaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/accountSettingDefault:AccountSettingDefault", name, args == null ? AccountSettingDefaultArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AccountSettingDefault(String name, Output<String> id, @Nullable AccountSettingDefaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/accountSettingDefault:AccountSettingDefault", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccountSettingDefault get(String name, Output<String> id, @Nullable AccountSettingDefaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccountSettingDefault(name, id, state, options);
    }
}
