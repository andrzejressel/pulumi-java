// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecAwsS3DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAwsS3DataSourceArgs Empty = new TransferJobTransferSpecAwsS3DataSourceArgs();

    /**
     * AWS credentials block.
     * 
     */
    @InputImport(name="awsAccessKey")
    private final @Nullable Input<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs> awsAccessKey;

    public Input<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs> getAwsAccessKey() {
        return this.awsAccessKey == null ? Input.empty() : this.awsAccessKey;
    }

    /**
     * S3 Bucket name.
     * 
     */
    @InputImport(name="bucketName", required=true)
    private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via 'AssumeRoleWithWebIdentity'. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a 'AssumeRoleWithWebIdentity' call for the provided role using the [GoogleServiceAccount][] for this project.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    public TransferJobTransferSpecAwsS3DataSourceArgs(
        @Nullable Input<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs> awsAccessKey,
        Input<String> bucketName,
        @Nullable Input<String> roleArn) {
        this.awsAccessKey = awsAccessKey;
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.roleArn = roleArn;
    }

    private TransferJobTransferSpecAwsS3DataSourceArgs() {
        this.awsAccessKey = Input.empty();
        this.bucketName = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAwsS3DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs> awsAccessKey;
        private Input<String> bucketName;
        private @Nullable Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAwsS3DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKey = defaults.awsAccessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAwsAccessKey(@Nullable Input<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs> awsAccessKey) {
            this.awsAccessKey = awsAccessKey;
            return this;
        }

        public Builder setAwsAccessKey(@Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs awsAccessKey) {
            this.awsAccessKey = Input.ofNullable(awsAccessKey);
            return this;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public TransferJobTransferSpecAwsS3DataSourceArgs build() {
            return new TransferJobTransferSpecAwsS3DataSourceArgs(awsAccessKey, bucketName, roleArn);
        }
    }
}
