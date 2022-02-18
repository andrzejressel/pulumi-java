// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A reference to a file, used for user inputs.
 * 
 */
public final class FileReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileReferenceArgs Empty = new FileReferenceArgs();

    /**
     * A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding)
     * 
     */
    @InputImport(name="gcsPath")
    private final @Nullable Input<String> gcsPath;

    public Input<String> getGcsPath() {
        return this.gcsPath == null ? Input.empty() : this.gcsPath;
    }

    public FileReferenceArgs(@Nullable Input<String> gcsPath) {
        this.gcsPath = gcsPath;
    }

    private FileReferenceArgs() {
        this.gcsPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> gcsPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
        }

        public Builder setGcsPath(@Nullable Input<String> gcsPath) {
            this.gcsPath = gcsPath;
            return this;
        }

        public Builder setGcsPath(@Nullable String gcsPath) {
            this.gcsPath = Input.ofNullable(gcsPath);
            return this;
        }

        public FileReferenceArgs build() {
            return new FileReferenceArgs(gcsPath);
        }
    }
}
