// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.osconfig.PatchDeploymentArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentState;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentInstanceFilter;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentOneTimeSchedule;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfig;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentRecurringSchedule;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentRollout;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Patch deployments are configurations that individual patch jobs use to complete a patch.
 * These configurations include instance filter, package repository settings, and a schedule.
 * 
 * To get more information about PatchDeployment, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/os-patch-management)
 * 
 * ## Example Usage
 * ### Os Config Patch Deployment Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var patch = new PatchDeployment(&#34;patch&#34;, PatchDeploymentArgs.builder()        
 *             .instanceFilter(PatchDeploymentInstanceFilter.builder()
 *                 .all(true)
 *                 .build())
 *             .oneTimeSchedule(PatchDeploymentOneTimeSchedule.builder()
 *                 .executeTime(&#34;2999-10-10T10:10:10.045123456Z&#34;)
 *                 .build())
 *             .patchDeploymentId(&#34;patch-deploy&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Os Config Patch Deployment Daily
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var patch = new PatchDeployment(&#34;patch&#34;, PatchDeploymentArgs.builder()        
 *             .instanceFilter(PatchDeploymentInstanceFilter.builder()
 *                 .all(true)
 *                 .build())
 *             .patchDeploymentId(&#34;patch-deploy&#34;)
 *             .recurringSchedule(PatchDeploymentRecurringSchedule.builder()
 *                 .timeOfDay(PatchDeploymentRecurringScheduleTimeOfDay.builder()
 *                     .hours(0)
 *                     .minutes(30)
 *                     .nanos(20)
 *                     .seconds(30)
 *                     .build())
 *                 .timeZone(PatchDeploymentRecurringScheduleTimeZone.builder()
 *                     .id(&#34;America/New_York&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Os Config Patch Deployment Daily Midnight
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var patch = new PatchDeployment(&#34;patch&#34;, PatchDeploymentArgs.builder()        
 *             .instanceFilter(PatchDeploymentInstanceFilter.builder()
 *                 .all(true)
 *                 .build())
 *             .patchDeploymentId(&#34;patch-deploy&#34;)
 *             .recurringSchedule(PatchDeploymentRecurringSchedule.builder()
 *                 .timeOfDay(PatchDeploymentRecurringScheduleTimeOfDay.builder()
 *                     .hours(0)
 *                     .minutes(0)
 *                     .nanos(0)
 *                     .seconds(0)
 *                     .build())
 *                 .timeZone(PatchDeploymentRecurringScheduleTimeZone.builder()
 *                     .id(&#34;America/New_York&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Os Config Patch Deployment Instance
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var myImage = Output.of(ComputeFunctions.getImage(GetImageArgs.builder()
 *             .family(&#34;debian-9&#34;)
 *             .project(&#34;debian-cloud&#34;)
 *             .build()));
 * 
 *         var foobar = new Instance(&#34;foobar&#34;, InstanceArgs.builder()        
 *             .machineType(&#34;e2-medium&#34;)
 *             .zone(&#34;us-central1-a&#34;)
 *             .canIpForward(false)
 *             .tags(            
 *                 &#34;foo&#34;,
 *                 &#34;bar&#34;)
 *             .bootDisk(InstanceBootDisk.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParams.builder()
 *                     .image(myImage.apply(getImageResult -&gt; getImageResult.getSelfLink()))
 *                     .build())
 *                 .build())
 *             .networkInterfaces(InstanceNetworkInterface.builder()
 *                 .network(&#34;default&#34;)
 *                 .build())
 *             .metadata(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         var patch = new PatchDeployment(&#34;patch&#34;, PatchDeploymentArgs.builder()        
 *             .patchDeploymentId(&#34;patch-deploy&#34;)
 *             .instanceFilter(PatchDeploymentInstanceFilter.builder()
 *                 .instances(foobar.getId())
 *                 .build())
 *             .patchConfig(PatchDeploymentPatchConfig.builder()
 *                 .yum(PatchDeploymentPatchConfigYum.builder()
 *                     .security(true)
 *                     .minimal(true)
 *                     .excludes(&#34;bash&#34;)
 *                     .build())
 *                 .build())
 *             .recurringSchedule(PatchDeploymentRecurringSchedule.builder()
 *                 .timeZone(PatchDeploymentRecurringScheduleTimeZone.builder()
 *                     .id(&#34;America/New_York&#34;)
 *                     .build())
 *                 .timeOfDay(PatchDeploymentRecurringScheduleTimeOfDay.builder()
 *                     .hours(0)
 *                     .minutes(30)
 *                     .seconds(30)
 *                     .nanos(20)
 *                     .build())
 *                 .monthly(PatchDeploymentRecurringScheduleMonthly.builder()
 *                     .monthDay(1)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * PatchDeployment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/patchDeployment:PatchDeployment default projects/{{project}}/patchDeployments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/patchDeployment:PatchDeployment default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/patchDeployment:PatchDeployment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:osconfig/patchDeployment:PatchDeployment")
public class PatchDeployment extends com.pulumi.resources.CustomResource {
    /**
     * Time the patch deployment was created. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the patch deployment was created. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;
     * 
     */
    @Export(name="duration", type=String.class, parameters={})
    private Output</* @Nullable */ String> duration;

    /**
     * @return Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;
     * 
     */
    public Output<Optional<String>> duration() {
        return Codegen.optional(this.duration);
    }
    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @Export(name="instanceFilter", type=PatchDeploymentInstanceFilter.class, parameters={})
    private Output<PatchDeploymentInstanceFilter> instanceFilter;

    /**
     * @return VM instances to patch.
     * Structure is documented below.
     * 
     */
    public Output<PatchDeploymentInstanceFilter> instanceFilter() {
        return this.instanceFilter;
    }
    /**
     * - 
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="lastExecuteTime", type=String.class, parameters={})
    private Output<String> lastExecuteTime;

    /**
     * @return -
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> lastExecuteTime() {
        return this.lastExecuteTime;
    }
    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form:
     * projects/{project_id}/patchDeployments/{patchDeploymentId}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name for the patch deployment resource in a project. The patch deployment name is in the form:
     * projects/{project_id}/patchDeployments/{patchDeploymentId}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @Export(name="oneTimeSchedule", type=PatchDeploymentOneTimeSchedule.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentOneTimeSchedule> oneTimeSchedule;

    /**
     * @return Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    public Output<Optional<PatchDeploymentOneTimeSchedule>> oneTimeSchedule() {
        return Codegen.optional(this.oneTimeSchedule);
    }
    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @Export(name="patchConfig", type=PatchDeploymentPatchConfig.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentPatchConfig> patchConfig;

    /**
     * @return Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    public Output<Optional<PatchDeploymentPatchConfig>> patchConfig() {
        return Codegen.optional(this.patchConfig);
    }
    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @Export(name="patchDeploymentId", type=String.class, parameters={})
    private Output<String> patchDeploymentId;

    /**
     * @return A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    public Output<String> patchDeploymentId() {
        return this.patchDeploymentId;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @Export(name="recurringSchedule", type=PatchDeploymentRecurringSchedule.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentRecurringSchedule> recurringSchedule;

    /**
     * @return Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    public Output<Optional<PatchDeploymentRecurringSchedule>> recurringSchedule() {
        return Codegen.optional(this.recurringSchedule);
    }
    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @Export(name="rollout", type=PatchDeploymentRollout.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentRollout> rollout;

    /**
     * @return Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    public Output<Optional<PatchDeploymentRollout>> rollout() {
        return Codegen.optional(this.rollout);
    }
    /**
     * Time the patch deployment was last updated. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC &#34;Zulu&#34;
     * format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the patch deployment was last updated. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC &#34;Zulu&#34;
     * format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PatchDeployment(String name) {
        this(name, PatchDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchDeployment(String name, PatchDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchDeployment(String name, PatchDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/patchDeployment:PatchDeployment", name, args == null ? PatchDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PatchDeployment(String name, Output<String> id, @Nullable PatchDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/patchDeployment:PatchDeployment", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PatchDeployment get(String name, Output<String> id, @Nullable PatchDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PatchDeployment(name, id, state, options);
    }
}
