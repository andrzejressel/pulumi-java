// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An occurrence of a particular package installation found within a system's filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
 * 
 */
public final class LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationArgs Empty = new LocationArgs();

    /**
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @InputImport(name="cpeUri", required=true)
    private final Input<String> cpeUri;

    public Input<String> getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The path from which we gathered that this package/version is installed.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The version installed at this location.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<VersionArgs> version;

    public Input<VersionArgs> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public LocationArgs(
        Input<String> cpeUri,
        @Nullable Input<String> path,
        @Nullable Input<VersionArgs> version) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.path = path;
        this.version = version;
    }

    private LocationArgs() {
        this.cpeUri = Input.empty();
        this.path = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cpeUri;
        private @Nullable Input<String> path;
        private @Nullable Input<VersionArgs> version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder setCpeUri(Input<String> cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Input.of(Objects.requireNonNull(cpeUri));
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setVersion(@Nullable Input<VersionArgs> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable VersionArgs version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public LocationArgs build() {
            return new LocationArgs(cpeUri, path, version);
        }
    }
}
