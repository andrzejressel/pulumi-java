// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.outputs;

import com.pulumi.awsnative.ssm.enums.AssociationComplianceSeverity;
import com.pulumi.awsnative.ssm.enums.AssociationSyncCompliance;
import com.pulumi.awsnative.ssm.outputs.AssociationInstanceAssociationOutputLocation;
import com.pulumi.awsnative.ssm.outputs.AssociationTarget;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssociationResult {
    private final @Nullable Boolean applyOnlyAtCronInterval;
    /**
     * @return Unique identifier of the association.
     * 
     */
    private final @Nullable String associationId;
    /**
     * @return The name of the association.
     * 
     */
    private final @Nullable String associationName;
    private final @Nullable String automationTargetParameterName;
    private final @Nullable List<String> calendarNames;
    private final @Nullable AssociationComplianceSeverity complianceSeverity;
    /**
     * @return The version of the SSM document to associate with the target.
     * 
     */
    private final @Nullable String documentVersion;
    /**
     * @return The ID of the instance that the SSM document is associated with.
     * 
     */
    private final @Nullable String instanceId;
    private final @Nullable String maxConcurrency;
    private final @Nullable String maxErrors;
    /**
     * @return The name of the SSM document.
     * 
     */
    private final @Nullable String name;
    private final @Nullable AssociationInstanceAssociationOutputLocation outputLocation;
    /**
     * @return Parameter values that the SSM document uses at runtime.
     * 
     */
    private final @Nullable Object parameters;
    /**
     * @return A Cron or Rate expression that specifies when the association is applied to the target.
     * 
     */
    private final @Nullable String scheduleExpression;
    private final @Nullable Integer scheduleOffset;
    private final @Nullable AssociationSyncCompliance syncCompliance;
    /**
     * @return The targets that the SSM document sends commands to.
     * 
     */
    private final @Nullable List<AssociationTarget> targets;
    private final @Nullable Integer waitForSuccessTimeoutSeconds;

    @CustomType.Constructor
    private GetAssociationResult(
        @CustomType.Parameter("applyOnlyAtCronInterval") @Nullable Boolean applyOnlyAtCronInterval,
        @CustomType.Parameter("associationId") @Nullable String associationId,
        @CustomType.Parameter("associationName") @Nullable String associationName,
        @CustomType.Parameter("automationTargetParameterName") @Nullable String automationTargetParameterName,
        @CustomType.Parameter("calendarNames") @Nullable List<String> calendarNames,
        @CustomType.Parameter("complianceSeverity") @Nullable AssociationComplianceSeverity complianceSeverity,
        @CustomType.Parameter("documentVersion") @Nullable String documentVersion,
        @CustomType.Parameter("instanceId") @Nullable String instanceId,
        @CustomType.Parameter("maxConcurrency") @Nullable String maxConcurrency,
        @CustomType.Parameter("maxErrors") @Nullable String maxErrors,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("outputLocation") @Nullable AssociationInstanceAssociationOutputLocation outputLocation,
        @CustomType.Parameter("parameters") @Nullable Object parameters,
        @CustomType.Parameter("scheduleExpression") @Nullable String scheduleExpression,
        @CustomType.Parameter("scheduleOffset") @Nullable Integer scheduleOffset,
        @CustomType.Parameter("syncCompliance") @Nullable AssociationSyncCompliance syncCompliance,
        @CustomType.Parameter("targets") @Nullable List<AssociationTarget> targets,
        @CustomType.Parameter("waitForSuccessTimeoutSeconds") @Nullable Integer waitForSuccessTimeoutSeconds) {
        this.applyOnlyAtCronInterval = applyOnlyAtCronInterval;
        this.associationId = associationId;
        this.associationName = associationName;
        this.automationTargetParameterName = automationTargetParameterName;
        this.calendarNames = calendarNames;
        this.complianceSeverity = complianceSeverity;
        this.documentVersion = documentVersion;
        this.instanceId = instanceId;
        this.maxConcurrency = maxConcurrency;
        this.maxErrors = maxErrors;
        this.name = name;
        this.outputLocation = outputLocation;
        this.parameters = parameters;
        this.scheduleExpression = scheduleExpression;
        this.scheduleOffset = scheduleOffset;
        this.syncCompliance = syncCompliance;
        this.targets = targets;
        this.waitForSuccessTimeoutSeconds = waitForSuccessTimeoutSeconds;
    }

    public Optional<Boolean> applyOnlyAtCronInterval() {
        return Optional.ofNullable(this.applyOnlyAtCronInterval);
    }
    /**
     * @return Unique identifier of the association.
     * 
     */
    public Optional<String> associationId() {
        return Optional.ofNullable(this.associationId);
    }
    /**
     * @return The name of the association.
     * 
     */
    public Optional<String> associationName() {
        return Optional.ofNullable(this.associationName);
    }
    public Optional<String> automationTargetParameterName() {
        return Optional.ofNullable(this.automationTargetParameterName);
    }
    public List<String> calendarNames() {
        return this.calendarNames == null ? List.of() : this.calendarNames;
    }
    public Optional<AssociationComplianceSeverity> complianceSeverity() {
        return Optional.ofNullable(this.complianceSeverity);
    }
    /**
     * @return The version of the SSM document to associate with the target.
     * 
     */
    public Optional<String> documentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }
    /**
     * @return The ID of the instance that the SSM document is associated with.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<String> maxConcurrency() {
        return Optional.ofNullable(this.maxConcurrency);
    }
    public Optional<String> maxErrors() {
        return Optional.ofNullable(this.maxErrors);
    }
    /**
     * @return The name of the SSM document.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<AssociationInstanceAssociationOutputLocation> outputLocation() {
        return Optional.ofNullable(this.outputLocation);
    }
    /**
     * @return Parameter values that the SSM document uses at runtime.
     * 
     */
    public Optional<Object> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * @return A Cron or Rate expression that specifies when the association is applied to the target.
     * 
     */
    public Optional<String> scheduleExpression() {
        return Optional.ofNullable(this.scheduleExpression);
    }
    public Optional<Integer> scheduleOffset() {
        return Optional.ofNullable(this.scheduleOffset);
    }
    public Optional<AssociationSyncCompliance> syncCompliance() {
        return Optional.ofNullable(this.syncCompliance);
    }
    /**
     * @return The targets that the SSM document sends commands to.
     * 
     */
    public List<AssociationTarget> targets() {
        return this.targets == null ? List.of() : this.targets;
    }
    public Optional<Integer> waitForSuccessTimeoutSeconds() {
        return Optional.ofNullable(this.waitForSuccessTimeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean applyOnlyAtCronInterval;
        private @Nullable String associationId;
        private @Nullable String associationName;
        private @Nullable String automationTargetParameterName;
        private @Nullable List<String> calendarNames;
        private @Nullable AssociationComplianceSeverity complianceSeverity;
        private @Nullable String documentVersion;
        private @Nullable String instanceId;
        private @Nullable String maxConcurrency;
        private @Nullable String maxErrors;
        private @Nullable String name;
        private @Nullable AssociationInstanceAssociationOutputLocation outputLocation;
        private @Nullable Object parameters;
        private @Nullable String scheduleExpression;
        private @Nullable Integer scheduleOffset;
        private @Nullable AssociationSyncCompliance syncCompliance;
        private @Nullable List<AssociationTarget> targets;
        private @Nullable Integer waitForSuccessTimeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyOnlyAtCronInterval = defaults.applyOnlyAtCronInterval;
    	      this.associationId = defaults.associationId;
    	      this.associationName = defaults.associationName;
    	      this.automationTargetParameterName = defaults.automationTargetParameterName;
    	      this.calendarNames = defaults.calendarNames;
    	      this.complianceSeverity = defaults.complianceSeverity;
    	      this.documentVersion = defaults.documentVersion;
    	      this.instanceId = defaults.instanceId;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.maxErrors = defaults.maxErrors;
    	      this.name = defaults.name;
    	      this.outputLocation = defaults.outputLocation;
    	      this.parameters = defaults.parameters;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.scheduleOffset = defaults.scheduleOffset;
    	      this.syncCompliance = defaults.syncCompliance;
    	      this.targets = defaults.targets;
    	      this.waitForSuccessTimeoutSeconds = defaults.waitForSuccessTimeoutSeconds;
        }

        public Builder applyOnlyAtCronInterval(@Nullable Boolean applyOnlyAtCronInterval) {
            this.applyOnlyAtCronInterval = applyOnlyAtCronInterval;
            return this;
        }
        public Builder associationId(@Nullable String associationId) {
            this.associationId = associationId;
            return this;
        }
        public Builder associationName(@Nullable String associationName) {
            this.associationName = associationName;
            return this;
        }
        public Builder automationTargetParameterName(@Nullable String automationTargetParameterName) {
            this.automationTargetParameterName = automationTargetParameterName;
            return this;
        }
        public Builder calendarNames(@Nullable List<String> calendarNames) {
            this.calendarNames = calendarNames;
            return this;
        }
        public Builder calendarNames(String... calendarNames) {
            return calendarNames(List.of(calendarNames));
        }
        public Builder complianceSeverity(@Nullable AssociationComplianceSeverity complianceSeverity) {
            this.complianceSeverity = complianceSeverity;
            return this;
        }
        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder maxConcurrency(@Nullable String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Builder maxErrors(@Nullable String maxErrors) {
            this.maxErrors = maxErrors;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder outputLocation(@Nullable AssociationInstanceAssociationOutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }
        public Builder parameters(@Nullable Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder scheduleExpression(@Nullable String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public Builder scheduleOffset(@Nullable Integer scheduleOffset) {
            this.scheduleOffset = scheduleOffset;
            return this;
        }
        public Builder syncCompliance(@Nullable AssociationSyncCompliance syncCompliance) {
            this.syncCompliance = syncCompliance;
            return this;
        }
        public Builder targets(@Nullable List<AssociationTarget> targets) {
            this.targets = targets;
            return this;
        }
        public Builder targets(AssociationTarget... targets) {
            return targets(List.of(targets));
        }
        public Builder waitForSuccessTimeoutSeconds(@Nullable Integer waitForSuccessTimeoutSeconds) {
            this.waitForSuccessTimeoutSeconds = waitForSuccessTimeoutSeconds;
            return this;
        }        public GetAssociationResult build() {
            return new GetAssociationResult(applyOnlyAtCronInterval, associationId, associationName, automationTargetParameterName, calendarNames, complianceSeverity, documentVersion, instanceId, maxConcurrency, maxErrors, name, outputLocation, parameters, scheduleExpression, scheduleOffset, syncCompliance, targets, waitForSuccessTimeoutSeconds);
        }
    }
}
