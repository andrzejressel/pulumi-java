// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.ReservationArgs;
import io.pulumi.googlenative.compute_alpha.outputs.AllocationSpecificSKUReservationResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ShareSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new reservation. For more information, read Reserving zonal resources.
 * 
 */
@ResourceType(type="google-native:compute/alpha:Reservation")
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
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#reservations for reservations.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
     */
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @OutputExport(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Share-settings for shared-reservation
     * 
     */
    @OutputExport(name="shareSettings", type=ShareSettingsResponse.class, parameters={})
    private Output<ShareSettingsResponse> shareSettings;

    /**
     * @return Share-settings for shared-reservation
     * 
     */
    public Output<ShareSettingsResponse> getShareSettings() {
        return this.shareSettings;
    }
    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    @OutputExport(name="specificReservation", type=AllocationSpecificSKUReservationResponse.class, parameters={})
    private Output<AllocationSpecificSKUReservationResponse> specificReservation;

    /**
     * @return Reservation for instances with specific machine shapes.
     * 
     */
    public Output<AllocationSpecificSKUReservationResponse> getSpecificReservation() {
        return this.specificReservation;
    }
    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    @OutputExport(name="specificReservationRequired", type=Boolean.class, parameters={})
    private Output<Boolean> specificReservationRequired;

    /**
     * @return Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    public Output<Boolean> getSpecificReservationRequired() {
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
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
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
    public Reservation(String name, @Nullable ReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Reservation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Reservation", name, null, makeResourceOptions(options, id));
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
    public static Reservation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, options);
    }
}
