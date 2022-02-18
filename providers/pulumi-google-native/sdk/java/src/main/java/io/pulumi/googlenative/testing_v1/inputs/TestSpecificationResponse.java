// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.AndroidInstrumentationTestResponse;
import io.pulumi.googlenative.testing_v1.inputs.AndroidRoboTestResponse;
import io.pulumi.googlenative.testing_v1.inputs.AndroidTestLoopResponse;
import io.pulumi.googlenative.testing_v1.inputs.IosTestLoopResponse;
import io.pulumi.googlenative.testing_v1.inputs.IosTestSetupResponse;
import io.pulumi.googlenative.testing_v1.inputs.IosXcTestResponse;
import io.pulumi.googlenative.testing_v1.inputs.TestSetupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A description of how to run the test.
 * 
 */
public final class TestSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestSpecificationResponse Empty = new TestSpecificationResponse();

    /**
     * An Android instrumentation test.
     * 
     */
    @InputImport(name="androidInstrumentationTest", required=true)
    private final AndroidInstrumentationTestResponse androidInstrumentationTest;

    public AndroidInstrumentationTestResponse getAndroidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }

    /**
     * An Android robo test.
     * 
     */
    @InputImport(name="androidRoboTest", required=true)
    private final AndroidRoboTestResponse androidRoboTest;

    public AndroidRoboTestResponse getAndroidRoboTest() {
        return this.androidRoboTest;
    }

    /**
     * An Android Application with a Test Loop.
     * 
     */
    @InputImport(name="androidTestLoop", required=true)
    private final AndroidTestLoopResponse androidTestLoop;

    public AndroidTestLoopResponse getAndroidTestLoop() {
        return this.androidTestLoop;
    }

    /**
     * Disables performance metrics recording. May reduce test latency.
     * 
     */
    @InputImport(name="disablePerformanceMetrics", required=true)
    private final Boolean disablePerformanceMetrics;

    public Boolean getDisablePerformanceMetrics() {
        return this.disablePerformanceMetrics;
    }

    /**
     * Disables video recording. May reduce test latency.
     * 
     */
    @InputImport(name="disableVideoRecording", required=true)
    private final Boolean disableVideoRecording;

    public Boolean getDisableVideoRecording() {
        return this.disableVideoRecording;
    }

    /**
     * An iOS application with a test loop.
     * 
     */
    @InputImport(name="iosTestLoop", required=true)
    private final IosTestLoopResponse iosTestLoop;

    public IosTestLoopResponse getIosTestLoop() {
        return this.iosTestLoop;
    }

    /**
     * Test setup requirements for iOS.
     * 
     */
    @InputImport(name="iosTestSetup", required=true)
    private final IosTestSetupResponse iosTestSetup;

    public IosTestSetupResponse getIosTestSetup() {
        return this.iosTestSetup;
    }

    /**
     * An iOS XCTest, via an .xctestrun file.
     * 
     */
    @InputImport(name="iosXcTest", required=true)
    private final IosXcTestResponse iosXcTest;

    public IosXcTestResponse getIosXcTest() {
        return this.iosXcTest;
    }

    /**
     * Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
     */
    @InputImport(name="testSetup", required=true)
    private final TestSetupResponse testSetup;

    public TestSetupResponse getTestSetup() {
        return this.testSetup;
    }

    /**
     * Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
     */
    @InputImport(name="testTimeout", required=true)
    private final String testTimeout;

    public String getTestTimeout() {
        return this.testTimeout;
    }

    public TestSpecificationResponse(
        AndroidInstrumentationTestResponse androidInstrumentationTest,
        AndroidRoboTestResponse androidRoboTest,
        AndroidTestLoopResponse androidTestLoop,
        Boolean disablePerformanceMetrics,
        Boolean disableVideoRecording,
        IosTestLoopResponse iosTestLoop,
        IosTestSetupResponse iosTestSetup,
        IosXcTestResponse iosXcTest,
        TestSetupResponse testSetup,
        String testTimeout) {
        this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest, "expected parameter 'androidInstrumentationTest' to be non-null");
        this.androidRoboTest = Objects.requireNonNull(androidRoboTest, "expected parameter 'androidRoboTest' to be non-null");
        this.androidTestLoop = Objects.requireNonNull(androidTestLoop, "expected parameter 'androidTestLoop' to be non-null");
        this.disablePerformanceMetrics = Objects.requireNonNull(disablePerformanceMetrics, "expected parameter 'disablePerformanceMetrics' to be non-null");
        this.disableVideoRecording = Objects.requireNonNull(disableVideoRecording, "expected parameter 'disableVideoRecording' to be non-null");
        this.iosTestLoop = Objects.requireNonNull(iosTestLoop, "expected parameter 'iosTestLoop' to be non-null");
        this.iosTestSetup = Objects.requireNonNull(iosTestSetup, "expected parameter 'iosTestSetup' to be non-null");
        this.iosXcTest = Objects.requireNonNull(iosXcTest, "expected parameter 'iosXcTest' to be non-null");
        this.testSetup = Objects.requireNonNull(testSetup, "expected parameter 'testSetup' to be non-null");
        this.testTimeout = Objects.requireNonNull(testTimeout, "expected parameter 'testTimeout' to be non-null");
    }

    private TestSpecificationResponse() {
        this.androidInstrumentationTest = null;
        this.androidRoboTest = null;
        this.androidTestLoop = null;
        this.disablePerformanceMetrics = null;
        this.disableVideoRecording = null;
        this.iosTestLoop = null;
        this.iosTestSetup = null;
        this.iosXcTest = null;
        this.testSetup = null;
        this.testTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidInstrumentationTestResponse androidInstrumentationTest;
        private AndroidRoboTestResponse androidRoboTest;
        private AndroidTestLoopResponse androidTestLoop;
        private Boolean disablePerformanceMetrics;
        private Boolean disableVideoRecording;
        private IosTestLoopResponse iosTestLoop;
        private IosTestSetupResponse iosTestSetup;
        private IosXcTestResponse iosXcTest;
        private TestSetupResponse testSetup;
        private String testTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidInstrumentationTest = defaults.androidInstrumentationTest;
    	      this.androidRoboTest = defaults.androidRoboTest;
    	      this.androidTestLoop = defaults.androidTestLoop;
    	      this.disablePerformanceMetrics = defaults.disablePerformanceMetrics;
    	      this.disableVideoRecording = defaults.disableVideoRecording;
    	      this.iosTestLoop = defaults.iosTestLoop;
    	      this.iosTestSetup = defaults.iosTestSetup;
    	      this.iosXcTest = defaults.iosXcTest;
    	      this.testSetup = defaults.testSetup;
    	      this.testTimeout = defaults.testTimeout;
        }

        public Builder setAndroidInstrumentationTest(AndroidInstrumentationTestResponse androidInstrumentationTest) {
            this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest);
            return this;
        }

        public Builder setAndroidRoboTest(AndroidRoboTestResponse androidRoboTest) {
            this.androidRoboTest = Objects.requireNonNull(androidRoboTest);
            return this;
        }

        public Builder setAndroidTestLoop(AndroidTestLoopResponse androidTestLoop) {
            this.androidTestLoop = Objects.requireNonNull(androidTestLoop);
            return this;
        }

        public Builder setDisablePerformanceMetrics(Boolean disablePerformanceMetrics) {
            this.disablePerformanceMetrics = Objects.requireNonNull(disablePerformanceMetrics);
            return this;
        }

        public Builder setDisableVideoRecording(Boolean disableVideoRecording) {
            this.disableVideoRecording = Objects.requireNonNull(disableVideoRecording);
            return this;
        }

        public Builder setIosTestLoop(IosTestLoopResponse iosTestLoop) {
            this.iosTestLoop = Objects.requireNonNull(iosTestLoop);
            return this;
        }

        public Builder setIosTestSetup(IosTestSetupResponse iosTestSetup) {
            this.iosTestSetup = Objects.requireNonNull(iosTestSetup);
            return this;
        }

        public Builder setIosXcTest(IosXcTestResponse iosXcTest) {
            this.iosXcTest = Objects.requireNonNull(iosXcTest);
            return this;
        }

        public Builder setTestSetup(TestSetupResponse testSetup) {
            this.testSetup = Objects.requireNonNull(testSetup);
            return this;
        }

        public Builder setTestTimeout(String testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }

        public TestSpecificationResponse build() {
            return new TestSpecificationResponse(androidInstrumentationTest, androidRoboTest, androidTestLoop, disablePerformanceMetrics, disableVideoRecording, iosTestLoop, iosTestSetup, iosXcTest, testSetup, testTimeout);
        }
    }
}
