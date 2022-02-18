// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A set of Display Device options
 * 
 */
public final class DisplayDeviceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DisplayDeviceResponse Empty = new DisplayDeviceResponse();

    /**
     * Defines whether the instance has Display enabled.
     * 
     */
    @InputImport(name="enableDisplay", required=true)
    private final Boolean enableDisplay;

    public Boolean getEnableDisplay() {
        return this.enableDisplay;
    }

    public DisplayDeviceResponse(Boolean enableDisplay) {
        this.enableDisplay = Objects.requireNonNull(enableDisplay, "expected parameter 'enableDisplay' to be non-null");
    }

    private DisplayDeviceResponse() {
        this.enableDisplay = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisplayDeviceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableDisplay;

        public Builder() {
    	      // Empty
        }

        public Builder(DisplayDeviceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDisplay = defaults.enableDisplay;
        }

        public Builder setEnableDisplay(Boolean enableDisplay) {
            this.enableDisplay = Objects.requireNonNull(enableDisplay);
            return this;
        }

        public DisplayDeviceResponse build() {
            return new DisplayDeviceResponse(enableDisplay);
        }
    }
}
