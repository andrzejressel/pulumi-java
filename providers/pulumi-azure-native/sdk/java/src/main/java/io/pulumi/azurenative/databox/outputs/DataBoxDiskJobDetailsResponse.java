// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.ContactDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxDiskCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxDiskCopyProgressResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavyAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataExportDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataImportDetailsResponse;
import io.pulumi.azurenative.databox.outputs.JobStagesResponse;
import io.pulumi.azurenative.databox.outputs.KeyEncryptionKeyResponse;
import io.pulumi.azurenative.databox.outputs.PackageShippingDetailsResponse;
import io.pulumi.azurenative.databox.outputs.PreferencesResponse;
import io.pulumi.azurenative.databox.outputs.ShippingAddressResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataBoxDiskJobDetailsResponse {
    /**
     * Shared access key to download the chain of custody logs
     * 
     */
    private final String chainOfCustodySasKey;
    /**
     * Contact details for notification and shipping.
     * 
     */
    private final ContactDetailsResponse contactDetails;
    /**
     * List of copy log details.
     * 
     */
    private final List<Object> copyLogDetails;
    /**
     * Copy progress per disk.
     * 
     */
    private final List<DataBoxDiskCopyProgressResponse> copyProgress;
    /**
     * Details of the data to be exported from azure.
     * 
     */
    private final @Nullable List<DataExportDetailsResponse> dataExportDetails;
    /**
     * Details of the data to be imported into azure.
     * 
     */
    private final @Nullable List<DataImportDetailsResponse> dataImportDetails;
    /**
     * Delivery package shipping details.
     * 
     */
    private final PackageShippingDetailsResponse deliveryPackage;
    /**
     * Contains the map of disk serial number to the disk size being used for the job. Is returned only after the disks are shipped to the customer.
     * 
     */
    private final Map<String,Integer> disksAndSizeDetails;
    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    private final @Nullable Integer expectedDataSizeInTeraBytes;
    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    private final String jobDetailsType;
    /**
     * List of stages that run in the job.
     * 
     */
    private final List<JobStagesResponse> jobStages;
    /**
     * Details about which key encryption type is being used.
     * 
     */
    private final @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
    /**
     * User entered passkey for DataBox Disk job.
     * 
     */
    private final @Nullable String passkey;
    /**
     * Preferences for the order.
     * 
     */
    private final @Nullable PreferencesResponse preferences;
    /**
     * User preference on what size disks are needed for the job. The map is from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an int.
     * 
     */
    private final @Nullable Map<String,Integer> preferredDisks;
    /**
     * Return package shipping details.
     * 
     */
    private final PackageShippingDetailsResponse returnPackage;
    /**
     * Shared access key to download the return shipment label
     * 
     */
    private final String reverseShipmentLabelSasKey;
    /**
     * Shipping address of the customer.
     * 
     */
    private final @Nullable ShippingAddressResponse shippingAddress;

    @OutputCustomType.Constructor
    private DataBoxDiskJobDetailsResponse(
        @OutputCustomType.Parameter("chainOfCustodySasKey") String chainOfCustodySasKey,
        @OutputCustomType.Parameter("contactDetails") ContactDetailsResponse contactDetails,
        @OutputCustomType.Parameter("copyLogDetails") List<Object> copyLogDetails,
        @OutputCustomType.Parameter("copyProgress") List<DataBoxDiskCopyProgressResponse> copyProgress,
        @OutputCustomType.Parameter("dataExportDetails") @Nullable List<DataExportDetailsResponse> dataExportDetails,
        @OutputCustomType.Parameter("dataImportDetails") @Nullable List<DataImportDetailsResponse> dataImportDetails,
        @OutputCustomType.Parameter("deliveryPackage") PackageShippingDetailsResponse deliveryPackage,
        @OutputCustomType.Parameter("disksAndSizeDetails") Map<String,Integer> disksAndSizeDetails,
        @OutputCustomType.Parameter("expectedDataSizeInTeraBytes") @Nullable Integer expectedDataSizeInTeraBytes,
        @OutputCustomType.Parameter("jobDetailsType") String jobDetailsType,
        @OutputCustomType.Parameter("jobStages") List<JobStagesResponse> jobStages,
        @OutputCustomType.Parameter("keyEncryptionKey") @Nullable KeyEncryptionKeyResponse keyEncryptionKey,
        @OutputCustomType.Parameter("passkey") @Nullable String passkey,
        @OutputCustomType.Parameter("preferences") @Nullable PreferencesResponse preferences,
        @OutputCustomType.Parameter("preferredDisks") @Nullable Map<String,Integer> preferredDisks,
        @OutputCustomType.Parameter("returnPackage") PackageShippingDetailsResponse returnPackage,
        @OutputCustomType.Parameter("reverseShipmentLabelSasKey") String reverseShipmentLabelSasKey,
        @OutputCustomType.Parameter("shippingAddress") @Nullable ShippingAddressResponse shippingAddress) {
        this.chainOfCustodySasKey = chainOfCustodySasKey;
        this.contactDetails = contactDetails;
        this.copyLogDetails = copyLogDetails;
        this.copyProgress = copyProgress;
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.deliveryPackage = deliveryPackage;
        this.disksAndSizeDetails = disksAndSizeDetails;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = jobDetailsType;
        this.jobStages = jobStages;
        this.keyEncryptionKey = keyEncryptionKey;
        this.passkey = passkey;
        this.preferences = preferences;
        this.preferredDisks = preferredDisks;
        this.returnPackage = returnPackage;
        this.reverseShipmentLabelSasKey = reverseShipmentLabelSasKey;
        this.shippingAddress = shippingAddress;
    }

    /**
     * Shared access key to download the chain of custody logs
     * 
    */
    public String getChainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }
    /**
     * Contact details for notification and shipping.
     * 
    */
    public ContactDetailsResponse getContactDetails() {
        return this.contactDetails;
    }
    /**
     * List of copy log details.
     * 
    */
    public List<Object> getCopyLogDetails() {
        return this.copyLogDetails;
    }
    /**
     * Copy progress per disk.
     * 
    */
    public List<DataBoxDiskCopyProgressResponse> getCopyProgress() {
        return this.copyProgress;
    }
    /**
     * Details of the data to be exported from azure.
     * 
    */
    public List<DataExportDetailsResponse> getDataExportDetails() {
        return this.dataExportDetails == null ? List.of() : this.dataExportDetails;
    }
    /**
     * Details of the data to be imported into azure.
     * 
    */
    public List<DataImportDetailsResponse> getDataImportDetails() {
        return this.dataImportDetails == null ? List.of() : this.dataImportDetails;
    }
    /**
     * Delivery package shipping details.
     * 
    */
    public PackageShippingDetailsResponse getDeliveryPackage() {
        return this.deliveryPackage;
    }
    /**
     * Contains the map of disk serial number to the disk size being used for the job. Is returned only after the disks are shipped to the customer.
     * 
    */
    public Map<String,Integer> getDisksAndSizeDetails() {
        return this.disksAndSizeDetails;
    }
    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
    */
    public Optional<Integer> getExpectedDataSizeInTeraBytes() {
        return Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }
    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
    */
    public String getJobDetailsType() {
        return this.jobDetailsType;
    }
    /**
     * List of stages that run in the job.
     * 
    */
    public List<JobStagesResponse> getJobStages() {
        return this.jobStages;
    }
    /**
     * Details about which key encryption type is being used.
     * 
    */
    public Optional<KeyEncryptionKeyResponse> getKeyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }
    /**
     * User entered passkey for DataBox Disk job.
     * 
    */
    public Optional<String> getPasskey() {
        return Optional.ofNullable(this.passkey);
    }
    /**
     * Preferences for the order.
     * 
    */
    public Optional<PreferencesResponse> getPreferences() {
        return Optional.ofNullable(this.preferences);
    }
    /**
     * User preference on what size disks are needed for the job. The map is from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an int.
     * 
    */
    public Map<String,Integer> getPreferredDisks() {
        return this.preferredDisks == null ? Map.of() : this.preferredDisks;
    }
    /**
     * Return package shipping details.
     * 
    */
    public PackageShippingDetailsResponse getReturnPackage() {
        return this.returnPackage;
    }
    /**
     * Shared access key to download the return shipment label
     * 
    */
    public String getReverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }
    /**
     * Shipping address of the customer.
     * 
    */
    public Optional<ShippingAddressResponse> getShippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainOfCustodySasKey;
        private ContactDetailsResponse contactDetails;
        private List<Object> copyLogDetails;
        private List<DataBoxDiskCopyProgressResponse> copyProgress;
        private @Nullable List<DataExportDetailsResponse> dataExportDetails;
        private @Nullable List<DataImportDetailsResponse> dataImportDetails;
        private PackageShippingDetailsResponse deliveryPackage;
        private Map<String,Integer> disksAndSizeDetails;
        private @Nullable Integer expectedDataSizeInTeraBytes;
        private String jobDetailsType;
        private List<JobStagesResponse> jobStages;
        private @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
        private @Nullable String passkey;
        private @Nullable PreferencesResponse preferences;
        private @Nullable Map<String,Integer> preferredDisks;
        private PackageShippingDetailsResponse returnPackage;
        private String reverseShipmentLabelSasKey;
        private @Nullable ShippingAddressResponse shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainOfCustodySasKey = defaults.chainOfCustodySasKey;
    	      this.contactDetails = defaults.contactDetails;
    	      this.copyLogDetails = defaults.copyLogDetails;
    	      this.copyProgress = defaults.copyProgress;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.disksAndSizeDetails = defaults.disksAndSizeDetails;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.jobStages = defaults.jobStages;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.passkey = defaults.passkey;
    	      this.preferences = defaults.preferences;
    	      this.preferredDisks = defaults.preferredDisks;
    	      this.returnPackage = defaults.returnPackage;
    	      this.reverseShipmentLabelSasKey = defaults.reverseShipmentLabelSasKey;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder setChainOfCustodySasKey(String chainOfCustodySasKey) {
            this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey);
            return this;
        }

        public Builder setContactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }

        public Builder setCopyLogDetails(List<Object> copyLogDetails) {
            this.copyLogDetails = Objects.requireNonNull(copyLogDetails);
            return this;
        }

        public Builder setCopyProgress(List<DataBoxDiskCopyProgressResponse> copyProgress) {
            this.copyProgress = Objects.requireNonNull(copyProgress);
            return this;
        }

        public Builder setDataExportDetails(@Nullable List<DataExportDetailsResponse> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }

        public Builder setDataImportDetails(@Nullable List<DataImportDetailsResponse> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }

        public Builder setDeliveryPackage(PackageShippingDetailsResponse deliveryPackage) {
            this.deliveryPackage = Objects.requireNonNull(deliveryPackage);
            return this;
        }

        public Builder setDisksAndSizeDetails(Map<String,Integer> disksAndSizeDetails) {
            this.disksAndSizeDetails = Objects.requireNonNull(disksAndSizeDetails);
            return this;
        }

        public Builder setExpectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }

        public Builder setJobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }

        public Builder setJobStages(List<JobStagesResponse> jobStages) {
            this.jobStages = Objects.requireNonNull(jobStages);
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable KeyEncryptionKeyResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder setPasskey(@Nullable String passkey) {
            this.passkey = passkey;
            return this;
        }

        public Builder setPreferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder setPreferredDisks(@Nullable Map<String,Integer> preferredDisks) {
            this.preferredDisks = preferredDisks;
            return this;
        }

        public Builder setReturnPackage(PackageShippingDetailsResponse returnPackage) {
            this.returnPackage = Objects.requireNonNull(returnPackage);
            return this;
        }

        public Builder setReverseShipmentLabelSasKey(String reverseShipmentLabelSasKey) {
            this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey);
            return this;
        }

        public Builder setShippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
        public DataBoxDiskJobDetailsResponse build() {
            return new DataBoxDiskJobDetailsResponse(chainOfCustodySasKey, contactDetails, copyLogDetails, copyProgress, dataExportDetails, dataImportDetails, deliveryPackage, disksAndSizeDetails, expectedDataSizeInTeraBytes, jobDetailsType, jobStages, keyEncryptionKey, passkey, preferences, preferredDisks, returnPackage, reverseShipmentLabelSasKey, shippingAddress);
        }
    }
}
