// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScriptActionResponse {
    /**
     * The user provided name of the script action.
     * 
     */
    private final String name;
    /**
     * The parameters for the script action.
     * 
     */
    private final @Nullable String parameters;
    /**
     * The node types on which the script action should be executed.
     * 
     */
    private final Object roles;
    /**
     * The URI for the script action.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor
    private ScriptActionResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") @Nullable String parameters,
        @OutputCustomType.Parameter("roles") Object roles,
        @OutputCustomType.Parameter("uri") String uri) {
        this.name = name;
        this.parameters = parameters;
        this.roles = roles;
        this.uri = uri;
    }

    /**
     * The user provided name of the script action.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parameters for the script action.
     * 
    */
    public Optional<String> getParameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * The node types on which the script action should be executed.
     * 
    */
    public Object getRoles() {
        return this.roles;
    }
    /**
     * The URI for the script action.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String parameters;
        private Object roles;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.roles = defaults.roles;
    	      this.uri = defaults.uri;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setRoles(Object roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ScriptActionResponse build() {
            return new ScriptActionResponse(name, parameters, roles, uri);
        }
    }
}
