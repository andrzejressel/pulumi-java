// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DockerImagePlatformResponse {
    /**
     * The OS type the Environment.
     * 
     */
    private final @Nullable String operatingSystemType;

    @OutputCustomType.Constructor
    private DockerImagePlatformResponse(@OutputCustomType.Parameter("operatingSystemType") @Nullable String operatingSystemType) {
        this.operatingSystemType = operatingSystemType;
    }

    /**
     * The OS type the Environment.
     * 
    */
    public Optional<String> getOperatingSystemType() {
        return Optional.ofNullable(this.operatingSystemType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerImagePlatformResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operatingSystemType;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerImagePlatformResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatingSystemType = defaults.operatingSystemType;
        }

        public Builder setOperatingSystemType(@Nullable String operatingSystemType) {
            this.operatingSystemType = operatingSystemType;
            return this;
        }
        public DockerImagePlatformResponse build() {
            return new DockerImagePlatformResponse(operatingSystemType);
        }
    }
}
