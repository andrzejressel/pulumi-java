// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefaultObjectAccessControlProjectTeam {
    private final @Nullable String projectNumber;
    private final @Nullable String team;

    @OutputCustomType.Constructor({"projectNumber","team"})
    private DefaultObjectAccessControlProjectTeam(
        @Nullable String projectNumber,
        @Nullable String team) {
        this.projectNumber = projectNumber;
        this.team = team;
    }

    public Optional<String> getProjectNumber() {
        return Optional.ofNullable(this.projectNumber);
    }
    public Optional<String> getTeam() {
        return Optional.ofNullable(this.team);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectAccessControlProjectTeam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String projectNumber;
        private @Nullable String team;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectAccessControlProjectTeam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder setProjectNumber(@Nullable String projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }

        public Builder setTeam(@Nullable String team) {
            this.team = team;
            return this;
        }

        public DefaultObjectAccessControlProjectTeam build() {
            return new DefaultObjectAccessControlProjectTeam(projectNumber, team);
        }
    }
}
