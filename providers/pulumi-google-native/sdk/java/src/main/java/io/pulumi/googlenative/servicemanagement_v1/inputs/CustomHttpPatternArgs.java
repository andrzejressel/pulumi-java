// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A custom pattern is used for defining custom HTTP verb.
 * 
 */
public final class CustomHttpPatternArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomHttpPatternArgs Empty = new CustomHttpPatternArgs();

    /**
     * The name of this custom HTTP verb.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The path matched by this custom verb.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public CustomHttpPatternArgs(
        @Nullable Input<String> kind,
        @Nullable Input<String> path) {
        this.kind = kind;
        this.path = path;
    }

    private CustomHttpPatternArgs() {
        this.kind = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHttpPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomHttpPatternArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.path = defaults.path;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public CustomHttpPatternArgs build() {
            return new CustomHttpPatternArgs(kind, path);
        }
    }
}
