// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AttestationAuthorityHintResponse {
    /**
     * The human readable name of this Attestation Authority, for example "qa".
     * 
     */
    private final String humanReadableName;

    @OutputCustomType.Constructor({"humanReadableName"})
    private AttestationAuthorityHintResponse(String humanReadableName) {
        this.humanReadableName = Objects.requireNonNull(humanReadableName);
    }

    /**
     * The human readable name of this Attestation Authority, for example "qa".
     * 
     */
    public String getHumanReadableName() {
        return this.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAuthorityHintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAuthorityHintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder setHumanReadableName(String humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }

        public AttestationAuthorityHintResponse build() {
            return new AttestationAuthorityHintResponse(humanReadableName);
        }
    }
}
