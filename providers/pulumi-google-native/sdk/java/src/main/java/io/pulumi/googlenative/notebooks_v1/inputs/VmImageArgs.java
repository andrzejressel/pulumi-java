// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of a custom Compute Engine virtual machine image for starting a notebook instance with the environment installed directly on the VM.
 * 
 */
public final class VmImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmImageArgs Empty = new VmImageArgs();

    /**
     * Use this VM image family to find the image; the newest image in this family will be used.
     * 
     */
    @InputImport(name="imageFamily")
    private final @Nullable Input<String> imageFamily;

    public Input<String> getImageFamily() {
        return this.imageFamily == null ? Input.empty() : this.imageFamily;
    }

    /**
     * Use VM image name to find the image.
     * 
     */
    @InputImport(name="imageName")
    private final @Nullable Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName == null ? Input.empty() : this.imageName;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to. Format: `projects/{project_id}`
     * 
     */
    @InputImport(name="project", required=true)
    private final Input<String> project;

    public Input<String> getProject() {
        return this.project;
    }

    public VmImageArgs(
        @Nullable Input<String> imageFamily,
        @Nullable Input<String> imageName,
        Input<String> project) {
        this.imageFamily = imageFamily;
        this.imageName = imageName;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private VmImageArgs() {
        this.imageFamily = Input.empty();
        this.imageName = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> imageFamily;
        private @Nullable Input<String> imageName;
        private Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(VmImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageFamily = defaults.imageFamily;
    	      this.imageName = defaults.imageName;
    	      this.project = defaults.project;
        }

        public Builder setImageFamily(@Nullable Input<String> imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }

        public Builder setImageFamily(@Nullable String imageFamily) {
            this.imageFamily = Input.ofNullable(imageFamily);
            return this;
        }

        public Builder setImageName(@Nullable Input<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = Input.ofNullable(imageName);
            return this;
        }

        public Builder setProject(Input<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }

        public VmImageArgs build() {
            return new VmImageArgs(imageFamily, imageName, project);
        }
    }
}
