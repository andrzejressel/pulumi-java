// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The entrypoint for the application.
 * 
 */
public final class EntrypointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntrypointArgs Empty = new EntrypointArgs();

    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
     */
    @InputImport(name="shell")
    private final @Nullable Input<String> shell;

    public Input<String> getShell() {
        return this.shell == null ? Input.empty() : this.shell;
    }

    public EntrypointArgs(@Nullable Input<String> shell) {
        this.shell = shell;
    }

    private EntrypointArgs() {
        this.shell = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntrypointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> shell;

        public Builder() {
    	      // Empty
        }

        public Builder(EntrypointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shell = defaults.shell;
        }

        public Builder setShell(@Nullable Input<String> shell) {
            this.shell = shell;
            return this;
        }

        public Builder setShell(@Nullable String shell) {
            this.shell = Input.ofNullable(shell);
            return this;
        }

        public EntrypointArgs build() {
            return new EntrypointArgs(shell);
        }
    }
}
