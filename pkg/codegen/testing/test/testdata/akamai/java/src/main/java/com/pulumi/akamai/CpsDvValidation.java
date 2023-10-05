// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CpsDvValidationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CpsDvValidationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/cpsDvValidation:CpsDvValidation")
public class CpsDvValidation extends com.pulumi.resources.CustomResource {
    /**
     * The unique identifier of enrollment
     * 
     */
    @Export(name="enrollmentId", refs={Integer.class}, tree="[0]")
    private Output<Integer> enrollmentId;

    /**
     * @return The unique identifier of enrollment
     * 
     */
    public Output<Integer> enrollmentId() {
        return this.enrollmentId;
    }
    /**
     * List of SANs
     * 
     */
    @Export(name="sans", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sans;

    /**
     * @return List of SANs
     * 
     */
    public Output<Optional<List<String>>> sans() {
        return Codegen.optional(this.sans);
    }
    /**
     * Status of validation
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of validation
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CpsDvValidation(String name) {
        this(name, CpsDvValidationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CpsDvValidation(String name, CpsDvValidationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CpsDvValidation(String name, CpsDvValidationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cpsDvValidation:CpsDvValidation", name, args == null ? CpsDvValidationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CpsDvValidation(String name, Output<String> id, @Nullable CpsDvValidationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cpsDvValidation:CpsDvValidation", name, state, makeResourceOptions(options, id));
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
    public static CpsDvValidation get(String name, Output<String> id, @Nullable CpsDvValidationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CpsDvValidation(name, id, state, options);
    }
}
