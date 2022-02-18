// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.file_v1.inputs.NfsExportOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * File share configuration for the instance.
 * 
 */
public final class FileShareConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileShareConfigArgs Empty = new FileShareConfigArgs();

    /**
     * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
     * 
     */
    @InputImport(name="capacityGb")
    private final @Nullable Input<String> capacityGb;

    public Input<String> getCapacityGb() {
        return this.capacityGb == null ? Input.empty() : this.capacityGb;
    }

    /**
     * The name of the file share (must be 16 characters or less).
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Nfs Export Options. There is a limit of 10 export options per file share.
     * 
     */
    @InputImport(name="nfsExportOptions")
    private final @Nullable Input<List<NfsExportOptionsArgs>> nfsExportOptions;

    public Input<List<NfsExportOptionsArgs>> getNfsExportOptions() {
        return this.nfsExportOptions == null ? Input.empty() : this.nfsExportOptions;
    }

    /**
     * The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share has been restored from.
     * 
     */
    @InputImport(name="sourceBackup")
    private final @Nullable Input<String> sourceBackup;

    public Input<String> getSourceBackup() {
        return this.sourceBackup == null ? Input.empty() : this.sourceBackup;
    }

    public FileShareConfigArgs(
        @Nullable Input<String> capacityGb,
        @Nullable Input<String> name,
        @Nullable Input<List<NfsExportOptionsArgs>> nfsExportOptions,
        @Nullable Input<String> sourceBackup) {
        this.capacityGb = capacityGb;
        this.name = name;
        this.nfsExportOptions = nfsExportOptions;
        this.sourceBackup = sourceBackup;
    }

    private FileShareConfigArgs() {
        this.capacityGb = Input.empty();
        this.name = Input.empty();
        this.nfsExportOptions = Input.empty();
        this.sourceBackup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileShareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> capacityGb;
        private @Nullable Input<String> name;
        private @Nullable Input<List<NfsExportOptionsArgs>> nfsExportOptions;
        private @Nullable Input<String> sourceBackup;

        public Builder() {
    	      // Empty
        }

        public Builder(FileShareConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityGb = defaults.capacityGb;
    	      this.name = defaults.name;
    	      this.nfsExportOptions = defaults.nfsExportOptions;
    	      this.sourceBackup = defaults.sourceBackup;
        }

        public Builder setCapacityGb(@Nullable Input<String> capacityGb) {
            this.capacityGb = capacityGb;
            return this;
        }

        public Builder setCapacityGb(@Nullable String capacityGb) {
            this.capacityGb = Input.ofNullable(capacityGb);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNfsExportOptions(@Nullable Input<List<NfsExportOptionsArgs>> nfsExportOptions) {
            this.nfsExportOptions = nfsExportOptions;
            return this;
        }

        public Builder setNfsExportOptions(@Nullable List<NfsExportOptionsArgs> nfsExportOptions) {
            this.nfsExportOptions = Input.ofNullable(nfsExportOptions);
            return this;
        }

        public Builder setSourceBackup(@Nullable Input<String> sourceBackup) {
            this.sourceBackup = sourceBackup;
            return this;
        }

        public Builder setSourceBackup(@Nullable String sourceBackup) {
            this.sourceBackup = Input.ofNullable(sourceBackup);
            return this;
        }

        public FileShareConfigArgs build() {
            return new FileShareConfigArgs(capacityGb, name, nfsExportOptions, sourceBackup);
        }
    }
}
