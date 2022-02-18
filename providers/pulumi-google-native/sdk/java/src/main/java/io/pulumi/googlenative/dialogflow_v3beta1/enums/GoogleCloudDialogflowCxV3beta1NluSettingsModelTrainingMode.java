// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates NLU model training mode.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode {
        /**
         * Not specified. `MODEL_TRAINING_MODE_AUTOMATIC` will be used.
         * 
         */
        ModelTrainingModeUnspecified("MODEL_TRAINING_MODE_UNSPECIFIED"),
        /**
         * NLU model training is automatically triggered when a flow gets modified. User can also manually trigger model training in this mode.
         * 
         */
        ModelTrainingModeAutomatic("MODEL_TRAINING_MODE_AUTOMATIC"),
        /**
         * User needs to manually trigger NLU model training. Best for large flows whose models take long time to train.
         * 
         */
        ModelTrainingModeManual("MODEL_TRAINING_MODE_MANUAL");

        private final String value;

        GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
