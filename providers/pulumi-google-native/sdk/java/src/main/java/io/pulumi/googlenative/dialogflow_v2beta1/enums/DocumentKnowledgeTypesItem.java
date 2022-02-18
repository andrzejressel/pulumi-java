// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DocumentKnowledgeTypesItem {
        /**
         * The type is unspecified or arbitrary.
         * 
         */
        KnowledgeTypeUnspecified("KNOWLEDGE_TYPE_UNSPECIFIED"),
        /**
         * The document content contains question and answer pairs as either HTML or CSV. Typical FAQ HTML formats are parsed accurately, but unusual formats may fail to be parsed. CSV must have questions in the first column and answers in the second, with no header. Because of this explicit format, they are always parsed accurately.
         * 
         */
        Faq("FAQ"),
        /**
         * Documents for which unstructured text is extracted and used for question answering.
         * 
         */
        ExtractiveQa("EXTRACTIVE_QA"),
        /**
         * The entire document content as a whole can be used for query results. Only for Contact Center Solutions on Dialogflow.
         * 
         */
        ArticleSuggestion("ARTICLE_SUGGESTION"),
        /**
         * The legacy enum for agent-facing smart reply feature.
         * 
         */
        SmartReply("SMART_REPLY");

        private final String value;

        DocumentKnowledgeTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DocumentKnowledgeTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
