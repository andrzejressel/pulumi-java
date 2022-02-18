// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs Empty = new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @InputImport(name="backendService", required=true)
    private final Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService;
    }

    public URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs(Input<String> backendService) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
    }

    private URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs() {
        this.backendService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(Input<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Input.of(Objects.requireNonNull(backendService));
            return this;
        }

        public URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs build() {
            return new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs(backendService);
        }
    }
}
