// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigArgs Empty = new TenantInboundSamlConfigArgs();

    /**
     * Human friendly display name.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * SAML IdP configuration when the project acts as the relying party
     * Structure is documented below.
     * 
     */
    @InputImport(name="idpConfig", required=true)
    private final Input<TenantInboundSamlConfigIdpConfigArgs> idpConfig;

    public Input<TenantInboundSamlConfigIdpConfigArgs> getIdpConfig() {
        return this.idpConfig;
    }

    /**
     * The name of the InboundSamlConfig resource. Must start with 'saml.' and can only have alphanumeric characters,
     * hyphens, underscores or periods. The part after 'saml.' must also start with a lowercase letter, end with an
     * alphanumeric character, and have at least 2 characters.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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

    /**
     * SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     * and accept an authentication assertion issued by a SAML identity provider.
     * Structure is documented below.
     * 
     */
    @InputImport(name="spConfig", required=true)
    private final Input<TenantInboundSamlConfigSpConfigArgs> spConfig;

    public Input<TenantInboundSamlConfigSpConfigArgs> getSpConfig() {
        return this.spConfig;
    }

    /**
     * The name of the tenant where this inbound SAML config resource exists
     * 
     */
    @InputImport(name="tenant", required=true)
    private final Input<String> tenant;

    public Input<String> getTenant() {
        return this.tenant;
    }

    public TenantInboundSamlConfigArgs(
        Input<String> displayName,
        @Nullable Input<Boolean> enabled,
        Input<TenantInboundSamlConfigIdpConfigArgs> idpConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<TenantInboundSamlConfigSpConfigArgs> spConfig,
        Input<String> tenant) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enabled = enabled;
        this.idpConfig = Objects.requireNonNull(idpConfig, "expected parameter 'idpConfig' to be non-null");
        this.name = name;
        this.project = project;
        this.spConfig = Objects.requireNonNull(spConfig, "expected parameter 'spConfig' to be non-null");
        this.tenant = Objects.requireNonNull(tenant, "expected parameter 'tenant' to be non-null");
    }

    private TenantInboundSamlConfigArgs() {
        this.displayName = Input.empty();
        this.enabled = Input.empty();
        this.idpConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.spConfig = Input.empty();
        this.tenant = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<Boolean> enabled;
        private Input<TenantInboundSamlConfigIdpConfigArgs> idpConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<TenantInboundSamlConfigSpConfigArgs> spConfig;
        private Input<String> tenant;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.idpConfig = defaults.idpConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.spConfig = defaults.spConfig;
    	      this.tenant = defaults.tenant;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setIdpConfig(Input<TenantInboundSamlConfigIdpConfigArgs> idpConfig) {
            this.idpConfig = Objects.requireNonNull(idpConfig);
            return this;
        }

        public Builder setIdpConfig(TenantInboundSamlConfigIdpConfigArgs idpConfig) {
            this.idpConfig = Input.of(Objects.requireNonNull(idpConfig));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setSpConfig(Input<TenantInboundSamlConfigSpConfigArgs> spConfig) {
            this.spConfig = Objects.requireNonNull(spConfig);
            return this;
        }

        public Builder setSpConfig(TenantInboundSamlConfigSpConfigArgs spConfig) {
            this.spConfig = Input.of(Objects.requireNonNull(spConfig));
            return this;
        }

        public Builder setTenant(Input<String> tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }

        public Builder setTenant(String tenant) {
            this.tenant = Input.of(Objects.requireNonNull(tenant));
            return this;
        }

        public TenantInboundSamlConfigArgs build() {
            return new TenantInboundSamlConfigArgs(displayName, enabled, idpConfig, name, project, spConfig, tenant);
        }
    }
}
