// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigGetArgs;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigState extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigState Empty = new TenantInboundSamlConfigState();

    /**
     * Human friendly display name.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
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
    @InputImport(name="idpConfig")
    private final @Nullable Input<TenantInboundSamlConfigIdpConfigGetArgs> idpConfig;

    public Input<TenantInboundSamlConfigIdpConfigGetArgs> getIdpConfig() {
        return this.idpConfig == null ? Input.empty() : this.idpConfig;
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
    @InputImport(name="spConfig")
    private final @Nullable Input<TenantInboundSamlConfigSpConfigGetArgs> spConfig;

    public Input<TenantInboundSamlConfigSpConfigGetArgs> getSpConfig() {
        return this.spConfig == null ? Input.empty() : this.spConfig;
    }

    /**
     * The name of the tenant where this inbound SAML config resource exists
     * 
     */
    @InputImport(name="tenant")
    private final @Nullable Input<String> tenant;

    public Input<String> getTenant() {
        return this.tenant == null ? Input.empty() : this.tenant;
    }

    public TenantInboundSamlConfigState(
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<TenantInboundSamlConfigIdpConfigGetArgs> idpConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<TenantInboundSamlConfigSpConfigGetArgs> spConfig,
        @Nullable Input<String> tenant) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.idpConfig = idpConfig;
        this.name = name;
        this.project = project;
        this.spConfig = spConfig;
        this.tenant = tenant;
    }

    private TenantInboundSamlConfigState() {
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

    public static Builder builder(TenantInboundSamlConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<TenantInboundSamlConfigIdpConfigGetArgs> idpConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<TenantInboundSamlConfigSpConfigGetArgs> spConfig;
        private @Nullable Input<String> tenant;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.idpConfig = defaults.idpConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.spConfig = defaults.spConfig;
    	      this.tenant = defaults.tenant;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder setIdpConfig(@Nullable Input<TenantInboundSamlConfigIdpConfigGetArgs> idpConfig) {
            this.idpConfig = idpConfig;
            return this;
        }

        public Builder setIdpConfig(@Nullable TenantInboundSamlConfigIdpConfigGetArgs idpConfig) {
            this.idpConfig = Input.ofNullable(idpConfig);
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

        public Builder setSpConfig(@Nullable Input<TenantInboundSamlConfigSpConfigGetArgs> spConfig) {
            this.spConfig = spConfig;
            return this;
        }

        public Builder setSpConfig(@Nullable TenantInboundSamlConfigSpConfigGetArgs spConfig) {
            this.spConfig = Input.ofNullable(spConfig);
            return this;
        }

        public Builder setTenant(@Nullable Input<String> tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setTenant(@Nullable String tenant) {
            this.tenant = Input.ofNullable(tenant);
            return this;
        }

        public TenantInboundSamlConfigState build() {
            return new TenantInboundSamlConfigState(displayName, enabled, idpConfig, name, project, spConfig, tenant);
        }
    }
}
