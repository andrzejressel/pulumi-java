// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormArgs Empty = new CxPageFormArgs();

    /**
     * Parameters to collect from the user.
     * Structure is documented below.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<List<CxPageFormParameterArgs>> parameters;

    public Input<List<CxPageFormParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public CxPageFormArgs(@Nullable Input<List<CxPageFormParameterArgs>> parameters) {
        this.parameters = parameters;
    }

    private CxPageFormArgs() {
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CxPageFormParameterArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        public Builder setParameters(@Nullable Input<List<CxPageFormParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<CxPageFormParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public CxPageFormArgs build() {
            return new CxPageFormArgs(parameters);
        }
    }
}
