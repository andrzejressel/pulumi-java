// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.StudyArgs;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__StudyConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a study.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:ml/v1:Study")
public class Study extends io.pulumi.resources.CustomResource {
    /**
     * Time at which the study was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the study was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A human readable reason why the Study is inactive. This should be empty if a study is ACTIVE or COMPLETED.
     * 
     */
    @OutputExport(name="inactiveReason", type=String.class, parameters={})
    private Output<String> inactiveReason;

    /**
     * @return A human readable reason why the Study is inactive. This should be empty if a study is ACTIVE or COMPLETED.
     * 
     */
    public Output<String> getInactiveReason() {
        return this.inactiveReason;
    }
    /**
     * The name of a study.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of a study.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The detailed state of a study.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The detailed state of a study.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Configuration of the study.
     * 
     */
    @OutputExport(name="studyConfig", type=GoogleCloudMlV1__StudyConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__StudyConfigResponse> studyConfig;

    /**
     * @return Configuration of the study.
     * 
     */
    public Output<GoogleCloudMlV1__StudyConfigResponse> getStudyConfig() {
        return this.studyConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Study(String name, StudyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Study", name, args == null ? StudyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Study(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Study", name, null, makeResourceOptions(options, id));
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
    public static Study get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Study(name, id, options);
    }
}
