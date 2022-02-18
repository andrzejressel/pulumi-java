// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse {
    /**
     * Additional experiment flags for the job.
     * 
     */
    private final List<String> additionalExperiments;
    /**
     * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ "name": "wrench", "mass": "1kg", "count": "3" }`.
     * 
     */
    private final Map<String,String> additionalUserLabels;
    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    private final Boolean enableStreamingEngine;
    /**
     * Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    private final String flexrsGoal;
    /**
     * Configuration for VM IPs.
     * 
     */
    private final String ipConfiguration;
    /**
     * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    private final String kmsKeyName;
    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    private final String machineType;
    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    private final Integer maxWorkers;
    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    private final String network;
    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    private final Integer numWorkers;
    /**
     * The email address of the service account to run the job as.
     * 
     */
    private final String serviceAccountEmail;
    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    private final String subnetwork;
    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    private final String tempLocation;
    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
     * 
     */
    private final String workerRegion;
    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    private final String workerZone;
    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"additionalExperiments","additionalUserLabels","enableStreamingEngine","flexrsGoal","ipConfiguration","kmsKeyName","machineType","maxWorkers","network","numWorkers","serviceAccountEmail","subnetwork","tempLocation","workerRegion","workerZone","zone"})
    private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse(
        List<String> additionalExperiments,
        Map<String,String> additionalUserLabels,
        Boolean enableStreamingEngine,
        String flexrsGoal,
        String ipConfiguration,
        String kmsKeyName,
        String machineType,
        Integer maxWorkers,
        String network,
        Integer numWorkers,
        String serviceAccountEmail,
        String subnetwork,
        String tempLocation,
        String workerRegion,
        String workerZone,
        String zone) {
        this.additionalExperiments = Objects.requireNonNull(additionalExperiments);
        this.additionalUserLabels = Objects.requireNonNull(additionalUserLabels);
        this.enableStreamingEngine = Objects.requireNonNull(enableStreamingEngine);
        this.flexrsGoal = Objects.requireNonNull(flexrsGoal);
        this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.machineType = Objects.requireNonNull(machineType);
        this.maxWorkers = Objects.requireNonNull(maxWorkers);
        this.network = Objects.requireNonNull(network);
        this.numWorkers = Objects.requireNonNull(numWorkers);
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
        this.subnetwork = Objects.requireNonNull(subnetwork);
        this.tempLocation = Objects.requireNonNull(tempLocation);
        this.workerRegion = Objects.requireNonNull(workerRegion);
        this.workerZone = Objects.requireNonNull(workerZone);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * Additional experiment flags for the job.
     * 
     */
    public List<String> getAdditionalExperiments() {
        return this.additionalExperiments;
    }
    /**
     * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ "name": "wrench", "mass": "1kg", "count": "3" }`.
     * 
     */
    public Map<String,String> getAdditionalUserLabels() {
        return this.additionalUserLabels;
    }
    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    public Boolean getEnableStreamingEngine() {
        return this.enableStreamingEngine;
    }
    /**
     * Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    public String getFlexrsGoal() {
        return this.flexrsGoal;
    }
    /**
     * Configuration for VM IPs.
     * 
     */
    public String getIpConfiguration() {
        return this.ipConfiguration;
    }
    /**
     * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    public Integer getMaxWorkers() {
        return this.maxWorkers;
    }
    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    public Integer getNumWorkers() {
        return this.numWorkers;
    }
    /**
     * The email address of the service account to run the job as.
     * 
     */
    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    public String getTempLocation() {
        return this.tempLocation;
    }
    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
     * 
     */
    public String getWorkerRegion() {
        return this.workerRegion;
    }
    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    public String getWorkerZone() {
        return this.workerZone;
    }
    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalExperiments;
        private Map<String,String> additionalUserLabels;
        private Boolean enableStreamingEngine;
        private String flexrsGoal;
        private String ipConfiguration;
        private String kmsKeyName;
        private String machineType;
        private Integer maxWorkers;
        private String network;
        private Integer numWorkers;
        private String serviceAccountEmail;
        private String subnetwork;
        private String tempLocation;
        private String workerRegion;
        private String workerZone;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse defaults) {
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

        public Builder setAdditionalExperiments(List<String> additionalExperiments) {
            this.additionalExperiments = Objects.requireNonNull(additionalExperiments);
            return this;
        }

        public Builder setAdditionalUserLabels(Map<String,String> additionalUserLabels) {
            this.additionalUserLabels = Objects.requireNonNull(additionalUserLabels);
            return this;
        }

        public Builder setEnableStreamingEngine(Boolean enableStreamingEngine) {
            this.enableStreamingEngine = Objects.requireNonNull(enableStreamingEngine);
            return this;
        }

        public Builder setFlexrsGoal(String flexrsGoal) {
            this.flexrsGoal = Objects.requireNonNull(flexrsGoal);
            return this;
        }

        public Builder setIpConfiguration(String ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMaxWorkers(Integer maxWorkers) {
            this.maxWorkers = Objects.requireNonNull(maxWorkers);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNumWorkers(Integer numWorkers) {
            this.numWorkers = Objects.requireNonNull(numWorkers);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setTempLocation(String tempLocation) {
            this.tempLocation = Objects.requireNonNull(tempLocation);
            return this;
        }

        public Builder setWorkerRegion(String workerRegion) {
            this.workerRegion = Objects.requireNonNull(workerRegion);
            return this;
        }

        public Builder setWorkerZone(String workerZone) {
            this.workerZone = Objects.requireNonNull(workerZone);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse build() {
            return new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse(additionalExperiments, additionalUserLabels, enableStreamingEngine, flexrsGoal, ipConfiguration, kmsKeyName, machineType, maxWorkers, network, numWorkers, serviceAccountEmail, subnetwork, tempLocation, workerRegion, workerZone, zone);
        }
    }
}
