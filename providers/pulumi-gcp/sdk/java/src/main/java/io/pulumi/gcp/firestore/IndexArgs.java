// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firestore;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.firestore.inputs.IndexFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexArgs Empty = new IndexArgs();

    /**
     * The collection being indexed.
     * 
     */
    @InputImport(name="collection", required=true)
    private final Input<String> collection;

    public Input<String> getCollection() {
        return this.collection;
    }

    /**
     * The Firestore database id. Defaults to `"(default)"`.
     * 
     */
    @InputImport(name="database")
    private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * The fields supported by this index. The last field entry is always for
     * the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the
     * same direction as that of the last field defined. If the final field
     * in a composite index is not directional, the `__name__` will be
     * ordered `"ASCENDING"` (unless explicitly specified otherwise).
     * Structure is documented below.
     * 
     */
    @InputImport(name="fields", required=true)
    private final Input<List<IndexFieldArgs>> fields;

    public Input<List<IndexFieldArgs>> getFields() {
        return this.fields;
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
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are `COLLECTION` and `COLLECTION_GROUP`.
     * 
     */
    @InputImport(name="queryScope")
    private final @Nullable Input<String> queryScope;

    public Input<String> getQueryScope() {
        return this.queryScope == null ? Input.empty() : this.queryScope;
    }

    public IndexArgs(
        Input<String> collection,
        @Nullable Input<String> database,
        Input<List<IndexFieldArgs>> fields,
        @Nullable Input<String> project,
        @Nullable Input<String> queryScope) {
        this.collection = Objects.requireNonNull(collection, "expected parameter 'collection' to be non-null");
        this.database = database;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.project = project;
        this.queryScope = queryScope;
    }

    private IndexArgs() {
        this.collection = Input.empty();
        this.database = Input.empty();
        this.fields = Input.empty();
        this.project = Input.empty();
        this.queryScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> collection;
        private @Nullable Input<String> database;
        private Input<List<IndexFieldArgs>> fields;
        private @Nullable Input<String> project;
        private @Nullable Input<String> queryScope;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.database = defaults.database;
    	      this.fields = defaults.fields;
    	      this.project = defaults.project;
    	      this.queryScope = defaults.queryScope;
        }

        public Builder setCollection(Input<String> collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }

        public Builder setCollection(String collection) {
            this.collection = Input.of(Objects.requireNonNull(collection));
            return this;
        }

        public Builder setDatabase(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder setFields(Input<List<IndexFieldArgs>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setFields(List<IndexFieldArgs> fields) {
            this.fields = Input.of(Objects.requireNonNull(fields));
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

        public Builder setQueryScope(@Nullable Input<String> queryScope) {
            this.queryScope = queryScope;
            return this;
        }

        public Builder setQueryScope(@Nullable String queryScope) {
            this.queryScope = Input.ofNullable(queryScope);
            return this;
        }

        public IndexArgs build() {
            return new IndexArgs(collection, database, fields, project, queryScope);
        }
    }
}
