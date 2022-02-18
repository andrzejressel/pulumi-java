// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VariableState extends io.pulumi.resources.ResourceArgs {

    public static final VariableState Empty = new VariableState();

    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     * 
     */
    @InputImport(name="parent")
    private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     * 
     */
    @InputImport(name="text")
    private final @Nullable Input<String> text;

    public Input<String> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: "2016-10-09T12:33:37.578138407Z".
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public VariableState(
        @Nullable Input<String> name,
        @Nullable Input<String> parent,
        @Nullable Input<String> project,
        @Nullable Input<String> text,
        @Nullable Input<String> updateTime,
        @Nullable Input<String> value) {
        this.name = name;
        this.parent = parent;
        this.project = project;
        this.text = text;
        this.updateTime = updateTime;
        this.value = value;
    }

    private VariableState() {
        this.name = Input.empty();
        this.parent = Input.empty();
        this.project = Input.empty();
        this.text = Input.empty();
        this.updateTime = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> project;
        private @Nullable Input<String> text;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VariableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
    	      this.text = defaults.text;
    	      this.updateTime = defaults.updateTime;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setText(@Nullable Input<String> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable String text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public VariableState build() {
            return new VariableState(name, parent, project, text, updateTime, value);
        }
    }
}
