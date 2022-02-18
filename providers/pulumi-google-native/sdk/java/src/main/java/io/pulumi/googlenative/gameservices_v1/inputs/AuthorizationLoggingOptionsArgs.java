// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1.enums.AuthorizationLoggingOptionsPermissionType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authorization-related information used by Cloud Audit Logging.
 * 
 */
public final class AuthorizationLoggingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizationLoggingOptionsArgs Empty = new AuthorizationLoggingOptionsArgs();

    /**
     * The type of the permission that was checked.
     * 
     */
    @InputImport(name="permissionType")
    private final @Nullable Input<AuthorizationLoggingOptionsPermissionType> permissionType;

    public Input<AuthorizationLoggingOptionsPermissionType> getPermissionType() {
        return this.permissionType == null ? Input.empty() : this.permissionType;
    }

    public AuthorizationLoggingOptionsArgs(@Nullable Input<AuthorizationLoggingOptionsPermissionType> permissionType) {
        this.permissionType = permissionType;
    }

    private AuthorizationLoggingOptionsArgs() {
        this.permissionType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthorizationLoggingOptionsPermissionType> permissionType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationLoggingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissionType = defaults.permissionType;
        }

        public Builder setPermissionType(@Nullable Input<AuthorizationLoggingOptionsPermissionType> permissionType) {
            this.permissionType = permissionType;
            return this;
        }

        public Builder setPermissionType(@Nullable AuthorizationLoggingOptionsPermissionType permissionType) {
            this.permissionType = Input.ofNullable(permissionType);
            return this;
        }

        public AuthorizationLoggingOptionsArgs build() {
            return new AuthorizationLoggingOptionsArgs(permissionType);
        }
    }
}
