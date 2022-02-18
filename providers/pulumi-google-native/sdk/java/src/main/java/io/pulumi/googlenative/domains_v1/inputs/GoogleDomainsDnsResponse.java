// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.inputs.DsRecordResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration for using the free DNS zone provided by Google Domains as a `Registration`'s `dns_provider`. You cannot configure the DNS zone itself using the API. To configure the DNS zone, go to [Google Domains](https://domains.google/).
 * 
 */
public final class GoogleDomainsDnsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDomainsDnsResponse Empty = new GoogleDomainsDnsResponse();

    /**
     * The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty.
     * 
     */
    @InputImport(name="dsRecords", required=true)
    private final List<DsRecordResponse> dsRecords;

    public List<DsRecordResponse> getDsRecords() {
        return this.dsRecords;
    }

    /**
     * The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    @InputImport(name="dsState", required=true)
    private final String dsState;

    public String getDsState() {
        return this.dsState;
    }

    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is automatically populated with the name servers assigned to the Google Domains DNS zone.
     * 
     */
    @InputImport(name="nameServers", required=true)
    private final List<String> nameServers;

    public List<String> getNameServers() {
        return this.nameServers;
    }

    public GoogleDomainsDnsResponse(
        List<DsRecordResponse> dsRecords,
        String dsState,
        List<String> nameServers) {
        this.dsRecords = Objects.requireNonNull(dsRecords, "expected parameter 'dsRecords' to be non-null");
        this.dsState = Objects.requireNonNull(dsState, "expected parameter 'dsState' to be non-null");
        this.nameServers = Objects.requireNonNull(nameServers, "expected parameter 'nameServers' to be non-null");
    }

    private GoogleDomainsDnsResponse() {
        this.dsRecords = List.of();
        this.dsState = null;
        this.nameServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDomainsDnsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DsRecordResponse> dsRecords;
        private String dsState;
        private List<String> nameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDomainsDnsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dsRecords = defaults.dsRecords;
    	      this.dsState = defaults.dsState;
    	      this.nameServers = defaults.nameServers;
        }

        public Builder setDsRecords(List<DsRecordResponse> dsRecords) {
            this.dsRecords = Objects.requireNonNull(dsRecords);
            return this;
        }

        public Builder setDsState(String dsState) {
            this.dsState = Objects.requireNonNull(dsState);
            return this;
        }

        public Builder setNameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public GoogleDomainsDnsResponse build() {
            return new GoogleDomainsDnsResponse(dsRecords, dsState, nameServers);
        }
    }
}
