// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGroupState extends io.pulumi.resources.ResourceArgs {

    public static final EntryGroupState Empty = new EntryGroupState();

    /**
     * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011".
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The id of the entry group to create. The id must begin with a letter or underscore,
     * contain only English letters, numbers and underscores, and be at most 64 characters.
     * 
     */
    @InputImport(name="entryGroupId")
    private final @Nullable Input<String> entryGroupId;

    public Input<String> getEntryGroupId() {
        return this.entryGroupId == null ? Input.empty() : this.entryGroupId;
    }

    /**
     * The resource name of the entry group in URL format. Example:
     * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * EntryGroup location region.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public EntryGroupState(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> entryGroupId,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.description = description;
        this.displayName = displayName;
        this.entryGroupId = entryGroupId;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private EntryGroupState() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.entryGroupId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> entryGroupId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entryGroupId = defaults.entryGroupId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEntryGroupId(@Nullable Input<String> entryGroupId) {
            this.entryGroupId = entryGroupId;
            return this;
        }

        public Builder setEntryGroupId(@Nullable String entryGroupId) {
            this.entryGroupId = Input.ofNullable(entryGroupId);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public EntryGroupState build() {
            return new EntryGroupState(description, displayName, entryGroupId, name, project, region);
        }
    }
}
