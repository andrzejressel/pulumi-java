// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The employer's company size.
     * 
     */
    @EnumType
    public enum CompanySize {
        /**
         * Default value if the size is not specified.
         * 
         */
        CompanySizeUnspecified("COMPANY_SIZE_UNSPECIFIED"),
        /**
         * The company has less than 50 employees.
         * 
         */
        Mini("MINI"),
        /**
         * The company has between 50 and 99 employees.
         * 
         */
        Small("SMALL"),
        /**
         * The company has between 100 and 499 employees.
         * 
         */
        Smedium("SMEDIUM"),
        /**
         * The company has between 500 and 999 employees.
         * 
         */
        Medium("MEDIUM"),
        /**
         * The company has between 1,000 and 4,999 employees.
         * 
         */
        Big("BIG"),
        /**
         * The company has between 5,000 and 9,999 employees.
         * 
         */
        Bigger("BIGGER"),
        /**
         * The company has 10,000 or more employees.
         * 
         */
        Giant("GIANT");

        private final String value;

        CompanySize(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CompanySize[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
