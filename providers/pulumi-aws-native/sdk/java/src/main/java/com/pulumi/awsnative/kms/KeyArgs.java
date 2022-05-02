// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms;

import com.pulumi.awsnative.kms.enums.KeySpec;
import com.pulumi.awsnative.kms.enums.KeyUsage;
import com.pulumi.awsnative.kms.inputs.KeyTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * A description of the AWS KMS key. Use a description that helps you to distinguish this AWS KMS key from others in the account, such as its intended use.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the AWS KMS key. Use a description that helps you to distinguish this AWS KMS key from others in the account, such as its intended use.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enables automatic rotation of the key material for the specified AWS KMS key. By default, automation key rotation is not enabled.
     * 
     */
    @Import(name="enableKeyRotation")
    private @Nullable Output<Boolean> enableKeyRotation;

    /**
     * @return Enables automatic rotation of the key material for the specified AWS KMS key. By default, automation key rotation is not enabled.
     * 
     */
    public Optional<Output<Boolean>> enableKeyRotation() {
        return Optional.ofNullable(this.enableKeyRotation);
    }

    /**
     * Specifies whether the AWS KMS key is enabled. Disabled AWS KMS keys cannot be used in cryptographic operations.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether the AWS KMS key is enabled. Disabled AWS KMS keys cannot be used in cryptographic operations.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The key policy that authorizes use of the AWS KMS key. The key policy must observe the following rules.
     * 
     */
    @Import(name="keyPolicy", required=true)
    private Output<Object> keyPolicy;

    /**
     * @return The key policy that authorizes use of the AWS KMS key. The key policy must observe the following rules.
     * 
     */
    public Output<Object> keyPolicy() {
        return this.keyPolicy;
    }

    /**
     * Specifies the type of AWS KMS key to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeySpec value after the AWS KMS key is created.
     * 
     */
    @Import(name="keySpec")
    private @Nullable Output<KeySpec> keySpec;

    /**
     * @return Specifies the type of AWS KMS key to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeySpec value after the AWS KMS key is created.
     * 
     */
    public Optional<Output<KeySpec>> keySpec() {
        return Optional.ofNullable(this.keySpec);
    }

    /**
     * Determines the cryptographic operations for which you can use the AWS KMS key. The default value is ENCRYPT_DECRYPT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeyUsage value after the AWS KMS key is created.
     * 
     */
    @Import(name="keyUsage")
    private @Nullable Output<KeyUsage> keyUsage;

    /**
     * @return Determines the cryptographic operations for which you can use the AWS KMS key. The default value is ENCRYPT_DECRYPT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeyUsage value after the AWS KMS key is created.
     * 
     */
    public Optional<Output<KeyUsage>> keyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }

    /**
     * Specifies whether the AWS KMS key should be Multi-Region. You can&#39;t change the MultiRegion value after the AWS KMS key is created.
     * 
     */
    @Import(name="multiRegion")
    private @Nullable Output<Boolean> multiRegion;

    /**
     * @return Specifies whether the AWS KMS key should be Multi-Region. You can&#39;t change the MultiRegion value after the AWS KMS key is created.
     * 
     */
    public Optional<Output<Boolean>> multiRegion() {
        return Optional.ofNullable(this.multiRegion);
    }

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes an AWS KMS key that has been removed from a CloudFormation stack. Enter a value between 7 and 30 days. The default value is 30 days.
     * 
     */
    @Import(name="pendingWindowInDays")
    private @Nullable Output<Integer> pendingWindowInDays;

    /**
     * @return Specifies the number of days in the waiting period before AWS KMS deletes an AWS KMS key that has been removed from a CloudFormation stack. Enter a value between 7 and 30 days. The default value is 30 days.
     * 
     */
    public Optional<Output<Integer>> pendingWindowInDays() {
        return Optional.ofNullable(this.pendingWindowInDays);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<KeyTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<KeyTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private KeyArgs() {}

    private KeyArgs(KeyArgs $) {
        this.description = $.description;
        this.enableKeyRotation = $.enableKeyRotation;
        this.enabled = $.enabled;
        this.keyPolicy = $.keyPolicy;
        this.keySpec = $.keySpec;
        this.keyUsage = $.keyUsage;
        this.multiRegion = $.multiRegion;
        this.pendingWindowInDays = $.pendingWindowInDays;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyArgs $;

        public Builder() {
            $ = new KeyArgs();
        }

        public Builder(KeyArgs defaults) {
            $ = new KeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the AWS KMS key. Use a description that helps you to distinguish this AWS KMS key from others in the account, such as its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the AWS KMS key. Use a description that helps you to distinguish this AWS KMS key from others in the account, such as its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableKeyRotation Enables automatic rotation of the key material for the specified AWS KMS key. By default, automation key rotation is not enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableKeyRotation(@Nullable Output<Boolean> enableKeyRotation) {
            $.enableKeyRotation = enableKeyRotation;
            return this;
        }

        /**
         * @param enableKeyRotation Enables automatic rotation of the key material for the specified AWS KMS key. By default, automation key rotation is not enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableKeyRotation(Boolean enableKeyRotation) {
            return enableKeyRotation(Output.of(enableKeyRotation));
        }

        /**
         * @param enabled Specifies whether the AWS KMS key is enabled. Disabled AWS KMS keys cannot be used in cryptographic operations.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether the AWS KMS key is enabled. Disabled AWS KMS keys cannot be used in cryptographic operations.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param keyPolicy The key policy that authorizes use of the AWS KMS key. The key policy must observe the following rules.
         * 
         * @return builder
         * 
         */
        public Builder keyPolicy(Output<Object> keyPolicy) {
            $.keyPolicy = keyPolicy;
            return this;
        }

        /**
         * @param keyPolicy The key policy that authorizes use of the AWS KMS key. The key policy must observe the following rules.
         * 
         * @return builder
         * 
         */
        public Builder keyPolicy(Object keyPolicy) {
            return keyPolicy(Output.of(keyPolicy));
        }

        /**
         * @param keySpec Specifies the type of AWS KMS key to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeySpec value after the AWS KMS key is created.
         * 
         * @return builder
         * 
         */
        public Builder keySpec(@Nullable Output<KeySpec> keySpec) {
            $.keySpec = keySpec;
            return this;
        }

        /**
         * @param keySpec Specifies the type of AWS KMS key to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeySpec value after the AWS KMS key is created.
         * 
         * @return builder
         * 
         */
        public Builder keySpec(KeySpec keySpec) {
            return keySpec(Output.of(keySpec));
        }

        /**
         * @param keyUsage Determines the cryptographic operations for which you can use the AWS KMS key. The default value is ENCRYPT_DECRYPT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeyUsage value after the AWS KMS key is created.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(@Nullable Output<KeyUsage> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param keyUsage Determines the cryptographic operations for which you can use the AWS KMS key. The default value is ENCRYPT_DECRYPT. This property is required only for asymmetric AWS KMS keys. You can&#39;t change the KeyUsage value after the AWS KMS key is created.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(KeyUsage keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        /**
         * @param multiRegion Specifies whether the AWS KMS key should be Multi-Region. You can&#39;t change the MultiRegion value after the AWS KMS key is created.
         * 
         * @return builder
         * 
         */
        public Builder multiRegion(@Nullable Output<Boolean> multiRegion) {
            $.multiRegion = multiRegion;
            return this;
        }

        /**
         * @param multiRegion Specifies whether the AWS KMS key should be Multi-Region. You can&#39;t change the MultiRegion value after the AWS KMS key is created.
         * 
         * @return builder
         * 
         */
        public Builder multiRegion(Boolean multiRegion) {
            return multiRegion(Output.of(multiRegion));
        }

        /**
         * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS deletes an AWS KMS key that has been removed from a CloudFormation stack. Enter a value between 7 and 30 days. The default value is 30 days.
         * 
         * @return builder
         * 
         */
        public Builder pendingWindowInDays(@Nullable Output<Integer> pendingWindowInDays) {
            $.pendingWindowInDays = pendingWindowInDays;
            return this;
        }

        /**
         * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS deletes an AWS KMS key that has been removed from a CloudFormation stack. Enter a value between 7 and 30 days. The default value is 30 days.
         * 
         * @return builder
         * 
         */
        public Builder pendingWindowInDays(Integer pendingWindowInDays) {
            return pendingWindowInDays(Output.of(pendingWindowInDays));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<KeyTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<KeyTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(KeyTagArgs... tags) {
            return tags(List.of(tags));
        }

        public KeyArgs build() {
            $.keyPolicy = Objects.requireNonNull($.keyPolicy, "expected parameter 'keyPolicy' to be non-null");
            return $;
        }
    }

}
