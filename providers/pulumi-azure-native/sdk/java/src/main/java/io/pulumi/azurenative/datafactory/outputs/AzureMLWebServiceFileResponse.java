// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;

@OutputCustomType
public final class AzureMLWebServiceFileResponse {
    /**
     * The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
     */
    private final Object filePath;
    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;

    @OutputCustomType.Constructor
    private AzureMLWebServiceFileResponse(
        @OutputCustomType.Parameter("filePath") Object filePath,
        @OutputCustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName) {
        this.filePath = filePath;
        this.linkedServiceName = linkedServiceName;
    }

    /**
     * The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
    */
    public Object getFilePath() {
        return this.filePath;
    }
    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLWebServiceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object filePath;
        private LinkedServiceReferenceResponse linkedServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLWebServiceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.linkedServiceName = defaults.linkedServiceName;
        }

        public Builder setFilePath(Object filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public AzureMLWebServiceFileResponse build() {
            return new AzureMLWebServiceFileResponse(filePath, linkedServiceName);
        }
    }
}
