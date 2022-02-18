// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * RelationshipNote represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 * 
 */
public final class RelationshipNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final RelationshipNoteResponse Empty = new RelationshipNoteResponse();

    /**
     * The type of relationship between the source and target SPDX elements
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public RelationshipNoteResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RelationshipNoteResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RelationshipNoteResponse build() {
            return new RelationshipNoteResponse(type);
        }
    }
}
