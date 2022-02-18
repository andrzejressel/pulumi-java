// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Dialogflow contexts are similar to natural language context. If a person says to you "they are orange", you need context in order to understand what "they" is referring to. Similarly, for Dialogflow to handle an end-user expression like that, it needs to be provided with context in order to correctly match an intent. Using contexts, you can control the flow of a conversation. You can configure contexts for an intent by setting input and output contexts, which are identified by string names. When an intent is matched, any configured output contexts for that intent become active. While any contexts are active, Dialogflow is more likely to match intents that are configured with input contexts that correspond to the currently active contexts. For more information about context, see the [Contexts guide](https://cloud.google.com/dialogflow/docs/contexts-overview).
 * 
 */
public final class GoogleCloudDialogflowV2ContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2ContextArgs Empty = new GoogleCloudDialogflowV2ContextArgs();

    /**
     * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire automatically after 20 minutes if there are no matching queries.
     * 
     */
    @InputImport(name="lifespanCount")
    private final @Nullable Input<Integer> lifespanCount;

    public Input<Integer> getLifespanCount() {
        return this.lifespanCount == null ? Input.empty() : this.lifespanCount;
    }

    /**
     * The unique identifier of the context. Format: `projects//agent/sessions//contexts/`, or `projects//agent/environments//users//sessions//contexts/`. The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter's entity type is a composite entity: map from composite entity property names to property values - Else: parameter value
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public GoogleCloudDialogflowV2ContextArgs(
        @Nullable Input<Integer> lifespanCount,
        Input<String> name,
        @Nullable Input<Map<String,String>> parameters) {
        this.lifespanCount = lifespanCount;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
    }

    private GoogleCloudDialogflowV2ContextArgs() {
        this.lifespanCount = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2ContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> lifespanCount;
        private Input<String> name;
        private @Nullable Input<Map<String,String>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2ContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifespanCount = defaults.lifespanCount;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setLifespanCount(@Nullable Input<Integer> lifespanCount) {
            this.lifespanCount = lifespanCount;
            return this;
        }

        public Builder setLifespanCount(@Nullable Integer lifespanCount) {
            this.lifespanCount = Input.ofNullable(lifespanCount);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public GoogleCloudDialogflowV2ContextArgs build() {
            return new GoogleCloudDialogflowV2ContextArgs(lifespanCount, name, parameters);
        }
    }
}
