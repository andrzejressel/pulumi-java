// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The format of the input data files.
     * 
     */
    @EnumType
    public enum GoogleCloudMlV1__PredictionInputDataFormat {
        /**
         * Unspecified format.
         * 
         */
        DataFormatUnspecified("DATA_FORMAT_UNSPECIFIED"),
        /**
         * Each line of the file is a JSON dictionary representing one record.
         * 
         */
        Json("JSON"),
        /**
         * Deprecated. Use JSON instead.
         * 
         */
        Text("TEXT"),
        /**
         * The source file is a TFRecord file. Currently available only for input data.
         * 
         */
        TfRecord("TF_RECORD"),
        /**
         * The source file is a GZIP-compressed TFRecord file. Currently available only for input data.
         * 
         */
        TfRecordGzip("TF_RECORD_GZIP"),
        /**
         * Values are comma-separated rows, with keys in a separate file. Currently available only for output data.
         * 
         */
        Csv("CSV");

        private final String value;

        GoogleCloudMlV1__PredictionInputDataFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1__PredictionInputDataFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
