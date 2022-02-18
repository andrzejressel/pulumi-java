// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata for a BigQuery connector used by the job.
 * 
 */
public final class BigQueryIODetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BigQueryIODetailsResponse Empty = new BigQueryIODetailsResponse();

    /**
     * Dataset accessed in the connection.
     * 
     */
    @InputImport(name="dataset", required=true)
    private final String dataset;

    public String getDataset() {
        return this.dataset;
    }

    /**
     * Project accessed in the connection.
     * 
     */
    @InputImport(name="project", required=true)
    private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Query used to access data in the connection.
     * 
     */
    @InputImport(name="query", required=true)
    private final String query;

    public String getQuery() {
        return this.query;
    }

    /**
     * Table accessed in the connection.
     * 
     */
    @InputImport(name="table", required=true)
    private final String table;

    public String getTable() {
        return this.table;
    }

    public BigQueryIODetailsResponse(
        String dataset,
        String project,
        String query,
        String table) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private BigQueryIODetailsResponse() {
        this.dataset = null;
        this.project = null;
        this.query = null;
        this.table = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryIODetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataset;
        private String project;
        private String query;
        private String table;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryIODetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.project = defaults.project;
    	      this.query = defaults.query;
    	      this.table = defaults.table;
        }

        public Builder setDataset(String dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setTable(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public BigQueryIODetailsResponse build() {
            return new BigQueryIODetailsResponse(dataset, project, query, table);
        }
    }
}
