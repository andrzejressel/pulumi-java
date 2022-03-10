// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceInputsResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceOutputColumnResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureMachineLearningWebServiceFunctionBindingResponse {
    /**
     * The API key used to authenticate with Request-Response endpoint.
     * 
     */
    private final @Nullable String apiKey;
    /**
     * Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
     */
    private final @Nullable Integer batchSize;
    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
     */
    private final @Nullable String endpoint;
    /**
     * The inputs for the Azure Machine Learning web service endpoint.
     * 
     */
    private final @Nullable AzureMachineLearningWebServiceInputsResponse inputs;
    /**
     * A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     */
    private final @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs;
    /**
     * Indicates the function binding type.
     * Expected value is 'Microsoft.MachineLearning/WebService'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private AzureMachineLearningWebServiceFunctionBindingResponse(
        @OutputCustomType.Parameter("apiKey") @Nullable String apiKey,
        @OutputCustomType.Parameter("batchSize") @Nullable Integer batchSize,
        @OutputCustomType.Parameter("endpoint") @Nullable String endpoint,
        @OutputCustomType.Parameter("inputs") @Nullable AzureMachineLearningWebServiceInputsResponse inputs,
        @OutputCustomType.Parameter("outputs") @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs,
        @OutputCustomType.Parameter("type") String type) {
        this.apiKey = apiKey;
        this.batchSize = batchSize;
        this.endpoint = endpoint;
        this.inputs = inputs;
        this.outputs = outputs;
        this.type = type;
    }

    /**
     * The API key used to authenticate with Request-Response endpoint.
     * 
    */
    public Optional<String> getApiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
    */
    public Optional<Integer> getBatchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
    */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * The inputs for the Azure Machine Learning web service endpoint.
     * 
    */
    public Optional<AzureMachineLearningWebServiceInputsResponse> getInputs() {
        return Optional.ofNullable(this.inputs);
    }
    /**
     * A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
    */
    public List<AzureMachineLearningWebServiceOutputColumnResponse> getOutputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * Indicates the function binding type.
     * Expected value is 'Microsoft.MachineLearning/WebService'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceFunctionBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable Integer batchSize;
        private @Nullable String endpoint;
        private @Nullable AzureMachineLearningWebServiceInputsResponse inputs;
        private @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceFunctionBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.batchSize = defaults.batchSize;
    	      this.endpoint = defaults.endpoint;
    	      this.inputs = defaults.inputs;
    	      this.outputs = defaults.outputs;
    	      this.type = defaults.type;
        }

        public Builder setApiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setInputs(@Nullable AzureMachineLearningWebServiceInputsResponse inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setOutputs(@Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureMachineLearningWebServiceFunctionBindingResponse build() {
            return new AzureMachineLearningWebServiceFunctionBindingResponse(apiKey, batchSize, endpoint, inputs, outputs, type);
        }
    }
}
