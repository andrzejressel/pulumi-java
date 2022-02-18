// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantArgs Empty = new TenantArgs();

    /**
     * Whether to allow email/password user authentication.
     * 
     */
    @InputImport(name="allowPasswordSignup")
    private final @Nullable Input<Boolean> allowPasswordSignup;

    public Input<Boolean> getAllowPasswordSignup() {
        return this.allowPasswordSignup == null ? Input.empty() : this.allowPasswordSignup;
    }

    /**
     * Whether authentication is disabled for the tenant. If true, the users under
     * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
     * are not able to manage its users.
     * 
     */
    @InputImport(name="disableAuth")
    private final @Nullable Input<Boolean> disableAuth;

    public Input<Boolean> getDisableAuth() {
        return this.disableAuth == null ? Input.empty() : this.disableAuth;
    }

    /**
     * Human friendly display name of the tenant.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Whether to enable email link user authentication.
     * 
     */
    @InputImport(name="enableEmailLinkSignin")
    private final @Nullable Input<Boolean> enableEmailLinkSignin;

    public Input<Boolean> getEnableEmailLinkSignin() {
        return this.enableEmailLinkSignin == null ? Input.empty() : this.enableEmailLinkSignin;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public TenantArgs(
        @Nullable Input<Boolean> allowPasswordSignup,
        @Nullable Input<Boolean> disableAuth,
        Input<String> displayName,
        @Nullable Input<Boolean> enableEmailLinkSignin,
        @Nullable Input<String> project) {
        this.allowPasswordSignup = allowPasswordSignup;
        this.disableAuth = disableAuth;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableEmailLinkSignin = enableEmailLinkSignin;
        this.project = project;
    }

    private TenantArgs() {
        this.allowPasswordSignup = Input.empty();
        this.disableAuth = Input.empty();
        this.displayName = Input.empty();
        this.enableEmailLinkSignin = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowPasswordSignup;
        private @Nullable Input<Boolean> disableAuth;
        private Input<String> displayName;
        private @Nullable Input<Boolean> enableEmailLinkSignin;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPasswordSignup = defaults.allowPasswordSignup;
    	      this.disableAuth = defaults.disableAuth;
    	      this.displayName = defaults.displayName;
    	      this.enableEmailLinkSignin = defaults.enableEmailLinkSignin;
    	      this.project = defaults.project;
        }

        public Builder setAllowPasswordSignup(@Nullable Input<Boolean> allowPasswordSignup) {
            this.allowPasswordSignup = allowPasswordSignup;
            return this;
        }

        public Builder setAllowPasswordSignup(@Nullable Boolean allowPasswordSignup) {
            this.allowPasswordSignup = Input.ofNullable(allowPasswordSignup);
            return this;
        }

        public Builder setDisableAuth(@Nullable Input<Boolean> disableAuth) {
            this.disableAuth = disableAuth;
            return this;
        }

        public Builder setDisableAuth(@Nullable Boolean disableAuth) {
            this.disableAuth = Input.ofNullable(disableAuth);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEnableEmailLinkSignin(@Nullable Input<Boolean> enableEmailLinkSignin) {
            this.enableEmailLinkSignin = enableEmailLinkSignin;
            return this;
        }

        public Builder setEnableEmailLinkSignin(@Nullable Boolean enableEmailLinkSignin) {
            this.enableEmailLinkSignin = Input.ofNullable(enableEmailLinkSignin);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public TenantArgs build() {
            return new TenantArgs(allowPasswordSignup, disableAuth, displayName, enableEmailLinkSignin, project);
        }
    }
}
