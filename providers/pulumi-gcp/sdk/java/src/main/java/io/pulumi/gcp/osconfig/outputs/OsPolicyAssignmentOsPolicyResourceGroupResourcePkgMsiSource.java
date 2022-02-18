// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcs;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource {
    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    private final @Nullable Boolean allowInsecure;
    /**
     * A Cloud Storage object.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcs gcs;
    /**
     * A local path within the VM to use.
     * 
     */
    private final @Nullable String localPath;
    /**
     * A generic remote file.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote remote;

    @OutputCustomType.Constructor({"allowInsecure","gcs","localPath","remote"})
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource(
        @Nullable Boolean allowInsecure,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcs gcs,
        @Nullable String localPath,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    public Optional<Boolean> getAllowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }
    /**
     * A Cloud Storage object.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcs> getGcs() {
        return Optional.ofNullable(this.gcs);
    }
    /**
     * A local path within the VM to use.
     * 
     */
    public Optional<String> getLocalPath() {
        return Optional.ofNullable(this.localPath);
    }
    /**
     * A generic remote file.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote> getRemote() {
        return Optional.ofNullable(this.remote);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInsecure;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcs gcs;
        private @Nullable String localPath;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder setAllowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder setGcs(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcs gcs) {
            this.gcs = gcs;
            return this;
        }

        public Builder setLocalPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder setRemote(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote remote) {
            this.remote = remote;
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource(allowInsecure, gcs, localPath, remote);
        }
    }
}
