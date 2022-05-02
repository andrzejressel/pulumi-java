// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.robomaker.SimulationApplicationArgs;
import com.pulumi.awsnative.robomaker.outputs.SimulationApplicationRenderingEngine;
import com.pulumi.awsnative.robomaker.outputs.SimulationApplicationRobotSoftwareSuite;
import com.pulumi.awsnative.robomaker.outputs.SimulationApplicationSimulationSoftwareSuite;
import com.pulumi.awsnative.robomaker.outputs.SimulationApplicationSourceConfig;
import com.pulumi.awsnative.robomaker.outputs.SimulationApplicationTags;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * AWS::RoboMaker::SimulationApplication resource creates an AWS RoboMaker SimulationApplication. Simulation application can be used in AWS RoboMaker Simulation Jobs.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:robomaker:SimulationApplication")
public class SimulationApplication extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The current revision id.
     * 
     */
    @Export(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    /**
     * @return The current revision id.
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
     * The name of the simulation application.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the simulation application.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The rendering engine for the simulation application.
     * 
     */
    @Export(name="renderingEngine", type=SimulationApplicationRenderingEngine.class, parameters={})
    private Output</* @Nullable */ SimulationApplicationRenderingEngine> renderingEngine;

    /**
     * @return The rendering engine for the simulation application.
     * 
     */
    public Output<Optional<SimulationApplicationRenderingEngine>> renderingEngine() {
        return Codegen.optional(this.renderingEngine);
    }
    /**
     * The robot software suite used by the simulation application.
     * 
     */
    @Export(name="robotSoftwareSuite", type=SimulationApplicationRobotSoftwareSuite.class, parameters={})
    private Output<SimulationApplicationRobotSoftwareSuite> robotSoftwareSuite;

    /**
     * @return The robot software suite used by the simulation application.
     * 
     */
    public Output<SimulationApplicationRobotSoftwareSuite> robotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }
    /**
     * The simulation software suite used by the simulation application.
     * 
     */
    @Export(name="simulationSoftwareSuite", type=SimulationApplicationSimulationSoftwareSuite.class, parameters={})
    private Output<SimulationApplicationSimulationSoftwareSuite> simulationSoftwareSuite;

    /**
     * @return The simulation software suite used by the simulation application.
     * 
     */
    public Output<SimulationApplicationSimulationSoftwareSuite> simulationSoftwareSuite() {
        return this.simulationSoftwareSuite;
    }
    /**
     * The sources of the simulation application.
     * 
     */
    @Export(name="sources", type=List.class, parameters={SimulationApplicationSourceConfig.class})
    private Output</* @Nullable */ List<SimulationApplicationSourceConfig>> sources;

    /**
     * @return The sources of the simulation application.
     * 
     */
    public Output<Optional<List<SimulationApplicationSourceConfig>>> sources() {
        return Codegen.optional(this.sources);
    }
    @Export(name="tags", type=SimulationApplicationTags.class, parameters={})
    private Output</* @Nullable */ SimulationApplicationTags> tags;

    public Output<Optional<SimulationApplicationTags>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SimulationApplication(String name) {
        this(name, SimulationApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SimulationApplication(String name, SimulationApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SimulationApplication(String name, SimulationApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplication", name, args == null ? SimulationApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SimulationApplication(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplication", name, null, makeResourceOptions(options, id));
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
    public static SimulationApplication get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SimulationApplication(name, id, options);
    }
}
