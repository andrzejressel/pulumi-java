// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseIAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseIAMPolicyState Empty = new DatabaseIAMPolicyState();

    /**
     * The name of the Spanner database.
     * 
     */
    @InputImport(name="database")
    private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * (Computed) The etag of the database's IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The name of the Spanner instance the database belongs to.
     * 
     */
    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
    private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatabaseIAMPolicyState(
        @Nullable Input<String> database,
        @Nullable Input<String> etag,
        @Nullable Input<String> instance,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project) {
        this.database = database;
        this.etag = etag;
        this.instance = instance;
        this.policyData = policyData;
        this.project = project;
    }

    private DatabaseIAMPolicyState() {
        this.database = Input.empty();
        this.etag = Input.empty();
        this.instance = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> database;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder setDatabase(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
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

        public DatabaseIAMPolicyState build() {
            return new DatabaseIAMPolicyState(database, etag, instance, policyData, project);
        }
    }
}
