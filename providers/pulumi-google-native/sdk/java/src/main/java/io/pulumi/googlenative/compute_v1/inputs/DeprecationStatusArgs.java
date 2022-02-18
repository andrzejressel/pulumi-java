// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.DeprecationStatusState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deprecation status for a public resource.
 * 
 */
public final class DeprecationStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeprecationStatusArgs Empty = new DeprecationStatusArgs();

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @InputImport(name="deleted")
    private final @Nullable Input<String> deleted;

    public Input<String> getDeleted() {
        return this.deleted == null ? Input.empty() : this.deleted;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @InputImport(name="deprecated")
    private final @Nullable Input<String> deprecated;

    public Input<String> getDeprecated() {
        return this.deprecated == null ? Input.empty() : this.deprecated;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @InputImport(name="obsolete")
    private final @Nullable Input<String> obsolete;

    public Input<String> getObsolete() {
        return this.obsolete == null ? Input.empty() : this.obsolete;
    }

    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    @InputImport(name="replacement")
    private final @Nullable Input<String> replacement;

    public Input<String> getReplacement() {
        return this.replacement == null ? Input.empty() : this.replacement;
    }

    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<DeprecationStatusState> state;

    public Input<DeprecationStatusState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public DeprecationStatusArgs(
        @Nullable Input<String> deleted,
        @Nullable Input<String> deprecated,
        @Nullable Input<String> obsolete,
        @Nullable Input<String> replacement,
        @Nullable Input<DeprecationStatusState> state) {
        this.deleted = deleted;
        this.deprecated = deprecated;
        this.obsolete = obsolete;
        this.replacement = replacement;
        this.state = state;
    }

    private DeprecationStatusArgs() {
        this.deleted = Input.empty();
        this.deprecated = Input.empty();
        this.obsolete = Input.empty();
        this.replacement = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeprecationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deleted;
        private @Nullable Input<String> deprecated;
        private @Nullable Input<String> obsolete;
        private @Nullable Input<String> replacement;
        private @Nullable Input<DeprecationStatusState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(DeprecationStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.deprecated = defaults.deprecated;
    	      this.obsolete = defaults.obsolete;
    	      this.replacement = defaults.replacement;
    	      this.state = defaults.state;
        }

        public Builder setDeleted(@Nullable Input<String> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder setDeleted(@Nullable String deleted) {
            this.deleted = Input.ofNullable(deleted);
            return this;
        }

        public Builder setDeprecated(@Nullable Input<String> deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        public Builder setDeprecated(@Nullable String deprecated) {
            this.deprecated = Input.ofNullable(deprecated);
            return this;
        }

        public Builder setObsolete(@Nullable Input<String> obsolete) {
            this.obsolete = obsolete;
            return this;
        }

        public Builder setObsolete(@Nullable String obsolete) {
            this.obsolete = Input.ofNullable(obsolete);
            return this;
        }

        public Builder setReplacement(@Nullable Input<String> replacement) {
            this.replacement = replacement;
            return this;
        }

        public Builder setReplacement(@Nullable String replacement) {
            this.replacement = Input.ofNullable(replacement);
            return this;
        }

        public Builder setState(@Nullable Input<DeprecationStatusState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable DeprecationStatusState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public DeprecationStatusArgs build() {
            return new DeprecationStatusArgs(deleted, deprecated, obsolete, replacement, state);
        }
    }
}
