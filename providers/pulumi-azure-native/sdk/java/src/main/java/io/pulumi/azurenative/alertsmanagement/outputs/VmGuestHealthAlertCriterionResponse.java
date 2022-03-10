// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.azurenative.alertsmanagement.outputs.HealthStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class VmGuestHealthAlertCriterionResponse {
    /**
     * Health states to alert on
     * 
     */
    private final List<HealthStateResponse> healthStates;
    /**
     * Names of health monitor on which to define alert
     * 
     */
    private final @Nullable List<String> monitorNames;
    /**
     * Names of health monitor type on which to define alert
     * 
     */
    private final @Nullable List<String> monitorTypes;
    /**
     * specifies the type of the alert criterion.
     * Expected value is 'GuestVmHealth'.
     * 
     */
    private final String namespace;

    @OutputCustomType.Constructor
    private VmGuestHealthAlertCriterionResponse(
        @OutputCustomType.Parameter("healthStates") List<HealthStateResponse> healthStates,
        @OutputCustomType.Parameter("monitorNames") @Nullable List<String> monitorNames,
        @OutputCustomType.Parameter("monitorTypes") @Nullable List<String> monitorTypes,
        @OutputCustomType.Parameter("namespace") String namespace) {
        this.healthStates = healthStates;
        this.monitorNames = monitorNames;
        this.monitorTypes = monitorTypes;
        this.namespace = namespace;
    }

    /**
     * Health states to alert on
     * 
    */
    public List<HealthStateResponse> getHealthStates() {
        return this.healthStates;
    }
    /**
     * Names of health monitor on which to define alert
     * 
    */
    public List<String> getMonitorNames() {
        return this.monitorNames == null ? List.of() : this.monitorNames;
    }
    /**
     * Names of health monitor type on which to define alert
     * 
    */
    public List<String> getMonitorTypes() {
        return this.monitorTypes == null ? List.of() : this.monitorTypes;
    }
    /**
     * specifies the type of the alert criterion.
     * Expected value is 'GuestVmHealth'.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmGuestHealthAlertCriterionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HealthStateResponse> healthStates;
        private @Nullable List<String> monitorNames;
        private @Nullable List<String> monitorTypes;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(VmGuestHealthAlertCriterionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthStates = defaults.healthStates;
    	      this.monitorNames = defaults.monitorNames;
    	      this.monitorTypes = defaults.monitorTypes;
    	      this.namespace = defaults.namespace;
        }

        public Builder setHealthStates(List<HealthStateResponse> healthStates) {
            this.healthStates = Objects.requireNonNull(healthStates);
            return this;
        }

        public Builder setMonitorNames(@Nullable List<String> monitorNames) {
            this.monitorNames = monitorNames;
            return this;
        }

        public Builder setMonitorTypes(@Nullable List<String> monitorTypes) {
            this.monitorTypes = monitorTypes;
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public VmGuestHealthAlertCriterionResponse build() {
            return new VmGuestHealthAlertCriterionResponse(healthStates, monitorNames, monitorTypes, namespace);
        }
    }
}
