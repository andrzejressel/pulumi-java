// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectionMonitorTestResult {
    /**
     * The Connection Monitor test destination
     * 
     */
    private final @Nullable String destination;
    /**
     * The Connection Monitor test destination port
     * 
     */
    private final @Nullable Integer destinationPort;
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The flag that indicates if the Connection Monitor test is successful or not.
     * 
     */
    private final Boolean isTestSuccessful;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The path representing the Connection Monitor test.
     * 
     */
    private final List<String> path;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The Connection Monitor test source agent
     * 
     */
    private final @Nullable String sourceAgent;
    /**
     * The Connection Monitor test frequency in seconds
     * 
     */
    private final @Nullable Integer testFrequencyInSec;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetConnectionMonitorTestResult(
        @OutputCustomType.Parameter("destination") @Nullable String destination,
        @OutputCustomType.Parameter("destinationPort") @Nullable Integer destinationPort,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isTestSuccessful") Boolean isTestSuccessful,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("path") List<String> path,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("sourceAgent") @Nullable String sourceAgent,
        @OutputCustomType.Parameter("testFrequencyInSec") @Nullable Integer testFrequencyInSec,
        @OutputCustomType.Parameter("type") String type) {
        this.destination = destination;
        this.destinationPort = destinationPort;
        this.id = id;
        this.isTestSuccessful = isTestSuccessful;
        this.name = name;
        this.path = path;
        this.provisioningState = provisioningState;
        this.sourceAgent = sourceAgent;
        this.testFrequencyInSec = testFrequencyInSec;
        this.type = type;
    }

    /**
     * The Connection Monitor test destination
     * 
    */
    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * The Connection Monitor test destination port
     * 
    */
    public Optional<Integer> getDestinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }
    /**
     * The ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The flag that indicates if the Connection Monitor test is successful or not.
     * 
    */
    public Boolean getIsTestSuccessful() {
        return this.isTestSuccessful;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The path representing the Connection Monitor test.
     * 
    */
    public List<String> getPath() {
        return this.path;
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Connection Monitor test source agent
     * 
    */
    public Optional<String> getSourceAgent() {
        return Optional.ofNullable(this.sourceAgent);
    }
    /**
     * The Connection Monitor test frequency in seconds
     * 
    */
    public Optional<Integer> getTestFrequencyInSec() {
        return Optional.ofNullable(this.testFrequencyInSec);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionMonitorTestResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable Integer destinationPort;
        private String id;
        private Boolean isTestSuccessful;
        private String name;
        private List<String> path;
        private String provisioningState;
        private @Nullable String sourceAgent;
        private @Nullable Integer testFrequencyInSec;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionMonitorTestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationPort = defaults.destinationPort;
    	      this.id = defaults.id;
    	      this.isTestSuccessful = defaults.isTestSuccessful;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceAgent = defaults.sourceAgent;
    	      this.testFrequencyInSec = defaults.testFrequencyInSec;
    	      this.type = defaults.type;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsTestSuccessful(Boolean isTestSuccessful) {
            this.isTestSuccessful = Objects.requireNonNull(isTestSuccessful);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(List<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSourceAgent(@Nullable String sourceAgent) {
            this.sourceAgent = sourceAgent;
            return this;
        }

        public Builder setTestFrequencyInSec(@Nullable Integer testFrequencyInSec) {
            this.testFrequencyInSec = testFrequencyInSec;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectionMonitorTestResult build() {
            return new GetConnectionMonitorTestResult(destination, destinationPort, id, isTestSuccessful, name, path, provisioningState, sourceAgent, testFrequencyInSec, type);
        }
    }
}
