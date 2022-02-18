// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs Empty = new FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs();

    /**
     * The depth for all recursive structures in the output analytics schema. For example, concept in the CodeSystem
     * resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called
     * concept.concept but not concept.concept.concept. If not specified or set to 0, the server will use the default
     * value 2. The maximum depth allowed is 5.
     * 
     */
    @InputImport(name="recursiveStructureDepth", required=true)
    private final Input<Integer> recursiveStructureDepth;

    public Input<Integer> getRecursiveStructureDepth() {
        return this.recursiveStructureDepth;
    }

    /**
     * Specifies the output schema type. Only ANALYTICS is supported at this time.
     * * ANALYTICS: Analytics schema defined by the FHIR community.
     *   See https://github.com/FHIR/sql-on-fhir/blob/master/sql-on-fhir.md.
     *   Default value is `ANALYTICS`.
     *   Possible values are `ANALYTICS`.
     * 
     */
    @InputImport(name="schemaType")
    private final @Nullable Input<String> schemaType;

    public Input<String> getSchemaType() {
        return this.schemaType == null ? Input.empty() : this.schemaType;
    }

    public FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs(
        Input<Integer> recursiveStructureDepth,
        @Nullable Input<String> schemaType) {
        this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth, "expected parameter 'recursiveStructureDepth' to be non-null");
        this.schemaType = schemaType;
    }

    private FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs() {
        this.recursiveStructureDepth = Input.empty();
        this.schemaType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> recursiveStructureDepth;
        private @Nullable Input<String> schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder setRecursiveStructureDepth(Input<Integer> recursiveStructureDepth) {
            this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth);
            return this;
        }

        public Builder setRecursiveStructureDepth(Integer recursiveStructureDepth) {
            this.recursiveStructureDepth = Input.of(Objects.requireNonNull(recursiveStructureDepth));
            return this;
        }

        public Builder setSchemaType(@Nullable Input<String> schemaType) {
            this.schemaType = schemaType;
            return this;
        }

        public Builder setSchemaType(@Nullable String schemaType) {
            this.schemaType = Input.ofNullable(schemaType);
            return this;
        }

        public FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs build() {
            return new FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs(recursiveStructureDepth, schemaType);
        }
    }
}
