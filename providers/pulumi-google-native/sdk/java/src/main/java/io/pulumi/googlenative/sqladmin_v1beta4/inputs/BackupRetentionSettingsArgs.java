// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.BackupRetentionSettingsRetentionUnit;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * We currently only support backup retention by specifying the number of backups we will retain.
 * 
 */
public final class BackupRetentionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupRetentionSettingsArgs Empty = new BackupRetentionSettingsArgs();

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
     * 
     */
    @InputImport(name="retainedBackups")
    private final @Nullable Input<Integer> retainedBackups;

    public Input<Integer> getRetainedBackups() {
        return this.retainedBackups == null ? Input.empty() : this.retainedBackups;
    }

    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    @InputImport(name="retentionUnit")
    private final @Nullable Input<BackupRetentionSettingsRetentionUnit> retentionUnit;

    public Input<BackupRetentionSettingsRetentionUnit> getRetentionUnit() {
        return this.retentionUnit == null ? Input.empty() : this.retentionUnit;
    }

    public BackupRetentionSettingsArgs(
        @Nullable Input<Integer> retainedBackups,
        @Nullable Input<BackupRetentionSettingsRetentionUnit> retentionUnit) {
        this.retainedBackups = retainedBackups;
        this.retentionUnit = retentionUnit;
    }

    private BackupRetentionSettingsArgs() {
        this.retainedBackups = Input.empty();
        this.retentionUnit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupRetentionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> retainedBackups;
        private @Nullable Input<BackupRetentionSettingsRetentionUnit> retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupRetentionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder setRetainedBackups(@Nullable Input<Integer> retainedBackups) {
            this.retainedBackups = retainedBackups;
            return this;
        }

        public Builder setRetainedBackups(@Nullable Integer retainedBackups) {
            this.retainedBackups = Input.ofNullable(retainedBackups);
            return this;
        }

        public Builder setRetentionUnit(@Nullable Input<BackupRetentionSettingsRetentionUnit> retentionUnit) {
            this.retentionUnit = retentionUnit;
            return this;
        }

        public Builder setRetentionUnit(@Nullable BackupRetentionSettingsRetentionUnit retentionUnit) {
            this.retentionUnit = Input.ofNullable(retentionUnit);
            return this;
        }

        public BackupRetentionSettingsArgs build() {
            return new BackupRetentionSettingsArgs(retainedBackups, retentionUnit);
        }
    }
}
