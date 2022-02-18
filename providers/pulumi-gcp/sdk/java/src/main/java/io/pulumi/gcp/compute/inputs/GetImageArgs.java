// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * The family name of the image.
     * 
     */
    @InputImport(name="family")
    private final @Nullable String family;

    public Optional<String> getFamily() {
        return this.family == null ? Optional.empty() : Optional.ofNullable(this.family);
    }

    @InputImport(name="filter")
    private final @Nullable String filter;

    public Optional<String> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * The name of the image.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The project in which the resource belongs. If it is not
     * provided, the provider project is used. If you are using a
     * [public base image][pubimg], be sure to specify the correct Image Project.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetImageArgs(
        @Nullable String family,
        @Nullable String filter,
        @Nullable String name,
        @Nullable String project) {
        this.family = family;
        this.filter = filter;
        this.name = name;
        this.project = project;
    }

    private GetImageArgs() {
        this.family = null;
        this.filter = null;
        this.name = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String family;
        private @Nullable String filter;
        private @Nullable String name;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetImageArgs build() {
            return new GetImageArgs(family, filter, name, project);
        }
    }
}
