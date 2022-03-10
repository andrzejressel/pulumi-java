// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AvroFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetCompressionResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.JsonFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.TextFormatResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmazonS3DatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     * 
     */
    private final Object bucketName;
    /**
     * The data compression method used for the Amazon S3 object.
     * 
     */
    private final @Nullable DatasetCompressionResponse compression;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    private final @Nullable DatasetResponseFolder folder;
    /**
     * The format of files.
     * 
     */
    private final @Nullable Object format;
    /**
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object key;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The end of S3 object's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeEnd;
    /**
     * The start of S3 object's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeStart;
    /**
     * Parameters for dataset.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object prefix;
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    private final @Nullable Object schema;
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    private final @Nullable Object structure;
    /**
     * Type of dataset.
     * Expected value is 'AmazonS3Object'.
     * 
     */
    private final String type;
    /**
     * The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object version;

    @OutputCustomType.Constructor
    private AmazonS3DatasetResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("bucketName") Object bucketName,
        @OutputCustomType.Parameter("compression") @Nullable DatasetCompressionResponse compression,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @OutputCustomType.Parameter("format") @Nullable Object format,
        @OutputCustomType.Parameter("key") @Nullable Object key,
        @OutputCustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @OutputCustomType.Parameter("modifiedDatetimeEnd") @Nullable Object modifiedDatetimeEnd,
        @OutputCustomType.Parameter("modifiedDatetimeStart") @Nullable Object modifiedDatetimeStart,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("prefix") @Nullable Object prefix,
        @OutputCustomType.Parameter("schema") @Nullable Object schema,
        @OutputCustomType.Parameter("structure") @Nullable Object structure,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("version") @Nullable Object version) {
        this.annotations = annotations;
        this.bucketName = bucketName;
        this.compression = compression;
        this.description = description;
        this.folder = folder;
        this.format = format;
        this.key = key;
        this.linkedServiceName = linkedServiceName;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.parameters = parameters;
        this.prefix = prefix;
        this.schema = schema;
        this.structure = structure;
        this.type = type;
        this.version = version;
    }

    /**
     * List of tags that can be used for describing the Dataset.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     * 
    */
    public Object getBucketName() {
        return this.bucketName;
    }
    /**
     * The data compression method used for the Amazon S3 object.
     * 
    */
    public Optional<DatasetCompressionResponse> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * Dataset description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
    */
    public Optional<DatasetResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * The format of files.
     * 
    */
    public Optional<Object> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * The end of S3 object's modified datetime. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getModifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }
    /**
     * The start of S3 object's modified datetime. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getModifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }
    /**
     * Parameters for dataset.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
    */
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
    */
    public Optional<Object> getStructure() {
        return Optional.ofNullable(this.structure);
    }
    /**
     * Type of dataset.
     * Expected value is 'AmazonS3Object'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The version for the S3 object. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3DatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object bucketName;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object format;
        private @Nullable Object key;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object prefix;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3DatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.bucketName = defaults.bucketName;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.format = defaults.format;
    	      this.key = defaults.key;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.parameters = defaults.parameters;
    	      this.prefix = defaults.prefix;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setBucketName(Object bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setCompression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFolder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFormat(@Nullable Object format) {
            this.format = format;
            return this;
        }

        public Builder setKey(@Nullable Object key) {
            this.key = key;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setModifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder setModifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPrefix(@Nullable Object prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }

        public Builder setStructure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable Object version) {
            this.version = version;
            return this;
        }
        public AmazonS3DatasetResponse build() {
            return new AmazonS3DatasetResponse(annotations, bucketName, compression, description, folder, format, key, linkedServiceName, modifiedDatetimeEnd, modifiedDatetimeStart, parameters, prefix, schema, structure, type, version);
        }
    }
}
