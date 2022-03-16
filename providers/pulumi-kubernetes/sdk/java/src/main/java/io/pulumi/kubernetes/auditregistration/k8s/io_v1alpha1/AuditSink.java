// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.AuditSinkArgs;
import io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.outputs.AuditSinkSpec;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AuditSink represents a cluster level audit sink
 * 
 */
@ResourceType(type="kubernetes:auditregistration.k8s.io/v1alpha1:AuditSink")
public class AuditSink extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec defines the audit configuration spec
     * 
     */
    @Export(name="spec", type=AuditSinkSpec.class, parameters={})
    private Output</* @Nullable */ AuditSinkSpec> spec;

    /**
     * @return Spec defines the audit configuration spec
     * 
     */
    public Output</* @Nullable */ AuditSinkSpec> getSpec() {
        return this.spec;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AuditSinkArgs.Builder a);
    }
    private static io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.AuditSinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.AuditSinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AuditSink(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuditSink(String name) {
        this(name, AuditSinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuditSink(String name, @Nullable AuditSinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuditSink(String name, @Nullable AuditSinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:auditregistration.k8s.io/v1alpha1:AuditSink", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private AuditSink(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:auditregistration.k8s.io/v1alpha1:AuditSink", name, null, makeResourceOptions(options, id));
    }

    private static AuditSinkArgs makeArgs(@Nullable AuditSinkArgs args) {
        var builder = args == null ? AuditSinkArgs.builder() : AuditSinkArgs.builder(args);
        return builder
            .apiVersion("auditregistration.k8s.io/v1alpha1")
            .kind("AuditSink")
            .build();
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
    public static AuditSink get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AuditSink(name, id, options);
    }
}
