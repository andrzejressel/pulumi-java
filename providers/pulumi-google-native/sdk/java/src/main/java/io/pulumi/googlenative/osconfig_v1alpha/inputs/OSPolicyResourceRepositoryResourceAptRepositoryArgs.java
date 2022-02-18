// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.enums.OSPolicyResourceRepositoryResourceAptRepositoryArchiveType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a single apt package repository. These will be added to a repo file that will be managed at `/etc/apt/sources.list.d/google_osconfig.list`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceAptRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceAptRepositoryArgs Empty = new OSPolicyResourceRepositoryResourceAptRepositoryArgs();

    /**
     * Type of archive files in this repository.
     * 
     */
    @InputImport(name="archiveType", required=true)
    private final Input<OSPolicyResourceRepositoryResourceAptRepositoryArchiveType> archiveType;

    public Input<OSPolicyResourceRepositoryResourceAptRepositoryArchiveType> getArchiveType() {
        return this.archiveType;
    }

    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    @InputImport(name="components", required=true)
    private final Input<List<String>> components;

    public Input<List<String>> getComponents() {
        return this.components;
    }

    /**
     * Distribution of this repository.
     * 
     */
    @InputImport(name="distribution", required=true)
    private final Input<String> distribution;

    public Input<String> getDistribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    @InputImport(name="gpgKey")
    private final @Nullable Input<String> gpgKey;

    public Input<String> getGpgKey() {
        return this.gpgKey == null ? Input.empty() : this.gpgKey;
    }

    /**
     * URI for this repository.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public OSPolicyResourceRepositoryResourceAptRepositoryArgs(
        Input<OSPolicyResourceRepositoryResourceAptRepositoryArchiveType> archiveType,
        Input<List<String>> components,
        Input<String> distribution,
        @Nullable Input<String> gpgKey,
        Input<String> uri) {
        this.archiveType = Objects.requireNonNull(archiveType, "expected parameter 'archiveType' to be non-null");
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.gpgKey = gpgKey;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceAptRepositoryArgs() {
        this.archiveType = Input.empty();
        this.components = Input.empty();
        this.distribution = Input.empty();
        this.gpgKey = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceAptRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<OSPolicyResourceRepositoryResourceAptRepositoryArchiveType> archiveType;
        private Input<List<String>> components;
        private Input<String> distribution;
        private @Nullable Input<String> gpgKey;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceAptRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder setArchiveType(Input<OSPolicyResourceRepositoryResourceAptRepositoryArchiveType> archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }

        public Builder setArchiveType(OSPolicyResourceRepositoryResourceAptRepositoryArchiveType archiveType) {
            this.archiveType = Input.of(Objects.requireNonNull(archiveType));
            return this;
        }

        public Builder setComponents(Input<List<String>> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder setComponents(List<String> components) {
            this.components = Input.of(Objects.requireNonNull(components));
            return this;
        }

        public Builder setDistribution(Input<String> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder setDistribution(String distribution) {
            this.distribution = Input.of(Objects.requireNonNull(distribution));
            return this;
        }

        public Builder setGpgKey(@Nullable Input<String> gpgKey) {
            this.gpgKey = gpgKey;
            return this;
        }

        public Builder setGpgKey(@Nullable String gpgKey) {
            this.gpgKey = Input.ofNullable(gpgKey);
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public OSPolicyResourceRepositoryResourceAptRepositoryArgs build() {
            return new OSPolicyResourceRepositoryResourceAptRepositoryArgs(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
