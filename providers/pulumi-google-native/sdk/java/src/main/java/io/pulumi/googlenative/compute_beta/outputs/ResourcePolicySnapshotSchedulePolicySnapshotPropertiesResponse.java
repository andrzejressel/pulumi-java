// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse {
    /**
     * Chain name that the snapshot is created in.
     * 
     */
    private final String chainName;
    /**
     * Indication to perform a 'guest aware' snapshot.
     * 
     */
    private final Boolean guestFlush;
    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    private final List<String> storageLocations;

    @OutputCustomType.Constructor({"chainName","guestFlush","labels","storageLocations"})
    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse(
        String chainName,
        Boolean guestFlush,
        Map<String,String> labels,
        List<String> storageLocations) {
        this.chainName = Objects.requireNonNull(chainName);
        this.guestFlush = Objects.requireNonNull(guestFlush);
        this.labels = Objects.requireNonNull(labels);
        this.storageLocations = Objects.requireNonNull(storageLocations);
    }

    /**
     * Chain name that the snapshot is created in.
     * 
     */
    public String getChainName() {
        return this.chainName;
    }
    /**
     * Indication to perform a 'guest aware' snapshot.
     * 
     */
    public Boolean getGuestFlush() {
        return this.guestFlush;
    }
    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    public List<String> getStorageLocations() {
        return this.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainName;
        private Boolean guestFlush;
        private Map<String,String> labels;
        private List<String> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder setChainName(String chainName) {
            this.chainName = Objects.requireNonNull(chainName);
            return this;
        }

        public Builder setGuestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setStorageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }

        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse(chainName, guestFlush, labels, storageLocations);
        }
    }
}
