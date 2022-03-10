// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadGroupResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The workload group importance level.
     * 
     */
    private final @Nullable String importance;
    /**
     * The workload group cap percentage resource.
     * 
     */
    private final Integer maxResourcePercent;
    /**
     * The workload group request maximum grant percentage.
     * 
     */
    private final @Nullable Double maxResourcePercentPerRequest;
    /**
     * The workload group minimum percentage resource.
     * 
     */
    private final Integer minResourcePercent;
    /**
     * The workload group request minimum grant percentage.
     * 
     */
    private final Double minResourcePercentPerRequest;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The workload group query execution timeout.
     * 
     */
    private final @Nullable Integer queryExecutionTimeout;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetWorkloadGroupResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("importance") @Nullable String importance,
        @OutputCustomType.Parameter("maxResourcePercent") Integer maxResourcePercent,
        @OutputCustomType.Parameter("maxResourcePercentPerRequest") @Nullable Double maxResourcePercentPerRequest,
        @OutputCustomType.Parameter("minResourcePercent") Integer minResourcePercent,
        @OutputCustomType.Parameter("minResourcePercentPerRequest") Double minResourcePercentPerRequest,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("queryExecutionTimeout") @Nullable Integer queryExecutionTimeout,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.importance = importance;
        this.maxResourcePercent = maxResourcePercent;
        this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
        this.minResourcePercent = minResourcePercent;
        this.minResourcePercentPerRequest = minResourcePercentPerRequest;
        this.name = name;
        this.queryExecutionTimeout = queryExecutionTimeout;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The workload group importance level.
     * 
    */
    public Optional<String> getImportance() {
        return Optional.ofNullable(this.importance);
    }
    /**
     * The workload group cap percentage resource.
     * 
    */
    public Integer getMaxResourcePercent() {
        return this.maxResourcePercent;
    }
    /**
     * The workload group request maximum grant percentage.
     * 
    */
    public Optional<Double> getMaxResourcePercentPerRequest() {
        return Optional.ofNullable(this.maxResourcePercentPerRequest);
    }
    /**
     * The workload group minimum percentage resource.
     * 
    */
    public Integer getMinResourcePercent() {
        return this.minResourcePercent;
    }
    /**
     * The workload group request minimum grant percentage.
     * 
    */
    public Double getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The workload group query execution timeout.
     * 
    */
    public Optional<Integer> getQueryExecutionTimeout() {
        return Optional.ofNullable(this.queryExecutionTimeout);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String importance;
        private Integer maxResourcePercent;
        private @Nullable Double maxResourcePercentPerRequest;
        private Integer minResourcePercent;
        private Double minResourcePercentPerRequest;
        private String name;
        private @Nullable Integer queryExecutionTimeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.importance = defaults.importance;
    	      this.maxResourcePercent = defaults.maxResourcePercent;
    	      this.maxResourcePercentPerRequest = defaults.maxResourcePercentPerRequest;
    	      this.minResourcePercent = defaults.minResourcePercent;
    	      this.minResourcePercentPerRequest = defaults.minResourcePercentPerRequest;
    	      this.name = defaults.name;
    	      this.queryExecutionTimeout = defaults.queryExecutionTimeout;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImportance(@Nullable String importance) {
            this.importance = importance;
            return this;
        }

        public Builder setMaxResourcePercent(Integer maxResourcePercent) {
            this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent);
            return this;
        }

        public Builder setMaxResourcePercentPerRequest(@Nullable Double maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
            return this;
        }

        public Builder setMinResourcePercent(Integer minResourcePercent) {
            this.minResourcePercent = Objects.requireNonNull(minResourcePercent);
            return this;
        }

        public Builder setMinResourcePercentPerRequest(Double minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQueryExecutionTimeout(@Nullable Integer queryExecutionTimeout) {
            this.queryExecutionTimeout = queryExecutionTimeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadGroupResult build() {
            return new GetWorkloadGroupResult(id, importance, maxResourcePercent, maxResourcePercentPerRequest, minResourcePercent, minResourcePercentPerRequest, name, queryExecutionTimeout, type);
        }
    }
}
