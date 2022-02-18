// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.OrganizationSecurityPolicyRuleArgs;
import io.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleState;
import io.pulumi.gcp.compute.outputs.OrganizationSecurityPolicyRuleMatch;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A rule for the OrganizationSecurityPolicy.
 * 
 * To get more information about OrganizationSecurityPolicyRule, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/organizationSecurityPolicies/addRule)
 * * How-to Guides
 *     * [Creating firewall rules](https://cloud.google.com/vpc/docs/using-firewall-policies#create-rules)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * OrganizationSecurityPolicyRule can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/organizationSecurityPolicyRule:OrganizationSecurityPolicyRule default {{policy_id}}/priority/{{priority}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/organizationSecurityPolicyRule:OrganizationSecurityPolicyRule")
public class OrganizationSecurityPolicyRule extends io.pulumi.resources.CustomResource {
    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either
     * "allow", "deny" or "goto_next".
     * 
     */
    @OutputExport(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The Action to perform when the client connection triggers the rule. Can currently be either
     * "allow", "deny" or "goto_next".
     * 
     */
    public Output<String> getAction() {
        return this.action;
    }
    /**
     * A description of the rule.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the rule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The direction in which this rule applies. If unspecified an INGRESS rule is created.
     * Possible values are `INGRESS` and `EGRESS`.
     * 
     */
    @OutputExport(name="direction", type=String.class, parameters={})
    private Output</* @Nullable */ String> direction;

    /**
     * @return The direction in which this rule applies. If unspecified an INGRESS rule is created.
     * Possible values are `INGRESS` and `EGRESS`.
     * 
     */
    public Output</* @Nullable */ String> getDirection() {
        return this.direction;
    }
    /**
     * Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the
     * configured export destination in Stackdriver.
     * 
     */
    @OutputExport(name="enableLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableLogging;

    /**
     * @return Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the
     * configured export destination in Stackdriver.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableLogging() {
        return this.enableLogging;
    }
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="match", type=OrganizationSecurityPolicyRuleMatch.class, parameters={})
    private Output<OrganizationSecurityPolicyRuleMatch> match;

    /**
     * @return A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * Structure is documented below.
     * 
     */
    public Output<OrganizationSecurityPolicyRuleMatch> getMatch() {
        return this.match;
    }
    /**
     * The ID of the OrganizationSecurityPolicy this rule applies to.
     * 
     */
    @OutputExport(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The ID of the OrganizationSecurityPolicy this rule applies to.
     * 
     */
    public Output<String> getPolicyId() {
        return this.policyId;
    }
    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @OutputExport(name="preview", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> preview;

    /**
     * @return If set to true, the specified action is not enforced.
     * 
     */
    public Output</* @Nullable */ Boolean> getPreview() {
        return this.preview;
    }
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a value
     * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
     * highest priority and 2147483647 is the lowest prority.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return An integer indicating the priority of a rule in the list. The priority must be a value
     * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
     * highest priority and 2147483647 is the lowest prority.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * A list of network resource URLs to which this rule applies.
     * This field allows you to control which network's VMs get
     * this rule. If this field is left blank, all VMs
     * within the organization will receive the rule.
     * 
     */
    @OutputExport(name="targetResources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetResources;

    /**
     * @return A list of network resource URLs to which this rule applies.
     * This field allows you to control which network's VMs get
     * this rule. If this field is left blank, all VMs
     * within the organization will receive the rule.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetResources() {
        return this.targetResources;
    }
    /**
     * A list of service accounts indicating the sets of
     * instances that are applied with this rule.
     * 
     */
    @OutputExport(name="targetServiceAccounts", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetServiceAccounts;

    /**
     * @return A list of service accounts indicating the sets of
     * instances that are applied with this rule.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationSecurityPolicyRule(String name, OrganizationSecurityPolicyRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/organizationSecurityPolicyRule:OrganizationSecurityPolicyRule", name, args == null ? OrganizationSecurityPolicyRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OrganizationSecurityPolicyRule(String name, Input<String> id, @Nullable OrganizationSecurityPolicyRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/organizationSecurityPolicyRule:OrganizationSecurityPolicyRule", name, state, makeResourceOptions(options, id));
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
    public static OrganizationSecurityPolicyRule get(String name, Input<String> id, @Nullable OrganizationSecurityPolicyRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationSecurityPolicyRule(name, id, state, options);
    }
}
