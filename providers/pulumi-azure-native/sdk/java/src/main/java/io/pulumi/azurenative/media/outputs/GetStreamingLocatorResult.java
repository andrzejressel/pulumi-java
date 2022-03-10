// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.StreamingLocatorContentKeyResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamingLocatorResult {
    /**
     * Alternative Media ID of this Streaming Locator
     * 
     */
    private final @Nullable String alternativeMediaId;
    /**
     * Asset Name
     * 
     */
    private final String assetName;
    /**
     * The ContentKeys used by this Streaming Locator.
     * 
     */
    private final @Nullable List<StreamingLocatorContentKeyResponse> contentKeys;
    /**
     * The creation time of the Streaming Locator.
     * 
     */
    private final String created;
    /**
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
     */
    private final @Nullable String defaultContentKeyPolicyName;
    /**
     * The end time of the Streaming Locator.
     * 
     */
    private final @Nullable String endTime;
    /**
     * A list of asset or account filters which apply to this streaming locator
     * 
     */
    private final @Nullable List<String> filters;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The start time of the Streaming Locator.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The StreamingLocatorId of the Streaming Locator.
     * 
     */
    private final @Nullable String streamingLocatorId;
    /**
     * Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'
     * 
     */
    private final String streamingPolicyName;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetStreamingLocatorResult(
        @OutputCustomType.Parameter("alternativeMediaId") @Nullable String alternativeMediaId,
        @OutputCustomType.Parameter("assetName") String assetName,
        @OutputCustomType.Parameter("contentKeys") @Nullable List<StreamingLocatorContentKeyResponse> contentKeys,
        @OutputCustomType.Parameter("created") String created,
        @OutputCustomType.Parameter("defaultContentKeyPolicyName") @Nullable String defaultContentKeyPolicyName,
        @OutputCustomType.Parameter("endTime") @Nullable String endTime,
        @OutputCustomType.Parameter("filters") @Nullable List<String> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("startTime") @Nullable String startTime,
        @OutputCustomType.Parameter("streamingLocatorId") @Nullable String streamingLocatorId,
        @OutputCustomType.Parameter("streamingPolicyName") String streamingPolicyName,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.alternativeMediaId = alternativeMediaId;
        this.assetName = assetName;
        this.contentKeys = contentKeys;
        this.created = created;
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        this.endTime = endTime;
        this.filters = filters;
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.streamingLocatorId = streamingLocatorId;
        this.streamingPolicyName = streamingPolicyName;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Alternative Media ID of this Streaming Locator
     * 
    */
    public Optional<String> getAlternativeMediaId() {
        return Optional.ofNullable(this.alternativeMediaId);
    }
    /**
     * Asset Name
     * 
    */
    public String getAssetName() {
        return this.assetName;
    }
    /**
     * The ContentKeys used by this Streaming Locator.
     * 
    */
    public List<StreamingLocatorContentKeyResponse> getContentKeys() {
        return this.contentKeys == null ? List.of() : this.contentKeys;
    }
    /**
     * The creation time of the Streaming Locator.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
    */
    public Optional<String> getDefaultContentKeyPolicyName() {
        return Optional.ofNullable(this.defaultContentKeyPolicyName);
    }
    /**
     * The end time of the Streaming Locator.
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * A list of asset or account filters which apply to this streaming locator
     * 
    */
    public List<String> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The start time of the Streaming Locator.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The StreamingLocatorId of the Streaming Locator.
     * 
    */
    public Optional<String> getStreamingLocatorId() {
        return Optional.ofNullable(this.streamingLocatorId);
    }
    /**
     * Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'
     * 
    */
    public String getStreamingPolicyName() {
        return this.streamingPolicyName;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingLocatorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternativeMediaId;
        private String assetName;
        private @Nullable List<StreamingLocatorContentKeyResponse> contentKeys;
        private String created;
        private @Nullable String defaultContentKeyPolicyName;
        private @Nullable String endTime;
        private @Nullable List<String> filters;
        private String id;
        private String name;
        private @Nullable String startTime;
        private @Nullable String streamingLocatorId;
        private String streamingPolicyName;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingLocatorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeMediaId = defaults.alternativeMediaId;
    	      this.assetName = defaults.assetName;
    	      this.contentKeys = defaults.contentKeys;
    	      this.created = defaults.created;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.endTime = defaults.endTime;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.streamingLocatorId = defaults.streamingLocatorId;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAlternativeMediaId(@Nullable String alternativeMediaId) {
            this.alternativeMediaId = alternativeMediaId;
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setContentKeys(@Nullable List<StreamingLocatorContentKeyResponse> contentKeys) {
            this.contentKeys = contentKeys;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDefaultContentKeyPolicyName(@Nullable String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setFilters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStreamingLocatorId(@Nullable String streamingLocatorId) {
            this.streamingLocatorId = streamingLocatorId;
            return this;
        }

        public Builder setStreamingPolicyName(String streamingPolicyName) {
            this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetStreamingLocatorResult build() {
            return new GetStreamingLocatorResult(alternativeMediaId, assetName, contentKeys, created, defaultContentKeyPolicyName, endTime, filters, id, name, startTime, streamingLocatorId, streamingPolicyName, systemData, type);
        }
    }
}
