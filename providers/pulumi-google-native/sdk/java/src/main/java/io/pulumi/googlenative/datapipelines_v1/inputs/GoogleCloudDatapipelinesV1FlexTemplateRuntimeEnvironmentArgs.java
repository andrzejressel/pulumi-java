// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal;
import io.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The environment values to be set at runtime for a Flex Template.
 * 
 */
public final class GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs Empty = new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs();

    /**
     * Additional experiment flags for the job.
     * 
     */
    @InputImport(name="additionalExperiments")
    private final @Nullable Input<List<String>> additionalExperiments;

    public Input<List<String>> getAdditionalExperiments() {
        return this.additionalExperiments == null ? Input.empty() : this.additionalExperiments;
    }

    /**
     * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ "name": "wrench", "mass": "1kg", "count": "3" }`.
     * 
     */
    @InputImport(name="additionalUserLabels")
    private final @Nullable Input<Map<String,String>> additionalUserLabels;

    public Input<Map<String,String>> getAdditionalUserLabels() {
        return this.additionalUserLabels == null ? Input.empty() : this.additionalUserLabels;
    }

    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    @InputImport(name="enableStreamingEngine")
    private final @Nullable Input<Boolean> enableStreamingEngine;

    public Input<Boolean> getEnableStreamingEngine() {
        return this.enableStreamingEngine == null ? Input.empty() : this.enableStreamingEngine;
    }

    /**
     * Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    @InputImport(name="flexrsGoal")
    private final @Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal;

    public Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> getFlexrsGoal() {
        return this.flexrsGoal == null ? Input.empty() : this.flexrsGoal;
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @InputImport(name="ipConfiguration")
    private final @Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration;

    public Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> getIpConfiguration() {
        return this.ipConfiguration == null ? Input.empty() : this.ipConfiguration;
    }

    /**
     * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    @InputImport(name="maxWorkers")
    private final @Nullable Input<Integer> maxWorkers;

    public Input<Integer> getMaxWorkers() {
        return this.maxWorkers == null ? Input.empty() : this.maxWorkers;
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    @InputImport(name="numWorkers")
    private final @Nullable Input<Integer> numWorkers;

    public Input<Integer> getNumWorkers() {
        return this.numWorkers == null ? Input.empty() : this.numWorkers;
    }

    /**
     * The email address of the service account to run the job as.
     * 
     */
    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    @InputImport(name="subnetwork")
    private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    @InputImport(name="tempLocation")
    private final @Nullable Input<String> tempLocation;

    public Input<String> getTempLocation() {
        return this.tempLocation == null ? Input.empty() : this.tempLocation;
    }

    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
     * 
     */
    @InputImport(name="workerRegion")
    private final @Nullable Input<String> workerRegion;

    public Input<String> getWorkerRegion() {
        return this.workerRegion == null ? Input.empty() : this.workerRegion;
    }

    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    @InputImport(name="workerZone")
    private final @Nullable Input<String> workerZone;

    public Input<String> getWorkerZone() {
        return this.workerZone == null ? Input.empty() : this.workerZone;
    }

    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs(
        @Nullable Input<List<String>> additionalExperiments,
        @Nullable Input<Map<String,String>> additionalUserLabels,
        @Nullable Input<Boolean> enableStreamingEngine,
        @Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal,
        @Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration,
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<String> machineType,
        @Nullable Input<Integer> maxWorkers,
        @Nullable Input<String> network,
        @Nullable Input<Integer> numWorkers,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> subnetwork,
        @Nullable Input<String> tempLocation,
        @Nullable Input<String> workerRegion,
        @Nullable Input<String> workerZone,
        @Nullable Input<String> zone) {
        this.additionalExperiments = additionalExperiments;
        this.additionalUserLabels = additionalUserLabels;
        this.enableStreamingEngine = enableStreamingEngine;
        this.flexrsGoal = flexrsGoal;
        this.ipConfiguration = ipConfiguration;
        this.kmsKeyName = kmsKeyName;
        this.machineType = machineType;
        this.maxWorkers = maxWorkers;
        this.network = network;
        this.numWorkers = numWorkers;
        this.serviceAccountEmail = serviceAccountEmail;
        this.subnetwork = subnetwork;
        this.tempLocation = tempLocation;
        this.workerRegion = workerRegion;
        this.workerZone = workerZone;
        this.zone = zone;
    }

    private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs() {
        this.additionalExperiments = Input.empty();
        this.additionalUserLabels = Input.empty();
        this.enableStreamingEngine = Input.empty();
        this.flexrsGoal = Input.empty();
        this.ipConfiguration = Input.empty();
        this.kmsKeyName = Input.empty();
        this.machineType = Input.empty();
        this.maxWorkers = Input.empty();
        this.network = Input.empty();
        this.numWorkers = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.subnetwork = Input.empty();
        this.tempLocation = Input.empty();
        this.workerRegion = Input.empty();
        this.workerZone = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> additionalExperiments;
        private @Nullable Input<Map<String,String>> additionalUserLabels;
        private @Nullable Input<Boolean> enableStreamingEngine;
        private @Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal;
        private @Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration;
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Integer> maxWorkers;
        private @Nullable Input<String> network;
        private @Nullable Input<Integer> numWorkers;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> subnetwork;
        private @Nullable Input<String> tempLocation;
        private @Nullable Input<String> workerRegion;
        private @Nullable Input<String> workerZone;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExperiments = defaults.additionalExperiments;
    	      this.additionalUserLabels = defaults.additionalUserLabels;
    	      this.enableStreamingEngine = defaults.enableStreamingEngine;
    	      this.flexrsGoal = defaults.flexrsGoal;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.machineType = defaults.machineType;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.network = defaults.network;
    	      this.numWorkers = defaults.numWorkers;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tempLocation = defaults.tempLocation;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
    	      this.zone = defaults.zone;
        }

        public Builder setAdditionalExperiments(@Nullable Input<List<String>> additionalExperiments) {
            this.additionalExperiments = additionalExperiments;
            return this;
        }

        public Builder setAdditionalExperiments(@Nullable List<String> additionalExperiments) {
            this.additionalExperiments = Input.ofNullable(additionalExperiments);
            return this;
        }

        public Builder setAdditionalUserLabels(@Nullable Input<Map<String,String>> additionalUserLabels) {
            this.additionalUserLabels = additionalUserLabels;
            return this;
        }

        public Builder setAdditionalUserLabels(@Nullable Map<String,String> additionalUserLabels) {
            this.additionalUserLabels = Input.ofNullable(additionalUserLabels);
            return this;
        }

        public Builder setEnableStreamingEngine(@Nullable Input<Boolean> enableStreamingEngine) {
            this.enableStreamingEngine = enableStreamingEngine;
            return this;
        }

        public Builder setEnableStreamingEngine(@Nullable Boolean enableStreamingEngine) {
            this.enableStreamingEngine = Input.ofNullable(enableStreamingEngine);
            return this;
        }

        public Builder setFlexrsGoal(@Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal) {
            this.flexrsGoal = flexrsGoal;
            return this;
        }

        public Builder setFlexrsGoal(@Nullable GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal flexrsGoal) {
            this.flexrsGoal = Input.ofNullable(flexrsGoal);
            return this;
        }

        public Builder setIpConfiguration(@Nullable Input<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder setIpConfiguration(@Nullable GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration ipConfiguration) {
            this.ipConfiguration = Input.ofNullable(ipConfiguration);
            return this;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMaxWorkers(@Nullable Input<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }

        public Builder setMaxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Input.ofNullable(maxWorkers);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNumWorkers(@Nullable Input<Integer> numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }

        public Builder setNumWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = Input.ofNullable(numWorkers);
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public Builder setTempLocation(@Nullable Input<String> tempLocation) {
            this.tempLocation = tempLocation;
            return this;
        }

        public Builder setTempLocation(@Nullable String tempLocation) {
            this.tempLocation = Input.ofNullable(tempLocation);
            return this;
        }

        public Builder setWorkerRegion(@Nullable Input<String> workerRegion) {
            this.workerRegion = workerRegion;
            return this;
        }

        public Builder setWorkerRegion(@Nullable String workerRegion) {
            this.workerRegion = Input.ofNullable(workerRegion);
            return this;
        }

        public Builder setWorkerZone(@Nullable Input<String> workerZone) {
            this.workerZone = workerZone;
            return this;
        }

        public Builder setWorkerZone(@Nullable String workerZone) {
            this.workerZone = Input.ofNullable(workerZone);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs build() {
            return new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs(additionalExperiments, additionalUserLabels, enableStreamingEngine, flexrsGoal, ipConfiguration, kmsKeyName, machineType, maxWorkers, network, numWorkers, serviceAccountEmail, subnetwork, tempLocation, workerRegion, workerZone, zone);
        }
    }
}
