// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the tag, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1". If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="packageId", required=true)
    private final Input<String> packageId;

    public Input<String> getPackageId() {
        return this.packageId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="repositoryId", required=true)
    private final Input<String> repositoryId;

    public Input<String> getRepositoryId() {
        return this.repositoryId;
    }

    @InputImport(name="tagId")
    private final @Nullable Input<String> tagId;

    public Input<String> getTagId() {
        return this.tagId == null ? Input.empty() : this.tagId;
    }

    /**
     * The name of the version the tag refers to, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811" If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public TagArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> packageId,
        @Nullable Input<String> project,
        Input<String> repositoryId,
        @Nullable Input<String> tagId,
        @Nullable Input<String> version) {
        this.location = location;
        this.name = name;
        this.packageId = Objects.requireNonNull(packageId, "expected parameter 'packageId' to be non-null");
        this.project = project;
        this.repositoryId = Objects.requireNonNull(repositoryId, "expected parameter 'repositoryId' to be non-null");
        this.tagId = tagId;
        this.version = version;
    }

    private TagArgs() {
        this.location = Input.empty();
        this.name = Input.empty();
        this.packageId = Input.empty();
        this.project = Input.empty();
        this.repositoryId = Input.empty();
        this.tagId = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> packageId;
        private @Nullable Input<String> project;
        private Input<String> repositoryId;
        private @Nullable Input<String> tagId;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(TagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.packageId = defaults.packageId;
    	      this.project = defaults.project;
    	      this.repositoryId = defaults.repositoryId;
    	      this.tagId = defaults.tagId;
    	      this.version = defaults.version;
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

        public Builder setPackageId(Input<String> packageId) {
            this.packageId = Objects.requireNonNull(packageId);
            return this;
        }

        public Builder setPackageId(String packageId) {
            this.packageId = Input.of(Objects.requireNonNull(packageId));
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

        public Builder setRepositoryId(Input<String> repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = Input.of(Objects.requireNonNull(repositoryId));
            return this;
        }

        public Builder setTagId(@Nullable Input<String> tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder setTagId(@Nullable String tagId) {
            this.tagId = Input.ofNullable(tagId);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public TagArgs build() {
            return new TagArgs(location, name, packageId, project, repositoryId, tagId, version);
        }
    }
}
