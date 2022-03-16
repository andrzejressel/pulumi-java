// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.CertificateArgs;
import io.pulumi.awsnative.iot.enums.CertificateMode;
import io.pulumi.awsnative.iot.enums.CertificateStatus;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Use the AWS::IoT::Certificate resource to declare an AWS IoT X.509 certificate.
 * 
 */
@ResourceType(type="aws-native:iot:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="cACertificatePem", type=String.class, parameters={})
    private Output</* @Nullable */ String> cACertificatePem;

    public Output</* @Nullable */ String> getCACertificatePem() {
        return this.cACertificatePem;
    }
    @Export(name="certificateMode", type=CertificateMode.class, parameters={})
    private Output</* @Nullable */ CertificateMode> certificateMode;

    public Output</* @Nullable */ CertificateMode> getCertificateMode() {
        return this.certificateMode;
    }
    @Export(name="certificatePem", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificatePem;

    public Output</* @Nullable */ String> getCertificatePem() {
        return this.certificatePem;
    }
    @Export(name="certificateSigningRequest", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateSigningRequest;

    public Output</* @Nullable */ String> getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    @Export(name="status", type=CertificateStatus.class, parameters={})
    private Output<CertificateStatus> status;

    public Output<CertificateStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(CertificateArgs.Builder a);
    }
    private static io.pulumi.awsnative.iot.CertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iot.CertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Certificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:Certificate", name, null, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}
