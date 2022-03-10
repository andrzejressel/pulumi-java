// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EtwEventConfigurationResponse {
    private final @Nullable String filter;
    private final Integer id;
    private final String name;

    @OutputCustomType.Constructor
    private EtwEventConfigurationResponse(
        @OutputCustomType.Parameter("filter") @Nullable String filter,
        @OutputCustomType.Parameter("id") Integer id,
        @OutputCustomType.Parameter("name") String name) {
        this.filter = filter;
        this.id = id;
        this.name = name;
    }

    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    public Integer getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtwEventConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private Integer id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(EtwEventConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setId(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public EtwEventConfigurationResponse build() {
            return new EtwEventConfigurationResponse(filter, id, name);
        }
    }
}
