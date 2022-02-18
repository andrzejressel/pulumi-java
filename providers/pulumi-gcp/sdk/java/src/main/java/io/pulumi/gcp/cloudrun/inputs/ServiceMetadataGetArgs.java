// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceMetadataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceMetadataGetArgs Empty = new ServiceMetadataGetArgs();

    /**
     * Annotations is a key value map stored with a resource that
     * may be set by external tools to store and retrieve arbitrary metadata. More
     * info: http://kubernetes.io/docs/user-guide/annotations
     * **Note**: The Cloud Run API may add additional annotations that were not provided in your config.
     * If the provider plan shows a diff where a server-side annotation is added, you can add it to your config
     * or apply the lifecycle.ignore_changes rule to the metadata.0.annotations field.
     * Cloud Run (fully managed) uses the following annotation keys to configure features on a Service:
     * - `run.googleapis.com/ingress` sets the [ingress settings](https://cloud.google.com/sdk/gcloud/reference/run/deploy#--ingress)
     *   for the Service. For example, `"run.googleapis.com/ingress" = "all"`.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * - 
     * A sequence number representing a specific generation of the desired state.
     * 
     */
    @InputImport(name="generation")
    private final @Nullable Input<Integer> generation;

    public Input<Integer> getGeneration() {
        return this.generation == null ? Input.empty() : this.generation;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * - 
     * An opaque value that represents the internal version of this object that
     * can be used by clients to determine when objects have changed. May be used
     * for optimistic concurrency, change detection, and the watch operation on a
     * resource or set of resources. They may only be valid for a
     * particular resource or set of resources.
     * More info:
     * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @InputImport(name="resourceVersion")
    private final @Nullable Input<String> resourceVersion;

    public Input<String> getResourceVersion() {
        return this.resourceVersion == null ? Input.empty() : this.resourceVersion;
    }

    /**
     * - 
     * SelfLink is a URL representing this object.
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * - 
     * UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public ServiceMetadataGetArgs(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<Integer> generation,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> namespace,
        @Nullable Input<String> resourceVersion,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> uid) {
        this.annotations = annotations;
        this.generation = generation;
        this.labels = labels;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    private ServiceMetadataGetArgs() {
        this.annotations = Input.empty();
        this.generation = Input.empty();
        this.labels = Input.empty();
        this.namespace = Input.empty();
        this.resourceVersion = Input.empty();
        this.selfLink = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<Integer> generation;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> namespace;
        private @Nullable Input<String> resourceVersion;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMetadataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setGeneration(@Nullable Input<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder setGeneration(@Nullable Integer generation) {
            this.generation = Input.ofNullable(generation);
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

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setResourceVersion(@Nullable Input<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        public Builder setResourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Input.ofNullable(resourceVersion);
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

        public Builder setUid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public ServiceMetadataGetArgs build() {
            return new ServiceMetadataGetArgs(annotations, generation, labels, namespace, resourceVersion, selfLink, uid);
        }
    }
}
