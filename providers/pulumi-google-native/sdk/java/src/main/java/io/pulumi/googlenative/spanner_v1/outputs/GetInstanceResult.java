// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
     * 
     */
    private final String config;
    /**
     * The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    private final String displayName;
    /**
     * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     * 
     */
    private final Map<String,String> labels;
    /**
     * A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the name must be between 2 and 64 characters in length.
     * 
     */
    private final String name;
    /**
     * The number of nodes allocated to this instance. At most one of either node_count or processing_units should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    private final Integer nodeCount;
    /**
     * The number of processing units allocated to this instance. At most one of processing_units or node_count should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    private final Integer processingUnits;
    /**
     * The current instance state. For CreateInstance, the state must be either omitted or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"config","displayName","labels","name","nodeCount","processingUnits","state"})
    private GetInstanceResult(
        String config,
        String displayName,
        Map<String,String> labels,
        String name,
        Integer nodeCount,
        Integer processingUnits,
        String state) {
        this.config = Objects.requireNonNull(config);
        this.displayName = Objects.requireNonNull(displayName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.nodeCount = Objects.requireNonNull(nodeCount);
        this.processingUnits = Objects.requireNonNull(processingUnits);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
     * 
     */
    public String getConfig() {
        return this.config;
    }
    /**
     * The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the name must be between 2 and 64 characters in length.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The number of nodes allocated to this instance. At most one of either node_count or processing_units should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * The number of processing units allocated to this instance. At most one of processing_units or node_count should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    public Integer getProcessingUnits() {
        return this.processingUnits;
    }
    /**
     * The current instance state. For CreateInstance, the state must be either omitted or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String config;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private Integer nodeCount;
        private Integer processingUnits;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.processingUnits = defaults.processingUnits;
    	      this.state = defaults.state;
        }

        public Builder setConfig(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder setProcessingUnits(Integer processingUnits) {
            this.processingUnits = Objects.requireNonNull(processingUnits);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetInstanceResult build() {
            return new GetInstanceResult(config, displayName, labels, name, nodeCount, processingUnits, state);
        }
    }
}
