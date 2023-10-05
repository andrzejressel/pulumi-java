// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs();

    @Import(name="dpr")
    private @Nullable Output<Double> dpr;

    public Optional<Output<Double>> dpr() {
        return Optional.ofNullable(this.dpr);
    }

    @Import(name="dprvar")
    private @Nullable Output<String> dprvar;

    public Optional<Output<String>> dprvar() {
        return Optional.ofNullable(this.dprvar);
    }

    @Import(name="excludeAllQueryParameters")
    private @Nullable Output<Boolean> excludeAllQueryParameters;

    public Optional<Output<Boolean>> excludeAllQueryParameters() {
        return Optional.ofNullable(this.excludeAllQueryParameters);
    }

    @Import(name="excludedQueryParameters")
    private @Nullable Output<List<String>> excludedQueryParameters;

    public Optional<Output<List<String>>> excludedQueryParameters() {
        return Optional.ofNullable(this.excludedQueryParameters);
    }

    @Import(name="format")
    private @Nullable Output<String> format;

    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    @Import(name="formatvar")
    private @Nullable Output<String> formatvar;

    public Optional<Output<String>> formatvar() {
        return Optional.ofNullable(this.formatvar);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="override")
    private @Nullable Output<String> override;

    public Optional<Output<String>> override() {
        return Optional.ofNullable(this.override);
    }

    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="policyvar")
    private @Nullable Output<String> policyvar;

    public Optional<Output<String>> policyvar() {
        return Optional.ofNullable(this.policyvar);
    }

    @Import(name="policyvarIMvar")
    private @Nullable Output<String> policyvarIMvar;

    public Optional<Output<String>> policyvarIMvar() {
        return Optional.ofNullable(this.policyvarIMvar);
    }

    @Import(name="policyvarName")
    private @Nullable Output<String> policyvarName;

    public Optional<Output<String>> policyvarName() {
        return Optional.ofNullable(this.policyvarName);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="typesel")
    private @Nullable Output<String> typesel;

    public Optional<Output<String>> typesel() {
        return Optional.ofNullable(this.typesel);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="width")
    private @Nullable Output<Double> width;

    public Optional<Output<Double>> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="widthvar")
    private @Nullable Output<String> widthvar;

    public Optional<Output<String>> widthvar() {
        return Optional.ofNullable(this.widthvar);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs(GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs $) {
        this.dpr = $.dpr;
        this.dprvar = $.dprvar;
        this.excludeAllQueryParameters = $.excludeAllQueryParameters;
        this.excludedQueryParameters = $.excludedQueryParameters;
        this.format = $.format;
        this.formatvar = $.formatvar;
        this.locked = $.locked;
        this.override = $.override;
        this.policy = $.policy;
        this.policyvar = $.policyvar;
        this.policyvarIMvar = $.policyvarIMvar;
        this.policyvarName = $.policyvarName;
        this.templateUuid = $.templateUuid;
        this.typesel = $.typesel;
        this.uuid = $.uuid;
        this.width = $.width;
        this.widthvar = $.widthvar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder dpr(@Nullable Output<Double> dpr) {
            $.dpr = dpr;
            return this;
        }

        public Builder dpr(Double dpr) {
            return dpr(Output.of(dpr));
        }

        public Builder dprvar(@Nullable Output<String> dprvar) {
            $.dprvar = dprvar;
            return this;
        }

        public Builder dprvar(String dprvar) {
            return dprvar(Output.of(dprvar));
        }

        public Builder excludeAllQueryParameters(@Nullable Output<Boolean> excludeAllQueryParameters) {
            $.excludeAllQueryParameters = excludeAllQueryParameters;
            return this;
        }

        public Builder excludeAllQueryParameters(Boolean excludeAllQueryParameters) {
            return excludeAllQueryParameters(Output.of(excludeAllQueryParameters));
        }

        public Builder excludedQueryParameters(@Nullable Output<List<String>> excludedQueryParameters) {
            $.excludedQueryParameters = excludedQueryParameters;
            return this;
        }

        public Builder excludedQueryParameters(List<String> excludedQueryParameters) {
            return excludedQueryParameters(Output.of(excludedQueryParameters));
        }

        public Builder excludedQueryParameters(String... excludedQueryParameters) {
            return excludedQueryParameters(List.of(excludedQueryParameters));
        }

        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder formatvar(@Nullable Output<String> formatvar) {
            $.formatvar = formatvar;
            return this;
        }

        public Builder formatvar(String formatvar) {
            return formatvar(Output.of(formatvar));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder override(@Nullable Output<String> override) {
            $.override = override;
            return this;
        }

        public Builder override(String override) {
            return override(Output.of(override));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder policyvar(@Nullable Output<String> policyvar) {
            $.policyvar = policyvar;
            return this;
        }

        public Builder policyvar(String policyvar) {
            return policyvar(Output.of(policyvar));
        }

        public Builder policyvarIMvar(@Nullable Output<String> policyvarIMvar) {
            $.policyvarIMvar = policyvarIMvar;
            return this;
        }

        public Builder policyvarIMvar(String policyvarIMvar) {
            return policyvarIMvar(Output.of(policyvarIMvar));
        }

        public Builder policyvarName(@Nullable Output<String> policyvarName) {
            $.policyvarName = policyvarName;
            return this;
        }

        public Builder policyvarName(String policyvarName) {
            return policyvarName(Output.of(policyvarName));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder typesel(@Nullable Output<String> typesel) {
            $.typesel = typesel;
            return this;
        }

        public Builder typesel(String typesel) {
            return typesel(Output.of(typesel));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public Builder width(@Nullable Output<Double> width) {
            $.width = width;
            return this;
        }

        public Builder width(Double width) {
            return width(Output.of(width));
        }

        public Builder widthvar(@Nullable Output<String> widthvar) {
            $.widthvar = widthvar;
            return this;
        }

        public Builder widthvar(String widthvar) {
            return widthvar(Output.of(widthvar));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideArgs build() {
            return $;
        }
    }

}
