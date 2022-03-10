// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RampUpRuleResponse {
    /**
     * Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
     * 
     */
    private final @Nullable String actionHostName;
    /**
     * Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     * 
     */
    private final @Nullable String changeDecisionCallbackUrl;
    /**
     * Specifies interval in minutes to reevaluate ReroutePercentage.
     * 
     */
    private final @Nullable Integer changeIntervalInMinutes;
    /**
     * In auto ramp up scenario this is the step to add/remove from <code>ReroutePercentage</code> until it reaches \n<code>MinReroutePercentage</code> or
     * <code>MaxReroutePercentage</code>. Site metrics are checked every N minutes specified in <code>ChangeIntervalInMinutes</code>.\nCustom decision algorithm
     * can be provided in TiPCallback site extension which URL can be specified in <code>ChangeDecisionCallbackUrl</code>.
     * 
     */
    private final @Nullable Double changeStep;
    /**
     * Specifies upper boundary below which ReroutePercentage will stay.
     * 
     */
    private final @Nullable Double maxReroutePercentage;
    /**
     * Specifies lower boundary above which ReroutePercentage will stay.
     * 
     */
    private final @Nullable Double minReroutePercentage;
    /**
     * Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
     * 
     */
    private final @Nullable String name;
    /**
     * Percentage of the traffic which will be redirected to <code>ActionHostName</code>.
     * 
     */
    private final @Nullable Double reroutePercentage;

    @OutputCustomType.Constructor
    private RampUpRuleResponse(
        @OutputCustomType.Parameter("actionHostName") @Nullable String actionHostName,
        @OutputCustomType.Parameter("changeDecisionCallbackUrl") @Nullable String changeDecisionCallbackUrl,
        @OutputCustomType.Parameter("changeIntervalInMinutes") @Nullable Integer changeIntervalInMinutes,
        @OutputCustomType.Parameter("changeStep") @Nullable Double changeStep,
        @OutputCustomType.Parameter("maxReroutePercentage") @Nullable Double maxReroutePercentage,
        @OutputCustomType.Parameter("minReroutePercentage") @Nullable Double minReroutePercentage,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("reroutePercentage") @Nullable Double reroutePercentage) {
        this.actionHostName = actionHostName;
        this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
        this.changeIntervalInMinutes = changeIntervalInMinutes;
        this.changeStep = changeStep;
        this.maxReroutePercentage = maxReroutePercentage;
        this.minReroutePercentage = minReroutePercentage;
        this.name = name;
        this.reroutePercentage = reroutePercentage;
    }

    /**
     * Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
     * 
    */
    public Optional<String> getActionHostName() {
        return Optional.ofNullable(this.actionHostName);
    }
    /**
     * Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     * 
    */
    public Optional<String> getChangeDecisionCallbackUrl() {
        return Optional.ofNullable(this.changeDecisionCallbackUrl);
    }
    /**
     * Specifies interval in minutes to reevaluate ReroutePercentage.
     * 
    */
    public Optional<Integer> getChangeIntervalInMinutes() {
        return Optional.ofNullable(this.changeIntervalInMinutes);
    }
    /**
     * In auto ramp up scenario this is the step to add/remove from <code>ReroutePercentage</code> until it reaches \n<code>MinReroutePercentage</code> or
     * <code>MaxReroutePercentage</code>. Site metrics are checked every N minutes specified in <code>ChangeIntervalInMinutes</code>.\nCustom decision algorithm
     * can be provided in TiPCallback site extension which URL can be specified in <code>ChangeDecisionCallbackUrl</code>.
     * 
    */
    public Optional<Double> getChangeStep() {
        return Optional.ofNullable(this.changeStep);
    }
    /**
     * Specifies upper boundary below which ReroutePercentage will stay.
     * 
    */
    public Optional<Double> getMaxReroutePercentage() {
        return Optional.ofNullable(this.maxReroutePercentage);
    }
    /**
     * Specifies lower boundary above which ReroutePercentage will stay.
     * 
    */
    public Optional<Double> getMinReroutePercentage() {
        return Optional.ofNullable(this.minReroutePercentage);
    }
    /**
     * Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Percentage of the traffic which will be redirected to <code>ActionHostName</code>.
     * 
    */
    public Optional<Double> getReroutePercentage() {
        return Optional.ofNullable(this.reroutePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RampUpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionHostName;
        private @Nullable String changeDecisionCallbackUrl;
        private @Nullable Integer changeIntervalInMinutes;
        private @Nullable Double changeStep;
        private @Nullable Double maxReroutePercentage;
        private @Nullable Double minReroutePercentage;
        private @Nullable String name;
        private @Nullable Double reroutePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RampUpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionHostName = defaults.actionHostName;
    	      this.changeDecisionCallbackUrl = defaults.changeDecisionCallbackUrl;
    	      this.changeIntervalInMinutes = defaults.changeIntervalInMinutes;
    	      this.changeStep = defaults.changeStep;
    	      this.maxReroutePercentage = defaults.maxReroutePercentage;
    	      this.minReroutePercentage = defaults.minReroutePercentage;
    	      this.name = defaults.name;
    	      this.reroutePercentage = defaults.reroutePercentage;
        }

        public Builder setActionHostName(@Nullable String actionHostName) {
            this.actionHostName = actionHostName;
            return this;
        }

        public Builder setChangeDecisionCallbackUrl(@Nullable String changeDecisionCallbackUrl) {
            this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
            return this;
        }

        public Builder setChangeIntervalInMinutes(@Nullable Integer changeIntervalInMinutes) {
            this.changeIntervalInMinutes = changeIntervalInMinutes;
            return this;
        }

        public Builder setChangeStep(@Nullable Double changeStep) {
            this.changeStep = changeStep;
            return this;
        }

        public Builder setMaxReroutePercentage(@Nullable Double maxReroutePercentage) {
            this.maxReroutePercentage = maxReroutePercentage;
            return this;
        }

        public Builder setMinReroutePercentage(@Nullable Double minReroutePercentage) {
            this.minReroutePercentage = minReroutePercentage;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setReroutePercentage(@Nullable Double reroutePercentage) {
            this.reroutePercentage = reroutePercentage;
            return this;
        }
        public RampUpRuleResponse build() {
            return new RampUpRuleResponse(actionHostName, changeDecisionCallbackUrl, changeIntervalInMinutes, changeStep, maxReroutePercentage, minReroutePercentage, name, reroutePercentage);
        }
    }
}
