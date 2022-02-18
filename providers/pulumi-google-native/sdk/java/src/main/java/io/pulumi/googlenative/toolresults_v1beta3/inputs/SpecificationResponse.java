// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidTestResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.IosTestResponse;
import java.util.Objects;


/**
 * The details about how to run the execution.
 * 
 */
public final class SpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SpecificationResponse Empty = new SpecificationResponse();

    /**
     * An Android mobile test execution specification.
     * 
     */
    @InputImport(name="androidTest", required=true)
    private final AndroidTestResponse androidTest;

    public AndroidTestResponse getAndroidTest() {
        return this.androidTest;
    }

    /**
     * An iOS mobile test execution specification.
     * 
     */
    @InputImport(name="iosTest", required=true)
    private final IosTestResponse iosTest;

    public IosTestResponse getIosTest() {
        return this.iosTest;
    }

    public SpecificationResponse(
        AndroidTestResponse androidTest,
        IosTestResponse iosTest) {
        this.androidTest = Objects.requireNonNull(androidTest, "expected parameter 'androidTest' to be non-null");
        this.iosTest = Objects.requireNonNull(iosTest, "expected parameter 'iosTest' to be non-null");
    }

    private SpecificationResponse() {
        this.androidTest = null;
        this.iosTest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidTestResponse androidTest;
        private IosTestResponse iosTest;

        public Builder() {
    	      // Empty
        }

        public Builder(SpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidTest = defaults.androidTest;
    	      this.iosTest = defaults.iosTest;
        }

        public Builder setAndroidTest(AndroidTestResponse androidTest) {
            this.androidTest = Objects.requireNonNull(androidTest);
            return this;
        }

        public Builder setIosTest(IosTestResponse iosTest) {
            this.iosTest = Objects.requireNonNull(iosTest);
            return this;
        }

        public SpecificationResponse build() {
            return new SpecificationResponse(androidTest, iosTest);
        }
    }
}
