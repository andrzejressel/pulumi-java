// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceDocumentAttributeValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceDocumentAttributeValueArgs Empty = new DataSourceDocumentAttributeValueArgs();

    @Import(name="dateValue")
    private @Nullable Output<String> dateValue;

    public Optional<Output<String>> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }

    @Import(name="longValue")
    private @Nullable Output<Integer> longValue;

    public Optional<Output<Integer>> longValue() {
        return Optional.ofNullable(this.longValue);
    }

    @Import(name="stringListValue")
    private @Nullable Output<List<String>> stringListValue;

    public Optional<Output<List<String>>> stringListValue() {
        return Optional.ofNullable(this.stringListValue);
    }

    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    private DataSourceDocumentAttributeValueArgs() {}

    private DataSourceDocumentAttributeValueArgs(DataSourceDocumentAttributeValueArgs $) {
        this.dateValue = $.dateValue;
        this.longValue = $.longValue;
        this.stringListValue = $.stringListValue;
        this.stringValue = $.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceDocumentAttributeValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceDocumentAttributeValueArgs $;

        public Builder() {
            $ = new DataSourceDocumentAttributeValueArgs();
        }

        public Builder(DataSourceDocumentAttributeValueArgs defaults) {
            $ = new DataSourceDocumentAttributeValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder dateValue(@Nullable Output<String> dateValue) {
            $.dateValue = dateValue;
            return this;
        }

        public Builder dateValue(String dateValue) {
            return dateValue(Output.of(dateValue));
        }

        public Builder longValue(@Nullable Output<Integer> longValue) {
            $.longValue = longValue;
            return this;
        }

        public Builder longValue(Integer longValue) {
            return longValue(Output.of(longValue));
        }

        public Builder stringListValue(@Nullable Output<List<String>> stringListValue) {
            $.stringListValue = stringListValue;
            return this;
        }

        public Builder stringListValue(List<String> stringListValue) {
            return stringListValue(Output.of(stringListValue));
        }

        public Builder stringListValue(String... stringListValue) {
            return stringListValue(List.of(stringListValue));
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public DataSourceDocumentAttributeValueArgs build() {
            return $;
        }
    }

}
