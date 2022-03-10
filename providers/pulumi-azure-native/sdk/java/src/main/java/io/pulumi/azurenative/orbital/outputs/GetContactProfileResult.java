// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.ContactProfileLinkResponse;
import io.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContactProfileResult {
    /**
     * Auto track configuration.
     * 
     */
    private final @Nullable String autoTrackingConfiguration;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The URI of the Event Hub used for telemetry
     * 
     */
    private final @Nullable String eventHubUri;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Links of the Contact Profile
     * 
     */
    private final List<ContactProfileLinkResponse> links;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    private final @Nullable Double minimumElevationDegrees;
    /**
     * Minimum viable contact duration in ISO 8601 format.
     * 
     */
    private final @Nullable String minimumViableContactDuration;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetContactProfileResult(
        @OutputCustomType.Parameter("autoTrackingConfiguration") @Nullable String autoTrackingConfiguration,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("eventHubUri") @Nullable String eventHubUri,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("links") List<ContactProfileLinkResponse> links,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("minimumElevationDegrees") @Nullable Double minimumElevationDegrees,
        @OutputCustomType.Parameter("minimumViableContactDuration") @Nullable String minimumViableContactDuration,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.autoTrackingConfiguration = autoTrackingConfiguration;
        this.etag = etag;
        this.eventHubUri = eventHubUri;
        this.id = id;
        this.links = links;
        this.location = location;
        this.minimumElevationDegrees = minimumElevationDegrees;
        this.minimumViableContactDuration = minimumViableContactDuration;
        this.name = name;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Auto track configuration.
     * 
    */
    public Optional<String> getAutoTrackingConfiguration() {
        return Optional.ofNullable(this.autoTrackingConfiguration);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The URI of the Event Hub used for telemetry
     * 
    */
    public Optional<String> getEventHubUri() {
        return Optional.ofNullable(this.eventHubUri);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Links of the Contact Profile
     * 
    */
    public List<ContactProfileLinkResponse> getLinks() {
        return this.links;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Minimum viable elevation for the contact in decimal degrees.
     * 
    */
    public Optional<Double> getMinimumElevationDegrees() {
        return Optional.ofNullable(this.minimumElevationDegrees);
    }
    /**
     * Minimum viable contact duration in ISO 8601 format.
     * 
    */
    public Optional<String> getMinimumViableContactDuration() {
        return Optional.ofNullable(this.minimumViableContactDuration);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetContactProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoTrackingConfiguration;
        private String etag;
        private @Nullable String eventHubUri;
        private String id;
        private List<ContactProfileLinkResponse> links;
        private String location;
        private @Nullable Double minimumElevationDegrees;
        private @Nullable String minimumViableContactDuration;
        private String name;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoTrackingConfiguration = defaults.autoTrackingConfiguration;
    	      this.etag = defaults.etag;
    	      this.eventHubUri = defaults.eventHubUri;
    	      this.id = defaults.id;
    	      this.links = defaults.links;
    	      this.location = defaults.location;
    	      this.minimumElevationDegrees = defaults.minimumElevationDegrees;
    	      this.minimumViableContactDuration = defaults.minimumViableContactDuration;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAutoTrackingConfiguration(@Nullable String autoTrackingConfiguration) {
            this.autoTrackingConfiguration = autoTrackingConfiguration;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEventHubUri(@Nullable String eventHubUri) {
            this.eventHubUri = eventHubUri;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinks(List<ContactProfileLinkResponse> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMinimumElevationDegrees(@Nullable Double minimumElevationDegrees) {
            this.minimumElevationDegrees = minimumElevationDegrees;
            return this;
        }

        public Builder setMinimumViableContactDuration(@Nullable String minimumViableContactDuration) {
            this.minimumViableContactDuration = minimumViableContactDuration;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetContactProfileResult build() {
            return new GetContactProfileResult(autoTrackingConfiguration, etag, eventHubUri, id, links, location, minimumElevationDegrees, minimumViableContactDuration, name, systemData, tags, type);
        }
    }
}
