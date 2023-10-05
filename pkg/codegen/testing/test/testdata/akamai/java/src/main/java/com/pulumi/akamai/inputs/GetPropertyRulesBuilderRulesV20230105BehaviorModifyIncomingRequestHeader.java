// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader();

    @Import(name="action")
    private @Nullable String action;

    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="avoidDuplicateHeaders")
    private @Nullable Boolean avoidDuplicateHeaders;

    public Optional<Boolean> avoidDuplicateHeaders() {
        return Optional.ofNullable(this.avoidDuplicateHeaders);
    }

    @Import(name="customHeaderName")
    private @Nullable String customHeaderName;

    public Optional<String> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    @Import(name="headerValue")
    private @Nullable String headerValue;

    public Optional<String> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="newHeaderValue")
    private @Nullable String newHeaderValue;

    public Optional<String> newHeaderValue() {
        return Optional.ofNullable(this.newHeaderValue);
    }

    @Import(name="standardAddHeaderName")
    private @Nullable String standardAddHeaderName;

    public Optional<String> standardAddHeaderName() {
        return Optional.ofNullable(this.standardAddHeaderName);
    }

    @Import(name="standardDeleteHeaderName")
    private @Nullable String standardDeleteHeaderName;

    public Optional<String> standardDeleteHeaderName() {
        return Optional.ofNullable(this.standardDeleteHeaderName);
    }

    @Import(name="standardModifyHeaderName")
    private @Nullable String standardModifyHeaderName;

    public Optional<String> standardModifyHeaderName() {
        return Optional.ofNullable(this.standardModifyHeaderName);
    }

    @Import(name="standardPassHeaderName")
    private @Nullable String standardPassHeaderName;

    public Optional<String> standardPassHeaderName() {
        return Optional.ofNullable(this.standardPassHeaderName);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader(GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader $) {
        this.action = $.action;
        this.avoidDuplicateHeaders = $.avoidDuplicateHeaders;
        this.customHeaderName = $.customHeaderName;
        this.headerValue = $.headerValue;
        this.locked = $.locked;
        this.newHeaderValue = $.newHeaderValue;
        this.standardAddHeaderName = $.standardAddHeaderName;
        this.standardDeleteHeaderName = $.standardDeleteHeaderName;
        this.standardModifyHeaderName = $.standardModifyHeaderName;
        this.standardPassHeaderName = $.standardPassHeaderName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable String action) {
            $.action = action;
            return this;
        }

        public Builder avoidDuplicateHeaders(@Nullable Boolean avoidDuplicateHeaders) {
            $.avoidDuplicateHeaders = avoidDuplicateHeaders;
            return this;
        }

        public Builder customHeaderName(@Nullable String customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        public Builder headerValue(@Nullable String headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder newHeaderValue(@Nullable String newHeaderValue) {
            $.newHeaderValue = newHeaderValue;
            return this;
        }

        public Builder standardAddHeaderName(@Nullable String standardAddHeaderName) {
            $.standardAddHeaderName = standardAddHeaderName;
            return this;
        }

        public Builder standardDeleteHeaderName(@Nullable String standardDeleteHeaderName) {
            $.standardDeleteHeaderName = standardDeleteHeaderName;
            return this;
        }

        public Builder standardModifyHeaderName(@Nullable String standardModifyHeaderName) {
            $.standardModifyHeaderName = standardModifyHeaderName;
            return this;
        }

        public Builder standardPassHeaderName(@Nullable String standardPassHeaderName) {
            $.standardPassHeaderName = standardPassHeaderName;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingRequestHeader build() {
            return $;
        }
    }

}
