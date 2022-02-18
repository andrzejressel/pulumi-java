// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class AuthorizationLoggingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthorizationLoggingOptionsResponse Empty = new AuthorizationLoggingOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="permissionType", required=true)
    private final String permissionType;

    public String getPermissionType() {
        return this.permissionType;
    }

    public AuthorizationLoggingOptionsResponse(String permissionType) {
        this.permissionType = Objects.requireNonNull(permissionType, "expected parameter 'permissionType' to be non-null");
    }

    private AuthorizationLoggingOptionsResponse() {
        this.permissionType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationLoggingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String permissionType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationLoggingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissionType = defaults.permissionType;
        }

        public Builder setPermissionType(String permissionType) {
            this.permissionType = Objects.requireNonNull(permissionType);
            return this;
        }

        public AuthorizationLoggingOptionsResponse build() {
            return new AuthorizationLoggingOptionsResponse(permissionType);
        }
    }
}
