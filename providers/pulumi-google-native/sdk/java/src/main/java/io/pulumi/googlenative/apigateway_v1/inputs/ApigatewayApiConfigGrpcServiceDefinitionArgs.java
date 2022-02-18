// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigFileArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A gRPC service definition.
 * 
 */
public final class ApigatewayApiConfigGrpcServiceDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApigatewayApiConfigGrpcServiceDefinitionArgs Empty = new ApigatewayApiConfigGrpcServiceDefinitionArgs();

    /**
     * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
     * 
     */
    @InputImport(name="fileDescriptorSet")
    private final @Nullable Input<ApigatewayApiConfigFileArgs> fileDescriptorSet;

    public Input<ApigatewayApiConfigFileArgs> getFileDescriptorSet() {
        return this.fileDescriptorSet == null ? Input.empty() : this.fileDescriptorSet;
    }

    /**
     * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to 'protoc' command used to generate file_descriptor_set.
     * 
     */
    @InputImport(name="source")
    private final @Nullable Input<List<ApigatewayApiConfigFileArgs>> source;

    public Input<List<ApigatewayApiConfigFileArgs>> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public ApigatewayApiConfigGrpcServiceDefinitionArgs(
        @Nullable Input<ApigatewayApiConfigFileArgs> fileDescriptorSet,
        @Nullable Input<List<ApigatewayApiConfigFileArgs>> source) {
        this.fileDescriptorSet = fileDescriptorSet;
        this.source = source;
    }

    private ApigatewayApiConfigGrpcServiceDefinitionArgs() {
        this.fileDescriptorSet = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigGrpcServiceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApigatewayApiConfigFileArgs> fileDescriptorSet;
        private @Nullable Input<List<ApigatewayApiConfigFileArgs>> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigGrpcServiceDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileDescriptorSet = defaults.fileDescriptorSet;
    	      this.source = defaults.source;
        }

        public Builder setFileDescriptorSet(@Nullable Input<ApigatewayApiConfigFileArgs> fileDescriptorSet) {
            this.fileDescriptorSet = fileDescriptorSet;
            return this;
        }

        public Builder setFileDescriptorSet(@Nullable ApigatewayApiConfigFileArgs fileDescriptorSet) {
            this.fileDescriptorSet = Input.ofNullable(fileDescriptorSet);
            return this;
        }

        public Builder setSource(@Nullable Input<List<ApigatewayApiConfigFileArgs>> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable List<ApigatewayApiConfigFileArgs> source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public ApigatewayApiConfigGrpcServiceDefinitionArgs build() {
            return new ApigatewayApiConfigGrpcServiceDefinitionArgs(fileDescriptorSet, source);
        }
    }
}
