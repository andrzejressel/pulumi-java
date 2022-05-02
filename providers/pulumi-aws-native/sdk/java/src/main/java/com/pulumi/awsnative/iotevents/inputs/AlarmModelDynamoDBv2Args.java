// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.AlarmModelPayloadArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an action to write to the Amazon DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the alarm model instance and the event that triggered the action. You can also customize the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html). A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
 * 
 * You can use expressions for parameters that are strings. For more information, see [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html) in the *AWS IoT Events Developer Guide*.
 * 
 */
public final class AlarmModelDynamoDBv2Args extends com.pulumi.resources.ResourceArgs {

    public static final AlarmModelDynamoDBv2Args Empty = new AlarmModelDynamoDBv2Args();

    @Import(name="payload")
    private @Nullable Output<AlarmModelPayloadArgs> payload;

    public Optional<Output<AlarmModelPayloadArgs>> payload() {
        return Optional.ofNullable(this.payload);
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    private AlarmModelDynamoDBv2Args() {}

    private AlarmModelDynamoDBv2Args(AlarmModelDynamoDBv2Args $) {
        this.payload = $.payload;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmModelDynamoDBv2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmModelDynamoDBv2Args $;

        public Builder() {
            $ = new AlarmModelDynamoDBv2Args();
        }

        public Builder(AlarmModelDynamoDBv2Args defaults) {
            $ = new AlarmModelDynamoDBv2Args(Objects.requireNonNull(defaults));
        }

        public Builder payload(@Nullable Output<AlarmModelPayloadArgs> payload) {
            $.payload = payload;
            return this;
        }

        public Builder payload(AlarmModelPayloadArgs payload) {
            return payload(Output.of(payload));
        }

        /**
         * @param tableName The name of the DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The name of the DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public AlarmModelDynamoDBv2Args build() {
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
