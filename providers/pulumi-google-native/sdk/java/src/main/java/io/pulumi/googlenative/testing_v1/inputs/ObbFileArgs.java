// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * An opaque binary blob file to install on the device before the test starts.
 * 
 */
public final class ObbFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObbFileArgs Empty = new ObbFileArgs();

    /**
     * Opaque Binary Blob (OBB) file(s) to install on the device.
     * 
     */
    @InputImport(name="obb", required=true)
    private final Input<FileReferenceArgs> obb;

    public Input<FileReferenceArgs> getObb() {
        return this.obb;
    }

    /**
     * OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
     * 
     */
    @InputImport(name="obbFileName", required=true)
    private final Input<String> obbFileName;

    public Input<String> getObbFileName() {
        return this.obbFileName;
    }

    public ObbFileArgs(
        Input<FileReferenceArgs> obb,
        Input<String> obbFileName) {
        this.obb = Objects.requireNonNull(obb, "expected parameter 'obb' to be non-null");
        this.obbFileName = Objects.requireNonNull(obbFileName, "expected parameter 'obbFileName' to be non-null");
    }

    private ObbFileArgs() {
        this.obb = Input.empty();
        this.obbFileName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObbFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FileReferenceArgs> obb;
        private Input<String> obbFileName;

        public Builder() {
    	      // Empty
        }

        public Builder(ObbFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obb = defaults.obb;
    	      this.obbFileName = defaults.obbFileName;
        }

        public Builder setObb(Input<FileReferenceArgs> obb) {
            this.obb = Objects.requireNonNull(obb);
            return this;
        }

        public Builder setObb(FileReferenceArgs obb) {
            this.obb = Input.of(Objects.requireNonNull(obb));
            return this;
        }

        public Builder setObbFileName(Input<String> obbFileName) {
            this.obbFileName = Objects.requireNonNull(obbFileName);
            return this;
        }

        public Builder setObbFileName(String obbFileName) {
            this.obbFileName = Input.of(Objects.requireNonNull(obbFileName));
            return this;
        }

        public ObbFileArgs build() {
            return new ObbFileArgs(obb, obbFileName);
        }
    }
}
