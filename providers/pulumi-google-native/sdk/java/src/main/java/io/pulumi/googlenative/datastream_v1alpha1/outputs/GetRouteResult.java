// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRouteResult {
    /**
     * The create time of the resource.
     * 
     */
    private final String createTime;
    /**
     * Destination address for connection
     * 
     */
    private final String destinationAddress;
    /**
     * Destination port for connection
     * 
     */
    private final Integer destinationPort;
    /**
     * Display name.
     * 
     */
    private final String displayName;
    /**
     * Labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource's name.
     * 
     */
    private final String name;
    /**
     * The update time of the resource.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","destinationAddress","destinationPort","displayName","labels","name","updateTime"})
    private GetRouteResult(
        String createTime,
        String destinationAddress,
        Integer destinationPort,
        String displayName,
        Map<String,String> labels,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destinationAddress = Objects.requireNonNull(destinationAddress);
        this.destinationPort = Objects.requireNonNull(destinationPort);
        this.displayName = Objects.requireNonNull(displayName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The create time of the resource.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Destination address for connection
     * 
     */
    public String getDestinationAddress() {
        return this.destinationAddress;
    }
    /**
     * Destination port for connection
     * 
     */
    public Integer getDestinationPort() {
        return this.destinationPort;
    }
    /**
     * Display name.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Labels.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource's name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The update time of the resource.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destinationAddress;
        private Integer destinationPort;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationPort = defaults.destinationPort;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestinationAddress(String destinationAddress) {
            this.destinationAddress = Objects.requireNonNull(destinationAddress);
            return this;
        }

        public Builder setDestinationPort(Integer destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
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

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetRouteResult build() {
            return new GetRouteResult(createTime, destinationAddress, destinationPort, displayName, labels, name, updateTime);
        }
    }
}
