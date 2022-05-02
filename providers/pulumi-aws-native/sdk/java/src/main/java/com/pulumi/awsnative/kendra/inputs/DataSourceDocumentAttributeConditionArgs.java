// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.enums.DataSourceConditionOperator;
import com.pulumi.awsnative.kendra.inputs.DataSourceDocumentAttributeValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceDocumentAttributeConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceDocumentAttributeConditionArgs Empty = new DataSourceDocumentAttributeConditionArgs();

    @Import(name="conditionDocumentAttributeKey", required=true)
    private Output<String> conditionDocumentAttributeKey;

    public Output<String> conditionDocumentAttributeKey() {
        return this.conditionDocumentAttributeKey;
    }

    @Import(name="conditionOnValue")
    private @Nullable Output<DataSourceDocumentAttributeValueArgs> conditionOnValue;

    public Optional<Output<DataSourceDocumentAttributeValueArgs>> conditionOnValue() {
        return Optional.ofNullable(this.conditionOnValue);
    }

    @Import(name="operator", required=true)
    private Output<DataSourceConditionOperator> operator;

    public Output<DataSourceConditionOperator> operator() {
        return this.operator;
    }

    private DataSourceDocumentAttributeConditionArgs() {}

    private DataSourceDocumentAttributeConditionArgs(DataSourceDocumentAttributeConditionArgs $) {
        this.conditionDocumentAttributeKey = $.conditionDocumentAttributeKey;
        this.conditionOnValue = $.conditionOnValue;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceDocumentAttributeConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceDocumentAttributeConditionArgs $;

        public Builder() {
            $ = new DataSourceDocumentAttributeConditionArgs();
        }

        public Builder(DataSourceDocumentAttributeConditionArgs defaults) {
            $ = new DataSourceDocumentAttributeConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionDocumentAttributeKey(Output<String> conditionDocumentAttributeKey) {
            $.conditionDocumentAttributeKey = conditionDocumentAttributeKey;
            return this;
        }

        public Builder conditionDocumentAttributeKey(String conditionDocumentAttributeKey) {
            return conditionDocumentAttributeKey(Output.of(conditionDocumentAttributeKey));
        }

        public Builder conditionOnValue(@Nullable Output<DataSourceDocumentAttributeValueArgs> conditionOnValue) {
            $.conditionOnValue = conditionOnValue;
            return this;
        }

        public Builder conditionOnValue(DataSourceDocumentAttributeValueArgs conditionOnValue) {
            return conditionOnValue(Output.of(conditionOnValue));
        }

        public Builder operator(Output<DataSourceConditionOperator> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(DataSourceConditionOperator operator) {
            return operator(Output.of(operator));
        }

        public DataSourceDocumentAttributeConditionArgs build() {
            $.conditionDocumentAttributeKey = Objects.requireNonNull($.conditionDocumentAttributeKey, "expected parameter 'conditionDocumentAttributeKey' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
