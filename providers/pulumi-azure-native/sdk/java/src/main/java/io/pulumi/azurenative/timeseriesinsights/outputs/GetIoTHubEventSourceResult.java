// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.azurenative.timeseriesinsights.outputs.LocalTimestampResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIoTHubEventSourceResult {
    /**
     * The name of the iot hub's consumer group that holds the partitions from which events will be read.
     * 
     */
    private final String consumerGroupName;
    /**
     * The time the resource was created.
     * 
     */
    private final String creationTime;
    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
     */
    private final String eventSourceResourceId;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The name of the iot hub.
     * 
     */
    private final String iotHubName;
    /**
     * The name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant 'service connect' permissions to the iot hub.
     * 
     */
    private final String keyName;
    /**
     * The kind of the event source.
     * Expected value is 'Microsoft.IoTHub'.
     * 
     */
    private final String kind;
    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    private final @Nullable LocalTimestampResponse localTimestamp;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    private final @Nullable String time;
    /**
     * The event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    private final @Nullable String timestampPropertyName;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetIoTHubEventSourceResult(
        @OutputCustomType.Parameter("consumerGroupName") String consumerGroupName,
        @OutputCustomType.Parameter("creationTime") String creationTime,
        @OutputCustomType.Parameter("eventSourceResourceId") String eventSourceResourceId,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("iotHubName") String iotHubName,
        @OutputCustomType.Parameter("keyName") String keyName,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("localTimestamp") @Nullable LocalTimestampResponse localTimestamp,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("time") @Nullable String time,
        @OutputCustomType.Parameter("timestampPropertyName") @Nullable String timestampPropertyName,
        @OutputCustomType.Parameter("type") String type) {
        this.consumerGroupName = consumerGroupName;
        this.creationTime = creationTime;
        this.eventSourceResourceId = eventSourceResourceId;
        this.id = id;
        this.iotHubName = iotHubName;
        this.keyName = keyName;
        this.kind = kind;
        this.localTimestamp = localTimestamp;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.time = time;
        this.timestampPropertyName = timestampPropertyName;
        this.type = type;
    }

    /**
     * The name of the iot hub's consumer group that holds the partitions from which events will be read.
     * 
    */
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }
    /**
     * The time the resource was created.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
    */
    public String getEventSourceResourceId() {
        return this.eventSourceResourceId;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the iot hub.
     * 
    */
    public String getIotHubName() {
        return this.iotHubName;
    }
    /**
     * The name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant 'service connect' permissions to the iot hub.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The kind of the event source.
     * Expected value is 'Microsoft.IoTHub'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
    */
    public Optional<LocalTimestampResponse> getLocalTimestamp() {
        return Optional.ofNullable(this.localTimestamp);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
    */
    public Optional<String> getTime() {
        return Optional.ofNullable(this.time);
    }
    /**
     * The event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
    */
    public Optional<String> getTimestampPropertyName() {
        return Optional.ofNullable(this.timestampPropertyName);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIoTHubEventSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumerGroupName;
        private String creationTime;
        private String eventSourceResourceId;
        private String id;
        private String iotHubName;
        private String keyName;
        private String kind;
        private @Nullable LocalTimestampResponse localTimestamp;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private @Nullable String time;
        private @Nullable String timestampPropertyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIoTHubEventSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.creationTime = defaults.creationTime;
    	      this.eventSourceResourceId = defaults.eventSourceResourceId;
    	      this.id = defaults.id;
    	      this.iotHubName = defaults.iotHubName;
    	      this.keyName = defaults.keyName;
    	      this.kind = defaults.kind;
    	      this.localTimestamp = defaults.localTimestamp;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.time = defaults.time;
    	      this.timestampPropertyName = defaults.timestampPropertyName;
    	      this.type = defaults.type;
        }

        public Builder setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = Objects.requireNonNull(consumerGroupName);
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setEventSourceResourceId(String eventSourceResourceId) {
            this.eventSourceResourceId = Objects.requireNonNull(eventSourceResourceId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIotHubName(String iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocalTimestamp(@Nullable LocalTimestampResponse localTimestamp) {
            this.localTimestamp = localTimestamp;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = time;
            return this;
        }

        public Builder setTimestampPropertyName(@Nullable String timestampPropertyName) {
            this.timestampPropertyName = timestampPropertyName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIoTHubEventSourceResult build() {
            return new GetIoTHubEventSourceResult(consumerGroupName, creationTime, eventSourceResourceId, id, iotHubName, keyName, kind, localTimestamp, location, name, provisioningState, tags, time, timestampPropertyName, type);
        }
    }
}
