// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArchiveDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArchiveDeploymentArgs Empty = new ArchiveDeploymentArgs();

    @InputImport(name="environmentId", required=true)
    private final Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * Input only. The Google Cloud Storage signed URL returned from GenerateUploadUrl and used to upload the Archive zip file.
     * 
     */
    @InputImport(name="gcsUri")
    private final @Nullable Input<String> gcsUri;

    public Input<String> getGcsUri() {
        return this.gcsUri == null ? Input.empty() : this.gcsUri;
    }

    /**
     * User-supplied key-value pairs used to organize ArchiveDeployments. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the Archive Deployment in the following format: `organizations/{org}/environments/{env}/archiveDeployments/{id}`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    public ArchiveDeploymentArgs(
        Input<String> environmentId,
        @Nullable Input<String> gcsUri,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        Input<String> organizationId) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.gcsUri = gcsUri;
        this.labels = labels;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private ArchiveDeploymentArgs() {
        this.environmentId = Input.empty();
        this.gcsUri = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArchiveDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> environmentId;
        private @Nullable Input<String> gcsUri;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(ArchiveDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.gcsUri = defaults.gcsUri;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setEnvironmentId(Input<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Input.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder setGcsUri(@Nullable Input<String> gcsUri) {
            this.gcsUri = gcsUri;
            return this;
        }

        public Builder setGcsUri(@Nullable String gcsUri) {
            this.gcsUri = Input.ofNullable(gcsUri);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public ArchiveDeploymentArgs build() {
            return new ArchiveDeploymentArgs(environmentId, gcsUri, labels, name, organizationId);
        }
    }
}
