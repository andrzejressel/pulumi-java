// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.awsnative.databrew.enums.JobOutputCompressionFormat;
import com.pulumi.awsnative.databrew.enums.JobOutputFormat;
import com.pulumi.awsnative.databrew.outputs.JobOutputFormatOptions;
import com.pulumi.awsnative.databrew.outputs.JobS3Location;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobOutput {
    private final @Nullable JobOutputCompressionFormat compressionFormat;
    private final @Nullable JobOutputFormat format;
    private final @Nullable JobOutputFormatOptions formatOptions;
    private final JobS3Location location;
    private final @Nullable Integer maxOutputFiles;
    private final @Nullable Boolean overwrite;
    private final @Nullable List<String> partitionColumns;

    @CustomType.Constructor
    private JobOutput(
        @CustomType.Parameter("compressionFormat") @Nullable JobOutputCompressionFormat compressionFormat,
        @CustomType.Parameter("format") @Nullable JobOutputFormat format,
        @CustomType.Parameter("formatOptions") @Nullable JobOutputFormatOptions formatOptions,
        @CustomType.Parameter("location") JobS3Location location,
        @CustomType.Parameter("maxOutputFiles") @Nullable Integer maxOutputFiles,
        @CustomType.Parameter("overwrite") @Nullable Boolean overwrite,
        @CustomType.Parameter("partitionColumns") @Nullable List<String> partitionColumns) {
        this.compressionFormat = compressionFormat;
        this.format = format;
        this.formatOptions = formatOptions;
        this.location = location;
        this.maxOutputFiles = maxOutputFiles;
        this.overwrite = overwrite;
        this.partitionColumns = partitionColumns;
    }

    public Optional<JobOutputCompressionFormat> compressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }
    public Optional<JobOutputFormat> format() {
        return Optional.ofNullable(this.format);
    }
    public Optional<JobOutputFormatOptions> formatOptions() {
        return Optional.ofNullable(this.formatOptions);
    }
    public JobS3Location location() {
        return this.location;
    }
    public Optional<Integer> maxOutputFiles() {
        return Optional.ofNullable(this.maxOutputFiles);
    }
    public Optional<Boolean> overwrite() {
        return Optional.ofNullable(this.overwrite);
    }
    public List<String> partitionColumns() {
        return this.partitionColumns == null ? List.of() : this.partitionColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobOutputCompressionFormat compressionFormat;
        private @Nullable JobOutputFormat format;
        private @Nullable JobOutputFormatOptions formatOptions;
        private JobS3Location location;
        private @Nullable Integer maxOutputFiles;
        private @Nullable Boolean overwrite;
        private @Nullable List<String> partitionColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.format = defaults.format;
    	      this.formatOptions = defaults.formatOptions;
    	      this.location = defaults.location;
    	      this.maxOutputFiles = defaults.maxOutputFiles;
    	      this.overwrite = defaults.overwrite;
    	      this.partitionColumns = defaults.partitionColumns;
        }

        public Builder compressionFormat(@Nullable JobOutputCompressionFormat compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }
        public Builder format(@Nullable JobOutputFormat format) {
            this.format = format;
            return this;
        }
        public Builder formatOptions(@Nullable JobOutputFormatOptions formatOptions) {
            this.formatOptions = formatOptions;
            return this;
        }
        public Builder location(JobS3Location location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maxOutputFiles(@Nullable Integer maxOutputFiles) {
            this.maxOutputFiles = maxOutputFiles;
            return this;
        }
        public Builder overwrite(@Nullable Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Builder partitionColumns(@Nullable List<String> partitionColumns) {
            this.partitionColumns = partitionColumns;
            return this;
        }
        public Builder partitionColumns(String... partitionColumns) {
            return partitionColumns(List.of(partitionColumns));
        }        public JobOutput build() {
            return new JobOutput(compressionFormat, format, formatOptions, location, maxOutputFiles, overwrite, partitionColumns);
        }
    }
}
