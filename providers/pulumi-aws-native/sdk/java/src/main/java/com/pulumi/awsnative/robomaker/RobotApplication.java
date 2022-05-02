// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.robomaker.RobotApplicationArgs;
import com.pulumi.awsnative.robomaker.outputs.RobotApplicationRobotSoftwareSuite;
import com.pulumi.awsnative.robomaker.outputs.RobotApplicationSourceConfig;
import com.pulumi.awsnative.robomaker.outputs.RobotApplicationTags;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * AWS::RoboMaker::RobotApplication resource creates an AWS RoboMaker RobotApplication. Robot application can be used in AWS RoboMaker Simulation Jobs.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:robomaker:RobotApplication")
public class RobotApplication extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The revision ID of robot application.
     * 
     */
    @Export(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    /**
     * @return The revision ID of robot application.
     * 
     */
    public Output<Optional<String>> currentRevisionId() {
        return Codegen.optional(this.currentRevisionId);
    }
    /**
     * The URI of the Docker image for the robot application.
     * 
     */
    @Export(name="environment", type=String.class, parameters={})
    private Output</* @Nullable */ String> environment;

    /**
     * @return The URI of the Docker image for the robot application.
     * 
     */
    public Output<Optional<String>> environment() {
        return Codegen.optional(this.environment);
    }
    /**
     * The name of the robot application.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the robot application.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    @Export(name="robotSoftwareSuite", type=RobotApplicationRobotSoftwareSuite.class, parameters={})
    private Output<RobotApplicationRobotSoftwareSuite> robotSoftwareSuite;

    public Output<RobotApplicationRobotSoftwareSuite> robotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }
    /**
     * The sources of the robot application.
     * 
     */
    @Export(name="sources", type=List.class, parameters={RobotApplicationSourceConfig.class})
    private Output</* @Nullable */ List<RobotApplicationSourceConfig>> sources;

    /**
     * @return The sources of the robot application.
     * 
     */
    public Output<Optional<List<RobotApplicationSourceConfig>>> sources() {
        return Codegen.optional(this.sources);
    }
    @Export(name="tags", type=RobotApplicationTags.class, parameters={})
    private Output</* @Nullable */ RobotApplicationTags> tags;

    public Output<Optional<RobotApplicationTags>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RobotApplication(String name) {
        this(name, RobotApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RobotApplication(String name, RobotApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RobotApplication(String name, RobotApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:RobotApplication", name, args == null ? RobotApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RobotApplication(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:RobotApplication", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RobotApplication get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RobotApplication(name, id, options);
    }
}
