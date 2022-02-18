// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Cardinality condition for the Waiter resource. A cardinality condition is met when the number of variables under a specified path prefix reaches a predefined number. For example, if you set a Cardinality condition where the `path` is set to `/foo` and the number of paths is set to `2`, the following variables would meet the condition in a RuntimeConfig resource: + `/foo/variable1 = "value1"` + `/foo/variable2 = "value2"` + `/bar/variable3 = "value3"` It would not satisfy the same condition with the `number` set to `3`, however, because there is only 2 paths that start with `/foo`. Cardinality conditions are recursive; all subtrees under the specific path prefix are counted.
 * 
 */
public final class CardinalityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CardinalityArgs Empty = new CardinalityArgs();

    /**
     * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
     * 
     */
    @InputImport(name="number")
    private final @Nullable Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    /**
     * The root of the variable subtree to monitor. For example, `/foo`.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public CardinalityArgs(
        @Nullable Input<Integer> number,
        @Nullable Input<String> path) {
        this.number = number;
        this.path = path;
    }

    private CardinalityArgs() {
        this.number = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CardinalityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> number;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(CardinalityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
    	      this.path = defaults.path;
        }

        public Builder setNumber(@Nullable Input<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Integer number) {
            this.number = Input.ofNullable(number);
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

        public CardinalityArgs build() {
            return new CardinalityArgs(number, path);
        }
    }
}
