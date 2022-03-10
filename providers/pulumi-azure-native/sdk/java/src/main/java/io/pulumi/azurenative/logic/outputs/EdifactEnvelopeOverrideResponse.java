// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdifactEnvelopeOverrideResponse {
    /**
     * The application password.
     * 
     */
    private final @Nullable String applicationPassword;
    /**
     * The association assigned code.
     * 
     */
    private final @Nullable String associationAssignedCode;
    /**
     * The controlling agency code.
     * 
     */
    private final @Nullable String controllingAgencyCode;
    /**
     * The functional group id.
     * 
     */
    private final @Nullable String functionalGroupId;
    /**
     * The group header message release.
     * 
     */
    private final @Nullable String groupHeaderMessageRelease;
    /**
     * The group header message version.
     * 
     */
    private final @Nullable String groupHeaderMessageVersion;
    /**
     * The message association assigned code.
     * 
     */
    private final @Nullable String messageAssociationAssignedCode;
    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    private final @Nullable String messageId;
    /**
     * The message release version on which this envelope settings has to be applied.
     * 
     */
    private final @Nullable String messageRelease;
    /**
     * The message version on which this envelope settings has to be applied.
     * 
     */
    private final @Nullable String messageVersion;
    /**
     * The receiver application id.
     * 
     */
    private final @Nullable String receiverApplicationId;
    /**
     * The receiver application qualifier.
     * 
     */
    private final @Nullable String receiverApplicationQualifier;
    /**
     * The sender application id.
     * 
     */
    private final @Nullable String senderApplicationId;
    /**
     * The sender application qualifier.
     * 
     */
    private final @Nullable String senderApplicationQualifier;
    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    private final @Nullable String targetNamespace;

    @OutputCustomType.Constructor
    private EdifactEnvelopeOverrideResponse(
        @OutputCustomType.Parameter("applicationPassword") @Nullable String applicationPassword,
        @OutputCustomType.Parameter("associationAssignedCode") @Nullable String associationAssignedCode,
        @OutputCustomType.Parameter("controllingAgencyCode") @Nullable String controllingAgencyCode,
        @OutputCustomType.Parameter("functionalGroupId") @Nullable String functionalGroupId,
        @OutputCustomType.Parameter("groupHeaderMessageRelease") @Nullable String groupHeaderMessageRelease,
        @OutputCustomType.Parameter("groupHeaderMessageVersion") @Nullable String groupHeaderMessageVersion,
        @OutputCustomType.Parameter("messageAssociationAssignedCode") @Nullable String messageAssociationAssignedCode,
        @OutputCustomType.Parameter("messageId") @Nullable String messageId,
        @OutputCustomType.Parameter("messageRelease") @Nullable String messageRelease,
        @OutputCustomType.Parameter("messageVersion") @Nullable String messageVersion,
        @OutputCustomType.Parameter("receiverApplicationId") @Nullable String receiverApplicationId,
        @OutputCustomType.Parameter("receiverApplicationQualifier") @Nullable String receiverApplicationQualifier,
        @OutputCustomType.Parameter("senderApplicationId") @Nullable String senderApplicationId,
        @OutputCustomType.Parameter("senderApplicationQualifier") @Nullable String senderApplicationQualifier,
        @OutputCustomType.Parameter("targetNamespace") @Nullable String targetNamespace) {
        this.applicationPassword = applicationPassword;
        this.associationAssignedCode = associationAssignedCode;
        this.controllingAgencyCode = controllingAgencyCode;
        this.functionalGroupId = functionalGroupId;
        this.groupHeaderMessageRelease = groupHeaderMessageRelease;
        this.groupHeaderMessageVersion = groupHeaderMessageVersion;
        this.messageAssociationAssignedCode = messageAssociationAssignedCode;
        this.messageId = messageId;
        this.messageRelease = messageRelease;
        this.messageVersion = messageVersion;
        this.receiverApplicationId = receiverApplicationId;
        this.receiverApplicationQualifier = receiverApplicationQualifier;
        this.senderApplicationId = senderApplicationId;
        this.senderApplicationQualifier = senderApplicationQualifier;
        this.targetNamespace = targetNamespace;
    }

    /**
     * The application password.
     * 
    */
    public Optional<String> getApplicationPassword() {
        return Optional.ofNullable(this.applicationPassword);
    }
    /**
     * The association assigned code.
     * 
    */
    public Optional<String> getAssociationAssignedCode() {
        return Optional.ofNullable(this.associationAssignedCode);
    }
    /**
     * The controlling agency code.
     * 
    */
    public Optional<String> getControllingAgencyCode() {
        return Optional.ofNullable(this.controllingAgencyCode);
    }
    /**
     * The functional group id.
     * 
    */
    public Optional<String> getFunctionalGroupId() {
        return Optional.ofNullable(this.functionalGroupId);
    }
    /**
     * The group header message release.
     * 
    */
    public Optional<String> getGroupHeaderMessageRelease() {
        return Optional.ofNullable(this.groupHeaderMessageRelease);
    }
    /**
     * The group header message version.
     * 
    */
    public Optional<String> getGroupHeaderMessageVersion() {
        return Optional.ofNullable(this.groupHeaderMessageVersion);
    }
    /**
     * The message association assigned code.
     * 
    */
    public Optional<String> getMessageAssociationAssignedCode() {
        return Optional.ofNullable(this.messageAssociationAssignedCode);
    }
    /**
     * The message id on which this envelope settings has to be applied.
     * 
    */
    public Optional<String> getMessageId() {
        return Optional.ofNullable(this.messageId);
    }
    /**
     * The message release version on which this envelope settings has to be applied.
     * 
    */
    public Optional<String> getMessageRelease() {
        return Optional.ofNullable(this.messageRelease);
    }
    /**
     * The message version on which this envelope settings has to be applied.
     * 
    */
    public Optional<String> getMessageVersion() {
        return Optional.ofNullable(this.messageVersion);
    }
    /**
     * The receiver application id.
     * 
    */
    public Optional<String> getReceiverApplicationId() {
        return Optional.ofNullable(this.receiverApplicationId);
    }
    /**
     * The receiver application qualifier.
     * 
    */
    public Optional<String> getReceiverApplicationQualifier() {
        return Optional.ofNullable(this.receiverApplicationQualifier);
    }
    /**
     * The sender application id.
     * 
    */
    public Optional<String> getSenderApplicationId() {
        return Optional.ofNullable(this.senderApplicationId);
    }
    /**
     * The sender application qualifier.
     * 
    */
    public Optional<String> getSenderApplicationQualifier() {
        return Optional.ofNullable(this.senderApplicationQualifier);
    }
    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
    */
    public Optional<String> getTargetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactEnvelopeOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationPassword;
        private @Nullable String associationAssignedCode;
        private @Nullable String controllingAgencyCode;
        private @Nullable String functionalGroupId;
        private @Nullable String groupHeaderMessageRelease;
        private @Nullable String groupHeaderMessageVersion;
        private @Nullable String messageAssociationAssignedCode;
        private @Nullable String messageId;
        private @Nullable String messageRelease;
        private @Nullable String messageVersion;
        private @Nullable String receiverApplicationId;
        private @Nullable String receiverApplicationQualifier;
        private @Nullable String senderApplicationId;
        private @Nullable String senderApplicationQualifier;
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactEnvelopeOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPassword = defaults.applicationPassword;
    	      this.associationAssignedCode = defaults.associationAssignedCode;
    	      this.controllingAgencyCode = defaults.controllingAgencyCode;
    	      this.functionalGroupId = defaults.functionalGroupId;
    	      this.groupHeaderMessageRelease = defaults.groupHeaderMessageRelease;
    	      this.groupHeaderMessageVersion = defaults.groupHeaderMessageVersion;
    	      this.messageAssociationAssignedCode = defaults.messageAssociationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.receiverApplicationQualifier = defaults.receiverApplicationQualifier;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.senderApplicationQualifier = defaults.senderApplicationQualifier;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder setApplicationPassword(@Nullable String applicationPassword) {
            this.applicationPassword = applicationPassword;
            return this;
        }

        public Builder setAssociationAssignedCode(@Nullable String associationAssignedCode) {
            this.associationAssignedCode = associationAssignedCode;
            return this;
        }

        public Builder setControllingAgencyCode(@Nullable String controllingAgencyCode) {
            this.controllingAgencyCode = controllingAgencyCode;
            return this;
        }

        public Builder setFunctionalGroupId(@Nullable String functionalGroupId) {
            this.functionalGroupId = functionalGroupId;
            return this;
        }

        public Builder setGroupHeaderMessageRelease(@Nullable String groupHeaderMessageRelease) {
            this.groupHeaderMessageRelease = groupHeaderMessageRelease;
            return this;
        }

        public Builder setGroupHeaderMessageVersion(@Nullable String groupHeaderMessageVersion) {
            this.groupHeaderMessageVersion = groupHeaderMessageVersion;
            return this;
        }

        public Builder setMessageAssociationAssignedCode(@Nullable String messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessageRelease(@Nullable String messageRelease) {
            this.messageRelease = messageRelease;
            return this;
        }

        public Builder setMessageVersion(@Nullable String messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }

        public Builder setReceiverApplicationId(@Nullable String receiverApplicationId) {
            this.receiverApplicationId = receiverApplicationId;
            return this;
        }

        public Builder setReceiverApplicationQualifier(@Nullable String receiverApplicationQualifier) {
            this.receiverApplicationQualifier = receiverApplicationQualifier;
            return this;
        }

        public Builder setSenderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder setSenderApplicationQualifier(@Nullable String senderApplicationQualifier) {
            this.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public EdifactEnvelopeOverrideResponse build() {
            return new EdifactEnvelopeOverrideResponse(applicationPassword, associationAssignedCode, controllingAgencyCode, functionalGroupId, groupHeaderMessageRelease, groupHeaderMessageVersion, messageAssociationAssignedCode, messageId, messageRelease, messageVersion, receiverApplicationId, receiverApplicationQualifier, senderApplicationId, senderApplicationQualifier, targetNamespace);
        }
    }
}
