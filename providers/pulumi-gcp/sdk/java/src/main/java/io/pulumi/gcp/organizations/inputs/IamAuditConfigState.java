// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamAuditConfigState extends io.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigState Empty = new IamAuditConfigState();

    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @InputImport(name="auditLogConfigs")
    private final @Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs;

    public Input<List<IamAuditConfigAuditLogConfigGetArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs == null ? Input.empty() : this.auditLogConfigs;
    }

    /**
     * The etag of iam policy
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @InputImport(name="orgId")
    private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_organization\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public IamAuditConfigState(
        @Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs,
        @Nullable Input<String> etag,
        @Nullable Input<String> orgId,
        @Nullable Input<String> service) {
        this.auditLogConfigs = auditLogConfigs;
        this.etag = etag;
        this.orgId = orgId;
        this.service = service;
    }

    private IamAuditConfigState() {
        this.auditLogConfigs = Input.empty();
        this.etag = Input.empty();
        this.orgId = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> orgId;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.etag = defaults.etag;
    	      this.orgId = defaults.orgId;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(@Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs) {
            this.auditLogConfigs = auditLogConfigs;
            return this;
        }

        public Builder setAuditLogConfigs(@Nullable List<IamAuditConfigAuditLogConfigGetArgs> auditLogConfigs) {
            this.auditLogConfigs = Input.ofNullable(auditLogConfigs);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public IamAuditConfigState build() {
            return new IamAuditConfigState(auditLogConfigs, etag, orgId, service);
        }
    }
}
