// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.IosAppInfoResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.IosRoboTestResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.IosTestLoopResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.IosXcTestResponse;
import java.util.Objects;

@OutputCustomType
public final class IosTestResponse {
    /**
     * Information about the application under test.
     * 
     */
    private final IosAppInfoResponse iosAppInfo;
    /**
     * An iOS Robo test.
     * 
     */
    private final IosRoboTestResponse iosRoboTest;
    /**
     * An iOS test loop.
     * 
     */
    private final IosTestLoopResponse iosTestLoop;
    /**
     * An iOS XCTest.
     * 
     */
    private final IosXcTestResponse iosXcTest;
    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    private final DurationResponse testTimeout;

    @OutputCustomType.Constructor({"iosAppInfo","iosRoboTest","iosTestLoop","iosXcTest","testTimeout"})
    private IosTestResponse(
        IosAppInfoResponse iosAppInfo,
        IosRoboTestResponse iosRoboTest,
        IosTestLoopResponse iosTestLoop,
        IosXcTestResponse iosXcTest,
        DurationResponse testTimeout) {
        this.iosAppInfo = Objects.requireNonNull(iosAppInfo);
        this.iosRoboTest = Objects.requireNonNull(iosRoboTest);
        this.iosTestLoop = Objects.requireNonNull(iosTestLoop);
        this.iosXcTest = Objects.requireNonNull(iosXcTest);
        this.testTimeout = Objects.requireNonNull(testTimeout);
    }

    /**
     * Information about the application under test.
     * 
     */
    public IosAppInfoResponse getIosAppInfo() {
        return this.iosAppInfo;
    }
    /**
     * An iOS Robo test.
     * 
     */
    public IosRoboTestResponse getIosRoboTest() {
        return this.iosRoboTest;
    }
    /**
     * An iOS test loop.
     * 
     */
    public IosTestLoopResponse getIosTestLoop() {
        return this.iosTestLoop;
    }
    /**
     * An iOS XCTest.
     * 
     */
    public IosXcTestResponse getIosXcTest() {
        return this.iosXcTest;
    }
    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    public DurationResponse getTestTimeout() {
        return this.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosAppInfoResponse iosAppInfo;
        private IosRoboTestResponse iosRoboTest;
        private IosTestLoopResponse iosTestLoop;
        private IosXcTestResponse iosXcTest;
        private DurationResponse testTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iosAppInfo = defaults.iosAppInfo;
    	      this.iosRoboTest = defaults.iosRoboTest;
    	      this.iosTestLoop = defaults.iosTestLoop;
    	      this.iosXcTest = defaults.iosXcTest;
    	      this.testTimeout = defaults.testTimeout;
        }

        public Builder setIosAppInfo(IosAppInfoResponse iosAppInfo) {
            this.iosAppInfo = Objects.requireNonNull(iosAppInfo);
            return this;
        }

        public Builder setIosRoboTest(IosRoboTestResponse iosRoboTest) {
            this.iosRoboTest = Objects.requireNonNull(iosRoboTest);
            return this;
        }

        public Builder setIosTestLoop(IosTestLoopResponse iosTestLoop) {
            this.iosTestLoop = Objects.requireNonNull(iosTestLoop);
            return this;
        }

        public Builder setIosXcTest(IosXcTestResponse iosXcTest) {
            this.iosXcTest = Objects.requireNonNull(iosXcTest);
            return this;
        }

        public Builder setTestTimeout(DurationResponse testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }

        public IosTestResponse build() {
            return new IosTestResponse(iosAppInfo, iosRoboTest, iosTestLoop, iosXcTest, testTimeout);
        }
    }
}
