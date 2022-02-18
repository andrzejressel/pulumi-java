// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for continuous tests.
 * 
 */
public final class GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs Empty = new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs();

    /**
     * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
     * 
     */
    @InputImport(name="enableContinuousRun")
    private final @Nullable Input<Boolean> enableContinuousRun;

    public Input<Boolean> getEnableContinuousRun() {
        return this.enableContinuousRun == null ? Input.empty() : this.enableContinuousRun;
    }

    /**
     * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
     * 
     */
    @InputImport(name="enablePredeploymentRun")
    private final @Nullable Input<Boolean> enablePredeploymentRun;

    public Input<Boolean> getEnablePredeploymentRun() {
        return this.enablePredeploymentRun == null ? Input.empty() : this.enablePredeploymentRun;
    }

    /**
     * A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
     * 
     */
    @InputImport(name="testCases")
    private final @Nullable Input<List<String>> testCases;

    public Input<List<String>> getTestCases() {
        return this.testCases == null ? Input.empty() : this.testCases;
    }

    public GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs(
        @Nullable Input<Boolean> enableContinuousRun,
        @Nullable Input<Boolean> enablePredeploymentRun,
        @Nullable Input<List<String>> testCases) {
        this.enableContinuousRun = enableContinuousRun;
        this.enablePredeploymentRun = enablePredeploymentRun;
        this.testCases = testCases;
    }

    private GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs() {
        this.enableContinuousRun = Input.empty();
        this.enablePredeploymentRun = Input.empty();
        this.testCases = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableContinuousRun;
        private @Nullable Input<Boolean> enablePredeploymentRun;
        private @Nullable Input<List<String>> testCases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableContinuousRun = defaults.enableContinuousRun;
    	      this.enablePredeploymentRun = defaults.enablePredeploymentRun;
    	      this.testCases = defaults.testCases;
        }

        public Builder setEnableContinuousRun(@Nullable Input<Boolean> enableContinuousRun) {
            this.enableContinuousRun = enableContinuousRun;
            return this;
        }

        public Builder setEnableContinuousRun(@Nullable Boolean enableContinuousRun) {
            this.enableContinuousRun = Input.ofNullable(enableContinuousRun);
            return this;
        }

        public Builder setEnablePredeploymentRun(@Nullable Input<Boolean> enablePredeploymentRun) {
            this.enablePredeploymentRun = enablePredeploymentRun;
            return this;
        }

        public Builder setEnablePredeploymentRun(@Nullable Boolean enablePredeploymentRun) {
            this.enablePredeploymentRun = Input.ofNullable(enablePredeploymentRun);
            return this;
        }

        public Builder setTestCases(@Nullable Input<List<String>> testCases) {
            this.testCases = testCases;
            return this;
        }

        public Builder setTestCases(@Nullable List<String> testCases) {
            this.testCases = Input.ofNullable(testCases);
            return this;
        }

        public GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs build() {
            return new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs(enableContinuousRun, enablePredeploymentRun, testCases);
        }
    }
}
