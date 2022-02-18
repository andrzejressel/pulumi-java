// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupCloudRunGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupCloudRunGetArgs Empty = new RegionNetworkEndpointGroupCloudRunGetArgs();

    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * Cloud Run tag represents the "named-revision" to provide
     * additional fine-grained traffic routing information.
     * The tag must be 1-63 characters long, and comply with RFC1035.
     * Example value: "revision-0010".
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    @InputImport(name="urlMask")
    private final @Nullable Input<String> urlMask;

    public Input<String> getUrlMask() {
        return this.urlMask == null ? Input.empty() : this.urlMask;
    }

    public RegionNetworkEndpointGroupCloudRunGetArgs(
        @Nullable Input<String> service,
        @Nullable Input<String> tag,
        @Nullable Input<String> urlMask) {
        this.service = service;
        this.tag = tag;
        this.urlMask = urlMask;
    }

    private RegionNetworkEndpointGroupCloudRunGetArgs() {
        this.service = Input.empty();
        this.tag = Input.empty();
        this.urlMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupCloudRunGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> service;
        private @Nullable Input<String> tag;
        private @Nullable Input<String> urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupCloudRunGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public Builder setUrlMask(@Nullable Input<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }

        public Builder setUrlMask(@Nullable String urlMask) {
            this.urlMask = Input.ofNullable(urlMask);
            return this;
        }

        public RegionNetworkEndpointGroupCloudRunGetArgs build() {
            return new RegionNetworkEndpointGroupCloudRunGetArgs(service, tag, urlMask);
        }
    }
}
