// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.DatadogHostMetadataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatadogHostResponse {
    /**
     * The aliases for the host.
     * 
     */
    private final @Nullable List<String> aliases;
    /**
     * The Datadog integrations reporting metrics for the host.
     * 
     */
    private final @Nullable List<String> apps;
    private final @Nullable DatadogHostMetadataResponse meta;
    /**
     * The name of the host.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private DatadogHostResponse(
        @OutputCustomType.Parameter("aliases") @Nullable List<String> aliases,
        @OutputCustomType.Parameter("apps") @Nullable List<String> apps,
        @OutputCustomType.Parameter("meta") @Nullable DatadogHostMetadataResponse meta,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.aliases = aliases;
        this.apps = apps;
        this.meta = meta;
        this.name = name;
    }

    /**
     * The aliases for the host.
     * 
    */
    public List<String> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    /**
     * The Datadog integrations reporting metrics for the host.
     * 
    */
    public List<String> getApps() {
        return this.apps == null ? List.of() : this.apps;
    }
    public Optional<DatadogHostMetadataResponse> getMeta() {
        return Optional.ofNullable(this.meta);
    }
    /**
     * The name of the host.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogHostResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> aliases;
        private @Nullable List<String> apps;
        private @Nullable DatadogHostMetadataResponse meta;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogHostResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apps = defaults.apps;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
        }

        public Builder setAliases(@Nullable List<String> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setApps(@Nullable List<String> apps) {
            this.apps = apps;
            return this;
        }

        public Builder setMeta(@Nullable DatadogHostMetadataResponse meta) {
            this.meta = meta;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DatadogHostResponse build() {
            return new DatadogHostResponse(aliases, apps, meta, name);
        }
    }
}
