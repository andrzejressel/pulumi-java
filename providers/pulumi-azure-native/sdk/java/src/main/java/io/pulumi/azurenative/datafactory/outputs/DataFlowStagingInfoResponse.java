// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataFlowStagingInfoResponse {
    /**
     * Folder path for staging blob. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * Staging linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedService;

    @OutputCustomType.Constructor
    private DataFlowStagingInfoResponse(
        @OutputCustomType.Parameter("folderPath") @Nullable Object folderPath,
        @OutputCustomType.Parameter("linkedService") @Nullable LinkedServiceReferenceResponse linkedService) {
        this.folderPath = folderPath;
        this.linkedService = linkedService;
    }

    /**
     * Folder path for staging blob. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * Staging linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedService() {
        return Optional.ofNullable(this.linkedService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowStagingInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object folderPath;
        private @Nullable LinkedServiceReferenceResponse linkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowStagingInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderPath = defaults.folderPath;
    	      this.linkedService = defaults.linkedService;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setLinkedService(@Nullable LinkedServiceReferenceResponse linkedService) {
            this.linkedService = linkedService;
            return this;
        }
        public DataFlowStagingInfoResponse build() {
            return new DataFlowStagingInfoResponse(folderPath, linkedService);
        }
    }
}
