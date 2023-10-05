// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs Empty = new GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="overrideId")
    private @Nullable Output<String> overrideId;

    public Optional<Output<String>> overrideId() {
        return Optional.ofNullable(this.overrideId);
    }

    private GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs() {}

    private GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs(GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs $) {
        this.name = $.name;
        this.overrideId = $.overrideId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder overrideId(@Nullable Output<String> overrideId) {
            $.overrideId = overrideId;
            return this;
        }

        public Builder overrideId(String overrideId) {
            return overrideId(Output.of(overrideId));
        }

        public GetPropertyRulesBuilderRulesV20230105CustomOverrideArgs build() {
            return $;
        }
    }

}
