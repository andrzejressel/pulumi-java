// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FutureReservationSpecificSKUPropertiesResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FutureReservationStatusResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FutureReservationTimeWindowResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ShareSettingsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFutureReservationResult {
    /**
     * The creation timestamp for this future reservation in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    private final String description;
    private final String kind;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    private final String namePrefix;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * List of Projects/Folders to share with.
     * 
     */
    private final ShareSettingsResponse shareSettings;
    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    private final FutureReservationSpecificSKUPropertiesResponse specificSkuProperties;
    /**
     * [Output only] Status of the Future Reservation
     * 
     */
    private final FutureReservationStatusResponse status;
    /**
     * Time window for this Future Reservation.
     * 
     */
    private final FutureReservationTimeWindowResponse timeWindow;
    /**
     * URL of the Zone where this future reservation resides.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"creationTimestamp","description","kind","name","namePrefix","selfLink","selfLinkWithId","shareSettings","specificSkuProperties","status","timeWindow","zone"})
    private GetFutureReservationResult(
        String creationTimestamp,
        String description,
        String kind,
        String name,
        String namePrefix,
        String selfLink,
        String selfLinkWithId,
        ShareSettingsResponse shareSettings,
        FutureReservationSpecificSKUPropertiesResponse specificSkuProperties,
        FutureReservationStatusResponse status,
        FutureReservationTimeWindowResponse timeWindow,
        String zone) {
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.namePrefix = Objects.requireNonNull(namePrefix);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.shareSettings = Objects.requireNonNull(shareSettings);
        this.specificSkuProperties = Objects.requireNonNull(specificSkuProperties);
        this.status = Objects.requireNonNull(status);
        this.timeWindow = Objects.requireNonNull(timeWindow);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The creation timestamp for this future reservation in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * List of Projects/Folders to share with.
     * 
     */
    public ShareSettingsResponse getShareSettings() {
        return this.shareSettings;
    }
    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    public FutureReservationSpecificSKUPropertiesResponse getSpecificSkuProperties() {
        return this.specificSkuProperties;
    }
    /**
     * [Output only] Status of the Future Reservation
     * 
     */
    public FutureReservationStatusResponse getStatus() {
        return this.status;
    }
    /**
     * Time window for this Future Reservation.
     * 
     */
    public FutureReservationTimeWindowResponse getTimeWindow() {
        return this.timeWindow;
    }
    /**
     * URL of the Zone where this future reservation resides.
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFutureReservationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private String namePrefix;
        private String selfLink;
        private String selfLinkWithId;
        private ShareSettingsResponse shareSettings;
        private FutureReservationSpecificSKUPropertiesResponse specificSkuProperties;
        private FutureReservationStatusResponse status;
        private FutureReservationTimeWindowResponse timeWindow;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFutureReservationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificSkuProperties = defaults.specificSkuProperties;
    	      this.status = defaults.status;
    	      this.timeWindow = defaults.timeWindow;
    	      this.zone = defaults.zone;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamePrefix(String namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setShareSettings(ShareSettingsResponse shareSettings) {
            this.shareSettings = Objects.requireNonNull(shareSettings);
            return this;
        }

        public Builder setSpecificSkuProperties(FutureReservationSpecificSKUPropertiesResponse specificSkuProperties) {
            this.specificSkuProperties = Objects.requireNonNull(specificSkuProperties);
            return this;
        }

        public Builder setStatus(FutureReservationStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTimeWindow(FutureReservationTimeWindowResponse timeWindow) {
            this.timeWindow = Objects.requireNonNull(timeWindow);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetFutureReservationResult build() {
            return new GetFutureReservationResult(creationTimestamp, description, kind, name, namePrefix, selfLink, selfLinkWithId, shareSettings, specificSkuProperties, status, timeWindow, zone);
        }
    }
}
