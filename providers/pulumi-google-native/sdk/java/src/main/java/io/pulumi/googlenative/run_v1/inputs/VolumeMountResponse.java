// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * VolumeMount describes a mounting of a Volume within a container.
 * 
 */
public final class VolumeMountResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeMountResponse Empty = new VolumeMountResponse();

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'.
     * 
     */
    @InputImport(name="mountPath", required=true)
    private final String mountPath;

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * (Optional) Only true is accepted. Defaults to true.
     * 
     */
    @InputImport(name="readOnly", required=true)
    private final Boolean readOnly;

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * (Optional) Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     * 
     */
    @InputImport(name="subPath", required=true)
    private final String subPath;

    public String getSubPath() {
        return this.subPath;
    }

    public VolumeMountResponse(
        String mountPath,
        String name,
        Boolean readOnly,
        String subPath) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = Objects.requireNonNull(readOnly, "expected parameter 'readOnly' to be non-null");
        this.subPath = Objects.requireNonNull(subPath, "expected parameter 'subPath' to be non-null");
    }

    private VolumeMountResponse() {
        this.mountPath = null;
        this.name = null;
        this.readOnly = null;
        this.subPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;
        private Boolean readOnly;
        private String subPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }

        public Builder setSubPath(String subPath) {
            this.subPath = Objects.requireNonNull(subPath);
            return this;
        }

        public VolumeMountResponse build() {
            return new VolumeMountResponse(mountPath, name, readOnly, subPath);
        }
    }
}
