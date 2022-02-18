// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBackendServiceSecuritySetting {
    private final String clientTlsPolicy;
    private final List<String> subjectAltNames;

    @OutputCustomType.Constructor({"clientTlsPolicy","subjectAltNames"})
    private GetBackendServiceSecuritySetting(
        String clientTlsPolicy,
        List<String> subjectAltNames) {
        this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy);
        this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
    }

    public String getClientTlsPolicy() {
        return this.clientTlsPolicy;
    }
    public List<String> getSubjectAltNames() {
        return this.subjectAltNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceSecuritySetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientTlsPolicy;
        private List<String> subjectAltNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceSecuritySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.subjectAltNames = defaults.subjectAltNames;
        }

        public Builder setClientTlsPolicy(String clientTlsPolicy) {
            this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy);
            return this;
        }

        public Builder setSubjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }

        public GetBackendServiceSecuritySetting build() {
            return new GetBackendServiceSecuritySetting(clientTlsPolicy, subjectAltNames);
        }
    }
}
