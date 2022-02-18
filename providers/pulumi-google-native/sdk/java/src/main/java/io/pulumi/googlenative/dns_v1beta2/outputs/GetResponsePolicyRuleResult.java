// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyRuleLocalDataResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetResponsePolicyRuleResult {
    /**
     * Answer this query with a behavior rather than DNS data.
     * 
     */
    private final String behavior;
    /**
     * The DNS name (wildcard or exact) to apply this rule to. Must be unique within the Response Policy Rule.
     * 
     */
    private final String dnsName;
    private final String kind;
    /**
     * Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name; in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * 
     */
    private final ResponsePolicyRuleLocalDataResponse localData;
    /**
     * An identifier for this rule. Must be unique with the ResponsePolicy.
     * 
     */
    private final String ruleName;

    @OutputCustomType.Constructor({"behavior","dnsName","kind","localData","ruleName"})
    private GetResponsePolicyRuleResult(
        String behavior,
        String dnsName,
        String kind,
        ResponsePolicyRuleLocalDataResponse localData,
        String ruleName) {
        this.behavior = Objects.requireNonNull(behavior);
        this.dnsName = Objects.requireNonNull(dnsName);
        this.kind = Objects.requireNonNull(kind);
        this.localData = Objects.requireNonNull(localData);
        this.ruleName = Objects.requireNonNull(ruleName);
    }

    /**
     * Answer this query with a behavior rather than DNS data.
     * 
     */
    public String getBehavior() {
        return this.behavior;
    }
    /**
     * The DNS name (wildcard or exact) to apply this rule to. Must be unique within the Response Policy Rule.
     * 
     */
    public String getDnsName() {
        return this.dnsName;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name; in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * 
     */
    public ResponsePolicyRuleLocalDataResponse getLocalData() {
        return this.localData;
    }
    /**
     * An identifier for this rule. Must be unique with the ResponsePolicy.
     * 
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponsePolicyRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String behavior;
        private String dnsName;
        private String kind;
        private ResponsePolicyRuleLocalDataResponse localData;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponsePolicyRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.dnsName = defaults.dnsName;
    	      this.kind = defaults.kind;
    	      this.localData = defaults.localData;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setBehavior(String behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }

        public Builder setDnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocalData(ResponsePolicyRuleLocalDataResponse localData) {
            this.localData = Objects.requireNonNull(localData);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public GetResponsePolicyRuleResult build() {
            return new GetResponsePolicyRuleResult(behavior, dnsName, kind, localData, ruleName);
        }
    }
}
