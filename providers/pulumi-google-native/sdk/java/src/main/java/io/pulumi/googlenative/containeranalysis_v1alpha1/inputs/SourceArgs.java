// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.RepoSourceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.StorageSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source describes the location of the source used for the build.
 * 
 */
public final class SourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    @InputImport(name="additionalContexts")
    private final @Nullable Input<List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs>> additionalContexts;

    public Input<List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs>> getAdditionalContexts() {
        return this.additionalContexts == null ? Input.empty() : this.additionalContexts;
    }

    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    @InputImport(name="artifactStorageSource")
    private final @Nullable Input<StorageSourceArgs> artifactStorageSource;

    public Input<StorageSourceArgs> getArtifactStorageSource() {
        return this.artifactStorageSource == null ? Input.empty() : this.artifactStorageSource;
    }

    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    @InputImport(name="context")
    private final @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs> context;

    public Input<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    @InputImport(name="fileHashes")
    private final @Nullable Input<Map<String,String>> fileHashes;

    public Input<Map<String,String>> getFileHashes() {
        return this.fileHashes == null ? Input.empty() : this.fileHashes;
    }

    /**
     * If provided, get source from this location in a Cloud Repo.
     * 
     */
    @InputImport(name="repoSource")
    private final @Nullable Input<RepoSourceArgs> repoSource;

    public Input<RepoSourceArgs> getRepoSource() {
        return this.repoSource == null ? Input.empty() : this.repoSource;
    }

    /**
     * If provided, get the source from this location in in Google Cloud Storage.
     * 
     */
    @InputImport(name="storageSource")
    private final @Nullable Input<StorageSourceArgs> storageSource;

    public Input<StorageSourceArgs> getStorageSource() {
        return this.storageSource == null ? Input.empty() : this.storageSource;
    }

    public SourceArgs(
        @Nullable Input<List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs>> additionalContexts,
        @Nullable Input<StorageSourceArgs> artifactStorageSource,
        @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs> context,
        @Nullable Input<Map<String,String>> fileHashes,
        @Nullable Input<RepoSourceArgs> repoSource,
        @Nullable Input<StorageSourceArgs> storageSource) {
        this.additionalContexts = additionalContexts;
        this.artifactStorageSource = artifactStorageSource;
        this.context = context;
        this.fileHashes = fileHashes;
        this.repoSource = repoSource;
        this.storageSource = storageSource;
    }

    private SourceArgs() {
        this.additionalContexts = Input.empty();
        this.artifactStorageSource = Input.empty();
        this.context = Input.empty();
        this.fileHashes = Input.empty();
        this.repoSource = Input.empty();
        this.storageSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs>> additionalContexts;
        private @Nullable Input<StorageSourceArgs> artifactStorageSource;
        private @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs> context;
        private @Nullable Input<Map<String,String>> fileHashes;
        private @Nullable Input<RepoSourceArgs> repoSource;
        private @Nullable Input<StorageSourceArgs> storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalContexts = defaults.additionalContexts;
    	      this.artifactStorageSource = defaults.artifactStorageSource;
    	      this.context = defaults.context;
    	      this.fileHashes = defaults.fileHashes;
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder setAdditionalContexts(@Nullable Input<List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs>> additionalContexts) {
            this.additionalContexts = additionalContexts;
            return this;
        }

        public Builder setAdditionalContexts(@Nullable List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs> additionalContexts) {
            this.additionalContexts = Input.ofNullable(additionalContexts);
            return this;
        }

        public Builder setArtifactStorageSource(@Nullable Input<StorageSourceArgs> artifactStorageSource) {
            this.artifactStorageSource = artifactStorageSource;
            return this;
        }

        public Builder setArtifactStorageSource(@Nullable StorageSourceArgs artifactStorageSource) {
            this.artifactStorageSource = Input.ofNullable(artifactStorageSource);
            return this;
        }

        public Builder setContext(@Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setFileHashes(@Nullable Input<Map<String,String>> fileHashes) {
            this.fileHashes = fileHashes;
            return this;
        }

        public Builder setFileHashes(@Nullable Map<String,String> fileHashes) {
            this.fileHashes = Input.ofNullable(fileHashes);
            return this;
        }

        public Builder setRepoSource(@Nullable Input<RepoSourceArgs> repoSource) {
            this.repoSource = repoSource;
            return this;
        }

        public Builder setRepoSource(@Nullable RepoSourceArgs repoSource) {
            this.repoSource = Input.ofNullable(repoSource);
            return this;
        }

        public Builder setStorageSource(@Nullable Input<StorageSourceArgs> storageSource) {
            this.storageSource = storageSource;
            return this;
        }

        public Builder setStorageSource(@Nullable StorageSourceArgs storageSource) {
            this.storageSource = Input.ofNullable(storageSource);
            return this;
        }

        public SourceArgs build() {
            return new SourceArgs(additionalContexts, artifactStorageSource, context, fileHashes, repoSource, storageSource);
        }
    }
}
