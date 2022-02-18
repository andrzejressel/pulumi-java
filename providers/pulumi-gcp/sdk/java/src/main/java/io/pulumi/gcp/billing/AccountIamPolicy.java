// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.billing.AccountIamPolicyArgs;
import io.pulumi.gcp.billing.inputs.AccountIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:billing/accountIamPolicy:AccountIamPolicy")
public class AccountIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="billingAccountId", type=String.class, parameters={})
    private Output<String> billingAccountId;

    public Output<String> getBillingAccountId() {
        return this.billingAccountId;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountIamPolicy(String name, AccountIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/accountIamPolicy:AccountIamPolicy", name, args == null ? AccountIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccountIamPolicy(String name, Input<String> id, @Nullable AccountIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/accountIamPolicy:AccountIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static AccountIamPolicy get(String name, Input<String> id, @Nullable AccountIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccountIamPolicy(name, id, state, options);
    }
}
