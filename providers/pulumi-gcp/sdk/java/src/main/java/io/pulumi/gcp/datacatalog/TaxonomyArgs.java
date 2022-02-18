// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyArgs Empty = new TaxonomyArgs();

    /**
     * A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    @InputImport(name="activatedPolicyTypes")
    private final @Nullable Input<List<String>> activatedPolicyTypes;

    public Input<List<String>> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes == null ? Input.empty() : this.activatedPolicyTypes;
    }

    /**
     * Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
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
     * Taxonomy location region.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public TaxonomyArgs(
        @Nullable Input<List<String>> activatedPolicyTypes,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.activatedPolicyTypes = activatedPolicyTypes;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.project = project;
        this.region = region;
    }

    private TaxonomyArgs() {
        this.activatedPolicyTypes = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> activatedPolicyTypes;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setActivatedPolicyTypes(@Nullable Input<List<String>> activatedPolicyTypes) {
            this.activatedPolicyTypes = activatedPolicyTypes;
            return this;
        }

        public Builder setActivatedPolicyTypes(@Nullable List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Input.ofNullable(activatedPolicyTypes);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
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

        public TaxonomyArgs build() {
            return new TaxonomyArgs(activatedPolicyTypes, description, displayName, project, region);
        }
    }
}
