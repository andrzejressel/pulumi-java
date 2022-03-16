// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.FuotaTaskArgs;
import io.pulumi.awsnative.iotwireless.outputs.FuotaTaskLoRaWAN;
import io.pulumi.awsnative.iotwireless.outputs.FuotaTaskTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create and manage FUOTA tasks.
 * 
 */
@ResourceType(type="aws-native:iotwireless:FuotaTask")
public class FuotaTask extends io.pulumi.resources.CustomResource {
    /**
     * FUOTA task arn. Returned after successful create.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return FUOTA task arn. Returned after successful create.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Multicast group to associate. Only for update request.
     * 
     */
    @Export(name="associateMulticastGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> associateMulticastGroup;

    /**
     * @return Multicast group to associate. Only for update request.
     * 
     */
    public Output</* @Nullable */ String> getAssociateMulticastGroup() {
        return this.associateMulticastGroup;
    }
    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    @Export(name="associateWirelessDevice", type=String.class, parameters={})
    private Output</* @Nullable */ String> associateWirelessDevice;

    /**
     * @return Wireless device to associate. Only for update request.
     * 
     */
    public Output</* @Nullable */ String> getAssociateWirelessDevice() {
        return this.associateWirelessDevice;
    }
    /**
     * FUOTA task description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return FUOTA task description
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Multicast group to disassociate. Only for update request.
     * 
     */
    @Export(name="disassociateMulticastGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> disassociateMulticastGroup;

    /**
     * @return Multicast group to disassociate. Only for update request.
     * 
     */
    public Output</* @Nullable */ String> getDisassociateMulticastGroup() {
        return this.disassociateMulticastGroup;
    }
    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    @Export(name="disassociateWirelessDevice", type=String.class, parameters={})
    private Output</* @Nullable */ String> disassociateWirelessDevice;

    /**
     * @return Wireless device to disassociate. Only for update request.
     * 
     */
    public Output</* @Nullable */ String> getDisassociateWirelessDevice() {
        return this.disassociateWirelessDevice;
    }
    /**
     * FUOTA task firmware update image binary S3 link
     * 
     */
    @Export(name="firmwareUpdateImage", type=String.class, parameters={})
    private Output<String> firmwareUpdateImage;

    /**
     * @return FUOTA task firmware update image binary S3 link
     * 
     */
    public Output<String> getFirmwareUpdateImage() {
        return this.firmwareUpdateImage;
    }
    /**
     * FUOTA task firmware IAM role for reading S3
     * 
     */
    @Export(name="firmwareUpdateRole", type=String.class, parameters={})
    private Output<String> firmwareUpdateRole;

    /**
     * @return FUOTA task firmware IAM role for reading S3
     * 
     */
    public Output<String> getFirmwareUpdateRole() {
        return this.firmwareUpdateRole;
    }
    /**
     * FUOTA task status. Returned after successful read.
     * 
     */
    @Export(name="fuotaTaskStatus", type=String.class, parameters={})
    private Output<String> fuotaTaskStatus;

    /**
     * @return FUOTA task status. Returned after successful read.
     * 
     */
    public Output<String> getFuotaTaskStatus() {
        return this.fuotaTaskStatus;
    }
    /**
     * FUOTA task LoRaWAN
     * 
     */
    @Export(name="loRaWAN", type=FuotaTaskLoRaWAN.class, parameters={})
    private Output<FuotaTaskLoRaWAN> loRaWAN;

    /**
     * @return FUOTA task LoRaWAN
     * 
     */
    public Output<FuotaTaskLoRaWAN> getLoRaWAN() {
        return this.loRaWAN;
    }
    /**
     * Name of FUOTA task
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of FUOTA task
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    @Export(name="tags", type=List.class, parameters={FuotaTaskTag.class})
    private Output</* @Nullable */ List<FuotaTaskTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    public Output</* @Nullable */ List<FuotaTaskTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(FuotaTaskArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotwireless.FuotaTaskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotwireless.FuotaTaskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FuotaTask(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FuotaTask(String name) {
        this(name, FuotaTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FuotaTask(String name, FuotaTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FuotaTask(String name, FuotaTaskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:FuotaTask", name, args == null ? FuotaTaskArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FuotaTask(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:FuotaTask", name, null, makeResourceOptions(options, id));
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
    public static FuotaTask get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FuotaTask(name, id, options);
    }
}
