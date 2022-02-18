// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigMasterConfigDiskConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigMasterConfigDiskConfigGetArgs Empty = new ClusterClusterConfigMasterConfigDiskConfigGetArgs();

    /**
     * Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    @InputImport(name="bootDiskSizeGb")
    private final @Nullable Input<Integer> bootDiskSizeGb;

    public Input<Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Input.empty() : this.bootDiskSizeGb;
    }

    /**
     * The disk type of the primary disk attached to each preemptible worker node.
     * One of `"pd-ssd"` or `"pd-standard"`. Defaults to `"pd-standard"`.
     * 
     */
    @InputImport(name="bootDiskType")
    private final @Nullable Input<String> bootDiskType;

    public Input<String> getBootDiskType() {
        return this.bootDiskType == null ? Input.empty() : this.bootDiskType;
    }

    /**
     * The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    @InputImport(name="numLocalSsds")
    private final @Nullable Input<Integer> numLocalSsds;

    public Input<Integer> getNumLocalSsds() {
        return this.numLocalSsds == null ? Input.empty() : this.numLocalSsds;
    }

    public ClusterClusterConfigMasterConfigDiskConfigGetArgs(
        @Nullable Input<Integer> bootDiskSizeGb,
        @Nullable Input<String> bootDiskType,
        @Nullable Input<Integer> numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    private ClusterClusterConfigMasterConfigDiskConfigGetArgs() {
        this.bootDiskSizeGb = Input.empty();
        this.bootDiskType = Input.empty();
        this.numLocalSsds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigMasterConfigDiskConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bootDiskSizeGb;
        private @Nullable Input<String> bootDiskType;
        private @Nullable Input<Integer> numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigMasterConfigDiskConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder setBootDiskSizeGb(@Nullable Input<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder setBootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Input.ofNullable(bootDiskSizeGb);
            return this;
        }

        public Builder setBootDiskType(@Nullable Input<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }

        public Builder setBootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Input.ofNullable(bootDiskType);
            return this;
        }

        public Builder setNumLocalSsds(@Nullable Input<Integer> numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }

        public Builder setNumLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = Input.ofNullable(numLocalSsds);
            return this;
        }

        public ClusterClusterConfigMasterConfigDiskConfigGetArgs build() {
            return new ClusterClusterConfigMasterConfigDiskConfigGetArgs(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}
