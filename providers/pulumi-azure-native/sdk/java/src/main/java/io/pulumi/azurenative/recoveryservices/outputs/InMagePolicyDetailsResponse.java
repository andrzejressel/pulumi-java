// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InMagePolicyDetailsResponse {
    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    private final @Nullable Integer appConsistentFrequencyInMinutes;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMage'.
     * 
     */
    private final String instanceType;
    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    private final @Nullable String multiVmSyncStatus;
    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    private final @Nullable Integer recoveryPointHistory;
    /**
     * The recovery point threshold in minutes.
     * 
     */
    private final @Nullable Integer recoveryPointThresholdInMinutes;

    @OutputCustomType.Constructor
    private InMagePolicyDetailsResponse(
        @OutputCustomType.Parameter("appConsistentFrequencyInMinutes") @Nullable Integer appConsistentFrequencyInMinutes,
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("multiVmSyncStatus") @Nullable String multiVmSyncStatus,
        @OutputCustomType.Parameter("recoveryPointHistory") @Nullable Integer recoveryPointHistory,
        @OutputCustomType.Parameter("recoveryPointThresholdInMinutes") @Nullable Integer recoveryPointThresholdInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.multiVmSyncStatus = multiVmSyncStatus;
        this.recoveryPointHistory = recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
    }

    /**
     * The app consistent snapshot frequency in minutes.
     * 
    */
    public Optional<Integer> getAppConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMage'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
    */
    public Optional<String> getMultiVmSyncStatus() {
        return Optional.ofNullable(this.multiVmSyncStatus);
    }
    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
    */
    public Optional<Integer> getRecoveryPointHistory() {
        return Optional.ofNullable(this.recoveryPointHistory);
    }
    /**
     * The recovery point threshold in minutes.
     * 
    */
    public Optional<Integer> getRecoveryPointThresholdInMinutes() {
        return Optional.ofNullable(this.recoveryPointThresholdInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMagePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer appConsistentFrequencyInMinutes;
        private String instanceType;
        private @Nullable String multiVmSyncStatus;
        private @Nullable Integer recoveryPointHistory;
        private @Nullable Integer recoveryPointThresholdInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMagePolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
    	      this.recoveryPointThresholdInMinutes = defaults.recoveryPointThresholdInMinutes;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setMultiVmSyncStatus(@Nullable String multiVmSyncStatus) {
            this.multiVmSyncStatus = multiVmSyncStatus;
            return this;
        }

        public Builder setRecoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }

        public Builder setRecoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }
        public InMagePolicyDetailsResponse build() {
            return new InMagePolicyDetailsResponse(appConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory, recoveryPointThresholdInMinutes);
        }
    }
}
