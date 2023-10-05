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


public final class GetCloudletsApplicationLoadBalancerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsApplicationLoadBalancerArgs Empty = new GetCloudletsApplicationLoadBalancerArgs();

    @Import(name="originId", required=true)
    private Output<String> originId;

    public Output<String> originId() {
        return this.originId;
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetCloudletsApplicationLoadBalancerArgs() {}

    private GetCloudletsApplicationLoadBalancerArgs(GetCloudletsApplicationLoadBalancerArgs $) {
        this.originId = $.originId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsApplicationLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsApplicationLoadBalancerArgs $;

        public Builder() {
            $ = new GetCloudletsApplicationLoadBalancerArgs();
        }

        public Builder(GetCloudletsApplicationLoadBalancerArgs defaults) {
            $ = new GetCloudletsApplicationLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        public Builder originId(Output<String> originId) {
            $.originId = originId;
            return this;
        }

        public Builder originId(String originId) {
            return originId(Output.of(originId));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetCloudletsApplicationLoadBalancerArgs build() {
            $.originId = Objects.requireNonNull($.originId, "expected parameter 'originId' to be non-null");
            return $;
        }
    }

}
