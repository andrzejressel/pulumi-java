// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of the training phrase.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowV2IntentTrainingPhraseType {
        /**
         * Not specified. This value should never be used.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Examples do not contain @-prefixed entity type names, but example parts can be annotated with entity types.
         * 
         */
        Example("EXAMPLE"),
        /**
         * Templates are not annotated with entity types, but they can contain @-prefixed entity type names as substrings. Template mode has been deprecated. Example mode is the only supported way to create new training phrases. If you have existing training phrases that you've created in template mode, those will continue to work.
         * 
         */
        Template("TEMPLATE");

        private final String value;

        GoogleCloudDialogflowV2IntentTrainingPhraseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowV2IntentTrainingPhraseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
