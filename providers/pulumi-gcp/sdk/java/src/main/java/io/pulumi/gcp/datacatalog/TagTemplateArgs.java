// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateArgs Empty = new TagTemplateArgs();

    /**
     * The display name for this template.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fields", required=true)
    private final Input<List<TagTemplateFieldArgs>> fields;

    public Input<List<TagTemplateFieldArgs>> getFields() {
        return this.fields;
    }

    /**
     * This confirms the deletion of any possible tags using this template. Must be set to true in order to delete the tag template.
     * 
     */
    @InputImport(name="forceDelete")
    private final @Nullable Input<Boolean> forceDelete;

    public Input<Boolean> getForceDelete() {
        return this.forceDelete == null ? Input.empty() : this.forceDelete;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Template location region.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The id of the tag template to create.
     * 
     */
    @InputImport(name="tagTemplateId", required=true)
    private final Input<String> tagTemplateId;

    public Input<String> getTagTemplateId() {
        return this.tagTemplateId;
    }

    public TagTemplateArgs(
        @Nullable Input<String> displayName,
        Input<List<TagTemplateFieldArgs>> fields,
        @Nullable Input<Boolean> forceDelete,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> tagTemplateId) {
        this.displayName = displayName;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.forceDelete = forceDelete;
        this.project = project;
        this.region = region;
        this.tagTemplateId = Objects.requireNonNull(tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
    }

    private TagTemplateArgs() {
        this.displayName = Input.empty();
        this.fields = Input.empty();
        this.forceDelete = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.tagTemplateId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private Input<List<TagTemplateFieldArgs>> fields;
        private @Nullable Input<Boolean> forceDelete;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> tagTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.forceDelete = defaults.forceDelete;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.tagTemplateId = defaults.tagTemplateId;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFields(Input<List<TagTemplateFieldArgs>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setFields(List<TagTemplateFieldArgs> fields) {
            this.fields = Input.of(Objects.requireNonNull(fields));
            return this;
        }

        public Builder setForceDelete(@Nullable Input<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder setForceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Input.ofNullable(forceDelete);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setTagTemplateId(Input<String> tagTemplateId) {
            this.tagTemplateId = Objects.requireNonNull(tagTemplateId);
            return this;
        }

        public Builder setTagTemplateId(String tagTemplateId) {
            this.tagTemplateId = Input.of(Objects.requireNonNull(tagTemplateId));
            return this;
        }

        public TagTemplateArgs build() {
            return new TagTemplateArgs(displayName, fields, forceDelete, project, region, tagTemplateId);
        }
    }
}
