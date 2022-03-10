// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHybridRunbookWorkerResult {
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets the assigned machine IP address.
     * 
     */
    private final @Nullable String ip;
    /**
     * Last Heartbeat from the Worker
     * 
     */
    private final @Nullable String lastSeenDateTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the registration time of the worker machine.
     * 
     */
    private final @Nullable String registeredDateTime;
    /**
     * Resource system metadata.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Azure Resource Manager Id for a virtual machine.
     * 
     */
    private final @Nullable String vmResourceId;
    /**
     * Name of the HybridWorker.
     * 
     */
    private final @Nullable String workerName;
    /**
     * Type of the HybridWorker.
     * 
     */
    private final @Nullable String workerType;

    @OutputCustomType.Constructor
    private GetHybridRunbookWorkerResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ip") @Nullable String ip,
        @OutputCustomType.Parameter("lastSeenDateTime") @Nullable String lastSeenDateTime,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("registeredDateTime") @Nullable String registeredDateTime,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("vmResourceId") @Nullable String vmResourceId,
        @OutputCustomType.Parameter("workerName") @Nullable String workerName,
        @OutputCustomType.Parameter("workerType") @Nullable String workerType) {
        this.id = id;
        this.ip = ip;
        this.lastSeenDateTime = lastSeenDateTime;
        this.name = name;
        this.registeredDateTime = registeredDateTime;
        this.systemData = systemData;
        this.type = type;
        this.vmResourceId = vmResourceId;
        this.workerName = workerName;
        this.workerType = workerType;
    }

    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the assigned machine IP address.
     * 
    */
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * Last Heartbeat from the Worker
     * 
    */
    public Optional<String> getLastSeenDateTime() {
        return Optional.ofNullable(this.lastSeenDateTime);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the registration time of the worker machine.
     * 
    */
    public Optional<String> getRegisteredDateTime() {
        return Optional.ofNullable(this.registeredDateTime);
    }
    /**
     * Resource system metadata.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Azure Resource Manager Id for a virtual machine.
     * 
    */
    public Optional<String> getVmResourceId() {
        return Optional.ofNullable(this.vmResourceId);
    }
    /**
     * Name of the HybridWorker.
     * 
    */
    public Optional<String> getWorkerName() {
        return Optional.ofNullable(this.workerName);
    }
    /**
     * Type of the HybridWorker.
     * 
    */
    public Optional<String> getWorkerType() {
        return Optional.ofNullable(this.workerType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridRunbookWorkerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String ip;
        private @Nullable String lastSeenDateTime;
        private String name;
        private @Nullable String registeredDateTime;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String vmResourceId;
        private @Nullable String workerName;
        private @Nullable String workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridRunbookWorkerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.lastSeenDateTime = defaults.lastSeenDateTime;
    	      this.name = defaults.name;
    	      this.registeredDateTime = defaults.registeredDateTime;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.vmResourceId = defaults.vmResourceId;
    	      this.workerName = defaults.workerName;
    	      this.workerType = defaults.workerType;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setLastSeenDateTime(@Nullable String lastSeenDateTime) {
            this.lastSeenDateTime = lastSeenDateTime;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegisteredDateTime(@Nullable String registeredDateTime) {
            this.registeredDateTime = registeredDateTime;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }

        public Builder setWorkerName(@Nullable String workerName) {
            this.workerName = workerName;
            return this;
        }

        public Builder setWorkerType(@Nullable String workerType) {
            this.workerType = workerType;
            return this;
        }
        public GetHybridRunbookWorkerResult build() {
            return new GetHybridRunbookWorkerResult(id, ip, lastSeenDateTime, name, registeredDateTime, systemData, type, vmResourceId, workerName, workerType);
        }
    }
}
