// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserPropertyResponse {
    /**
     * User property name.
     * 
     */
    private final String name;
    /**
     * User property value. Type: string (or Expression with resultType string).
     * 
     */
    private final Object value;

    @OutputCustomType.Constructor
    private UserPropertyResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * User property name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * User property value. Type: string (or Expression with resultType string).
     * 
    */
    public Object getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public UserPropertyResponse build() {
            return new UserPropertyResponse(name, value);
        }
    }
}
