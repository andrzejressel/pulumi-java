// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeProviderParametersAzureFileResponse {
    /**
     * Access key of the Azure storage account for the File Share.
     * 
     */
    private final @Nullable String accountKey;
    /**
     * Name of the Azure storage account for the File Share.
     * 
     */
    private final String accountName;
    /**
     * Name of the Azure Files file share that provides storage for the volume.
     * 
     */
    private final String shareName;

    @OutputCustomType.Constructor
    private VolumeProviderParametersAzureFileResponse(
        @OutputCustomType.Parameter("accountKey") @Nullable String accountKey,
        @OutputCustomType.Parameter("accountName") String accountName,
        @OutputCustomType.Parameter("shareName") String shareName) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.shareName = shareName;
    }

    /**
     * Access key of the Azure storage account for the File Share.
     * 
    */
    public Optional<String> getAccountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * Name of the Azure storage account for the File Share.
     * 
    */
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Name of the Azure Files file share that provides storage for the volume.
     * 
    */
    public String getShareName() {
        return this.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProviderParametersAzureFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private String accountName;
        private String shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeProviderParametersAzureFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.shareName = defaults.shareName;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public VolumeProviderParametersAzureFileResponse build() {
            return new VolumeProviderParametersAzureFileResponse(accountKey, accountName, shareName);
        }
    }
}
