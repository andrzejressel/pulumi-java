// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceDocumentAttributeValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceDocumentAttributeTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceDocumentAttributeTargetArgs Empty = new DataSourceDocumentAttributeTargetArgs();

    @Import(name="targetDocumentAttributeKey", required=true)
    private Output<String> targetDocumentAttributeKey;

    public Output<String> targetDocumentAttributeKey() {
        return this.targetDocumentAttributeKey;
    }

    @Import(name="targetDocumentAttributeValue")
    private @Nullable Output<DataSourceDocumentAttributeValueArgs> targetDocumentAttributeValue;

    public Optional<Output<DataSourceDocumentAttributeValueArgs>> targetDocumentAttributeValue() {
        return Optional.ofNullable(this.targetDocumentAttributeValue);
    }

    @Import(name="targetDocumentAttributeValueDeletion")
    private @Nullable Output<Boolean> targetDocumentAttributeValueDeletion;

    public Optional<Output<Boolean>> targetDocumentAttributeValueDeletion() {
        return Optional.ofNullable(this.targetDocumentAttributeValueDeletion);
    }

    private DataSourceDocumentAttributeTargetArgs() {}

    private DataSourceDocumentAttributeTargetArgs(DataSourceDocumentAttributeTargetArgs $) {
        this.targetDocumentAttributeKey = $.targetDocumentAttributeKey;
        this.targetDocumentAttributeValue = $.targetDocumentAttributeValue;
        this.targetDocumentAttributeValueDeletion = $.targetDocumentAttributeValueDeletion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceDocumentAttributeTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceDocumentAttributeTargetArgs $;

        public Builder() {
            $ = new DataSourceDocumentAttributeTargetArgs();
        }

        public Builder(DataSourceDocumentAttributeTargetArgs defaults) {
            $ = new DataSourceDocumentAttributeTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetDocumentAttributeKey(Output<String> targetDocumentAttributeKey) {
            $.targetDocumentAttributeKey = targetDocumentAttributeKey;
            return this;
        }

        public Builder targetDocumentAttributeKey(String targetDocumentAttributeKey) {
            return targetDocumentAttributeKey(Output.of(targetDocumentAttributeKey));
        }

        public Builder targetDocumentAttributeValue(@Nullable Output<DataSourceDocumentAttributeValueArgs> targetDocumentAttributeValue) {
            $.targetDocumentAttributeValue = targetDocumentAttributeValue;
            return this;
        }

        public Builder targetDocumentAttributeValue(DataSourceDocumentAttributeValueArgs targetDocumentAttributeValue) {
            return targetDocumentAttributeValue(Output.of(targetDocumentAttributeValue));
        }

        public Builder targetDocumentAttributeValueDeletion(@Nullable Output<Boolean> targetDocumentAttributeValueDeletion) {
            $.targetDocumentAttributeValueDeletion = targetDocumentAttributeValueDeletion;
            return this;
        }

        public Builder targetDocumentAttributeValueDeletion(Boolean targetDocumentAttributeValueDeletion) {
            return targetDocumentAttributeValueDeletion(Output.of(targetDocumentAttributeValueDeletion));
        }

        public DataSourceDocumentAttributeTargetArgs build() {
            $.targetDocumentAttributeKey = Objects.requireNonNull($.targetDocumentAttributeKey, "expected parameter 'targetDocumentAttributeKey' to be non-null");
            return $;
        }
    }

}
