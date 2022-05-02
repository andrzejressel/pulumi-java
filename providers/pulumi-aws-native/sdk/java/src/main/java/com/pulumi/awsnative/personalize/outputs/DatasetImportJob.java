// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.outputs;

import com.pulumi.awsnative.personalize.outputs.DatasetImportJobDataSourceProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetImportJob {
    /**
     * @return The Amazon S3 bucket that contains the training data to import.
     * 
     */
    private final @Nullable DatasetImportJobDataSourceProperties dataSource;
    /**
     * @return The ARN of the dataset that receives the imported data
     * 
     */
    private final @Nullable String datasetArn;
    /**
     * @return The ARN of the dataset import job
     * 
     */
    private final @Nullable String datasetImportJobArn;
    /**
     * @return The name for the dataset import job.
     * 
     */
    private final @Nullable String jobName;
    /**
     * @return The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * 
     */
    private final @Nullable String roleArn;

    @CustomType.Constructor
    private DatasetImportJob(
        @CustomType.Parameter("dataSource") @Nullable DatasetImportJobDataSourceProperties dataSource,
        @CustomType.Parameter("datasetArn") @Nullable String datasetArn,
        @CustomType.Parameter("datasetImportJobArn") @Nullable String datasetImportJobArn,
        @CustomType.Parameter("jobName") @Nullable String jobName,
        @CustomType.Parameter("roleArn") @Nullable String roleArn) {
        this.dataSource = dataSource;
        this.datasetArn = datasetArn;
        this.datasetImportJobArn = datasetImportJobArn;
        this.jobName = jobName;
        this.roleArn = roleArn;
    }

    /**
     * @return The Amazon S3 bucket that contains the training data to import.
     * 
     */
    public Optional<DatasetImportJobDataSourceProperties> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }
    /**
     * @return The ARN of the dataset that receives the imported data
     * 
     */
    public Optional<String> datasetArn() {
        return Optional.ofNullable(this.datasetArn);
    }
    /**
     * @return The ARN of the dataset import job
     * 
     */
    public Optional<String> datasetImportJobArn() {
        return Optional.ofNullable(this.datasetImportJobArn);
    }
    /**
     * @return The name for the dataset import job.
     * 
     */
    public Optional<String> jobName() {
        return Optional.ofNullable(this.jobName);
    }
    /**
     * @return The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetImportJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetImportJobDataSourceProperties dataSource;
        private @Nullable String datasetArn;
        private @Nullable String datasetImportJobArn;
        private @Nullable String jobName;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetImportJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.datasetArn = defaults.datasetArn;
    	      this.datasetImportJobArn = defaults.datasetImportJobArn;
    	      this.jobName = defaults.jobName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder dataSource(@Nullable DatasetImportJobDataSourceProperties dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder datasetArn(@Nullable String datasetArn) {
            this.datasetArn = datasetArn;
            return this;
        }
        public Builder datasetImportJobArn(@Nullable String datasetImportJobArn) {
            this.datasetImportJobArn = datasetImportJobArn;
            return this;
        }
        public Builder jobName(@Nullable String jobName) {
            this.jobName = jobName;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }        public DatasetImportJob build() {
            return new DatasetImportJob(dataSource, datasetArn, datasetImportJobArn, jobName, roleArn);
        }
    }
}
