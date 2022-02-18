// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs;
import io.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricArgs Empty = new MetricArgs();

    /**
     * The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     * describes the bucket boundaries used to create a histogram of the extracted values.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bucketOptions")
    private final @Nullable Input<MetricBucketOptionsArgs> bucketOptions;

    public Input<MetricBucketOptionsArgs> getBucketOptions() {
        return this.bucketOptions == null ? Input.empty() : this.bucketOptions;
    }

    /**
     * A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-filters) which
     * is used to match log entries.
     * 
     */
    @InputImport(name="filter", required=true)
    private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * A map from a label key string to an extractor expression which is used to extract data from a log
     * entry field and assign as the label value. Each label key specified in the LabelDescriptor must
     * have an associated extractor expression in this map. The syntax of the extractor expression is
     * the same as for the valueExtractor field.
     * 
     */
    @InputImport(name="labelExtractors")
    private final @Nullable Input<Map<String,String>> labelExtractors;

    public Input<Map<String,String>> getLabelExtractors() {
        return this.labelExtractors == null ? Input.empty() : this.labelExtractors;
    }

    /**
     * The metric descriptor associated with the logs-based metric.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metricDescriptor", required=true)
    private final Input<MetricMetricDescriptorArgs> metricDescriptor;

    public Input<MetricMetricDescriptorArgs> getMetricDescriptor() {
        return this.metricDescriptor;
    }

    /**
     * The client-assigned metric identifier. Examples - "error_count", "nginx/requests".
     * Metric identifiers are limited to 100 characters and can include only the following
     * characters A-Z, a-z, 0-9, and the special characters _-.,+!*',()%/. The forward-slash
     * character (/) denotes a hierarchy of name pieces, and it cannot be the first character
     * of the name.
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
     * A valueExtractor is required when using a distribution logs-based metric to extract the values to
     * record from a log entry. Two functions are supported for value extraction - EXTRACT(field) or
     * REGEXP_EXTRACT(field, regex). The argument are 1. field - The name of the log entry field from which
     * the value is to be extracted. 2. regex - A regular expression using the Google RE2 syntax
     * (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified
     * log entry field. The value of the field is converted to a string before applying the regex. It is an
     * error to specify a regex that does not include exactly one capture group.
     * 
     */
    @InputImport(name="valueExtractor")
    private final @Nullable Input<String> valueExtractor;

    public Input<String> getValueExtractor() {
        return this.valueExtractor == null ? Input.empty() : this.valueExtractor;
    }

    public MetricArgs(
        @Nullable Input<MetricBucketOptionsArgs> bucketOptions,
        @Nullable Input<String> description,
        Input<String> filter,
        @Nullable Input<Map<String,String>> labelExtractors,
        Input<MetricMetricDescriptorArgs> metricDescriptor,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> valueExtractor) {
        this.bucketOptions = bucketOptions;
        this.description = description;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.labelExtractors = labelExtractors;
        this.metricDescriptor = Objects.requireNonNull(metricDescriptor, "expected parameter 'metricDescriptor' to be non-null");
        this.name = name;
        this.project = project;
        this.valueExtractor = valueExtractor;
    }

    private MetricArgs() {
        this.bucketOptions = Input.empty();
        this.description = Input.empty();
        this.filter = Input.empty();
        this.labelExtractors = Input.empty();
        this.metricDescriptor = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.valueExtractor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MetricBucketOptionsArgs> bucketOptions;
        private @Nullable Input<String> description;
        private Input<String> filter;
        private @Nullable Input<Map<String,String>> labelExtractors;
        private Input<MetricMetricDescriptorArgs> metricDescriptor;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> valueExtractor;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketOptions = defaults.bucketOptions;
    	      this.description = defaults.description;
    	      this.filter = defaults.filter;
    	      this.labelExtractors = defaults.labelExtractors;
    	      this.metricDescriptor = defaults.metricDescriptor;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.valueExtractor = defaults.valueExtractor;
        }

        public Builder setBucketOptions(@Nullable Input<MetricBucketOptionsArgs> bucketOptions) {
            this.bucketOptions = bucketOptions;
            return this;
        }

        public Builder setBucketOptions(@Nullable MetricBucketOptionsArgs bucketOptions) {
            this.bucketOptions = Input.ofNullable(bucketOptions);
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

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setLabelExtractors(@Nullable Input<Map<String,String>> labelExtractors) {
            this.labelExtractors = labelExtractors;
            return this;
        }

        public Builder setLabelExtractors(@Nullable Map<String,String> labelExtractors) {
            this.labelExtractors = Input.ofNullable(labelExtractors);
            return this;
        }

        public Builder setMetricDescriptor(Input<MetricMetricDescriptorArgs> metricDescriptor) {
            this.metricDescriptor = Objects.requireNonNull(metricDescriptor);
            return this;
        }

        public Builder setMetricDescriptor(MetricMetricDescriptorArgs metricDescriptor) {
            this.metricDescriptor = Input.of(Objects.requireNonNull(metricDescriptor));
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

        public Builder setValueExtractor(@Nullable Input<String> valueExtractor) {
            this.valueExtractor = valueExtractor;
            return this;
        }

        public Builder setValueExtractor(@Nullable String valueExtractor) {
            this.valueExtractor = Input.ofNullable(valueExtractor);
            return this;
        }

        public MetricArgs build() {
            return new MetricArgs(bucketOptions, description, filter, labelExtractors, metricDescriptor, name, project, valueExtractor);
        }
    }
}
