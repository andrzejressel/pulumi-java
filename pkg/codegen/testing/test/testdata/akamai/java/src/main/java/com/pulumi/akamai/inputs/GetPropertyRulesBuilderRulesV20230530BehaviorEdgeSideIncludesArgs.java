// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs();

    @Import(name="detectInjection")
    private @Nullable Output<Boolean> detectInjection;

    public Optional<Output<Boolean>> detectInjection() {
        return Optional.ofNullable(this.detectInjection);
    }

    @Import(name="enableViaHttp")
    private @Nullable Output<Boolean> enableViaHttp;

    public Optional<Output<Boolean>> enableViaHttp() {
        return Optional.ofNullable(this.enableViaHttp);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="i18nCharsets")
    private @Nullable Output<List<String>> i18nCharsets;

    public Optional<Output<List<String>>> i18nCharsets() {
        return Optional.ofNullable(this.i18nCharsets);
    }

    @Import(name="i18nStatus")
    private @Nullable Output<Boolean> i18nStatus;

    public Optional<Output<Boolean>> i18nStatus() {
        return Optional.ofNullable(this.i18nStatus);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="passClientIp")
    private @Nullable Output<Boolean> passClientIp;

    public Optional<Output<Boolean>> passClientIp() {
        return Optional.ofNullable(this.passClientIp);
    }

    @Import(name="passSetCookie")
    private @Nullable Output<Boolean> passSetCookie;

    public Optional<Output<Boolean>> passSetCookie() {
        return Optional.ofNullable(this.passSetCookie);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs $) {
        this.detectInjection = $.detectInjection;
        this.enableViaHttp = $.enableViaHttp;
        this.enabled = $.enabled;
        this.i18nCharsets = $.i18nCharsets;
        this.i18nStatus = $.i18nStatus;
        this.locked = $.locked;
        this.passClientIp = $.passClientIp;
        this.passSetCookie = $.passSetCookie;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs(Objects.requireNonNull(defaults));
        }

        public Builder detectInjection(@Nullable Output<Boolean> detectInjection) {
            $.detectInjection = detectInjection;
            return this;
        }

        public Builder detectInjection(Boolean detectInjection) {
            return detectInjection(Output.of(detectInjection));
        }

        public Builder enableViaHttp(@Nullable Output<Boolean> enableViaHttp) {
            $.enableViaHttp = enableViaHttp;
            return this;
        }

        public Builder enableViaHttp(Boolean enableViaHttp) {
            return enableViaHttp(Output.of(enableViaHttp));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder i18nCharsets(@Nullable Output<List<String>> i18nCharsets) {
            $.i18nCharsets = i18nCharsets;
            return this;
        }

        public Builder i18nCharsets(List<String> i18nCharsets) {
            return i18nCharsets(Output.of(i18nCharsets));
        }

        public Builder i18nCharsets(String... i18nCharsets) {
            return i18nCharsets(List.of(i18nCharsets));
        }

        public Builder i18nStatus(@Nullable Output<Boolean> i18nStatus) {
            $.i18nStatus = i18nStatus;
            return this;
        }

        public Builder i18nStatus(Boolean i18nStatus) {
            return i18nStatus(Output.of(i18nStatus));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder passClientIp(@Nullable Output<Boolean> passClientIp) {
            $.passClientIp = passClientIp;
            return this;
        }

        public Builder passClientIp(Boolean passClientIp) {
            return passClientIp(Output.of(passClientIp));
        }

        public Builder passSetCookie(@Nullable Output<Boolean> passSetCookie) {
            $.passSetCookie = passSetCookie;
            return this;
        }

        public Builder passSetCookie(Boolean passSetCookie) {
            return passSetCookie(Output.of(passSetCookie));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesArgs build() {
            return $;
        }
    }

}
