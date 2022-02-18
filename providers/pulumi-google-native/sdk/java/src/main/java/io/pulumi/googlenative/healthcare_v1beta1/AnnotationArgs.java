// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.AnnotationSourceArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.ImageAnnotationArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.ResourceAnnotationArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.SensitiveTextAnnotationArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnnotationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnnotationArgs Empty = new AnnotationArgs();

    /**
     * Details of the source.
     * 
     */
    @InputImport(name="annotationSource")
    private final @Nullable Input<AnnotationSourceArgs> annotationSource;

    public Input<AnnotationSourceArgs> getAnnotationSource() {
        return this.annotationSource == null ? Input.empty() : this.annotationSource;
    }

    @InputImport(name="annotationStoreId", required=true)
    private final Input<String> annotationStoreId;

    public Input<String> getAnnotationStoreId() {
        return this.annotationStoreId;
    }

    /**
     * Additional information for this annotation record, such as annotator and verifier information or study campaign.
     * 
     */
    @InputImport(name="customData")
    private final @Nullable Input<Map<String,String>> customData;

    public Input<Map<String,String>> getCustomData() {
        return this.customData == null ? Input.empty() : this.customData;
    }

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Annotations for images. For example, bounding polygons.
     * 
     */
    @InputImport(name="imageAnnotation")
    private final @Nullable Input<ImageAnnotationArgs> imageAnnotation;

    public Input<ImageAnnotationArgs> getImageAnnotation() {
        return this.imageAnnotation == null ? Input.empty() : this.imageAnnotation;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Resource name of the Annotation, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
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

    /**
     * Annotations for resource. For example, classification tags.
     * 
     */
    @InputImport(name="resourceAnnotation")
    private final @Nullable Input<ResourceAnnotationArgs> resourceAnnotation;

    public Input<ResourceAnnotationArgs> getResourceAnnotation() {
        return this.resourceAnnotation == null ? Input.empty() : this.resourceAnnotation;
    }

    /**
     * Annotations for sensitive texts. For example, a range that describes the location of sensitive text.
     * 
     */
    @InputImport(name="textAnnotation")
    private final @Nullable Input<SensitiveTextAnnotationArgs> textAnnotation;

    public Input<SensitiveTextAnnotationArgs> getTextAnnotation() {
        return this.textAnnotation == null ? Input.empty() : this.textAnnotation;
    }

    public AnnotationArgs(
        @Nullable Input<AnnotationSourceArgs> annotationSource,
        Input<String> annotationStoreId,
        @Nullable Input<Map<String,String>> customData,
        Input<String> datasetId,
        @Nullable Input<ImageAnnotationArgs> imageAnnotation,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<ResourceAnnotationArgs> resourceAnnotation,
        @Nullable Input<SensitiveTextAnnotationArgs> textAnnotation) {
        this.annotationSource = annotationSource;
        this.annotationStoreId = Objects.requireNonNull(annotationStoreId, "expected parameter 'annotationStoreId' to be non-null");
        this.customData = customData;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.imageAnnotation = imageAnnotation;
        this.location = location;
        this.name = name;
        this.project = project;
        this.resourceAnnotation = resourceAnnotation;
        this.textAnnotation = textAnnotation;
    }

    private AnnotationArgs() {
        this.annotationSource = Input.empty();
        this.annotationStoreId = Input.empty();
        this.customData = Input.empty();
        this.datasetId = Input.empty();
        this.imageAnnotation = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.resourceAnnotation = Input.empty();
        this.textAnnotation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AnnotationSourceArgs> annotationSource;
        private Input<String> annotationStoreId;
        private @Nullable Input<Map<String,String>> customData;
        private Input<String> datasetId;
        private @Nullable Input<ImageAnnotationArgs> imageAnnotation;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<ResourceAnnotationArgs> resourceAnnotation;
        private @Nullable Input<SensitiveTextAnnotationArgs> textAnnotation;

        public Builder() {
    	      // Empty
        }

        public Builder(AnnotationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSource = defaults.annotationSource;
    	      this.annotationStoreId = defaults.annotationStoreId;
    	      this.customData = defaults.customData;
    	      this.datasetId = defaults.datasetId;
    	      this.imageAnnotation = defaults.imageAnnotation;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.resourceAnnotation = defaults.resourceAnnotation;
    	      this.textAnnotation = defaults.textAnnotation;
        }

        public Builder setAnnotationSource(@Nullable Input<AnnotationSourceArgs> annotationSource) {
            this.annotationSource = annotationSource;
            return this;
        }

        public Builder setAnnotationSource(@Nullable AnnotationSourceArgs annotationSource) {
            this.annotationSource = Input.ofNullable(annotationSource);
            return this;
        }

        public Builder setAnnotationStoreId(Input<String> annotationStoreId) {
            this.annotationStoreId = Objects.requireNonNull(annotationStoreId);
            return this;
        }

        public Builder setAnnotationStoreId(String annotationStoreId) {
            this.annotationStoreId = Input.of(Objects.requireNonNull(annotationStoreId));
            return this;
        }

        public Builder setCustomData(@Nullable Input<Map<String,String>> customData) {
            this.customData = customData;
            return this;
        }

        public Builder setCustomData(@Nullable Map<String,String> customData) {
            this.customData = Input.ofNullable(customData);
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

        public Builder setImageAnnotation(@Nullable Input<ImageAnnotationArgs> imageAnnotation) {
            this.imageAnnotation = imageAnnotation;
            return this;
        }

        public Builder setImageAnnotation(@Nullable ImageAnnotationArgs imageAnnotation) {
            this.imageAnnotation = Input.ofNullable(imageAnnotation);
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

        public Builder setResourceAnnotation(@Nullable Input<ResourceAnnotationArgs> resourceAnnotation) {
            this.resourceAnnotation = resourceAnnotation;
            return this;
        }

        public Builder setResourceAnnotation(@Nullable ResourceAnnotationArgs resourceAnnotation) {
            this.resourceAnnotation = Input.ofNullable(resourceAnnotation);
            return this;
        }

        public Builder setTextAnnotation(@Nullable Input<SensitiveTextAnnotationArgs> textAnnotation) {
            this.textAnnotation = textAnnotation;
            return this;
        }

        public Builder setTextAnnotation(@Nullable SensitiveTextAnnotationArgs textAnnotation) {
            this.textAnnotation = Input.ofNullable(textAnnotation);
            return this;
        }

        public AnnotationArgs build() {
            return new AnnotationArgs(annotationSource, annotationStoreId, customData, datasetId, imageAnnotation, location, name, project, resourceAnnotation, textAnnotation);
        }
    }
}
