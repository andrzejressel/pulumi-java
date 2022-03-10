// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SapTablePartitionSettingsResponse {
    /**
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     * 
     */
    private final @Nullable Object maxPartitionsNumber;
    /**
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionColumnName;
    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionLowerBound;
    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionUpperBound;

    @OutputCustomType.Constructor
    private SapTablePartitionSettingsResponse(
        @OutputCustomType.Parameter("maxPartitionsNumber") @Nullable Object maxPartitionsNumber,
        @OutputCustomType.Parameter("partitionColumnName") @Nullable Object partitionColumnName,
        @OutputCustomType.Parameter("partitionLowerBound") @Nullable Object partitionLowerBound,
        @OutputCustomType.Parameter("partitionUpperBound") @Nullable Object partitionUpperBound) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    /**
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     * 
    */
    public Optional<Object> getMaxPartitionsNumber() {
        return Optional.ofNullable(this.maxPartitionsNumber);
    }
    /**
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPartitionColumnName() {
        return Optional.ofNullable(this.partitionColumnName);
    }
    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPartitionLowerBound() {
        return Optional.ofNullable(this.partitionLowerBound);
    }
    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPartitionUpperBound() {
        return Optional.ofNullable(this.partitionUpperBound);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTablePartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object maxPartitionsNumber;
        private @Nullable Object partitionColumnName;
        private @Nullable Object partitionLowerBound;
        private @Nullable Object partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTablePartitionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPartitionsNumber = defaults.maxPartitionsNumber;
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder setMaxPartitionsNumber(@Nullable Object maxPartitionsNumber) {
            this.maxPartitionsNumber = maxPartitionsNumber;
            return this;
        }

        public Builder setPartitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder setPartitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }

        public Builder setPartitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }
        public SapTablePartitionSettingsResponse build() {
            return new SapTablePartitionSettingsResponse(maxPartitionsNumber, partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}
