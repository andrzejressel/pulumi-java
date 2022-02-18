// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseInstanceSettingBackupConfiguration {
    private final List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings;
    private final Boolean binaryLogEnabled;
    private final Boolean enabled;
    private final String location;
    private final Boolean pointInTimeRecoveryEnabled;
    private final String startTime;
    private final Integer transactionLogRetentionDays;

    @OutputCustomType.Constructor({"backupRetentionSettings","binaryLogEnabled","enabled","location","pointInTimeRecoveryEnabled","startTime","transactionLogRetentionDays"})
    private GetDatabaseInstanceSettingBackupConfiguration(
        List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings,
        Boolean binaryLogEnabled,
        Boolean enabled,
        String location,
        Boolean pointInTimeRecoveryEnabled,
        String startTime,
        Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
        this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
        this.enabled = Objects.requireNonNull(enabled);
        this.location = Objects.requireNonNull(location);
        this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
        this.startTime = Objects.requireNonNull(startTime);
        this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
    }

    public List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> getBackupRetentionSettings() {
        return this.backupRetentionSettings;
    }
    public Boolean getBinaryLogEnabled() {
        return this.binaryLogEnabled;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getLocation() {
        return this.location;
    }
    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public Integer getTransactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingBackupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings;
        private Boolean binaryLogEnabled;
        private Boolean enabled;
        private String location;
        private Boolean pointInTimeRecoveryEnabled;
        private String startTime;
        private Integer transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingBackupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder setBackupRetentionSettings(List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings) {
            this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
            return this;
        }

        public Builder setBinaryLogEnabled(Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTransactionLogRetentionDays(Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
            return this;
        }

        public GetDatabaseInstanceSettingBackupConfiguration build() {
            return new GetDatabaseInstanceSettingBackupConfiguration(backupRetentionSettings, binaryLogEnabled, enabled, location, pointInTimeRecoveryEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
