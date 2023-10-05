// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs();

    @Import(name="cpCode")
    private @Nullable Output<Integer> cpCode;

    public Optional<Output<Integer>> cpCode() {
        return Optional.ofNullable(this.cpCode);
    }

    @Import(name="downloadDomainName")
    private @Nullable Output<String> downloadDomainName;

    public Optional<Output<String>> downloadDomainName() {
        return Optional.ofNullable(this.downloadDomainName);
    }

    @Import(name="g2oToken")
    private @Nullable Output<String> g2oToken;

    public Optional<Output<String>> g2oToken() {
        return Optional.ofNullable(this.g2oToken);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs(GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs $) {
        this.cpCode = $.cpCode;
        this.downloadDomainName = $.downloadDomainName;
        this.g2oToken = $.g2oToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpCode(@Nullable Output<Integer> cpCode) {
            $.cpCode = cpCode;
            return this;
        }

        public Builder cpCode(Integer cpCode) {
            return cpCode(Output.of(cpCode));
        }

        public Builder downloadDomainName(@Nullable Output<String> downloadDomainName) {
            $.downloadDomainName = downloadDomainName;
            return this;
        }

        public Builder downloadDomainName(String downloadDomainName) {
            return downloadDomainName(Output.of(downloadDomainName));
        }

        public Builder g2oToken(@Nullable Output<String> g2oToken) {
            $.g2oToken = g2oToken;
            return this;
        }

        public Builder g2oToken(String g2oToken) {
            return g2oToken(Output.of(g2oToken));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostnameArgs build() {
            return $;
        }
    }

}
