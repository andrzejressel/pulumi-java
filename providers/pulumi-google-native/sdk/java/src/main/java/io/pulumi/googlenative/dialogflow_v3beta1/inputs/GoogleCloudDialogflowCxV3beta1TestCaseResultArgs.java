// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ConversationTurnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a result from running a test case in an agent environment.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TestCaseResultArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1TestCaseResultArgs Empty = new GoogleCloudDialogflowCxV3beta1TestCaseResultArgs();

    /**
     * The conversation turns uttered during the test case replay in chronological order.
     * 
     */
    @InputImport(name="conversationTurns")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> conversationTurns;

    public Input<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> getConversationTurns() {
        return this.conversationTurns == null ? Input.empty() : this.conversationTurns;
    }

    /**
     * Environment where the test was run. If not set, it indicates the draft environment.
     * 
     */
    @InputImport(name="environment")
    private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Whether the test case passed in the agent environment.
     * 
     */
    @InputImport(name="testResult")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult> testResult;

    public Input<GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult> getTestResult() {
        return this.testResult == null ? Input.empty() : this.testResult;
    }

    /**
     * The time that the test was run.
     * 
     */
    @InputImport(name="testTime")
    private final @Nullable Input<String> testTime;

    public Input<String> getTestTime() {
        return this.testTime == null ? Input.empty() : this.testTime;
    }

    public GoogleCloudDialogflowCxV3beta1TestCaseResultArgs(
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> conversationTurns,
        @Nullable Input<String> environment,
        @Nullable Input<String> name,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult> testResult,
        @Nullable Input<String> testTime) {
        this.conversationTurns = conversationTurns;
        this.environment = environment;
        this.name = name;
        this.testResult = testResult;
        this.testTime = testTime;
    }

    private GoogleCloudDialogflowCxV3beta1TestCaseResultArgs() {
        this.conversationTurns = Input.empty();
        this.environment = Input.empty();
        this.name = Input.empty();
        this.testResult = Input.empty();
        this.testTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TestCaseResultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> conversationTurns;
        private @Nullable Input<String> environment;
        private @Nullable Input<String> name;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult> testResult;
        private @Nullable Input<String> testTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TestCaseResultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationTurns = defaults.conversationTurns;
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.testResult = defaults.testResult;
    	      this.testTime = defaults.testTime;
        }

        public Builder setConversationTurns(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> conversationTurns) {
            this.conversationTurns = conversationTurns;
            return this;
        }

        public Builder setConversationTurns(@Nullable List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs> conversationTurns) {
            this.conversationTurns = Input.ofNullable(conversationTurns);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTestResult(@Nullable Input<GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult> testResult) {
            this.testResult = testResult;
            return this;
        }

        public Builder setTestResult(@Nullable GoogleCloudDialogflowCxV3beta1TestCaseResultTestResult testResult) {
            this.testResult = Input.ofNullable(testResult);
            return this;
        }

        public Builder setTestTime(@Nullable Input<String> testTime) {
            this.testTime = testTime;
            return this;
        }

        public Builder setTestTime(@Nullable String testTime) {
            this.testTime = Input.ofNullable(testTime);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1TestCaseResultArgs build() {
            return new GoogleCloudDialogflowCxV3beta1TestCaseResultArgs(conversationTurns, environment, name, testResult, testTime);
        }
    }
}
