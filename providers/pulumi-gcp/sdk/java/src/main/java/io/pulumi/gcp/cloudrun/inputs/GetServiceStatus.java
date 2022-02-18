// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.GetServiceStatusCondition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceStatus extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceStatus Empty = new GetServiceStatus();

    @InputImport(name="conditions", required=true)
    private final List<GetServiceStatusCondition> conditions;

    public List<GetServiceStatusCondition> getConditions() {
        return this.conditions;
    }

    @InputImport(name="latestCreatedRevisionName", required=true)
    private final String latestCreatedRevisionName;

    public String getLatestCreatedRevisionName() {
        return this.latestCreatedRevisionName;
    }

    @InputImport(name="latestReadyRevisionName", required=true)
    private final String latestReadyRevisionName;

    public String getLatestReadyRevisionName() {
        return this.latestReadyRevisionName;
    }

    @InputImport(name="observedGeneration", required=true)
    private final Integer observedGeneration;

    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public GetServiceStatus(
        List<GetServiceStatusCondition> conditions,
        String latestCreatedRevisionName,
        String latestReadyRevisionName,
        Integer observedGeneration,
        String url) {
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.latestCreatedRevisionName = Objects.requireNonNull(latestCreatedRevisionName, "expected parameter 'latestCreatedRevisionName' to be non-null");
        this.latestReadyRevisionName = Objects.requireNonNull(latestReadyRevisionName, "expected parameter 'latestReadyRevisionName' to be non-null");
        this.observedGeneration = Objects.requireNonNull(observedGeneration, "expected parameter 'observedGeneration' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GetServiceStatus() {
        this.conditions = List.of();
        this.latestCreatedRevisionName = null;
        this.latestReadyRevisionName = null;
        this.observedGeneration = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceStatusCondition> conditions;
        private String latestCreatedRevisionName;
        private String latestReadyRevisionName;
        private Integer observedGeneration;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.url = defaults.url;
        }

        public Builder setConditions(List<GetServiceStatusCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setLatestCreatedRevisionName(String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Objects.requireNonNull(latestCreatedRevisionName);
            return this;
        }

        public Builder setLatestReadyRevisionName(String latestReadyRevisionName) {
            this.latestReadyRevisionName = Objects.requireNonNull(latestReadyRevisionName);
            return this;
        }

        public Builder setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public GetServiceStatus build() {
            return new GetServiceStatus(conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, url);
        }
    }
}
