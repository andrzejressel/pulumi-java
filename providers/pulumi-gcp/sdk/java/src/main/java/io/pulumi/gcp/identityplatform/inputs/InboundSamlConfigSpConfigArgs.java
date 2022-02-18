// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigSpCertificateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundSamlConfigSpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundSamlConfigSpConfigArgs Empty = new InboundSamlConfigSpConfigArgs();

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    @InputImport(name="callbackUri")
    private final @Nullable Input<String> callbackUri;

    public Input<String> getCallbackUri() {
        return this.callbackUri == null ? Input.empty() : this.callbackUri;
    }

    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @InputImport(name="spCertificates")
    private final @Nullable Input<List<InboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;

    public Input<List<InboundSamlConfigSpConfigSpCertificateArgs>> getSpCertificates() {
        return this.spCertificates == null ? Input.empty() : this.spCertificates;
    }

    /**
     * Unique identifier for all SAML entities.
     * 
     */
    @InputImport(name="spEntityId")
    private final @Nullable Input<String> spEntityId;

    public Input<String> getSpEntityId() {
        return this.spEntityId == null ? Input.empty() : this.spEntityId;
    }

    public InboundSamlConfigSpConfigArgs(
        @Nullable Input<String> callbackUri,
        @Nullable Input<List<InboundSamlConfigSpConfigSpCertificateArgs>> spCertificates,
        @Nullable Input<String> spEntityId) {
        this.callbackUri = callbackUri;
        this.spCertificates = spCertificates;
        this.spEntityId = spEntityId;
    }

    private InboundSamlConfigSpConfigArgs() {
        this.callbackUri = Input.empty();
        this.spCertificates = Input.empty();
        this.spEntityId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigSpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> callbackUri;
        private @Nullable Input<List<InboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;
        private @Nullable Input<String> spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigSpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder setCallbackUri(@Nullable Input<String> callbackUri) {
            this.callbackUri = callbackUri;
            return this;
        }

        public Builder setCallbackUri(@Nullable String callbackUri) {
            this.callbackUri = Input.ofNullable(callbackUri);
            return this;
        }

        public Builder setSpCertificates(@Nullable Input<List<InboundSamlConfigSpConfigSpCertificateArgs>> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }

        public Builder setSpCertificates(@Nullable List<InboundSamlConfigSpConfigSpCertificateArgs> spCertificates) {
            this.spCertificates = Input.ofNullable(spCertificates);
            return this;
        }

        public Builder setSpEntityId(@Nullable Input<String> spEntityId) {
            this.spEntityId = spEntityId;
            return this;
        }

        public Builder setSpEntityId(@Nullable String spEntityId) {
            this.spEntityId = Input.ofNullable(spEntityId);
            return this;
        }

        public InboundSamlConfigSpConfigArgs build() {
            return new InboundSamlConfigSpConfigArgs(callbackUri, spCertificates, spEntityId);
        }
    }
}
