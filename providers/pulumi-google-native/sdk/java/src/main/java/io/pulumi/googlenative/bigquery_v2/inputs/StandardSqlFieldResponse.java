// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.StandardSqlDataTypeResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A field or a column.
 * 
 */
public final class StandardSqlFieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final StandardSqlFieldResponse Empty = new StandardSqlFieldResponse();

    /**
     * Optional. The name of this field. Can be absent for struct fields.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Optional. The type of this parameter. Absent if not explicitly specified (e.g., CREATE FUNCTION statement can omit the return type; in this case the output parameter does not have this "type" field).
     * 
     */
    @InputImport(name="type", required=true)
    private final StandardSqlDataTypeResponse type;

    public StandardSqlDataTypeResponse getType() {
        return this.type;
    }

    public StandardSqlFieldResponse(
        String name,
        StandardSqlDataTypeResponse type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StandardSqlFieldResponse() {
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private StandardSqlDataTypeResponse type;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(StandardSqlDataTypeResponse type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public StandardSqlFieldResponse build() {
            return new StandardSqlFieldResponse(name, type);
        }
    }
}
