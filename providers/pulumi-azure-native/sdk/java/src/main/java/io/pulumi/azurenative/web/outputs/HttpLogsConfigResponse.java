// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AzureBlobStorageHttpLogsConfigResponse;
import io.pulumi.azurenative.web.outputs.FileSystemHttpLogsConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpLogsConfigResponse {
    /**
     * Http logs to azure blob storage configuration.
     * 
     */
    private final @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;
    /**
     * Http logs to file system configuration.
     * 
     */
    private final @Nullable FileSystemHttpLogsConfigResponse fileSystem;

    @OutputCustomType.Constructor
    private HttpLogsConfigResponse(
        @OutputCustomType.Parameter("azureBlobStorage") @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage,
        @OutputCustomType.Parameter("fileSystem") @Nullable FileSystemHttpLogsConfigResponse fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.fileSystem = fileSystem;
    }

    /**
     * Http logs to azure blob storage configuration.
     * 
    */
    public Optional<AzureBlobStorageHttpLogsConfigResponse> getAzureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * Http logs to file system configuration.
     * 
    */
    public Optional<FileSystemHttpLogsConfigResponse> getFileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;
        private @Nullable FileSystemHttpLogsConfigResponse fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder setAzureBlobStorage(@Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }

        public Builder setFileSystem(@Nullable FileSystemHttpLogsConfigResponse fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public HttpLogsConfigResponse build() {
            return new HttpLogsConfigResponse(azureBlobStorage, fileSystem);
        }
    }
}
