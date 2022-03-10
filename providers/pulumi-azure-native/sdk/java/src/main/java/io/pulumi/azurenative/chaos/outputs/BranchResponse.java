// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.outputs;

import io.pulumi.azurenative.chaos.outputs.ContinuousActionResponse;
import io.pulumi.azurenative.chaos.outputs.DelayActionResponse;
import io.pulumi.azurenative.chaos.outputs.DiscreteActionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BranchResponse {
    /**
     * List of actions.
     * 
     */
    private final List<Object> actions;
    /**
     * String of the branch name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private BranchResponse(
        @OutputCustomType.Parameter("actions") List<Object> actions,
        @OutputCustomType.Parameter("name") String name) {
        this.actions = actions;
        this.name = name;
    }

    /**
     * List of actions.
     * 
    */
    public List<Object> getActions() {
        return this.actions;
    }
    /**
     * String of the branch name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> actions;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.name = defaults.name;
        }

        public Builder setActions(List<Object> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public BranchResponse build() {
            return new BranchResponse(actions, name);
        }
    }
}
