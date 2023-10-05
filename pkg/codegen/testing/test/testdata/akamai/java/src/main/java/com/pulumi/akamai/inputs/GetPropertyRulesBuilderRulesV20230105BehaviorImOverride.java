// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorImOverride extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorImOverride Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorImOverride();

    @Import(name="dpr")
    private @Nullable Double dpr;

    public Optional<Double> dpr() {
        return Optional.ofNullable(this.dpr);
    }

    @Import(name="dprvar")
    private @Nullable String dprvar;

    public Optional<String> dprvar() {
        return Optional.ofNullable(this.dprvar);
    }

    @Import(name="excludeAllQueryParameters")
    private @Nullable Boolean excludeAllQueryParameters;

    public Optional<Boolean> excludeAllQueryParameters() {
        return Optional.ofNullable(this.excludeAllQueryParameters);
    }

    @Import(name="excludedQueryParameters")
    private @Nullable List<String> excludedQueryParameters;

    public Optional<List<String>> excludedQueryParameters() {
        return Optional.ofNullable(this.excludedQueryParameters);
    }

    @Import(name="format")
    private @Nullable String format;

    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    @Import(name="formatvar")
    private @Nullable String formatvar;

    public Optional<String> formatvar() {
        return Optional.ofNullable(this.formatvar);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="override")
    private @Nullable String override;

    public Optional<String> override() {
        return Optional.ofNullable(this.override);
    }

    @Import(name="policy")
    private @Nullable String policy;

    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="policyvar")
    private @Nullable String policyvar;

    public Optional<String> policyvar() {
        return Optional.ofNullable(this.policyvar);
    }

    @Import(name="policyvarIMvar")
    private @Nullable String policyvarIMvar;

    public Optional<String> policyvarIMvar() {
        return Optional.ofNullable(this.policyvarIMvar);
    }

    @Import(name="policyvarName")
    private @Nullable String policyvarName;

    public Optional<String> policyvarName() {
        return Optional.ofNullable(this.policyvarName);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="typesel")
    private @Nullable String typesel;

    public Optional<String> typesel() {
        return Optional.ofNullable(this.typesel);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="width")
    private @Nullable Double width;

    public Optional<Double> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="widthvar")
    private @Nullable String widthvar;

    public Optional<String> widthvar() {
        return Optional.ofNullable(this.widthvar);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorImOverride() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorImOverride(GetPropertyRulesBuilderRulesV20230105BehaviorImOverride $) {
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
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorImOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorImOverride $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorImOverride();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorImOverride defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorImOverride(Objects.requireNonNull(defaults));
        }

        public Builder dpr(@Nullable Double dpr) {
            $.dpr = dpr;
            return this;
        }

        public Builder dprvar(@Nullable String dprvar) {
            $.dprvar = dprvar;
            return this;
        }

        public Builder excludeAllQueryParameters(@Nullable Boolean excludeAllQueryParameters) {
            $.excludeAllQueryParameters = excludeAllQueryParameters;
            return this;
        }

        public Builder excludedQueryParameters(@Nullable List<String> excludedQueryParameters) {
            $.excludedQueryParameters = excludedQueryParameters;
            return this;
        }

        public Builder excludedQueryParameters(String... excludedQueryParameters) {
            return excludedQueryParameters(List.of(excludedQueryParameters));
        }

        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        public Builder formatvar(@Nullable String formatvar) {
            $.formatvar = formatvar;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder override(@Nullable String override) {
            $.override = override;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            $.policy = policy;
            return this;
        }

        public Builder policyvar(@Nullable String policyvar) {
            $.policyvar = policyvar;
            return this;
        }

        public Builder policyvarIMvar(@Nullable String policyvarIMvar) {
            $.policyvarIMvar = policyvarIMvar;
            return this;
        }

        public Builder policyvarName(@Nullable String policyvarName) {
            $.policyvarName = policyvarName;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder typesel(@Nullable String typesel) {
            $.typesel = typesel;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder width(@Nullable Double width) {
            $.width = width;
            return this;
        }

        public Builder widthvar(@Nullable String widthvar) {
            $.widthvar = widthvar;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorImOverride build() {
            return $;
        }
    }

}
