// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlRdbmsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL source configuration
 * 
 */
public final class MysqlSourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlSourceConfigArgs Empty = new MysqlSourceConfigArgs();

    /**
     * MySQL objects to retrieve from the source.
     * 
     */
    @InputImport(name="allowlist")
    private final @Nullable Input<MysqlRdbmsArgs> allowlist;

    public Input<MysqlRdbmsArgs> getAllowlist() {
        return this.allowlist == null ? Input.empty() : this.allowlist;
    }

    /**
     * MySQL objects to exclude from the stream.
     * 
     */
    @InputImport(name="rejectlist")
    private final @Nullable Input<MysqlRdbmsArgs> rejectlist;

    public Input<MysqlRdbmsArgs> getRejectlist() {
        return this.rejectlist == null ? Input.empty() : this.rejectlist;
    }

    public MysqlSourceConfigArgs(
        @Nullable Input<MysqlRdbmsArgs> allowlist,
        @Nullable Input<MysqlRdbmsArgs> rejectlist) {
        this.allowlist = allowlist;
        this.rejectlist = rejectlist;
    }

    private MysqlSourceConfigArgs() {
        this.allowlist = Input.empty();
        this.rejectlist = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MysqlRdbmsArgs> allowlist;
        private @Nullable Input<MysqlRdbmsArgs> rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder setAllowlist(@Nullable Input<MysqlRdbmsArgs> allowlist) {
            this.allowlist = allowlist;
            return this;
        }

        public Builder setAllowlist(@Nullable MysqlRdbmsArgs allowlist) {
            this.allowlist = Input.ofNullable(allowlist);
            return this;
        }

        public Builder setRejectlist(@Nullable Input<MysqlRdbmsArgs> rejectlist) {
            this.rejectlist = rejectlist;
            return this;
        }

        public Builder setRejectlist(@Nullable MysqlRdbmsArgs rejectlist) {
            this.rejectlist = Input.ofNullable(rejectlist);
            return this;
        }

        public MysqlSourceConfigArgs build() {
            return new MysqlSourceConfigArgs(allowlist, rejectlist);
        }
    }
}
