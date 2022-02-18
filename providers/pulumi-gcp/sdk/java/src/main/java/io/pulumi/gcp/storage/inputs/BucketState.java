// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.BucketCorGetArgs;
import io.pulumi.gcp.storage.inputs.BucketEncryptionGetArgs;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleGetArgs;
import io.pulumi.gcp.storage.inputs.BucketLoggingGetArgs;
import io.pulumi.gcp.storage.inputs.BucketRetentionPolicyGetArgs;
import io.pulumi.gcp.storage.inputs.BucketVersioningGetArgs;
import io.pulumi.gcp.storage.inputs.BucketWebsiteGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketState extends io.pulumi.resources.ResourceArgs {

    public static final BucketState Empty = new BucketState();

    /**
     * The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @InputImport(name="cors")
    private final @Nullable Input<List<BucketCorGetArgs>> cors;

    public Input<List<BucketCorGetArgs>> getCors() {
        return this.cors == null ? Input.empty() : this.cors;
    }

    @InputImport(name="defaultEventBasedHold")
    private final @Nullable Input<Boolean> defaultEventBasedHold;

    public Input<Boolean> getDefaultEventBasedHold() {
        return this.defaultEventBasedHold == null ? Input.empty() : this.defaultEventBasedHold;
    }

    /**
     * The bucket's encryption configuration. Structure is documented below.
     * 
     */
    @InputImport(name="encryption")
    private final @Nullable Input<BucketEncryptionGetArgs> encryption;

    public Input<BucketEncryptionGetArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    @InputImport(name="forceDestroy")
    private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * A map of key/value label pairs to assign to the bucket.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @InputImport(name="lifecycleRules")
    private final @Nullable Input<List<BucketLifecycleRuleGetArgs>> lifecycleRules;

    public Input<List<BucketLifecycleRuleGetArgs>> getLifecycleRules() {
        return this.lifecycleRules == null ? Input.empty() : this.lifecycleRules;
    }

    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    @InputImport(name="logging")
    private final @Nullable Input<BucketLoggingGetArgs> logging;

    public Input<BucketLoggingGetArgs> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Prevents public access to a bucket.
     * 
     */
    @InputImport(name="publicAccessPrevention")
    private final @Nullable Input<String> publicAccessPrevention;

    public Input<String> getPublicAccessPrevention() {
        return this.publicAccessPrevention == null ? Input.empty() : this.publicAccessPrevention;
    }

    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    @InputImport(name="requesterPays")
    private final @Nullable Input<Boolean> requesterPays;

    public Input<Boolean> getRequesterPays() {
        return this.requesterPays == null ? Input.empty() : this.requesterPays;
    }

    /**
     * Configuration of the bucket's data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    @InputImport(name="retentionPolicy")
    private final @Nullable Input<BucketRetentionPolicyGetArgs> retentionPolicy;

    public Input<BucketRetentionPolicyGetArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * The target [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects affected by this Lifecycle Rule. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    @InputImport(name="storageClass")
    private final @Nullable Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    /**
     * Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    @InputImport(name="uniformBucketLevelAccess")
    private final @Nullable Input<Boolean> uniformBucketLevelAccess;

    public Input<Boolean> getUniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess == null ? Input.empty() : this.uniformBucketLevelAccess;
    }

    /**
     * The base URL of the bucket, in the format `gs://<bucket-name>`.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    @InputImport(name="versioning")
    private final @Nullable Input<BucketVersioningGetArgs> versioning;

    public Input<BucketVersioningGetArgs> getVersioning() {
        return this.versioning == null ? Input.empty() : this.versioning;
    }

    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    @InputImport(name="website")
    private final @Nullable Input<BucketWebsiteGetArgs> website;

    public Input<BucketWebsiteGetArgs> getWebsite() {
        return this.website == null ? Input.empty() : this.website;
    }

    public BucketState(
        @Nullable Input<List<BucketCorGetArgs>> cors,
        @Nullable Input<Boolean> defaultEventBasedHold,
        @Nullable Input<BucketEncryptionGetArgs> encryption,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<BucketLifecycleRuleGetArgs>> lifecycleRules,
        @Nullable Input<String> location,
        @Nullable Input<BucketLoggingGetArgs> logging,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> publicAccessPrevention,
        @Nullable Input<Boolean> requesterPays,
        @Nullable Input<BucketRetentionPolicyGetArgs> retentionPolicy,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> storageClass,
        @Nullable Input<Boolean> uniformBucketLevelAccess,
        @Nullable Input<String> url,
        @Nullable Input<BucketVersioningGetArgs> versioning,
        @Nullable Input<BucketWebsiteGetArgs> website) {
        this.cors = cors;
        this.defaultEventBasedHold = defaultEventBasedHold;
        this.encryption = encryption;
        this.forceDestroy = forceDestroy;
        this.labels = labels;
        this.lifecycleRules = lifecycleRules;
        this.location = location;
        this.logging = logging;
        this.name = name;
        this.project = project;
        this.publicAccessPrevention = publicAccessPrevention;
        this.requesterPays = requesterPays;
        this.retentionPolicy = retentionPolicy;
        this.selfLink = selfLink;
        this.storageClass = storageClass;
        this.uniformBucketLevelAccess = uniformBucketLevelAccess;
        this.url = url;
        this.versioning = versioning;
        this.website = website;
    }

    private BucketState() {
        this.cors = Input.empty();
        this.defaultEventBasedHold = Input.empty();
        this.encryption = Input.empty();
        this.forceDestroy = Input.empty();
        this.labels = Input.empty();
        this.lifecycleRules = Input.empty();
        this.location = Input.empty();
        this.logging = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.publicAccessPrevention = Input.empty();
        this.requesterPays = Input.empty();
        this.retentionPolicy = Input.empty();
        this.selfLink = Input.empty();
        this.storageClass = Input.empty();
        this.uniformBucketLevelAccess = Input.empty();
        this.url = Input.empty();
        this.versioning = Input.empty();
        this.website = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BucketCorGetArgs>> cors;
        private @Nullable Input<Boolean> defaultEventBasedHold;
        private @Nullable Input<BucketEncryptionGetArgs> encryption;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<BucketLifecycleRuleGetArgs>> lifecycleRules;
        private @Nullable Input<String> location;
        private @Nullable Input<BucketLoggingGetArgs> logging;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> publicAccessPrevention;
        private @Nullable Input<Boolean> requesterPays;
        private @Nullable Input<BucketRetentionPolicyGetArgs> retentionPolicy;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> storageClass;
        private @Nullable Input<Boolean> uniformBucketLevelAccess;
        private @Nullable Input<String> url;
        private @Nullable Input<BucketVersioningGetArgs> versioning;
        private @Nullable Input<BucketWebsiteGetArgs> website;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.defaultEventBasedHold = defaults.defaultEventBasedHold;
    	      this.encryption = defaults.encryption;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.labels = defaults.labels;
    	      this.lifecycleRules = defaults.lifecycleRules;
    	      this.location = defaults.location;
    	      this.logging = defaults.logging;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicAccessPrevention = defaults.publicAccessPrevention;
    	      this.requesterPays = defaults.requesterPays;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.selfLink = defaults.selfLink;
    	      this.storageClass = defaults.storageClass;
    	      this.uniformBucketLevelAccess = defaults.uniformBucketLevelAccess;
    	      this.url = defaults.url;
    	      this.versioning = defaults.versioning;
    	      this.website = defaults.website;
        }

        public Builder setCors(@Nullable Input<List<BucketCorGetArgs>> cors) {
            this.cors = cors;
            return this;
        }

        public Builder setCors(@Nullable List<BucketCorGetArgs> cors) {
            this.cors = Input.ofNullable(cors);
            return this;
        }

        public Builder setDefaultEventBasedHold(@Nullable Input<Boolean> defaultEventBasedHold) {
            this.defaultEventBasedHold = defaultEventBasedHold;
            return this;
        }

        public Builder setDefaultEventBasedHold(@Nullable Boolean defaultEventBasedHold) {
            this.defaultEventBasedHold = Input.ofNullable(defaultEventBasedHold);
            return this;
        }

        public Builder setEncryption(@Nullable Input<BucketEncryptionGetArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable BucketEncryptionGetArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLifecycleRules(@Nullable Input<List<BucketLifecycleRuleGetArgs>> lifecycleRules) {
            this.lifecycleRules = lifecycleRules;
            return this;
        }

        public Builder setLifecycleRules(@Nullable List<BucketLifecycleRuleGetArgs> lifecycleRules) {
            this.lifecycleRules = Input.ofNullable(lifecycleRules);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLogging(@Nullable Input<BucketLoggingGetArgs> logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLogging(@Nullable BucketLoggingGetArgs logging) {
            this.logging = Input.ofNullable(logging);
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

        public Builder setPublicAccessPrevention(@Nullable Input<String> publicAccessPrevention) {
            this.publicAccessPrevention = publicAccessPrevention;
            return this;
        }

        public Builder setPublicAccessPrevention(@Nullable String publicAccessPrevention) {
            this.publicAccessPrevention = Input.ofNullable(publicAccessPrevention);
            return this;
        }

        public Builder setRequesterPays(@Nullable Input<Boolean> requesterPays) {
            this.requesterPays = requesterPays;
            return this;
        }

        public Builder setRequesterPays(@Nullable Boolean requesterPays) {
            this.requesterPays = Input.ofNullable(requesterPays);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Input<BucketRetentionPolicyGetArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable BucketRetentionPolicyGetArgs retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setStorageClass(@Nullable Input<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder setStorageClass(@Nullable String storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }

        public Builder setUniformBucketLevelAccess(@Nullable Input<Boolean> uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = uniformBucketLevelAccess;
            return this;
        }

        public Builder setUniformBucketLevelAccess(@Nullable Boolean uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = Input.ofNullable(uniformBucketLevelAccess);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder setVersioning(@Nullable Input<BucketVersioningGetArgs> versioning) {
            this.versioning = versioning;
            return this;
        }

        public Builder setVersioning(@Nullable BucketVersioningGetArgs versioning) {
            this.versioning = Input.ofNullable(versioning);
            return this;
        }

        public Builder setWebsite(@Nullable Input<BucketWebsiteGetArgs> website) {
            this.website = website;
            return this;
        }

        public Builder setWebsite(@Nullable BucketWebsiteGetArgs website) {
            this.website = Input.ofNullable(website);
            return this;
        }

        public BucketState build() {
            return new BucketState(cors, defaultEventBasedHold, encryption, forceDestroy, labels, lifecycleRules, location, logging, name, project, publicAccessPrevention, requesterPays, retentionPolicy, selfLink, storageClass, uniformBucketLevelAccess, url, versioning, website);
        }
    }
}
