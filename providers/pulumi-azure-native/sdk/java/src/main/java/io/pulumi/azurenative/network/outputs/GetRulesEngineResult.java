// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.RulesEngineRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRulesEngineResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource status.
     * 
     */
    private final String resourceState;
    /**
     * A list of rules that define a particular Rules Engine Configuration.
     * 
     */
    private final @Nullable List<RulesEngineRuleResponse> rules;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetRulesEngineResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("resourceState") String resourceState,
        @OutputCustomType.Parameter("rules") @Nullable List<RulesEngineRuleResponse> rules,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.resourceState = resourceState;
        this.rules = rules;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource status.
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * A list of rules that define a particular Rules Engine Configuration.
     * 
    */
    public List<RulesEngineRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesEngineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String resourceState;
        private @Nullable List<RulesEngineRuleResponse> rules;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesEngineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setRules(@Nullable List<RulesEngineRuleResponse> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRulesEngineResult build() {
            return new GetRulesEngineResult(id, name, resourceState, rules, type);
        }
    }
}
