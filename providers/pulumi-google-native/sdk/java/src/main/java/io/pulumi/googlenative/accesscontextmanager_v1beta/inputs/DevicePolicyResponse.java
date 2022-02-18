// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.OsConstraintResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * `DevicePolicy` specifies device specific restrictions necessary to acquire a given access level. A `DevicePolicy` specifies requirements for requests from devices to be granted access levels, it does not do any enforcement on the device. `DevicePolicy` acts as an AND over all specified fields, and each repeated field is an OR over its elements. Any unset fields are ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will be true for requests originating from encrypted Linux desktops and encrypted Windows desktops.
 * 
 */
public final class DevicePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final DevicePolicyResponse Empty = new DevicePolicyResponse();

    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
     */
    @InputImport(name="allowedDeviceManagementLevels", required=true)
    private final List<String> allowedDeviceManagementLevels;

    public List<String> getAllowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels;
    }

    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    @InputImport(name="allowedEncryptionStatuses", required=true)
    private final List<String> allowedEncryptionStatuses;

    public List<String> getAllowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses;
    }

    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    @InputImport(name="osConstraints", required=true)
    private final List<OsConstraintResponse> osConstraints;

    public List<OsConstraintResponse> getOsConstraints() {
        return this.osConstraints;
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @InputImport(name="requireAdminApproval", required=true)
    private final Boolean requireAdminApproval;

    public Boolean getRequireAdminApproval() {
        return this.requireAdminApproval;
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @InputImport(name="requireCorpOwned", required=true)
    private final Boolean requireCorpOwned;

    public Boolean getRequireCorpOwned() {
        return this.requireCorpOwned;
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    @InputImport(name="requireScreenlock", required=true)
    private final Boolean requireScreenlock;

    public Boolean getRequireScreenlock() {
        return this.requireScreenlock;
    }

    public DevicePolicyResponse(
        List<String> allowedDeviceManagementLevels,
        List<String> allowedEncryptionStatuses,
        List<OsConstraintResponse> osConstraints,
        Boolean requireAdminApproval,
        Boolean requireCorpOwned,
        Boolean requireScreenlock) {
        this.allowedDeviceManagementLevels = Objects.requireNonNull(allowedDeviceManagementLevels, "expected parameter 'allowedDeviceManagementLevels' to be non-null");
        this.allowedEncryptionStatuses = Objects.requireNonNull(allowedEncryptionStatuses, "expected parameter 'allowedEncryptionStatuses' to be non-null");
        this.osConstraints = Objects.requireNonNull(osConstraints, "expected parameter 'osConstraints' to be non-null");
        this.requireAdminApproval = Objects.requireNonNull(requireAdminApproval, "expected parameter 'requireAdminApproval' to be non-null");
        this.requireCorpOwned = Objects.requireNonNull(requireCorpOwned, "expected parameter 'requireCorpOwned' to be non-null");
        this.requireScreenlock = Objects.requireNonNull(requireScreenlock, "expected parameter 'requireScreenlock' to be non-null");
    }

    private DevicePolicyResponse() {
        this.allowedDeviceManagementLevels = List.of();
        this.allowedEncryptionStatuses = List.of();
        this.osConstraints = List.of();
        this.requireAdminApproval = null;
        this.requireCorpOwned = null;
        this.requireScreenlock = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedDeviceManagementLevels;
        private List<String> allowedEncryptionStatuses;
        private List<OsConstraintResponse> osConstraints;
        private Boolean requireAdminApproval;
        private Boolean requireCorpOwned;
        private Boolean requireScreenlock;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenlock = defaults.requireScreenlock;
        }

        public Builder setAllowedDeviceManagementLevels(List<String> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = Objects.requireNonNull(allowedDeviceManagementLevels);
            return this;
        }

        public Builder setAllowedEncryptionStatuses(List<String> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = Objects.requireNonNull(allowedEncryptionStatuses);
            return this;
        }

        public Builder setOsConstraints(List<OsConstraintResponse> osConstraints) {
            this.osConstraints = Objects.requireNonNull(osConstraints);
            return this;
        }

        public Builder setRequireAdminApproval(Boolean requireAdminApproval) {
            this.requireAdminApproval = Objects.requireNonNull(requireAdminApproval);
            return this;
        }

        public Builder setRequireCorpOwned(Boolean requireCorpOwned) {
            this.requireCorpOwned = Objects.requireNonNull(requireCorpOwned);
            return this;
        }

        public Builder setRequireScreenlock(Boolean requireScreenlock) {
            this.requireScreenlock = Objects.requireNonNull(requireScreenlock);
            return this;
        }

        public DevicePolicyResponse build() {
            return new DevicePolicyResponse(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenlock);
        }
    }
}
