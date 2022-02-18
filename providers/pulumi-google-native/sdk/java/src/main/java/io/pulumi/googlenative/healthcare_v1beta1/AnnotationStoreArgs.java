// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnnotationStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnnotationStoreArgs Empty = new AnnotationStoreArgs();

    @InputImport(name="annotationStoreId")
    private final @Nullable Input<String> annotationStoreId;

    public Input<String> getAnnotationStoreId() {
        return this.annotationStoreId == null ? Input.empty() : this.annotationStoreId;
    }

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Optional. User-supplied key-value pairs used to organize Annotation stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Resource name of the Annotation store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public AnnotationStoreArgs(
        @Nullable Input<String> annotationStoreId,
        Input<String> datasetId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.annotationStoreId = annotationStoreId;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private AnnotationStoreArgs() {
        this.annotationStoreId = Input.empty();
        this.datasetId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnnotationStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> annotationStoreId;
        private Input<String> datasetId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AnnotationStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationStoreId = defaults.annotationStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setAnnotationStoreId(@Nullable Input<String> annotationStoreId) {
            this.annotationStoreId = annotationStoreId;
            return this;
        }

        public Builder setAnnotationStoreId(@Nullable String annotationStoreId) {
            this.annotationStoreId = Input.ofNullable(annotationStoreId);
            return this;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public AnnotationStoreArgs build() {
            return new AnnotationStoreArgs(annotationStoreId, datasetId, labels, location, name, project);
        }
    }
}
