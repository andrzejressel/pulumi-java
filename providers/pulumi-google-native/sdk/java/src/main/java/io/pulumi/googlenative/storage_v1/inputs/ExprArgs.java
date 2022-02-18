// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an expression text. Example: title: "User account presence" description: "Determines whether the request has a user account" expression: "size(request.user) > 0"
 * 
 */
public final class ExprArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExprArgs Empty = new ExprArgs();

    /**
     * An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax. The application context of the containing message determines which well-known feature set of CEL is supported.
     * 
     */
    @InputImport(name="expression")
    private final @Nullable Input<String> expression;

    public Input<String> getExpression() {
        return this.expression == null ? Input.empty() : this.expression;
    }

    /**
     * An optional string indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * An optional title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public ExprArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> expression,
        @Nullable Input<String> location,
        @Nullable Input<String> title) {
        this.description = description;
        this.expression = expression;
        this.location = location;
        this.title = title;
    }

    private ExprArgs() {
        this.description = Input.empty();
        this.expression = Input.empty();
        this.location = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> expression;
        private @Nullable Input<String> location;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(ExprArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpression(@Nullable Input<String> expression) {
            this.expression = expression;
            return this;
        }

        public Builder setExpression(@Nullable String expression) {
            this.expression = Input.ofNullable(expression);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public ExprArgs build() {
            return new ExprArgs(description, expression, location, title);
        }
    }
}
