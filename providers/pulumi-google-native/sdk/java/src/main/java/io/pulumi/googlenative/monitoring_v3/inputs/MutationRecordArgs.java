// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a change made to a configuration.
 * 
 */
public final class MutationRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final MutationRecordArgs Empty = new MutationRecordArgs();

    /**
     * When the change occurred.
     * 
     */
    @InputImport(name="mutateTime")
    private final @Nullable Input<String> mutateTime;

    public Input<String> getMutateTime() {
        return this.mutateTime == null ? Input.empty() : this.mutateTime;
    }

    /**
     * The email address of the user making the change.
     * 
     */
    @InputImport(name="mutatedBy")
    private final @Nullable Input<String> mutatedBy;

    public Input<String> getMutatedBy() {
        return this.mutatedBy == null ? Input.empty() : this.mutatedBy;
    }

    public MutationRecordArgs(
        @Nullable Input<String> mutateTime,
        @Nullable Input<String> mutatedBy) {
        this.mutateTime = mutateTime;
        this.mutatedBy = mutatedBy;
    }

    private MutationRecordArgs() {
        this.mutateTime = Input.empty();
        this.mutatedBy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutationRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mutateTime;
        private @Nullable Input<String> mutatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(MutationRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mutateTime = defaults.mutateTime;
    	      this.mutatedBy = defaults.mutatedBy;
        }

        public Builder setMutateTime(@Nullable Input<String> mutateTime) {
            this.mutateTime = mutateTime;
            return this;
        }

        public Builder setMutateTime(@Nullable String mutateTime) {
            this.mutateTime = Input.ofNullable(mutateTime);
            return this;
        }

        public Builder setMutatedBy(@Nullable Input<String> mutatedBy) {
            this.mutatedBy = mutatedBy;
            return this;
        }

        public Builder setMutatedBy(@Nullable String mutatedBy) {
            this.mutatedBy = Input.ofNullable(mutatedBy);
            return this;
        }

        public MutationRecordArgs build() {
            return new MutationRecordArgs(mutateTime, mutatedBy);
        }
    }
}
