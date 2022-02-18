// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigGetArgs();

    /**
     * Specifies free-text based transformations to be applied to the dataset.
     * Structure is documented below.
     * 
     */
    @InputImport(name="infoTypeTransformations", required=true)
    private final Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs> infoTypeTransformations;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs> getInfoTypeTransformations() {
        return this.infoTypeTransformations;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigGetArgs(Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs> infoTypeTransformations) {
        this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations, "expected parameter 'infoTypeTransformations' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigGetArgs() {
        this.infoTypeTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs> infoTypeTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
        }

        public Builder setInfoTypeTransformations(Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs> infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }

        public Builder setInfoTypeTransformations(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsGetArgs infoTypeTransformations) {
            this.infoTypeTransformations = Input.of(Objects.requireNonNull(infoTypeTransformations));
            return this;
        }

        public PreventionDeidentifyTemplateDeidentifyConfigGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigGetArgs(infoTypeTransformations);
        }
    }
}
