// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivatePoolResponse {
    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    private final String artifactStorage;
    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    private final String serviceAccount;
    /**
     * Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    private final String workerPool;

    @OutputCustomType.Constructor({"artifactStorage","serviceAccount","workerPool"})
    private PrivatePoolResponse(
        String artifactStorage,
        String serviceAccount,
        String workerPool) {
        this.artifactStorage = Objects.requireNonNull(artifactStorage);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.workerPool = Objects.requireNonNull(workerPool);
    }

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    public String getArtifactStorage() {
        return this.artifactStorage;
    }
    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    public String getWorkerPool() {
        return this.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivatePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private String serviceAccount;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivatePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder setArtifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setWorkerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }

        public PrivatePoolResponse build() {
            return new PrivatePoolResponse(artifactStorage, serviceAccount, workerPool);
        }
    }
}
