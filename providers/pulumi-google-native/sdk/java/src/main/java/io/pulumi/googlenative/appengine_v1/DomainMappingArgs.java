// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.inputs.SslSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingArgs Empty = new DomainMappingArgs();

    @InputImport(name="appId", required=true)
    private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * Relative name of the domain serving the application. Example: example.com.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="overrideStrategy")
    private final @Nullable Input<String> overrideStrategy;

    public Input<String> getOverrideStrategy() {
        return this.overrideStrategy == null ? Input.empty() : this.overrideStrategy;
    }

    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    @InputImport(name="sslSettings")
    private final @Nullable Input<SslSettingsArgs> sslSettings;

    public Input<SslSettingsArgs> getSslSettings() {
        return this.sslSettings == null ? Input.empty() : this.sslSettings;
    }

    public DomainMappingArgs(
        Input<String> appId,
        @Nullable Input<String> id,
        @Nullable Input<String> overrideStrategy,
        @Nullable Input<SslSettingsArgs> sslSettings) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.id = id;
        this.overrideStrategy = overrideStrategy;
        this.sslSettings = sslSettings;
    }

    private DomainMappingArgs() {
        this.appId = Input.empty();
        this.id = Input.empty();
        this.overrideStrategy = Input.empty();
        this.sslSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<String> id;
        private @Nullable Input<String> overrideStrategy;
        private @Nullable Input<SslSettingsArgs> sslSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.id = defaults.id;
    	      this.overrideStrategy = defaults.overrideStrategy;
    	      this.sslSettings = defaults.sslSettings;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setOverrideStrategy(@Nullable Input<String> overrideStrategy) {
            this.overrideStrategy = overrideStrategy;
            return this;
        }

        public Builder setOverrideStrategy(@Nullable String overrideStrategy) {
            this.overrideStrategy = Input.ofNullable(overrideStrategy);
            return this;
        }

        public Builder setSslSettings(@Nullable Input<SslSettingsArgs> sslSettings) {
            this.sslSettings = sslSettings;
            return this;
        }

        public Builder setSslSettings(@Nullable SslSettingsArgs sslSettings) {
            this.sslSettings = Input.ofNullable(sslSettings);
            return this;
        }

        public DomainMappingArgs build() {
            return new DomainMappingArgs(appId, id, overrideStrategy, sslSettings);
        }
    }
}
