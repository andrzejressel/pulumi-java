// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StandardAppVersionDeploymentZip {
    /**
     * files count
     * 
     */
    private final @Nullable Integer filesCount;
    /**
     * Source URL
     * 
     */
    private final String sourceUrl;

    @OutputCustomType.Constructor({"filesCount","sourceUrl"})
    private StandardAppVersionDeploymentZip(
        @Nullable Integer filesCount,
        String sourceUrl) {
        this.filesCount = filesCount;
        this.sourceUrl = Objects.requireNonNull(sourceUrl);
    }

    /**
     * files count
     * 
     */
    public Optional<Integer> getFilesCount() {
        return Optional.ofNullable(this.filesCount);
    }
    /**
     * Source URL
     * 
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionDeploymentZip defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer filesCount;
        private String sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionDeploymentZip defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder setFilesCount(@Nullable Integer filesCount) {
            this.filesCount = filesCount;
            return this;
        }

        public Builder setSourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }

        public StandardAppVersionDeploymentZip build() {
            return new StandardAppVersionDeploymentZip(filesCount, sourceUrl);
        }
    }
}
