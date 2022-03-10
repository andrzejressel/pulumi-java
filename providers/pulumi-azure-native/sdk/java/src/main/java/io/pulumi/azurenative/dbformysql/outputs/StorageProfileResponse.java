// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageProfileResponse {
    /**
     * Backup retention days for the server.
     * 
     */
    private final @Nullable Integer backupRetentionDays;
    /**
     * Enable Geo-redundant or not for server backup.
     * 
     */
    private final @Nullable String geoRedundantBackup;
    /**
     * Enable Storage Auto Grow.
     * 
     */
    private final @Nullable String storageAutogrow;
    /**
     * Max storage allowed for a server.
     * 
     */
    private final @Nullable Integer storageMB;

    @OutputCustomType.Constructor
    private StorageProfileResponse(
        @OutputCustomType.Parameter("backupRetentionDays") @Nullable Integer backupRetentionDays,
        @OutputCustomType.Parameter("geoRedundantBackup") @Nullable String geoRedundantBackup,
        @OutputCustomType.Parameter("storageAutogrow") @Nullable String storageAutogrow,
        @OutputCustomType.Parameter("storageMB") @Nullable Integer storageMB) {
        this.backupRetentionDays = backupRetentionDays;
        this.geoRedundantBackup = geoRedundantBackup;
        this.storageAutogrow = storageAutogrow;
        this.storageMB = storageMB;
    }

    /**
     * Backup retention days for the server.
     * 
    */
    public Optional<Integer> getBackupRetentionDays() {
        return Optional.ofNullable(this.backupRetentionDays);
    }
    /**
     * Enable Geo-redundant or not for server backup.
     * 
    */
    public Optional<String> getGeoRedundantBackup() {
        return Optional.ofNullable(this.geoRedundantBackup);
    }
    /**
     * Enable Storage Auto Grow.
     * 
    */
    public Optional<String> getStorageAutogrow() {
        return Optional.ofNullable(this.storageAutogrow);
    }
    /**
     * Max storage allowed for a server.
     * 
    */
    public Optional<Integer> getStorageMB() {
        return Optional.ofNullable(this.storageMB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backupRetentionDays;
        private @Nullable String geoRedundantBackup;
        private @Nullable String storageAutogrow;
        private @Nullable Integer storageMB;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionDays = defaults.backupRetentionDays;
    	      this.geoRedundantBackup = defaults.geoRedundantBackup;
    	      this.storageAutogrow = defaults.storageAutogrow;
    	      this.storageMB = defaults.storageMB;
        }

        public Builder setBackupRetentionDays(@Nullable Integer backupRetentionDays) {
            this.backupRetentionDays = backupRetentionDays;
            return this;
        }

        public Builder setGeoRedundantBackup(@Nullable String geoRedundantBackup) {
            this.geoRedundantBackup = geoRedundantBackup;
            return this;
        }

        public Builder setStorageAutogrow(@Nullable String storageAutogrow) {
            this.storageAutogrow = storageAutogrow;
            return this;
        }

        public Builder setStorageMB(@Nullable Integer storageMB) {
            this.storageMB = storageMB;
            return this;
        }
        public StorageProfileResponse build() {
            return new StorageProfileResponse(backupRetentionDays, geoRedundantBackup, storageAutogrow, storageMB);
        }
    }
}
