// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCpCodePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCpCodePlainArgs Empty = new GetCpCodePlainArgs();

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

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetCpCodePlainArgs() {}

    private GetCpCodePlainArgs(GetCpCodePlainArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCpCodePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCpCodePlainArgs $;

        public Builder() {
            $ = new GetCpCodePlainArgs();
        }

        public Builder(GetCpCodePlainArgs defaults) {
            $ = new GetCpCodePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(String contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder groupId(String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCpCodePlainArgs build() {
            $.contractId = Objects.requireNonNull($.contractId, "expected parameter 'contractId' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
