// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.AlarmModelPayload;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmModelDynamoDB {
    /**
     * @return The name of the hash key (also called the partition key).
     * 
     */
    private final String hashKeyField;
    /**
     * @return The data type for the hash key (also called the partition key). You can specify the following values:
     * 
     * * `STRING` - The hash key is a string.
     * 
     * * `NUMBER` - The hash key is a number.
     * 
     * If you don&#39;t specify `hashKeyType`, the default value is `STRING`.
     * 
     */
    private final @Nullable String hashKeyType;
    /**
     * @return The value of the hash key (also called the partition key).
     * 
     */
    private final String hashKeyValue;
    /**
     * @return The type of operation to perform. You can specify the following values:
     * 
     * * `INSERT` - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * 
     * * `UPDATE` - Update an existing item of the DynamoDB table with new data. This item&#39;s partition key must match the specified hash key. If you specified a range key, the range key must match the item&#39;s sort key.
     * 
     * * `DELETE` - Delete an existing item of the DynamoDB table. This item&#39;s partition key must match the specified hash key. If you specified a range key, the range key must match the item&#39;s sort key.
     * 
     * If you don&#39;t specify this parameter, AWS IoT Events triggers the `INSERT` operation.
     * 
     */
    private final @Nullable String operation;
    private final @Nullable AlarmModelPayload payload;
    /**
     * @return The name of the DynamoDB column that receives the action payload.
     * 
     * If you don&#39;t specify this parameter, the name of the DynamoDB column is `payload`.
     * 
     */
    private final @Nullable String payloadField;
    /**
     * @return The name of the range key (also called the sort key).
     * 
     */
    private final @Nullable String rangeKeyField;
    /**
     * @return The data type for the range key (also called the sort key), You can specify the following values:
     * 
     * * `STRING` - The range key is a string.
     * 
     * * `NUMBER` - The range key is number.
     * 
     * If you don&#39;t specify `rangeKeyField`, the default value is `STRING`.
     * 
     */
    private final @Nullable String rangeKeyType;
    /**
     * @return The value of the range key (also called the sort key).
     * 
     */
    private final @Nullable String rangeKeyValue;
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    private final String tableName;

    @CustomType.Constructor
    private AlarmModelDynamoDB(
        @CustomType.Parameter("hashKeyField") String hashKeyField,
        @CustomType.Parameter("hashKeyType") @Nullable String hashKeyType,
        @CustomType.Parameter("hashKeyValue") String hashKeyValue,
        @CustomType.Parameter("operation") @Nullable String operation,
        @CustomType.Parameter("payload") @Nullable AlarmModelPayload payload,
        @CustomType.Parameter("payloadField") @Nullable String payloadField,
        @CustomType.Parameter("rangeKeyField") @Nullable String rangeKeyField,
        @CustomType.Parameter("rangeKeyType") @Nullable String rangeKeyType,
        @CustomType.Parameter("rangeKeyValue") @Nullable String rangeKeyValue,
        @CustomType.Parameter("tableName") String tableName) {
        this.hashKeyField = hashKeyField;
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = hashKeyValue;
        this.operation = operation;
        this.payload = payload;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.tableName = tableName;
    }

    /**
     * @return The name of the hash key (also called the partition key).
     * 
     */
    public String hashKeyField() {
        return this.hashKeyField;
    }
    /**
     * @return The data type for the hash key (also called the partition key). You can specify the following values:
     * 
     * * `STRING` - The hash key is a string.
     * 
     * * `NUMBER` - The hash key is a number.
     * 
     * If you don&#39;t specify `hashKeyType`, the default value is `STRING`.
     * 
     */
    public Optional<String> hashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }
    /**
     * @return The value of the hash key (also called the partition key).
     * 
     */
    public String hashKeyValue() {
        return this.hashKeyValue;
    }
    /**
     * @return The type of operation to perform. You can specify the following values:
     * 
     * * `INSERT` - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * 
     * * `UPDATE` - Update an existing item of the DynamoDB table with new data. This item&#39;s partition key must match the specified hash key. If you specified a range key, the range key must match the item&#39;s sort key.
     * 
     * * `DELETE` - Delete an existing item of the DynamoDB table. This item&#39;s partition key must match the specified hash key. If you specified a range key, the range key must match the item&#39;s sort key.
     * 
     * If you don&#39;t specify this parameter, AWS IoT Events triggers the `INSERT` operation.
     * 
     */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    public Optional<AlarmModelPayload> payload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * @return The name of the DynamoDB column that receives the action payload.
     * 
     * If you don&#39;t specify this parameter, the name of the DynamoDB column is `payload`.
     * 
     */
    public Optional<String> payloadField() {
        return Optional.ofNullable(this.payloadField);
    }
    /**
     * @return The name of the range key (also called the sort key).
     * 
     */
    public Optional<String> rangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }
    /**
     * @return The data type for the range key (also called the sort key), You can specify the following values:
     * 
     * * `STRING` - The range key is a string.
     * 
     * * `NUMBER` - The range key is number.
     * 
     * If you don&#39;t specify `rangeKeyField`, the default value is `STRING`.
     * 
     */
    public Optional<String> rangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }
    /**
     * @return The value of the range key (also called the sort key).
     * 
     */
    public Optional<String> rangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmModelDynamoDB defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String operation;
        private @Nullable AlarmModelPayload payload;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmModelDynamoDB defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payload = defaults.payload;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.tableName = defaults.tableName;
        }

        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }
        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }
        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        public Builder payload(@Nullable AlarmModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }
        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }
        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }
        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public AlarmModelDynamoDB build() {
            return new AlarmModelDynamoDB(hashKeyField, hashKeyType, hashKeyValue, operation, payload, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, tableName);
        }
    }
}
