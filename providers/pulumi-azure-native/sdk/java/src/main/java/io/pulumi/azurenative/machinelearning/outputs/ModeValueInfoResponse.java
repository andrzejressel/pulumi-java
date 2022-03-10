// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.ModuleAssetParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModeValueInfoResponse {
    /**
     * The interface string name for the nested parameter.
     * 
     */
    private final @Nullable String interfaceString;
    /**
     * The definition of the parameter.
     * 
     */
    private final @Nullable List<ModuleAssetParameterResponse> parameters;

    @OutputCustomType.Constructor
    private ModeValueInfoResponse(
        @OutputCustomType.Parameter("interfaceString") @Nullable String interfaceString,
        @OutputCustomType.Parameter("parameters") @Nullable List<ModuleAssetParameterResponse> parameters) {
        this.interfaceString = interfaceString;
        this.parameters = parameters;
    }

    /**
     * The interface string name for the nested parameter.
     * 
    */
    public Optional<String> getInterfaceString() {
        return Optional.ofNullable(this.interfaceString);
    }
    /**
     * The definition of the parameter.
     * 
    */
    public List<ModuleAssetParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModeValueInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String interfaceString;
        private @Nullable List<ModuleAssetParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ModeValueInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interfaceString = defaults.interfaceString;
    	      this.parameters = defaults.parameters;
        }

        public Builder setInterfaceString(@Nullable String interfaceString) {
            this.interfaceString = interfaceString;
            return this;
        }

        public Builder setParameters(@Nullable List<ModuleAssetParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public ModeValueInfoResponse build() {
            return new ModeValueInfoResponse(interfaceString, parameters);
        }
    }
}
