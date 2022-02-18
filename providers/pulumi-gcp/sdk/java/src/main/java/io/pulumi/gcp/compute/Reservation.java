// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ReservationArgs;
import io.pulumi.gcp.compute.inputs.ReservationState;
import io.pulumi.gcp.compute.outputs.ReservationShareSettings;
import io.pulumi.gcp.compute.outputs.ReservationSpecificReservation;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a reservation resource. A reservation ensures that capacity is
 * held in a specific zone even if the reserved VMs are not running.
 * 
 * Reservations apply only to Compute Engine, Cloud Dataproc, and Google
 * Kubernetes Engine VM usage.Reservations do not apply to `f1-micro` or
 * `g1-small` machine types, preemptible VMs, sole tenant nodes, or other
 * services not listed above
 * like Cloud SQL and Dataflow.
 * 
 * To get more information about Reservation, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/reservations)
 * * How-to Guides
 *     * [Reserving zonal resources](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Reservation can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/reservation:Reservation default projects/{{project}}/zones/{{zone}}/reservations/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/reservation:Reservation default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/reservation:Reservation default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/reservation:Reservation default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/reservation:Reservation")
public class Reservation extends io.pulumi.resources.CustomResource {
    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    @OutputExport(name="commitment", type=String.class, parameters={})
    private Output<String> commitment;

    /**
     * @return Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    public Output<String> getCommitment() {
        return this.commitment;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="shareSettings", type=ReservationShareSettings.class, parameters={})
    private Output<ReservationShareSettings> shareSettings;

    /**
     * @return The share setting for reservations.
     * Structure is documented below.
     * 
     */
    public Output<ReservationShareSettings> getShareSettings() {
        return this.shareSettings;
    }
    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="specificReservation", type=ReservationSpecificReservation.class, parameters={})
    private Output<ReservationSpecificReservation> specificReservation;

    /**
     * @return Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    public Output<ReservationSpecificReservation> getSpecificReservation() {
        return this.specificReservation;
    }
    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @OutputExport(name="specificReservationRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> specificReservationRequired;

    /**
     * @return When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    public Output</* @Nullable */ Boolean> getSpecificReservationRequired() {
        return this.specificReservationRequired;
    }
    /**
     * The status of the reservation.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the reservation.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The zone where the reservation is made.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone where the reservation is made.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Reservation(String name, ReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/reservation:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Reservation(String name, Input<String> id, @Nullable ReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/reservation:Reservation", name, state, makeResourceOptions(options, id));
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
    public static Reservation get(String name, Input<String> id, @Nullable ReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, state, options);
    }
}
