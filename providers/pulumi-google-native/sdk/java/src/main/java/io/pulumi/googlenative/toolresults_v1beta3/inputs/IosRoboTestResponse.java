// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import java.util.Objects;


/**
 * A Robo test for an iOS application.
 * 
 */
public final class IosRoboTestResponse extends io.pulumi.resources.InvokeArgs {

    public static final IosRoboTestResponse Empty = new IosRoboTestResponse();

    public IosRoboTestResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosRoboTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(IosRoboTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public IosRoboTestResponse build() {
            return new IosRoboTestResponse();
        }
    }
}
