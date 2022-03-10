// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RGitHubPackageResponseResponse {
    /**
     * Repository address in the format username/repo[/subdir][@ref|#pull].
     * 
     */
    private final @Nullable String repository;

    @OutputCustomType.Constructor
    private RGitHubPackageResponseResponse(@OutputCustomType.Parameter("repository") @Nullable String repository) {
        this.repository = repository;
    }

    /**
     * Repository address in the format username/repo[/subdir][@ref|#pull].
     * 
    */
    public Optional<String> getRepository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RGitHubPackageResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RGitHubPackageResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }
        public RGitHubPackageResponseResponse build() {
            return new RGitHubPackageResponseResponse(repository);
        }
    }
}
