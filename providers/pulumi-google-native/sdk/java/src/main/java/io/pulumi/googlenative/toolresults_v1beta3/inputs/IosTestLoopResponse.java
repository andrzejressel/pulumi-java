// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A game loop test of an iOS application.
 * 
 */
public final class IosTestLoopResponse extends io.pulumi.resources.InvokeArgs {

    public static final IosTestLoopResponse Empty = new IosTestLoopResponse();

    /**
     * Bundle ID of the app.
     * 
     */
    @InputImport(name="bundleId", required=true)
    private final String bundleId;

    public String getBundleId() {
        return this.bundleId;
    }

    public IosTestLoopResponse(String bundleId) {
        this.bundleId = Objects.requireNonNull(bundleId, "expected parameter 'bundleId' to be non-null");
    }

    private IosTestLoopResponse() {
        this.bundleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bundleId;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestLoopResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
        }

        public Builder setBundleId(String bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }

        public IosTestLoopResponse build() {
            return new IosTestLoopResponse(bundleId);
        }
    }
}
