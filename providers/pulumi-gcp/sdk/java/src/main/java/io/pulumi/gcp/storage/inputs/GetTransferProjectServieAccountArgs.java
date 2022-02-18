// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransferProjectServieAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransferProjectServieAccountArgs Empty = new GetTransferProjectServieAccountArgs();

    /**
     * The project ID. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetTransferProjectServieAccountArgs(@Nullable String project) {
        this.project = project;
    }

    private GetTransferProjectServieAccountArgs() {
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransferProjectServieAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransferProjectServieAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetTransferProjectServieAccountArgs build() {
            return new GetTransferProjectServieAccountArgs(project);
        }
    }
}
