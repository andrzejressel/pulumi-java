// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListRemediationDeploymentsAtSubscriptionResult {
    /**
     * The URL to get the next set of results.
     * 
     */
    private final String nextLink;
    /**
     * Array of deployments for the remediation.
     * 
     */
    private final List<RemediationDeploymentResponse> value;

    @OutputCustomType.Constructor
    private ListRemediationDeploymentsAtSubscriptionResult(
        @OutputCustomType.Parameter("nextLink") String nextLink,
        @OutputCustomType.Parameter("value") List<RemediationDeploymentResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URL to get the next set of results.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * Array of deployments for the remediation.
     * 
    */
    public List<RemediationDeploymentResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRemediationDeploymentsAtSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<RemediationDeploymentResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRemediationDeploymentsAtSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(List<RemediationDeploymentResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListRemediationDeploymentsAtSubscriptionResult build() {
            return new ListRemediationDeploymentsAtSubscriptionResult(nextLink, value);
        }
    }
}
