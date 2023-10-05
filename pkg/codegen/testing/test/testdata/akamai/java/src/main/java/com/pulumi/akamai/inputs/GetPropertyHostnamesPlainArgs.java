// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyHostnamesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyHostnamesPlainArgs Empty = new GetPropertyHostnamesPlainArgs();

    @Import(name="contractId", required=true)
    private String contractId;

    public String contractId() {
        return this.contractId;
    }

    @Import(name="groupId", required=true)
    private String groupId;

    public String groupId() {
        return this.groupId;
    }

    @Import(name="propertyId", required=true)
    private String propertyId;

    public String propertyId() {
        return this.propertyId;
    }

    private GetPropertyHostnamesPlainArgs() {}

    private GetPropertyHostnamesPlainArgs(GetPropertyHostnamesPlainArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyHostnamesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyHostnamesPlainArgs $;

        public Builder() {
            $ = new GetPropertyHostnamesPlainArgs();
        }

        public Builder(GetPropertyHostnamesPlainArgs defaults) {
            $ = new GetPropertyHostnamesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(String contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder groupId(String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder propertyId(String propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public GetPropertyHostnamesPlainArgs build() {
            $.contractId = Objects.requireNonNull($.contractId, "expected parameter 'contractId' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.propertyId = Objects.requireNonNull($.propertyId, "expected parameter 'propertyId' to be non-null");
            return $;
        }
    }

}
