// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationCloudletPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs();

    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationCloudletPolicyArgs> cloudletPolicy;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="cloudletSharedPolicy")
    private @Nullable Output<Integer> cloudletSharedPolicy;

    public Optional<Output<Integer>> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="isSharedPolicy")
    private @Nullable Output<Boolean> isSharedPolicy;

    public Optional<Output<Boolean>> isSharedPolicy() {
        return Optional.ofNullable(this.isSharedPolicy);
    }

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="populationCookieAutomaticSalt")
    private @Nullable Output<Boolean> populationCookieAutomaticSalt;

    public Optional<Output<Boolean>> populationCookieAutomaticSalt() {
        return Optional.ofNullable(this.populationCookieAutomaticSalt);
    }

    @Import(name="populationCookieDomain")
    private @Nullable Output<String> populationCookieDomain;

    public Optional<Output<String>> populationCookieDomain() {
        return Optional.ofNullable(this.populationCookieDomain);
    }

    @Import(name="populationCookieIncludeRuleName")
    private @Nullable Output<Boolean> populationCookieIncludeRuleName;

    public Optional<Output<Boolean>> populationCookieIncludeRuleName() {
        return Optional.ofNullable(this.populationCookieIncludeRuleName);
    }

    @Import(name="populationCookieSalt")
    private @Nullable Output<String> populationCookieSalt;

    public Optional<Output<String>> populationCookieSalt() {
        return Optional.ofNullable(this.populationCookieSalt);
    }

    @Import(name="populationCookieType")
    private @Nullable Output<String> populationCookieType;

    public Optional<Output<String>> populationCookieType() {
        return Optional.ofNullable(this.populationCookieType);
    }

    @Import(name="populationDuration")
    private @Nullable Output<String> populationDuration;

    public Optional<Output<String>> populationDuration() {
        return Optional.ofNullable(this.populationDuration);
    }

    @Import(name="populationRefresh")
    private @Nullable Output<Boolean> populationRefresh;

    public Optional<Output<Boolean>> populationRefresh() {
        return Optional.ofNullable(this.populationRefresh);
    }

    @Import(name="populationTitle")
    private @Nullable Output<String> populationTitle;

    public Optional<Output<String>> populationTitle() {
        return Optional.ofNullable(this.populationTitle);
    }

    @Import(name="segmentTrackingCookieName")
    private @Nullable Output<String> segmentTrackingCookieName;

    public Optional<Output<String>> segmentTrackingCookieName() {
        return Optional.ofNullable(this.segmentTrackingCookieName);
    }

    @Import(name="segmentTrackingCustomHeader")
    private @Nullable Output<String> segmentTrackingCustomHeader;

    public Optional<Output<String>> segmentTrackingCustomHeader() {
        return Optional.ofNullable(this.segmentTrackingCustomHeader);
    }

    @Import(name="segmentTrackingMethod")
    private @Nullable Output<String> segmentTrackingMethod;

    public Optional<Output<String>> segmentTrackingMethod() {
        return Optional.ofNullable(this.segmentTrackingMethod);
    }

    @Import(name="segmentTrackingQueryParam")
    private @Nullable Output<String> segmentTrackingQueryParam;

    public Optional<Output<String>> segmentTrackingQueryParam() {
        return Optional.ofNullable(this.segmentTrackingQueryParam);
    }

    @Import(name="segmentTrackingTitle")
    private @Nullable Output<String> segmentTrackingTitle;

    public Optional<Output<String>> segmentTrackingTitle() {
        return Optional.ofNullable(this.segmentTrackingTitle);
    }

    @Import(name="specifyPopulationCookieDomain")
    private @Nullable Output<Boolean> specifyPopulationCookieDomain;

    public Optional<Output<Boolean>> specifyPopulationCookieDomain() {
        return Optional.ofNullable(this.specifyPopulationCookieDomain);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs(GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs $) {
        this.cloudletPolicy = $.cloudletPolicy;
        this.cloudletSharedPolicy = $.cloudletSharedPolicy;
        this.enabled = $.enabled;
        this.isSharedPolicy = $.isSharedPolicy;
        this.label = $.label;
        this.locked = $.locked;
        this.populationCookieAutomaticSalt = $.populationCookieAutomaticSalt;
        this.populationCookieDomain = $.populationCookieDomain;
        this.populationCookieIncludeRuleName = $.populationCookieIncludeRuleName;
        this.populationCookieSalt = $.populationCookieSalt;
        this.populationCookieType = $.populationCookieType;
        this.populationDuration = $.populationDuration;
        this.populationRefresh = $.populationRefresh;
        this.populationTitle = $.populationTitle;
        this.segmentTrackingCookieName = $.segmentTrackingCookieName;
        this.segmentTrackingCustomHeader = $.segmentTrackingCustomHeader;
        this.segmentTrackingMethod = $.segmentTrackingMethod;
        this.segmentTrackingQueryParam = $.segmentTrackingQueryParam;
        this.segmentTrackingTitle = $.segmentTrackingTitle;
        this.specifyPopulationCookieDomain = $.specifyPopulationCookieDomain;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        public Builder cloudletSharedPolicy(@Nullable Output<Integer> cloudletSharedPolicy) {
            $.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }

        public Builder cloudletSharedPolicy(Integer cloudletSharedPolicy) {
            return cloudletSharedPolicy(Output.of(cloudletSharedPolicy));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder isSharedPolicy(@Nullable Output<Boolean> isSharedPolicy) {
            $.isSharedPolicy = isSharedPolicy;
            return this;
        }

        public Builder isSharedPolicy(Boolean isSharedPolicy) {
            return isSharedPolicy(Output.of(isSharedPolicy));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder populationCookieAutomaticSalt(@Nullable Output<Boolean> populationCookieAutomaticSalt) {
            $.populationCookieAutomaticSalt = populationCookieAutomaticSalt;
            return this;
        }

        public Builder populationCookieAutomaticSalt(Boolean populationCookieAutomaticSalt) {
            return populationCookieAutomaticSalt(Output.of(populationCookieAutomaticSalt));
        }

        public Builder populationCookieDomain(@Nullable Output<String> populationCookieDomain) {
            $.populationCookieDomain = populationCookieDomain;
            return this;
        }

        public Builder populationCookieDomain(String populationCookieDomain) {
            return populationCookieDomain(Output.of(populationCookieDomain));
        }

        public Builder populationCookieIncludeRuleName(@Nullable Output<Boolean> populationCookieIncludeRuleName) {
            $.populationCookieIncludeRuleName = populationCookieIncludeRuleName;
            return this;
        }

        public Builder populationCookieIncludeRuleName(Boolean populationCookieIncludeRuleName) {
            return populationCookieIncludeRuleName(Output.of(populationCookieIncludeRuleName));
        }

        public Builder populationCookieSalt(@Nullable Output<String> populationCookieSalt) {
            $.populationCookieSalt = populationCookieSalt;
            return this;
        }

        public Builder populationCookieSalt(String populationCookieSalt) {
            return populationCookieSalt(Output.of(populationCookieSalt));
        }

        public Builder populationCookieType(@Nullable Output<String> populationCookieType) {
            $.populationCookieType = populationCookieType;
            return this;
        }

        public Builder populationCookieType(String populationCookieType) {
            return populationCookieType(Output.of(populationCookieType));
        }

        public Builder populationDuration(@Nullable Output<String> populationDuration) {
            $.populationDuration = populationDuration;
            return this;
        }

        public Builder populationDuration(String populationDuration) {
            return populationDuration(Output.of(populationDuration));
        }

        public Builder populationRefresh(@Nullable Output<Boolean> populationRefresh) {
            $.populationRefresh = populationRefresh;
            return this;
        }

        public Builder populationRefresh(Boolean populationRefresh) {
            return populationRefresh(Output.of(populationRefresh));
        }

        public Builder populationTitle(@Nullable Output<String> populationTitle) {
            $.populationTitle = populationTitle;
            return this;
        }

        public Builder populationTitle(String populationTitle) {
            return populationTitle(Output.of(populationTitle));
        }

        public Builder segmentTrackingCookieName(@Nullable Output<String> segmentTrackingCookieName) {
            $.segmentTrackingCookieName = segmentTrackingCookieName;
            return this;
        }

        public Builder segmentTrackingCookieName(String segmentTrackingCookieName) {
            return segmentTrackingCookieName(Output.of(segmentTrackingCookieName));
        }

        public Builder segmentTrackingCustomHeader(@Nullable Output<String> segmentTrackingCustomHeader) {
            $.segmentTrackingCustomHeader = segmentTrackingCustomHeader;
            return this;
        }

        public Builder segmentTrackingCustomHeader(String segmentTrackingCustomHeader) {
            return segmentTrackingCustomHeader(Output.of(segmentTrackingCustomHeader));
        }

        public Builder segmentTrackingMethod(@Nullable Output<String> segmentTrackingMethod) {
            $.segmentTrackingMethod = segmentTrackingMethod;
            return this;
        }

        public Builder segmentTrackingMethod(String segmentTrackingMethod) {
            return segmentTrackingMethod(Output.of(segmentTrackingMethod));
        }

        public Builder segmentTrackingQueryParam(@Nullable Output<String> segmentTrackingQueryParam) {
            $.segmentTrackingQueryParam = segmentTrackingQueryParam;
            return this;
        }

        public Builder segmentTrackingQueryParam(String segmentTrackingQueryParam) {
            return segmentTrackingQueryParam(Output.of(segmentTrackingQueryParam));
        }

        public Builder segmentTrackingTitle(@Nullable Output<String> segmentTrackingTitle) {
            $.segmentTrackingTitle = segmentTrackingTitle;
            return this;
        }

        public Builder segmentTrackingTitle(String segmentTrackingTitle) {
            return segmentTrackingTitle(Output.of(segmentTrackingTitle));
        }

        public Builder specifyPopulationCookieDomain(@Nullable Output<Boolean> specifyPopulationCookieDomain) {
            $.specifyPopulationCookieDomain = specifyPopulationCookieDomain;
            return this;
        }

        public Builder specifyPopulationCookieDomain(Boolean specifyPopulationCookieDomain) {
            return specifyPopulationCookieDomain(Output.of(specifyPopulationCookieDomain));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationArgs build() {
            return $;
        }
    }

}
