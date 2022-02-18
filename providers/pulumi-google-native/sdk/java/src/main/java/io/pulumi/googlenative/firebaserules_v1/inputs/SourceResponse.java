// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.firebaserules_v1.inputs.FileResponse;
import java.util.List;
import java.util.Objects;


/**
 * `Source` is one or more `File` messages comprising a logical set of rules.
 * 
 */
public final class SourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * `File` set constituting the `Source` bundle.
     * 
     */
    @InputImport(name="files", required=true)
    private final List<FileResponse> files;

    public List<FileResponse> getFiles() {
        return this.files;
    }

    public SourceResponse(List<FileResponse> files) {
        this.files = Objects.requireNonNull(files, "expected parameter 'files' to be non-null");
    }

    private SourceResponse() {
        this.files = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileResponse> files;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
        }

        public Builder setFiles(List<FileResponse> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }

        public SourceResponse build() {
            return new SourceResponse(files);
        }
    }
}
