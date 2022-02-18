// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.RegionSecurityPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyAdaptiveProtectionConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyAdvancedOptionsConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyAssociationResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyCloudArmorConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyDdosProtectionConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyRecaptchaOptionsConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new policy in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:RegionSecurityPolicy")
public class RegionSecurityPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="adaptiveProtectionConfig", type=SecurityPolicyAdaptiveProtectionConfigResponse.class, parameters={})
    private Output<SecurityPolicyAdaptiveProtectionConfigResponse> adaptiveProtectionConfig;

    public Output<SecurityPolicyAdaptiveProtectionConfigResponse> getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig;
    }
    @OutputExport(name="advancedOptionsConfig", type=SecurityPolicyAdvancedOptionsConfigResponse.class, parameters={})
    private Output<SecurityPolicyAdvancedOptionsConfigResponse> advancedOptionsConfig;

    public Output<SecurityPolicyAdvancedOptionsConfigResponse> getAdvancedOptionsConfig() {
        return this.advancedOptionsConfig;
    }
    /**
     * A list of associations that belong to this policy.
     * 
     */
    @OutputExport(name="associations", type=List.class, parameters={SecurityPolicyAssociationResponse.class})
    private Output<List<SecurityPolicyAssociationResponse>> associations;

    /**
     * @return A list of associations that belong to this policy.
     * 
     */
    public Output<List<SecurityPolicyAssociationResponse>> getAssociations() {
        return this.associations;
    }
    @OutputExport(name="cloudArmorConfig", type=SecurityPolicyCloudArmorConfigResponse.class, parameters={})
    private Output<SecurityPolicyCloudArmorConfigResponse> cloudArmorConfig;

    public Output<SecurityPolicyCloudArmorConfigResponse> getCloudArmorConfig() {
        return this.cloudArmorConfig;
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
    @OutputExport(name="ddosProtectionConfig", type=SecurityPolicyDdosProtectionConfigResponse.class, parameters={})
    private Output<SecurityPolicyDdosProtectionConfigResponse> ddosProtectionConfig;

    public Output<SecurityPolicyDdosProtectionConfigResponse> getDdosProtectionConfig() {
        return this.ddosProtectionConfig;
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
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this security policy, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this security policy, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of the security policy.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the security policy.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    @OutputExport(name="recaptchaOptionsConfig", type=SecurityPolicyRecaptchaOptionsConfigResponse.class, parameters={})
    private Output<SecurityPolicyRecaptchaOptionsConfigResponse> recaptchaOptionsConfig;

    public Output<SecurityPolicyRecaptchaOptionsConfigResponse> getRecaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig;
    }
    /**
     * URL of the region where the regional security policy resides. This field is not applicable to global security policies.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the regional security policy resides. This field is not applicable to global security policies.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * Total count of all security policy rule tuples. A security policy can not exceed a set number of tuples.
     * 
     */
    @OutputExport(name="ruleTupleCount", type=Integer.class, parameters={})
    private Output<Integer> ruleTupleCount;

    /**
     * @return Total count of all security policy rule tuples. A security policy can not exceed a set number of tuples.
     * 
     */
    public Output<Integer> getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={SecurityPolicyRuleResponse.class})
    private Output<List<SecurityPolicyRuleResponse>> rules;

    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
     */
    public Output<List<SecurityPolicyRuleResponse>> getRules() {
        return this.rules;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
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
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
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
    public RegionSecurityPolicy(String name, RegionSecurityPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionSecurityPolicy", name, args == null ? RegionSecurityPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionSecurityPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionSecurityPolicy", name, null, makeResourceOptions(options, id));
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
    public static RegionSecurityPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionSecurityPolicy(name, id, options);
    }
}
