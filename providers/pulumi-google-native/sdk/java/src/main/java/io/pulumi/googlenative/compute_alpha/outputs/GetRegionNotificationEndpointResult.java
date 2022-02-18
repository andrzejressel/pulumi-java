// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.NotificationEndpointGrpcSettingsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRegionNotificationEndpointResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
     * 
     */
    private final NotificationEndpointGrpcSettingsResponse grpcSettings;
    /**
     * Type of the resource. Always compute#notificationEndpoint for notification endpoints.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * URL of the region where the notification endpoint resides. This field applies only to the regional resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;

    @OutputCustomType.Constructor({"creationTimestamp","description","grpcSettings","kind","name","region","selfLink"})
    private GetRegionNotificationEndpointResult(
        String creationTimestamp,
        String description,
        NotificationEndpointGrpcSettingsResponse grpcSettings,
        String kind,
        String name,
        String region,
        String selfLink) {
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.grpcSettings = Objects.requireNonNull(grpcSettings);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
     * 
     */
    public NotificationEndpointGrpcSettingsResponse getGrpcSettings() {
        return this.grpcSettings;
    }
    /**
     * Type of the resource. Always compute#notificationEndpoint for notification endpoints.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the region where the notification endpoint resides. This field applies only to the regional resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNotificationEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private NotificationEndpointGrpcSettingsResponse grpcSettings;
        private String kind;
        private String name;
        private String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionNotificationEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.grpcSettings = defaults.grpcSettings;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setGrpcSettings(NotificationEndpointGrpcSettingsResponse grpcSettings) {
            this.grpcSettings = Objects.requireNonNull(grpcSettings);
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

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public GetRegionNotificationEndpointResult build() {
            return new GetRegionNotificationEndpointResult(creationTimestamp, description, grpcSettings, kind, name, region, selfLink);
        }
    }
}
