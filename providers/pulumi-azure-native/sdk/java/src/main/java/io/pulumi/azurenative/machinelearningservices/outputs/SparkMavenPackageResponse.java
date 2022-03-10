// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SparkMavenPackageResponse {
    private final @Nullable String artifact;
    private final @Nullable String group;
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private SparkMavenPackageResponse(
        @OutputCustomType.Parameter("artifact") @Nullable String artifact,
        @OutputCustomType.Parameter("group") @Nullable String group,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.artifact = artifact;
        this.group = group;
        this.version = version;
    }

    public Optional<String> getArtifact() {
        return Optional.ofNullable(this.artifact);
    }
    public Optional<String> getGroup() {
        return Optional.ofNullable(this.group);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkMavenPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String artifact;
        private @Nullable String group;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkMavenPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifact = defaults.artifact;
    	      this.group = defaults.group;
    	      this.version = defaults.version;
        }

        public Builder setArtifact(@Nullable String artifact) {
            this.artifact = artifact;
            return this;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = group;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public SparkMavenPackageResponse build() {
            return new SparkMavenPackageResponse(artifact, group, version);
        }
    }
}
