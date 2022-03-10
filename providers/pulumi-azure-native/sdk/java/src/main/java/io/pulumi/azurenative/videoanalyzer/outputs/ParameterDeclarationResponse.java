// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterDeclarationResponse {
    /**
     * The default value for the parameter to be used if the pipeline does not specify a value.
     * 
     */
    private final @Nullable String $default;
    /**
     * Description of the parameter.
     * 
     */
    private final @Nullable String description;
    /**
     * Name of the parameter.
     * 
     */
    private final String name;
    /**
     * Type of the parameter.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ParameterDeclarationResponse(
        @OutputCustomType.Parameter("default") @Nullable String $default,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type) {
        this.$default = $default;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    /**
     * The default value for the parameter to be used if the pipeline does not specify a value.
     * 
    */
    public Optional<String> get$default() {
        return Optional.ofNullable(this.$default);
    }
    /**
     * Description of the parameter.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Name of the parameter.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of the parameter.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDeclarationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String $default;
        private @Nullable String description;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDeclarationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder set$default(@Nullable String $default) {
            this.$default = $default;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ParameterDeclarationResponse build() {
            return new ParameterDeclarationResponse($default, description, name, type);
        }
    }
}
