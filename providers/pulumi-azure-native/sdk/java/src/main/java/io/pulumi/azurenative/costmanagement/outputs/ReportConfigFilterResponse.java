// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportConfigComparisonExpressionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportConfigFilterResponse {
    /**
     * The logical "AND" expression. Must have at least 2 items.
     * 
     */
    private final @Nullable List<ReportConfigFilterResponse> and;
    /**
     * Has comparison expression for a dimension
     * 
     */
    private final @Nullable ReportConfigComparisonExpressionResponse dimensions;
    /**
     * The logical "OR" expression. Must have at least 2 items.
     * 
     */
    private final @Nullable List<ReportConfigFilterResponse> or;
    /**
     * Has comparison expression for a tag key
     * 
     */
    private final @Nullable ReportConfigComparisonExpressionResponse tagKey;
    /**
     * Has comparison expression for a tag value
     * 
     */
    private final @Nullable ReportConfigComparisonExpressionResponse tagValue;
    /**
     * Has comparison expression for a tag
     * 
     */
    private final @Nullable ReportConfigComparisonExpressionResponse tags;

    @OutputCustomType.Constructor
    private ReportConfigFilterResponse(
        @OutputCustomType.Parameter("and") @Nullable List<ReportConfigFilterResponse> and,
        @OutputCustomType.Parameter("dimensions") @Nullable ReportConfigComparisonExpressionResponse dimensions,
        @OutputCustomType.Parameter("or") @Nullable List<ReportConfigFilterResponse> or,
        @OutputCustomType.Parameter("tagKey") @Nullable ReportConfigComparisonExpressionResponse tagKey,
        @OutputCustomType.Parameter("tagValue") @Nullable ReportConfigComparisonExpressionResponse tagValue,
        @OutputCustomType.Parameter("tags") @Nullable ReportConfigComparisonExpressionResponse tags) {
        this.and = and;
        this.dimensions = dimensions;
        this.or = or;
        this.tagKey = tagKey;
        this.tagValue = tagValue;
        this.tags = tags;
    }

    /**
     * The logical "AND" expression. Must have at least 2 items.
     * 
    */
    public List<ReportConfigFilterResponse> getAnd() {
        return this.and == null ? List.of() : this.and;
    }
    /**
     * Has comparison expression for a dimension
     * 
    */
    public Optional<ReportConfigComparisonExpressionResponse> getDimensions() {
        return Optional.ofNullable(this.dimensions);
    }
    /**
     * The logical "OR" expression. Must have at least 2 items.
     * 
    */
    public List<ReportConfigFilterResponse> getOr() {
        return this.or == null ? List.of() : this.or;
    }
    /**
     * Has comparison expression for a tag key
     * 
    */
    public Optional<ReportConfigComparisonExpressionResponse> getTagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    /**
     * Has comparison expression for a tag value
     * 
    */
    public Optional<ReportConfigComparisonExpressionResponse> getTagValue() {
        return Optional.ofNullable(this.tagValue);
    }
    /**
     * Has comparison expression for a tag
     * 
    */
    public Optional<ReportConfigComparisonExpressionResponse> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReportConfigFilterResponse> and;
        private @Nullable ReportConfigComparisonExpressionResponse dimensions;
        private @Nullable List<ReportConfigFilterResponse> or;
        private @Nullable ReportConfigComparisonExpressionResponse tagKey;
        private @Nullable ReportConfigComparisonExpressionResponse tagValue;
        private @Nullable ReportConfigComparisonExpressionResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimensions = defaults.dimensions;
    	      this.or = defaults.or;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
    	      this.tags = defaults.tags;
        }

        public Builder setAnd(@Nullable List<ReportConfigFilterResponse> and) {
            this.and = and;
            return this;
        }

        public Builder setDimensions(@Nullable ReportConfigComparisonExpressionResponse dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setOr(@Nullable List<ReportConfigFilterResponse> or) {
            this.or = or;
            return this;
        }

        public Builder setTagKey(@Nullable ReportConfigComparisonExpressionResponse tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        public Builder setTagValue(@Nullable ReportConfigComparisonExpressionResponse tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Builder setTags(@Nullable ReportConfigComparisonExpressionResponse tags) {
            this.tags = tags;
            return this;
        }
        public ReportConfigFilterResponse build() {
            return new ReportConfigFilterResponse(and, dimensions, or, tagKey, tagValue, tags);
        }
    }
}
