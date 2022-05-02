// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobQueueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobQueueArgs Empty = new GetJobQueueArgs();

    @Import(name="jobQueueArn", required=true)
    private String jobQueueArn;

    public String jobQueueArn() {
        return this.jobQueueArn;
    }

    private GetJobQueueArgs() {}

    private GetJobQueueArgs(GetJobQueueArgs $) {
        this.jobQueueArn = $.jobQueueArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobQueueArgs $;

        public Builder() {
            $ = new GetJobQueueArgs();
        }

        public Builder(GetJobQueueArgs defaults) {
            $ = new GetJobQueueArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobQueueArn(String jobQueueArn) {
            $.jobQueueArn = jobQueueArn;
            return this;
        }

        public GetJobQueueArgs build() {
            $.jobQueueArn = Objects.requireNonNull($.jobQueueArn, "expected parameter 'jobQueueArn' to be non-null");
            return $;
        }
    }

}
