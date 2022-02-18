// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyAssociationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyAssociationResponse Empty = new SecurityPolicyAssociationResponse();

    /**
     * The resource that the security policy is attached to.
     * 
     */
    @InputImport(name="attachmentId", required=true)
    private final String attachmentId;

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * The display name of the security policy of the association.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The name for an association.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The security policy ID of the association.
     * 
     */
    @InputImport(name="securityPolicyId", required=true)
    private final String securityPolicyId;

    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public SecurityPolicyAssociationResponse(
        String attachmentId,
        String displayName,
        String name,
        String securityPolicyId) {
        this.attachmentId = Objects.requireNonNull(attachmentId, "expected parameter 'attachmentId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.securityPolicyId = Objects.requireNonNull(securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
    }

    private SecurityPolicyAssociationResponse() {
        this.attachmentId = null;
        this.displayName = null;
        this.name = null;
        this.securityPolicyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachmentId;
        private String displayName;
        private String name;
        private String securityPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAssociationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        public Builder setAttachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = Objects.requireNonNull(securityPolicyId);
            return this;
        }

        public SecurityPolicyAssociationResponse build() {
            return new SecurityPolicyAssociationResponse(attachmentId, displayName, name, securityPolicyId);
        }
    }
}
