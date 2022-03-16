// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.SecurityProfileArgs;
import io.pulumi.awsnative.iot.outputs.SecurityProfileBehavior;
import io.pulumi.awsnative.iot.outputs.SecurityProfileMetricToRetain;
import io.pulumi.awsnative.iot.outputs.SecurityProfileTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A security profile defines a set of expected behaviors for devices in your account.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iot:SecurityProfile")
public class SecurityProfile extends io.pulumi.resources.CustomResource {
    /**
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
     * 
     */
    @Export(name="additionalMetricsToRetainV2", type=List.class, parameters={SecurityProfileMetricToRetain.class})
    private Output</* @Nullable */ List<SecurityProfileMetricToRetain>> additionalMetricsToRetainV2;

    /**
     * @return A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
     * 
     */
    public Output</* @Nullable */ List<SecurityProfileMetricToRetain>> getAdditionalMetricsToRetainV2() {
        return this.additionalMetricsToRetainV2;
    }
    /**
     * Specifies the destinations to which alerts are sent.
     * 
     */
    @Export(name="alertTargets", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> alertTargets;

    /**
     * @return Specifies the destinations to which alerts are sent.
     * 
     */
    public Output</* @Nullable */ Object> getAlertTargets() {
        return this.alertTargets;
    }
    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * 
     */
    @Export(name="behaviors", type=List.class, parameters={SecurityProfileBehavior.class})
    private Output</* @Nullable */ List<SecurityProfileBehavior>> behaviors;

    /**
     * @return Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * 
     */
    public Output</* @Nullable */ List<SecurityProfileBehavior>> getBehaviors() {
        return this.behaviors;
    }
    /**
     * The ARN (Amazon resource name) of the created security profile.
     * 
     */
    @Export(name="securityProfileArn", type=String.class, parameters={})
    private Output<String> securityProfileArn;

    /**
     * @return The ARN (Amazon resource name) of the created security profile.
     * 
     */
    public Output<String> getSecurityProfileArn() {
        return this.securityProfileArn;
    }
    /**
     * A description of the security profile.
     * 
     */
    @Export(name="securityProfileDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityProfileDescription;

    /**
     * @return A description of the security profile.
     * 
     */
    public Output</* @Nullable */ String> getSecurityProfileDescription() {
        return this.securityProfileDescription;
    }
    /**
     * A unique identifier for the security profile.
     * 
     */
    @Export(name="securityProfileName", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityProfileName;

    /**
     * @return A unique identifier for the security profile.
     * 
     */
    public Output</* @Nullable */ String> getSecurityProfileName() {
        return this.securityProfileName;
    }
    /**
     * Metadata that can be used to manage the security profile.
     * 
     */
    @Export(name="tags", type=List.class, parameters={SecurityProfileTag.class})
    private Output</* @Nullable */ List<SecurityProfileTag>> tags;

    /**
     * @return Metadata that can be used to manage the security profile.
     * 
     */
    public Output</* @Nullable */ List<SecurityProfileTag>> getTags() {
        return this.tags;
    }
    /**
     * A set of target ARNs that the security profile is attached to.
     * 
     */
    @Export(name="targetArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetArns;

    /**
     * @return A set of target ARNs that the security profile is attached to.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetArns() {
        return this.targetArns;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SecurityProfileArgs.Builder a);
    }
    private static io.pulumi.awsnative.iot.SecurityProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iot.SecurityProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityProfile(String name) {
        this(name, SecurityProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityProfile(String name, @Nullable SecurityProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityProfile(String name, @Nullable SecurityProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:SecurityProfile", name, args == null ? SecurityProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SecurityProfile(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:SecurityProfile", name, null, makeResourceOptions(options, id));
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
    public static SecurityProfile get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityProfile(name, id, options);
    }
}
