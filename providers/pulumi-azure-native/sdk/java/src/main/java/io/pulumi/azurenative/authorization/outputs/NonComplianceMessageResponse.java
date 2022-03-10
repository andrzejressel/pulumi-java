// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NonComplianceMessageResponse {
    /**
     * A message that describes why a resource is non-compliant with the policy. This is shown in 'deny' error messages and on resource's non-compliant compliance results.
     * 
     */
    private final String message;
    /**
     * The policy definition reference ID within a policy set definition the message is intended for. This is only applicable if the policy assignment assigns a policy set definition. If this is not provided the message applies to all policies assigned by this policy assignment.
     * 
     */
    private final @Nullable String policyDefinitionReferenceId;

    @OutputCustomType.Constructor
    private NonComplianceMessageResponse(
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("policyDefinitionReferenceId") @Nullable String policyDefinitionReferenceId) {
        this.message = message;
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
    }

    /**
     * A message that describes why a resource is non-compliant with the policy. This is shown in 'deny' error messages and on resource's non-compliant compliance results.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The policy definition reference ID within a policy set definition the message is intended for. This is only applicable if the policy assignment assigns a policy set definition. If this is not provided the message applies to all policies assigned by this policy assignment.
     * 
    */
    public Optional<String> getPolicyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonComplianceMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private @Nullable String policyDefinitionReferenceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NonComplianceMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }
        public NonComplianceMessageResponse build() {
            return new NonComplianceMessageResponse(message, policyDefinitionReferenceId);
        }
    }
}
