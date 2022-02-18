// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1beta2.ResourceRecordSetArgs;
import io.pulumi.googlenative.dns_v1beta2.outputs.RRSetRoutingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new ResourceRecordSet.
 * 
 */
@ResourceType(type="google-native:dns/v1beta2:ResourceRecordSet")
public class ResourceRecordSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * For example, www.example.com.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return For example, www.example.com.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @OutputExport(name="routingPolicy", type=RRSetRoutingPolicyResponse.class, parameters={})
    private Output<RRSetRoutingPolicyResponse> routingPolicy;

    /**
     * @return Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    public Output<RRSetRoutingPolicyResponse> getRoutingPolicy() {
        return this.routingPolicy;
    }
    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @OutputExport(name="rrdatas", type=List.class, parameters={String.class})
    private Output<List<String>> rrdatas;

    /**
     * @return As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    public Output<List<String>> getRrdatas() {
        return this.rrdatas;
    }
    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @OutputExport(name="signatureRrdatas", type=List.class, parameters={String.class})
    private Output<List<String>> signatureRrdatas;

    /**
     * @return As defined in RFC 4034 (section 3.2).
     * 
     */
    public Output<List<String>> getSignatureRrdatas() {
        return this.signatureRrdatas;
    }
    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @OutputExport(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    public Output<Integer> getTtl() {
        return this.ttl;
    }
    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceRecordSet(String name, ResourceRecordSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResourceRecordSet", name, args == null ? ResourceRecordSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceRecordSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResourceRecordSet", name, null, makeResourceOptions(options, id));
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
    public static ResourceRecordSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceRecordSet(name, id, options);
    }
}
