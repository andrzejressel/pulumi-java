// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceDocumentAttributeConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceHookConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceHookConfigurationArgs Empty = new DataSourceHookConfigurationArgs();

    @Import(name="invocationCondition")
    private @Nullable Output<DataSourceDocumentAttributeConditionArgs> invocationCondition;

    public Optional<Output<DataSourceDocumentAttributeConditionArgs>> invocationCondition() {
        return Optional.ofNullable(this.invocationCondition);
    }

    @Import(name="lambdaArn", required=true)
    private Output<String> lambdaArn;

    public Output<String> lambdaArn() {
        return this.lambdaArn;
    }

    @Import(name="s3Bucket", required=true)
    private Output<String> s3Bucket;

    public Output<String> s3Bucket() {
        return this.s3Bucket;
    }

    private DataSourceHookConfigurationArgs() {}

    private DataSourceHookConfigurationArgs(DataSourceHookConfigurationArgs $) {
        this.invocationCondition = $.invocationCondition;
        this.lambdaArn = $.lambdaArn;
        this.s3Bucket = $.s3Bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceHookConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceHookConfigurationArgs $;

        public Builder() {
            $ = new DataSourceHookConfigurationArgs();
        }

        public Builder(DataSourceHookConfigurationArgs defaults) {
            $ = new DataSourceHookConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder invocationCondition(@Nullable Output<DataSourceDocumentAttributeConditionArgs> invocationCondition) {
            $.invocationCondition = invocationCondition;
            return this;
        }

        public Builder invocationCondition(DataSourceDocumentAttributeConditionArgs invocationCondition) {
            return invocationCondition(Output.of(invocationCondition));
        }

        public Builder lambdaArn(Output<String> lambdaArn) {
            $.lambdaArn = lambdaArn;
            return this;
        }

        public Builder lambdaArn(String lambdaArn) {
            return lambdaArn(Output.of(lambdaArn));
        }

        public Builder s3Bucket(Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        public DataSourceHookConfigurationArgs build() {
            $.lambdaArn = Objects.requireNonNull($.lambdaArn, "expected parameter 'lambdaArn' to be non-null");
            $.s3Bucket = Objects.requireNonNull($.s3Bucket, "expected parameter 's3Bucket' to be non-null");
            return $;
        }
    }

}
