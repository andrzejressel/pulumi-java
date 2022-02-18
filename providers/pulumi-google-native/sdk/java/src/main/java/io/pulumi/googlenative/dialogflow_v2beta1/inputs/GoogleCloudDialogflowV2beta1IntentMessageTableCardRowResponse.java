// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Row of TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse();

    /**
     * Optional. List of cells that make up this row.
     * 
     */
    @InputImport(name="cells", required=true)
    private final List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells;

    public List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> getCells() {
        return this.cells;
    }

    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    @InputImport(name="dividerAfter", required=true)
    private final Boolean dividerAfter;

    public Boolean getDividerAfter() {
        return this.dividerAfter;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells,
        Boolean dividerAfter) {
        this.cells = Objects.requireNonNull(cells, "expected parameter 'cells' to be non-null");
        this.dividerAfter = Objects.requireNonNull(dividerAfter, "expected parameter 'dividerAfter' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse() {
        this.cells = List.of();
        this.dividerAfter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells;
        private Boolean dividerAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.dividerAfter = defaults.dividerAfter;
        }

        public Builder setCells(List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells) {
            this.cells = Objects.requireNonNull(cells);
            return this;
        }

        public Builder setDividerAfter(Boolean dividerAfter) {
            this.dividerAfter = Objects.requireNonNull(dividerAfter);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse(cells, dividerAfter);
        }
    }
}
