// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.ReservationArgs;
import com.pulumi.gcp.bigquery.inputs.ReservationState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A reservation is a mechanism used to guarantee BigQuery slots to users.
 * 
 * To get more information about Reservation, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1beta1/projects.locations.reservations/create)
 * * How-to Guides
 *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
 * 
 * ## Example Usage
 * ### Bigquery Reservation Basic
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
 *         var reservation = new Reservation(&#34;reservation&#34;, ReservationArgs.builder()        
 *             .ignoreIdleSlots(false)
 *             .location(&#34;asia-northeast1&#34;)
 *             .slotCapacity(0)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Reservation can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/reservation:Reservation default projects/{{project}}/locations/{{location}}/reservations/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/reservation:Reservation default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/reservation:Reservation default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/reservation:Reservation")
public class Reservation extends com.pulumi.resources.CustomResource {
    /**
     * If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    @Export(name="ignoreIdleSlots", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreIdleSlots;

    /**
     * @return If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    public Output<Optional<Boolean>> ignoreIdleSlots() {
        return Codegen.optional(this.ignoreIdleSlots);
    }
    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    @Export(name="slotCapacity", type=Integer.class, parameters={})
    private Output<Integer> slotCapacity;

    /**
     * @return Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    public Output<Integer> slotCapacity() {
        return this.slotCapacity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Reservation(String name) {
        this(name, ReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Reservation(String name, ReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Reservation(String name, ReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/reservation:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Reservation(String name, Output<String> id, @Nullable ReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/reservation:Reservation", name, state, makeResourceOptions(options, id));
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
    public static Reservation get(String name, Output<String> id, @Nullable ReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, state, options);
    }
}
