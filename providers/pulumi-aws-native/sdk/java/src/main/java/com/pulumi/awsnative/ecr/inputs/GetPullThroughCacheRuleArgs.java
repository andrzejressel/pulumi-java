// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPullThroughCacheRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPullThroughCacheRuleArgs Empty = new GetPullThroughCacheRuleArgs();

    /**
     * The ECRRepositoryPrefix is a custom alias for upstream registry url.
     * 
     */
    @Import(name="ecrRepositoryPrefix", required=true)
    private String ecrRepositoryPrefix;

    /**
     * @return The ECRRepositoryPrefix is a custom alias for upstream registry url.
     * 
     */
    public String ecrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    private GetPullThroughCacheRuleArgs() {}

    private GetPullThroughCacheRuleArgs(GetPullThroughCacheRuleArgs $) {
        this.ecrRepositoryPrefix = $.ecrRepositoryPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPullThroughCacheRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPullThroughCacheRuleArgs $;

        public Builder() {
            $ = new GetPullThroughCacheRuleArgs();
        }

        public Builder(GetPullThroughCacheRuleArgs defaults) {
            $ = new GetPullThroughCacheRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ecrRepositoryPrefix The ECRRepositoryPrefix is a custom alias for upstream registry url.
         * 
         * @return builder
         * 
         */
        public Builder ecrRepositoryPrefix(String ecrRepositoryPrefix) {
            $.ecrRepositoryPrefix = ecrRepositoryPrefix;
            return this;
        }

        public GetPullThroughCacheRuleArgs build() {
            $.ecrRepositoryPrefix = Objects.requireNonNull($.ecrRepositoryPrefix, "expected parameter 'ecrRepositoryPrefix' to be non-null");
            return $;
        }
    }

}
