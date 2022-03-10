// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkspaceCustomObjectParameterResponse {
    /**
     * The type of variable that this is
     * 
     */
    private final String type;
    /**
     * The value which should be used for this field.
     * 
     */
    private final Object value;

    @OutputCustomType.Constructor
    private WorkspaceCustomObjectParameterResponse(
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("value") Object value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type of variable that this is
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The value which should be used for this field.
     * 
    */
    public Object getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomObjectParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomObjectParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public WorkspaceCustomObjectParameterResponse build() {
            return new WorkspaceCustomObjectParameterResponse(type, value);
        }
    }
}
