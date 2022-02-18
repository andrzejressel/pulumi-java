// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration of the persistence functionality.
 * 
 */
public final class PersistenceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PersistenceConfigResponse Empty = new PersistenceConfigResponse();

    /**
     * Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    @InputImport(name="persistenceMode", required=true)
    private final String persistenceMode;

    public String getPersistenceMode() {
        return this.persistenceMode;
    }

    /**
     * The next time that a snapshot attempt is scheduled to occur.
     * 
     */
    @InputImport(name="rdbNextSnapshotTime", required=true)
    private final String rdbNextSnapshotTime;

    public String getRdbNextSnapshotTime() {
        return this.rdbNextSnapshotTime;
    }

    /**
     * Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    @InputImport(name="rdbSnapshotPeriod", required=true)
    private final String rdbSnapshotPeriod;

    public String getRdbSnapshotPeriod() {
        return this.rdbSnapshotPeriod;
    }

    /**
     * Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    @InputImport(name="rdbSnapshotStartTime", required=true)
    private final String rdbSnapshotStartTime;

    public String getRdbSnapshotStartTime() {
        return this.rdbSnapshotStartTime;
    }

    public PersistenceConfigResponse(
        String persistenceMode,
        String rdbNextSnapshotTime,
        String rdbSnapshotPeriod,
        String rdbSnapshotStartTime) {
        this.persistenceMode = Objects.requireNonNull(persistenceMode, "expected parameter 'persistenceMode' to be non-null");
        this.rdbNextSnapshotTime = Objects.requireNonNull(rdbNextSnapshotTime, "expected parameter 'rdbNextSnapshotTime' to be non-null");
        this.rdbSnapshotPeriod = Objects.requireNonNull(rdbSnapshotPeriod, "expected parameter 'rdbSnapshotPeriod' to be non-null");
        this.rdbSnapshotStartTime = Objects.requireNonNull(rdbSnapshotStartTime, "expected parameter 'rdbSnapshotStartTime' to be non-null");
    }

    private PersistenceConfigResponse() {
        this.persistenceMode = null;
        this.rdbNextSnapshotTime = null;
        this.rdbSnapshotPeriod = null;
        this.rdbSnapshotStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String persistenceMode;
        private String rdbNextSnapshotTime;
        private String rdbSnapshotPeriod;
        private String rdbSnapshotStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.persistenceMode = defaults.persistenceMode;
    	      this.rdbNextSnapshotTime = defaults.rdbNextSnapshotTime;
    	      this.rdbSnapshotPeriod = defaults.rdbSnapshotPeriod;
    	      this.rdbSnapshotStartTime = defaults.rdbSnapshotStartTime;
        }

        public Builder setPersistenceMode(String persistenceMode) {
            this.persistenceMode = Objects.requireNonNull(persistenceMode);
            return this;
        }

        public Builder setRdbNextSnapshotTime(String rdbNextSnapshotTime) {
            this.rdbNextSnapshotTime = Objects.requireNonNull(rdbNextSnapshotTime);
            return this;
        }

        public Builder setRdbSnapshotPeriod(String rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = Objects.requireNonNull(rdbSnapshotPeriod);
            return this;
        }

        public Builder setRdbSnapshotStartTime(String rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = Objects.requireNonNull(rdbSnapshotStartTime);
            return this;
        }

        public PersistenceConfigResponse build() {
            return new PersistenceConfigResponse(persistenceMode, rdbNextSnapshotTime, rdbSnapshotPeriod, rdbSnapshotStartTime);
        }
    }
}
