// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on information about the source of the request. The request must satisfy what is defined in `sources` AND identity related fields in order to match.
 * 
 */
public final class IngressFromResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngressFromResponse Empty = new IngressFromResponse();

    /**
     * A list of identities that are allowed access through this ingress policy. Should be in the format of email address. The email address should represent individual user or service account only.
     * 
     */
    @InputImport(name="identities", required=true)
    private final List<String> identities;

    public List<String> getIdentities() {
        return this.identities;
    }

    /**
     * Specifies the type of identities that are allowed access from outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
     * 
     */
    @InputImport(name="identityType", required=true)
    private final String identityType;

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * Sources that this IngressPolicy authorizes access from.
     * 
     */
    @InputImport(name="sources", required=true)
    private final List<IngressSourceResponse> sources;

    public List<IngressSourceResponse> getSources() {
        return this.sources;
    }

    public IngressFromResponse(
        List<String> identities,
        String identityType,
        List<IngressSourceResponse> sources) {
        this.identities = Objects.requireNonNull(identities, "expected parameter 'identities' to be non-null");
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private IngressFromResponse() {
        this.identities = List.of();
        this.identityType = null;
        this.sources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressFromResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> identities;
        private String identityType;
        private List<IngressSourceResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressFromResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        public Builder setIdentities(List<String> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }

        public Builder setIdentityType(String identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }

        public Builder setSources(List<IngressSourceResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public IngressFromResponse build() {
            return new IngressFromResponse(identities, identityType, sources);
        }
    }
}
