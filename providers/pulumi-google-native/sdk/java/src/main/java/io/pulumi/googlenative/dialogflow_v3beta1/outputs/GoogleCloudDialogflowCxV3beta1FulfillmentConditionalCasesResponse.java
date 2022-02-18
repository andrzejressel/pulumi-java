// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse {
    /**
     * A list of cascading if-else conditions.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse> cases;

    @OutputCustomType.Constructor({"cases"})
    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse> cases) {
        this.cases = Objects.requireNonNull(cases);
    }

    /**
     * A list of cascading if-else conditions.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse> getCases() {
        return this.cases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse> cases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
        }

        public Builder setCases(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse> cases) {
            this.cases = Objects.requireNonNull(cases);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse(cases);
        }
    }
}
