// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.StandardAppVersionArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionState;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionAutomaticScaling;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionBasicScaling;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionDeployment;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionEntrypoint;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionHandler;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionLibrary;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionManualScaling;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionVpcAccessConnector;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Standard App Version resource to create a new version of standard GAE Application.
 * Learn about the differences between the standard environment and the flexible environment
 * at https://cloud.google.com/appengine/docs/the-appengine-environments.
 * Currently supporting Zip and File Containers.
 * 
 * To get more information about StandardAppVersion, see:
 * 
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/appengine/docs/standard)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * StandardAppVersion can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/standardAppVersion:StandardAppVersion default apps/{{project}}/services/{{service}}/versions/{{version_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/standardAppVersion:StandardAppVersion default {{project}}/{{service}}/{{version_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/standardAppVersion:StandardAppVersion default {{service}}/{{version_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:appengine/standardAppVersion:StandardAppVersion")
public class StandardAppVersion extends io.pulumi.resources.CustomResource {
    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="automaticScaling", type=StandardAppVersionAutomaticScaling.class, parameters={})
    private Output</* @Nullable */ StandardAppVersionAutomaticScaling> automaticScaling;

    /**
     * @return Automatic scaling is based on request rate, response latencies, and other application metrics.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ StandardAppVersionAutomaticScaling> getAutomaticScaling() {
        return this.automaticScaling;
    }
    /**
     * Basic scaling creates instances when your application receives requests. Each instance will be shut down when the application becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="basicScaling", type=StandardAppVersionBasicScaling.class, parameters={})
    private Output</* @Nullable */ StandardAppVersionBasicScaling> basicScaling;

    /**
     * @return Basic scaling creates instances when your application receives requests. Each instance will be shut down when the application becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ StandardAppVersionBasicScaling> getBasicScaling() {
        return this.basicScaling;
    }
    /**
     * If set to `true`, the service will be deleted if it is the last version.
     * 
     */
    @OutputExport(name="deleteServiceOnDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteServiceOnDestroy;

    /**
     * @return If set to `true`, the service will be deleted if it is the last version.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeleteServiceOnDestroy() {
        return this.deleteServiceOnDestroy;
    }
    /**
     * Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="deployment", type=StandardAppVersionDeployment.class, parameters={})
    private Output<StandardAppVersionDeployment> deployment;

    /**
     * @return Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    public Output<StandardAppVersionDeployment> getDeployment() {
        return this.deployment;
    }
    /**
     * The entrypoint for the application.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="entrypoint", type=StandardAppVersionEntrypoint.class, parameters={})
    private Output<StandardAppVersionEntrypoint> entrypoint;

    /**
     * @return The entrypoint for the application.
     * Structure is documented below.
     * 
     */
    public Output<StandardAppVersionEntrypoint> getEntrypoint() {
        return this.entrypoint;
    }
    /**
     * Environment variables available to the application.
     * 
     */
    @OutputExport(name="envVariables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> envVariables;

    /**
     * @return Environment variables available to the application.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getEnvVariables() {
        return this.envVariables;
    }
    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests.
     * The first matching URL handles the request and other request handlers are not attempted.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="handlers", type=List.class, parameters={StandardAppVersionHandler.class})
    private Output<List<StandardAppVersionHandler>> handlers;

    /**
     * @return An ordered list of URL-matching patterns that should be applied to incoming requests.
     * The first matching URL handles the request and other request handlers are not attempted.
     * Structure is documented below.
     * 
     */
    public Output<List<StandardAppVersionHandler>> getHandlers() {
        return this.handlers;
    }
    /**
     * A list of the types of messages that this application is able to receive.
     * Each value may be one of `INBOUND_SERVICE_MAIL`, `INBOUND_SERVICE_MAIL_BOUNCE`, `INBOUND_SERVICE_XMPP_ERROR`, `INBOUND_SERVICE_XMPP_MESSAGE`, `INBOUND_SERVICE_XMPP_SUBSCRIBE`, `INBOUND_SERVICE_XMPP_PRESENCE`, `INBOUND_SERVICE_CHANNEL_PRESENCE`, and `INBOUND_SERVICE_WARMUP`.
     * 
     */
    @OutputExport(name="inboundServices", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> inboundServices;

    /**
     * @return A list of the types of messages that this application is able to receive.
     * Each value may be one of `INBOUND_SERVICE_MAIL`, `INBOUND_SERVICE_MAIL_BOUNCE`, `INBOUND_SERVICE_XMPP_ERROR`, `INBOUND_SERVICE_XMPP_MESSAGE`, `INBOUND_SERVICE_XMPP_SUBSCRIBE`, `INBOUND_SERVICE_XMPP_PRESENCE`, `INBOUND_SERVICE_CHANNEL_PRESENCE`, and `INBOUND_SERVICE_WARMUP`.
     * 
     */
    public Output</* @Nullable */ List<String>> getInboundServices() {
        return this.inboundServices;
    }
    /**
     * Instance class that is used to run this version. Valid values are
     * AutomaticScaling: F1, F2, F4, F4_1G
     * BasicScaling or ManualScaling: B1, B2, B4, B4_1G, B8
     * Defaults to F1 for AutomaticScaling and B2 for ManualScaling and BasicScaling. If no scaling is specified, AutomaticScaling is chosen.
     * 
     */
    @OutputExport(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return Instance class that is used to run this version. Valid values are
     * AutomaticScaling: F1, F2, F4, F4_1G
     * BasicScaling or ManualScaling: B1, B2, B4, B4_1G, B8
     * Defaults to F1 for AutomaticScaling and B2 for ManualScaling and BasicScaling. If no scaling is specified, AutomaticScaling is chosen.
     * 
     */
    public Output<String> getInstanceClass() {
        return this.instanceClass;
    }
    /**
     * Configuration for third-party Python runtime libraries that are required by the application.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="libraries", type=List.class, parameters={StandardAppVersionLibrary.class})
    private Output</* @Nullable */ List<StandardAppVersionLibrary>> libraries;

    /**
     * @return Configuration for third-party Python runtime libraries that are required by the application.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<StandardAppVersionLibrary>> getLibraries() {
        return this.libraries;
    }
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="manualScaling", type=StandardAppVersionManualScaling.class, parameters={})
    private Output</* @Nullable */ StandardAppVersionManualScaling> manualScaling;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ StandardAppVersionManualScaling> getManualScaling() {
        return this.manualScaling;
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * If set to `true`, the application version will not be deleted.
     * 
     */
    @OutputExport(name="noopOnDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noopOnDestroy;

    /**
     * @return If set to `true`, the application version will not be deleted.
     * 
     */
    public Output</* @Nullable */ Boolean> getNoopOnDestroy() {
        return this.noopOnDestroy;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Desired runtime. Example python27.
     * 
     */
    @OutputExport(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return Desired runtime. Example python27.
     * 
     */
    public Output<String> getRuntime() {
        return this.runtime;
    }
    /**
     * The version of the API in the given runtime environment.
     * Please see the app.yaml reference for valid values at `https://cloud.google.com/appengine/docs/standard/<language>/config/appref`\
     * Substitute `<language>` with `python`, `java`, `php`, `ruby`, `go` or `nodejs`.
     * 
     */
    @OutputExport(name="runtimeApiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeApiVersion;

    /**
     * @return The version of the API in the given runtime environment.
     * Please see the app.yaml reference for valid values at `https://cloud.google.com/appengine/docs/standard/<language>/config/appref`\
     * Substitute `<language>` with `python`, `java`, `php`, `ruby`, `go` or `nodejs`.
     * 
     */
    public Output</* @Nullable */ String> getRuntimeApiVersion() {
        return this.runtimeApiVersion;
    }
    /**
     * AppEngine service resource
     * 
     */
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return AppEngine service resource
     * 
     */
    public Output<String> getService() {
        return this.service;
    }
    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    @OutputExport(name="threadsafe", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> threadsafe;

    /**
     * @return Whether multiple requests can be dispatched to this version at once.
     * 
     */
    public Output</* @Nullable */ Boolean> getThreadsafe() {
        return this.threadsafe;
    }
    /**
     * Relative name of the version within the service. For example, `v1`. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names,"default", "latest", and any name with the prefix "ah-".
     * 
     */
    @OutputExport(name="versionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionId;

    /**
     * @return Relative name of the version within the service. For example, `v1`. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names,"default", "latest", and any name with the prefix "ah-".
     * 
     */
    public Output</* @Nullable */ String> getVersionId() {
        return this.versionId;
    }
    /**
     * Enables VPC connectivity for standard apps.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="vpcAccessConnector", type=StandardAppVersionVpcAccessConnector.class, parameters={})
    private Output</* @Nullable */ StandardAppVersionVpcAccessConnector> vpcAccessConnector;

    /**
     * @return Enables VPC connectivity for standard apps.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ StandardAppVersionVpcAccessConnector> getVpcAccessConnector() {
        return this.vpcAccessConnector;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StandardAppVersion(String name, StandardAppVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/standardAppVersion:StandardAppVersion", name, args == null ? StandardAppVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StandardAppVersion(String name, Input<String> id, @Nullable StandardAppVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/standardAppVersion:StandardAppVersion", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StandardAppVersion get(String name, Input<String> id, @Nullable StandardAppVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StandardAppVersion(name, id, state, options);
    }
}
