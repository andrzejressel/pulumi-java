// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer();

    @Import(name="accessControl")
    private @Nullable Boolean accessControl;

    public Optional<Boolean> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }

    @Import(name="cacheKey")
    private @Nullable Boolean cacheKey;

    public Optional<Boolean> cacheKey() {
        return Optional.ofNullable(this.cacheKey);
    }

    @Import(name="caching")
    private @Nullable Boolean caching;

    public Optional<Boolean> caching() {
        return Optional.ofNullable(this.caching);
    }

    @Import(name="contentCompressor")
    private @Nullable Boolean contentCompressor;

    public Optional<Boolean> contentCompressor() {
        return Optional.ofNullable(this.contentCompressor);
    }

    @Import(name="dynamicWebContent")
    private @Nullable Boolean dynamicWebContent;

    public Optional<Boolean> dynamicWebContent() {
        return Optional.ofNullable(this.dynamicWebContent);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="geoLocation")
    private @Nullable Boolean geoLocation;

    public Optional<Boolean> geoLocation() {
        return Optional.ofNullable(this.geoLocation);
    }

    @Import(name="ip")
    private @Nullable Boolean ip;

    public Optional<Boolean> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="largeFileDelivery")
    private @Nullable Boolean largeFileDelivery;

    public Optional<Boolean> largeFileDelivery() {
        return Optional.ofNullable(this.largeFileDelivery);
    }

    @Import(name="liveVideoDelivery")
    private @Nullable Boolean liveVideoDelivery;

    public Optional<Boolean> liveVideoDelivery() {
        return Optional.ofNullable(this.liveVideoDelivery);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="modifyPath")
    private @Nullable Boolean modifyPath;

    public Optional<Boolean> modifyPath() {
        return Optional.ofNullable(this.modifyPath);
    }

    @Import(name="onDemandVideoDelivery")
    private @Nullable Boolean onDemandVideoDelivery;

    public Optional<Boolean> onDemandVideoDelivery() {
        return Optional.ofNullable(this.onDemandVideoDelivery);
    }

    @Import(name="origin")
    private @Nullable Boolean origin;

    public Optional<Boolean> origin() {
        return Optional.ofNullable(this.origin);
    }

    @Import(name="partnerDomainSuffix")
    private @Nullable String partnerDomainSuffix;

    public Optional<String> partnerDomainSuffix() {
        return Optional.ofNullable(this.partnerDomainSuffix);
    }

    @Import(name="referrer")
    private @Nullable Boolean referrer;

    public Optional<Boolean> referrer() {
        return Optional.ofNullable(this.referrer);
    }

    @Import(name="refreshContent")
    private @Nullable Boolean refreshContent;

    public Optional<Boolean> refreshContent() {
        return Optional.ofNullable(this.refreshContent);
    }

    @Import(name="siteFailover")
    private @Nullable Boolean siteFailover;

    public Optional<Boolean> siteFailover() {
        return Optional.ofNullable(this.siteFailover);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="tokenAuthorization")
    private @Nullable Boolean tokenAuthorization;

    public Optional<Boolean> tokenAuthorization() {
        return Optional.ofNullable(this.tokenAuthorization);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="webApplicationFirewall")
    private @Nullable Boolean webApplicationFirewall;

    public Optional<Boolean> webApplicationFirewall() {
        return Optional.ofNullable(this.webApplicationFirewall);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer(GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer $) {
        this.accessControl = $.accessControl;
        this.cacheKey = $.cacheKey;
        this.caching = $.caching;
        this.contentCompressor = $.contentCompressor;
        this.dynamicWebContent = $.dynamicWebContent;
        this.enabled = $.enabled;
        this.geoLocation = $.geoLocation;
        this.ip = $.ip;
        this.largeFileDelivery = $.largeFileDelivery;
        this.liveVideoDelivery = $.liveVideoDelivery;
        this.locked = $.locked;
        this.modifyPath = $.modifyPath;
        this.onDemandVideoDelivery = $.onDemandVideoDelivery;
        this.origin = $.origin;
        this.partnerDomainSuffix = $.partnerDomainSuffix;
        this.referrer = $.referrer;
        this.refreshContent = $.refreshContent;
        this.siteFailover = $.siteFailover;
        this.templateUuid = $.templateUuid;
        this.tokenAuthorization = $.tokenAuthorization;
        this.uuid = $.uuid;
        this.webApplicationFirewall = $.webApplicationFirewall;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer(Objects.requireNonNull(defaults));
        }

        public Builder accessControl(@Nullable Boolean accessControl) {
            $.accessControl = accessControl;
            return this;
        }

        public Builder cacheKey(@Nullable Boolean cacheKey) {
            $.cacheKey = cacheKey;
            return this;
        }

        public Builder caching(@Nullable Boolean caching) {
            $.caching = caching;
            return this;
        }

        public Builder contentCompressor(@Nullable Boolean contentCompressor) {
            $.contentCompressor = contentCompressor;
            return this;
        }

        public Builder dynamicWebContent(@Nullable Boolean dynamicWebContent) {
            $.dynamicWebContent = dynamicWebContent;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder geoLocation(@Nullable Boolean geoLocation) {
            $.geoLocation = geoLocation;
            return this;
        }

        public Builder ip(@Nullable Boolean ip) {
            $.ip = ip;
            return this;
        }

        public Builder largeFileDelivery(@Nullable Boolean largeFileDelivery) {
            $.largeFileDelivery = largeFileDelivery;
            return this;
        }

        public Builder liveVideoDelivery(@Nullable Boolean liveVideoDelivery) {
            $.liveVideoDelivery = liveVideoDelivery;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder modifyPath(@Nullable Boolean modifyPath) {
            $.modifyPath = modifyPath;
            return this;
        }

        public Builder onDemandVideoDelivery(@Nullable Boolean onDemandVideoDelivery) {
            $.onDemandVideoDelivery = onDemandVideoDelivery;
            return this;
        }

        public Builder origin(@Nullable Boolean origin) {
            $.origin = origin;
            return this;
        }

        public Builder partnerDomainSuffix(@Nullable String partnerDomainSuffix) {
            $.partnerDomainSuffix = partnerDomainSuffix;
            return this;
        }

        public Builder referrer(@Nullable Boolean referrer) {
            $.referrer = referrer;
            return this;
        }

        public Builder refreshContent(@Nullable Boolean refreshContent) {
            $.refreshContent = refreshContent;
            return this;
        }

        public Builder siteFailover(@Nullable Boolean siteFailover) {
            $.siteFailover = siteFailover;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder tokenAuthorization(@Nullable Boolean tokenAuthorization) {
            $.tokenAuthorization = tokenAuthorization;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder webApplicationFirewall(@Nullable Boolean webApplicationFirewall) {
            $.webApplicationFirewall = webApplicationFirewall;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomer build() {
            return $;
        }
    }

}
