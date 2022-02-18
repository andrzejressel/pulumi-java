// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionPerInstanceConfigPreservedStateDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionPerInstanceConfigPreservedStateDiskArgs Empty = new RegionPerInstanceConfigPreservedStateDiskArgs();

    /**
     * A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
     * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
     * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
     * deleted from the instance group.
     * Default value is `NEVER`.
     * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    @InputImport(name="deleteRule")
    private final @Nullable Input<String> deleteRule;

    public Input<String> getDeleteRule() {
        return this.deleteRule == null ? Input.empty() : this.deleteRule;
    }

    /**
     * A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The mode of the disk.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The URI of an existing persistent disk to attach under the specified device-name in the format
     * `projects/project-id/zones/zone/disks/disk-name`.
     * 
     */
    @InputImport(name="source", required=true)
    private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    public RegionPerInstanceConfigPreservedStateDiskArgs(
        @Nullable Input<String> deleteRule,
        Input<String> deviceName,
        @Nullable Input<String> mode,
        Input<String> source) {
        this.deleteRule = deleteRule;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.mode = mode;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private RegionPerInstanceConfigPreservedStateDiskArgs() {
        this.deleteRule = Input.empty();
        this.deviceName = Input.empty();
        this.mode = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionPerInstanceConfigPreservedStateDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deleteRule;
        private Input<String> deviceName;
        private @Nullable Input<String> mode;
        private Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionPerInstanceConfigPreservedStateDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder setDeleteRule(@Nullable Input<String> deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }

        public Builder setDeleteRule(@Nullable String deleteRule) {
            this.deleteRule = Input.ofNullable(deleteRule);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSource(Input<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public RegionPerInstanceConfigPreservedStateDiskArgs build() {
            return new RegionPerInstanceConfigPreservedStateDiskArgs(deleteRule, deviceName, mode, source);
        }
    }
}
