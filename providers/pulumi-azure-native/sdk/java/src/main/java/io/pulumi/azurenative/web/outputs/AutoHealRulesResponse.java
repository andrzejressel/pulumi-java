// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AutoHealActionsResponse;
import io.pulumi.azurenative.web.outputs.AutoHealTriggersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoHealRulesResponse {
    /**
     * Actions to be executed when a rule is triggered.
     * 
     */
    private final @Nullable AutoHealActionsResponse actions;
    /**
     * Conditions that describe when to execute the auto-heal actions.
     * 
     */
    private final @Nullable AutoHealTriggersResponse triggers;

    @OutputCustomType.Constructor
    private AutoHealRulesResponse(
        @OutputCustomType.Parameter("actions") @Nullable AutoHealActionsResponse actions,
        @OutputCustomType.Parameter("triggers") @Nullable AutoHealTriggersResponse triggers) {
        this.actions = actions;
        this.triggers = triggers;
    }

    /**
     * Actions to be executed when a rule is triggered.
     * 
    */
    public Optional<AutoHealActionsResponse> getActions() {
        return Optional.ofNullable(this.actions);
    }
    /**
     * Conditions that describe when to execute the auto-heal actions.
     * 
    */
    public Optional<AutoHealTriggersResponse> getTriggers() {
        return Optional.ofNullable(this.triggers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoHealActionsResponse actions;
        private @Nullable AutoHealTriggersResponse triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.triggers = defaults.triggers;
        }

        public Builder setActions(@Nullable AutoHealActionsResponse actions) {
            this.actions = actions;
            return this;
        }

        public Builder setTriggers(@Nullable AutoHealTriggersResponse triggers) {
            this.triggers = triggers;
            return this;
        }
        public AutoHealRulesResponse build() {
            return new AutoHealRulesResponse(actions, triggers);
        }
    }
}
