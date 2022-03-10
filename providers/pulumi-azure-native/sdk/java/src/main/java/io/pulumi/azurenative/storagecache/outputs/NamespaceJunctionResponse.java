// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NamespaceJunctionResponse {
    /**
     * Namespace path on a Cache for a Storage Target.
     * 
     */
    private final @Nullable String namespacePath;
    /**
     * Name of the access policy applied to this junction.
     * 
     */
    private final @Nullable String nfsAccessPolicy;
    /**
     * NFS export where targetPath exists.
     * 
     */
    private final @Nullable String nfsExport;
    /**
     * Path in Storage Target to which namespacePath points.
     * 
     */
    private final @Nullable String targetPath;

    @OutputCustomType.Constructor
    private NamespaceJunctionResponse(
        @OutputCustomType.Parameter("namespacePath") @Nullable String namespacePath,
        @OutputCustomType.Parameter("nfsAccessPolicy") @Nullable String nfsAccessPolicy,
        @OutputCustomType.Parameter("nfsExport") @Nullable String nfsExport,
        @OutputCustomType.Parameter("targetPath") @Nullable String targetPath) {
        this.namespacePath = namespacePath;
        this.nfsAccessPolicy = nfsAccessPolicy;
        this.nfsExport = nfsExport;
        this.targetPath = targetPath;
    }

    /**
     * Namespace path on a Cache for a Storage Target.
     * 
    */
    public Optional<String> getNamespacePath() {
        return Optional.ofNullable(this.namespacePath);
    }
    /**
     * Name of the access policy applied to this junction.
     * 
    */
    public Optional<String> getNfsAccessPolicy() {
        return Optional.ofNullable(this.nfsAccessPolicy);
    }
    /**
     * NFS export where targetPath exists.
     * 
    */
    public Optional<String> getNfsExport() {
        return Optional.ofNullable(this.nfsExport);
    }
    /**
     * Path in Storage Target to which namespacePath points.
     * 
    */
    public Optional<String> getTargetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceJunctionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String namespacePath;
        private @Nullable String nfsAccessPolicy;
        private @Nullable String nfsExport;
        private @Nullable String targetPath;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceJunctionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacePath = defaults.namespacePath;
    	      this.nfsAccessPolicy = defaults.nfsAccessPolicy;
    	      this.nfsExport = defaults.nfsExport;
    	      this.targetPath = defaults.targetPath;
        }

        public Builder setNamespacePath(@Nullable String namespacePath) {
            this.namespacePath = namespacePath;
            return this;
        }

        public Builder setNfsAccessPolicy(@Nullable String nfsAccessPolicy) {
            this.nfsAccessPolicy = nfsAccessPolicy;
            return this;
        }

        public Builder setNfsExport(@Nullable String nfsExport) {
            this.nfsExport = nfsExport;
            return this;
        }

        public Builder setTargetPath(@Nullable String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public NamespaceJunctionResponse build() {
            return new NamespaceJunctionResponse(namespacePath, nfsAccessPolicy, nfsExport, targetPath);
        }
    }
}
