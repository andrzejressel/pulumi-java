// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyAssignmentInstanceFilterInventoryResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyAssignmentLabelSetResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Filters to select target VMs for an assignment. If more than one filter criteria is specified below, a VM will be selected if and only if it satisfies all of them.
 * 
 */
public final class OSPolicyAssignmentInstanceFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyAssignmentInstanceFilterResponse Empty = new OSPolicyAssignmentInstanceFilterResponse();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @InputImport(name="all", required=true)
    private final Boolean all;

    public Boolean getAll() {
        return this.all;
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @InputImport(name="exclusionLabels", required=true)
    private final List<OSPolicyAssignmentLabelSetResponse> exclusionLabels;

    public List<OSPolicyAssignmentLabelSetResponse> getExclusionLabels() {
        return this.exclusionLabels;
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @InputImport(name="inclusionLabels", required=true)
    private final List<OSPolicyAssignmentLabelSetResponse> inclusionLabels;

    public List<OSPolicyAssignmentLabelSetResponse> getInclusionLabels() {
        return this.inclusionLabels;
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @InputImport(name="inventories", required=true)
    private final List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories;

    public List<OSPolicyAssignmentInstanceFilterInventoryResponse> getInventories() {
        return this.inventories;
    }

    public OSPolicyAssignmentInstanceFilterResponse(
        Boolean all,
        List<OSPolicyAssignmentLabelSetResponse> exclusionLabels,
        List<OSPolicyAssignmentLabelSetResponse> inclusionLabels,
        List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories) {
        this.all = Objects.requireNonNull(all, "expected parameter 'all' to be non-null");
        this.exclusionLabels = Objects.requireNonNull(exclusionLabels, "expected parameter 'exclusionLabels' to be non-null");
        this.inclusionLabels = Objects.requireNonNull(inclusionLabels, "expected parameter 'inclusionLabels' to be non-null");
        this.inventories = Objects.requireNonNull(inventories, "expected parameter 'inventories' to be non-null");
    }

    private OSPolicyAssignmentInstanceFilterResponse() {
        this.all = null;
        this.exclusionLabels = List.of();
        this.inclusionLabels = List.of();
        this.inventories = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentInstanceFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean all;
        private List<OSPolicyAssignmentLabelSetResponse> exclusionLabels;
        private List<OSPolicyAssignmentLabelSetResponse> inclusionLabels;
        private List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentInstanceFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder setAll(Boolean all) {
            this.all = Objects.requireNonNull(all);
            return this;
        }

        public Builder setExclusionLabels(List<OSPolicyAssignmentLabelSetResponse> exclusionLabels) {
            this.exclusionLabels = Objects.requireNonNull(exclusionLabels);
            return this;
        }

        public Builder setInclusionLabels(List<OSPolicyAssignmentLabelSetResponse> inclusionLabels) {
            this.inclusionLabels = Objects.requireNonNull(inclusionLabels);
            return this;
        }

        public Builder setInventories(List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories) {
            this.inventories = Objects.requireNonNull(inventories);
            return this;
        }

        public OSPolicyAssignmentInstanceFilterResponse build() {
            return new OSPolicyAssignmentInstanceFilterResponse(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
