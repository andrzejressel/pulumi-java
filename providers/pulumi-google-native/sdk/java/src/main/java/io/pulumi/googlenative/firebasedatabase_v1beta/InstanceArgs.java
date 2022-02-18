// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasedatabase_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.firebasedatabase_v1beta.enums.InstanceState;
import io.pulumi.googlenative.firebasedatabase_v1beta.enums.InstanceType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    @InputImport(name="databaseId")
    private final @Nullable Input<String> databaseId;

    public Input<String> getDatabaseId() {
        return this.databaseId == null ? Input.empty() : this.databaseId;
    }

    /**
     * Immutable. The globally unique hostname of the database.
     * 
     */
    @InputImport(name="databaseUrl")
    private final @Nullable Input<String> databaseUrl;

    public Input<String> getDatabaseUrl() {
        return this.databaseUrl == null ? Input.empty() : this.databaseUrl;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource name of the project this instance belongs to. For example: `projects/{project-number}`.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The database's lifecycle state. Read-only.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<InstanceState> state;

    public Input<InstanceState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<InstanceType> type;

    public Input<InstanceType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="validateOnly")
    private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public InstanceArgs(
        @Nullable Input<String> databaseId,
        @Nullable Input<String> databaseUrl,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<InstanceState> state,
        @Nullable Input<InstanceType> type,
        @Nullable Input<String> validateOnly) {
        this.databaseId = databaseId;
        this.databaseUrl = databaseUrl;
        this.location = location;
        this.name = name;
        this.project = project;
        this.state = state;
        this.type = type;
        this.validateOnly = validateOnly;
    }

    private InstanceArgs() {
        this.databaseId = Input.empty();
        this.databaseUrl = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.state = Input.empty();
        this.type = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> databaseId;
        private @Nullable Input<String> databaseUrl;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<InstanceState> state;
        private @Nullable Input<InstanceType> type;
        private @Nullable Input<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setDatabaseId(@Nullable Input<String> databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDatabaseId(@Nullable String databaseId) {
            this.databaseId = Input.ofNullable(databaseId);
            return this;
        }

        public Builder setDatabaseUrl(@Nullable Input<String> databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public Builder setDatabaseUrl(@Nullable String databaseUrl) {
            this.databaseUrl = Input.ofNullable(databaseUrl);
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

        public Builder setState(@Nullable Input<InstanceState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable InstanceState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setType(@Nullable Input<InstanceType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable InstanceType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValidateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }

        public InstanceArgs build() {
            return new InstanceArgs(databaseId, databaseUrl, location, name, project, state, type, validateOnly);
        }
    }
}
