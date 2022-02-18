// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNodeConfigKubeletConfig {
    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    private final @Nullable Boolean cpuCfsQuota;
    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `"300ms"`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m",
     * "h". The value must be a positive duration.
     * 
     */
    private final @Nullable String cpuCfsQuotaPeriod;
    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `"none"` or `"static"`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    private final String cpuManagerPolicy;

    @OutputCustomType.Constructor({"cpuCfsQuota","cpuCfsQuotaPeriod","cpuManagerPolicy"})
    private ClusterNodeConfigKubeletConfig(
        @Nullable Boolean cpuCfsQuota,
        @Nullable String cpuCfsQuotaPeriod,
        String cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
    }

    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    public Optional<Boolean> getCpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }
    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `"300ms"`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m",
     * "h". The value must be a positive duration.
     * 
     */
    public Optional<String> getCpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }
    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `"none"` or `"static"`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    public String getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cpuCfsQuota;
        private @Nullable String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder setCpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder setCpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder setCpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }

        public ClusterNodeConfigKubeletConfig build() {
            return new ClusterNodeConfigKubeletConfig(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
