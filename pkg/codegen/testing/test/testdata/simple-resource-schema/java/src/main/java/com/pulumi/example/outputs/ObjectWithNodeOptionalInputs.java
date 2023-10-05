// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectWithNodeOptionalInputs {
    private @Nullable Integer bar;
    private String foo;

    private ObjectWithNodeOptionalInputs() {}
    public Optional<Integer> bar() {
        return Optional.ofNullable(this.bar);
    }
    public String foo() {
        return this.foo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectWithNodeOptionalInputs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer bar;
        private String foo;
        public Builder() {}
        public Builder(ObjectWithNodeOptionalInputs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.foo = defaults.foo;
        }

        @CustomType.Setter
        public Builder bar(@Nullable Integer bar) {
            this.bar = bar;
            return this;
        }
        @CustomType.Setter
        public Builder foo(String foo) {
            this.foo = Objects.requireNonNull(foo);
            return this;
        }
        public ObjectWithNodeOptionalInputs build() {
            final var _resultValue = new ObjectWithNodeOptionalInputs();
            _resultValue.bar = bar;
            _resultValue.foo = foo;
            return _resultValue;
        }
    }
}
