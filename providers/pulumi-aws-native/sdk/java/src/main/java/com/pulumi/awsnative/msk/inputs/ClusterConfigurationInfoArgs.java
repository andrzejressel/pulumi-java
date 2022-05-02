// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ClusterConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationInfoArgs Empty = new ClusterConfigurationInfoArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    @Import(name="revision", required=true)
    private Output<Integer> revision;

    public Output<Integer> revision() {
        return this.revision;
    }

    private ClusterConfigurationInfoArgs() {}

    private ClusterConfigurationInfoArgs(ClusterConfigurationInfoArgs $) {
        this.arn = $.arn;
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigurationInfoArgs $;

        public Builder() {
            $ = new ClusterConfigurationInfoArgs();
        }

        public Builder(ClusterConfigurationInfoArgs defaults) {
            $ = new ClusterConfigurationInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder revision(Output<Integer> revision) {
            $.revision = revision;
            return this;
        }

        public Builder revision(Integer revision) {
            return revision(Output.of(revision));
        }

        public ClusterConfigurationInfoArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            return $;
        }
    }

}
