// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs Empty = new GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="nameCaseSensitive")
    private @Nullable Output<Boolean> nameCaseSensitive;

    public Optional<Output<Boolean>> nameCaseSensitive() {
        return Optional.ofNullable(this.nameCaseSensitive);
    }

    @Import(name="nameHasWildcard")
    private @Nullable Output<Boolean> nameHasWildcard;

    public Optional<Output<Boolean>> nameHasWildcard() {
        return Optional.ofNullable(this.nameHasWildcard);
    }

    @Import(name="options")
    private @Nullable Output<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueOptionsArgs> options;

    public Optional<Output<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs() {}

    private GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs(GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs $) {
        this.name = $.name;
        this.nameCaseSensitive = $.nameCaseSensitive;
        this.nameHasWildcard = $.nameHasWildcard;
        this.options = $.options;
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs $;

        public Builder() {
            $ = new GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs();
        }

        public Builder(GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs defaults) {
            $ = new GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder nameCaseSensitive(@Nullable Output<Boolean> nameCaseSensitive) {
            $.nameCaseSensitive = nameCaseSensitive;
            return this;
        }

        public Builder nameCaseSensitive(Boolean nameCaseSensitive) {
            return nameCaseSensitive(Output.of(nameCaseSensitive));
        }

        public Builder nameHasWildcard(@Nullable Output<Boolean> nameHasWildcard) {
            $.nameHasWildcard = nameHasWildcard;
            return this;
        }

        public Builder nameHasWildcard(Boolean nameHasWildcard) {
            return nameHasWildcard(Output.of(nameHasWildcard));
        }

        public Builder options(@Nullable Output<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueOptionsArgs> options) {
            $.options = options;
            return this;
        }

        public Builder options(GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueOptionsArgs options) {
            return options(Output.of(options));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchObjectMatchValueArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
