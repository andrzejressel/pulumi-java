// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatusErrorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusErrorGetArgs Empty = new JobStatusErrorGetArgs();

    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public JobStatusErrorGetArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> message,
        @Nullable Input<String> reason) {
        this.location = location;
        this.message = message;
        this.reason = reason;
    }

    private JobStatusErrorGetArgs() {
        this.location = Input.empty();
        this.message = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusErrorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusErrorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public JobStatusErrorGetArgs build() {
            return new JobStatusErrorGetArgs(location, message, reason);
        }
    }
}
