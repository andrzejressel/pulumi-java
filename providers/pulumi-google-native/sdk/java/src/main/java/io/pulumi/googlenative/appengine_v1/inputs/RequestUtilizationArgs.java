// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Target scaling by request utilization. Only applicable in the App Engine flexible environment.
 * 
 */
public final class RequestUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestUtilizationArgs Empty = new RequestUtilizationArgs();

    /**
     * Target number of concurrent requests.
     * 
     */
    @InputImport(name="targetConcurrentRequests")
    private final @Nullable Input<Integer> targetConcurrentRequests;

    public Input<Integer> getTargetConcurrentRequests() {
        return this.targetConcurrentRequests == null ? Input.empty() : this.targetConcurrentRequests;
    }

    /**
     * Target requests per second.
     * 
     */
    @InputImport(name="targetRequestCountPerSecond")
    private final @Nullable Input<Integer> targetRequestCountPerSecond;

    public Input<Integer> getTargetRequestCountPerSecond() {
        return this.targetRequestCountPerSecond == null ? Input.empty() : this.targetRequestCountPerSecond;
    }

    public RequestUtilizationArgs(
        @Nullable Input<Integer> targetConcurrentRequests,
        @Nullable Input<Integer> targetRequestCountPerSecond) {
        this.targetConcurrentRequests = targetConcurrentRequests;
        this.targetRequestCountPerSecond = targetRequestCountPerSecond;
    }

    private RequestUtilizationArgs() {
        this.targetConcurrentRequests = Input.empty();
        this.targetRequestCountPerSecond = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> targetConcurrentRequests;
        private @Nullable Input<Integer> targetRequestCountPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConcurrentRequests = defaults.targetConcurrentRequests;
    	      this.targetRequestCountPerSecond = defaults.targetRequestCountPerSecond;
        }

        public Builder setTargetConcurrentRequests(@Nullable Input<Integer> targetConcurrentRequests) {
            this.targetConcurrentRequests = targetConcurrentRequests;
            return this;
        }

        public Builder setTargetConcurrentRequests(@Nullable Integer targetConcurrentRequests) {
            this.targetConcurrentRequests = Input.ofNullable(targetConcurrentRequests);
            return this;
        }

        public Builder setTargetRequestCountPerSecond(@Nullable Input<Integer> targetRequestCountPerSecond) {
            this.targetRequestCountPerSecond = targetRequestCountPerSecond;
            return this;
        }

        public Builder setTargetRequestCountPerSecond(@Nullable Integer targetRequestCountPerSecond) {
            this.targetRequestCountPerSecond = Input.ofNullable(targetRequestCountPerSecond);
            return this;
        }

        public RequestUtilizationArgs build() {
            return new RequestUtilizationArgs(targetConcurrentRequests, targetRequestCountPerSecond);
        }
    }
}
