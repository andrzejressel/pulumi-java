// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.LiveEventArgs;
import io.pulumi.azurenative.media.outputs.CrossSiteAccessPoliciesResponse;
import io.pulumi.azurenative.media.outputs.LiveEventEncodingResponse;
import io.pulumi.azurenative.media.outputs.LiveEventInputResponse;
import io.pulumi.azurenative.media.outputs.LiveEventPreviewResponse;
import io.pulumi.azurenative.media.outputs.LiveEventTranscriptionResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The live event.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:LiveEvent myLiveEvent1 /subscriptions/0a6ec948-5a62-437d-b9df-934dc7c1b722/resourceGroups/mediaresources/providers/Microsoft.Media/mediaservices/slitestmedia10/liveevents/myLiveEvent1 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:LiveEvent")
public class LiveEvent extends io.pulumi.resources.CustomResource {
    /**
     * The creation time for the live event
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The creation time for the live event
     * 
     */
    public Output<String> getCreated() {
        return this.created;
    }
    /**
     * Live event cross site access policies.
     * 
     */
    @Export(name="crossSiteAccessPolicies", type=CrossSiteAccessPoliciesResponse.class, parameters={})
    private Output</* @Nullable */ CrossSiteAccessPoliciesResponse> crossSiteAccessPolicies;

    /**
     * @return Live event cross site access policies.
     * 
     */
    public Output</* @Nullable */ CrossSiteAccessPoliciesResponse> getCrossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies;
    }
    /**
     * A description for the live event.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the live event.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     */
    @Export(name="encoding", type=LiveEventEncodingResponse.class, parameters={})
    private Output</* @Nullable */ LiveEventEncodingResponse> encoding;

    /**
     * @return Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     */
    public Output</* @Nullable */ LiveEventEncodingResponse> getEncoding() {
        return this.encoding;
    }
    /**
     * When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     */
    @Export(name="hostnamePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostnamePrefix;

    /**
     * @return When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     */
    public Output</* @Nullable */ String> getHostnamePrefix() {
        return this.hostnamePrefix;
    }
    /**
     * Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     */
    @Export(name="input", type=LiveEventInputResponse.class, parameters={})
    private Output<LiveEventInputResponse> input;

    /**
     * @return Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     */
    public Output<LiveEventInputResponse> getInput() {
        return this.input;
    }
    /**
     * The last modified time of the live event.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The last modified time of the live event.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     */
    @Export(name="preview", type=LiveEventPreviewResponse.class, parameters={})
    private Output</* @Nullable */ LiveEventPreviewResponse> preview;

    /**
     * @return Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     */
    public Output</* @Nullable */ LiveEventPreviewResponse> getPreview() {
        return this.preview;
    }
    /**
     * The provisioning state of the live event.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the live event.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
     */
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     * 
     */
    @Export(name="streamOptions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> streamOptions;

    /**
     * @return The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     * 
     */
    public Output</* @Nullable */ List<String>> getStreamOptions() {
        return this.streamOptions;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     */
    @Export(name="transcriptions", type=List.class, parameters={LiveEventTranscriptionResponse.class})
    private Output</* @Nullable */ List<LiveEventTranscriptionResponse>> transcriptions;

    /**
     * @return Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     */
    public Output</* @Nullable */ List<LiveEventTranscriptionResponse>> getTranscriptions() {
        return this.transcriptions;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
     */
    @Export(name="useStaticHostname", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useStaticHostname;

    /**
     * @return Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
     */
    public Output</* @Nullable */ Boolean> getUseStaticHostname() {
        return this.useStaticHostname;
    }

    public interface BuilderApplicator {
        public void apply(LiveEventArgs.Builder a);
    }
    private static io.pulumi.azurenative.media.LiveEventArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.media.LiveEventArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LiveEvent(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiveEvent(String name) {
        this(name, LiveEventArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiveEvent(String name, LiveEventArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiveEvent(String name, LiveEventArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:LiveEvent", name, args == null ? LiveEventArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LiveEvent(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:LiveEvent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20180330preview:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180601preview:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180701:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20190501preview:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200501:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:LiveEvent").build())
            ))
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
    public static LiveEvent get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LiveEvent(name, id, options);
    }
}
