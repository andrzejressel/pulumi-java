// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderConfigArgs Empty = new ProviderConfigArgs();

    @Import(name="accessToken", required=true)
    private Output<String> accessToken;

    public Output<String> accessToken() {
        return this.accessToken;
    }

    @Import(name="accountKey")
    private @Nullable Output<String> accountKey;

    public Optional<Output<String>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    @Import(name="clientToken", required=true)
    private Output<String> clientToken;

    public Output<String> clientToken() {
        return this.clientToken;
    }

    @Import(name="host", required=true)
    private Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    @Import(name="maxBody")
    private @Nullable Output<Integer> maxBody;

    public Optional<Output<Integer>> maxBody() {
        return Optional.ofNullable(this.maxBody);
    }

    private ProviderConfigArgs() {}

    private ProviderConfigArgs(ProviderConfigArgs $) {
        this.accessToken = $.accessToken;
        this.accountKey = $.accountKey;
        this.clientSecret = $.clientSecret;
        this.clientToken = $.clientToken;
        this.host = $.host;
        this.maxBody = $.maxBody;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderConfigArgs $;

        public Builder() {
            $ = new ProviderConfigArgs();
        }

        public Builder(ProviderConfigArgs defaults) {
            $ = new ProviderConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessToken(Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        public Builder accountKey(@Nullable Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder clientToken(Output<String> clientToken) {
            $.clientToken = clientToken;
            return this;
        }

        public Builder clientToken(String clientToken) {
            return clientToken(Output.of(clientToken));
        }

        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder maxBody(@Nullable Output<Integer> maxBody) {
            $.maxBody = maxBody;
            return this;
        }

        public Builder maxBody(Integer maxBody) {
            return maxBody(Output.of(maxBody));
        }

        public ProviderConfigArgs build() {
            $.accessToken = Objects.requireNonNull($.accessToken, "expected parameter 'accessToken' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.clientToken = Objects.requireNonNull($.clientToken, "expected parameter 'clientToken' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            return $;
        }
    }

}
