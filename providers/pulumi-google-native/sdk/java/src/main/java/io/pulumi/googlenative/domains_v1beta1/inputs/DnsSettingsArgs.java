// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.domains_v1beta1.inputs.CustomDnsArgs;
import io.pulumi.googlenative.domains_v1beta1.inputs.GlueRecordArgs;
import io.pulumi.googlenative.domains_v1beta1.inputs.GoogleDomainsDnsArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the DNS configuration of a `Registration`, including name servers, DNSSEC, and glue records.
 * 
 */
public final class DnsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DnsSettingsArgs Empty = new DnsSettingsArgs();

    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
     */
    @InputImport(name="customDns")
    private final @Nullable Input<CustomDnsArgs> customDns;

    public Input<CustomDnsArgs> getCustomDns() {
        return this.customDns == null ? Input.empty() : this.customDns;
    }

    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    @InputImport(name="glueRecords")
    private final @Nullable Input<List<GlueRecordArgs>> glueRecords;

    public Input<List<GlueRecordArgs>> getGlueRecords() {
        return this.glueRecords == null ? Input.empty() : this.glueRecords;
    }

    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    @InputImport(name="googleDomainsDns")
    private final @Nullable Input<GoogleDomainsDnsArgs> googleDomainsDns;

    public Input<GoogleDomainsDnsArgs> getGoogleDomainsDns() {
        return this.googleDomainsDns == null ? Input.empty() : this.googleDomainsDns;
    }

    public DnsSettingsArgs(
        @Nullable Input<CustomDnsArgs> customDns,
        @Nullable Input<List<GlueRecordArgs>> glueRecords,
        @Nullable Input<GoogleDomainsDnsArgs> googleDomainsDns) {
        this.customDns = customDns;
        this.glueRecords = glueRecords;
        this.googleDomainsDns = googleDomainsDns;
    }

    private DnsSettingsArgs() {
        this.customDns = Input.empty();
        this.glueRecords = Input.empty();
        this.googleDomainsDns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomDnsArgs> customDns;
        private @Nullable Input<List<GlueRecordArgs>> glueRecords;
        private @Nullable Input<GoogleDomainsDnsArgs> googleDomainsDns;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDns = defaults.customDns;
    	      this.glueRecords = defaults.glueRecords;
    	      this.googleDomainsDns = defaults.googleDomainsDns;
        }

        public Builder setCustomDns(@Nullable Input<CustomDnsArgs> customDns) {
            this.customDns = customDns;
            return this;
        }

        public Builder setCustomDns(@Nullable CustomDnsArgs customDns) {
            this.customDns = Input.ofNullable(customDns);
            return this;
        }

        public Builder setGlueRecords(@Nullable Input<List<GlueRecordArgs>> glueRecords) {
            this.glueRecords = glueRecords;
            return this;
        }

        public Builder setGlueRecords(@Nullable List<GlueRecordArgs> glueRecords) {
            this.glueRecords = Input.ofNullable(glueRecords);
            return this;
        }

        public Builder setGoogleDomainsDns(@Nullable Input<GoogleDomainsDnsArgs> googleDomainsDns) {
            this.googleDomainsDns = googleDomainsDns;
            return this;
        }

        public Builder setGoogleDomainsDns(@Nullable GoogleDomainsDnsArgs googleDomainsDns) {
            this.googleDomainsDns = Input.ofNullable(googleDomainsDns);
            return this;
        }

        public DnsSettingsArgs build() {
            return new DnsSettingsArgs(customDns, glueRecords, googleDomainsDns);
        }
    }
}
