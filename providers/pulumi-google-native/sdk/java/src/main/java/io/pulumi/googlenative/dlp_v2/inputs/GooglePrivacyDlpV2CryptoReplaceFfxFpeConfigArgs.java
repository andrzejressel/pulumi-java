// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoKeyArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `ReidentifyContent` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See https://cloud.google.com/dlp/docs/pseudonymization to learn more. Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
 * 
 */
public final class GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs Empty = new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs();

    /**
     * Common alphabets.
     * 
     */
    @InputImport(name="commonAlphabet")
    private final @Nullable Input<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet;

    public Input<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> getCommonAlphabet() {
        return this.commonAlphabet == null ? Input.empty() : this.commonAlphabet;
    }

    /**
     * The 'tweak', a context may be used for higher security since the same identifier in two different contexts won't be given the same surrogate. If the context is not set, a default tweak will be used. If the context is set but: 1. there is no record present when transforming a given value or 1. the field is not present when transforming a given value, a default tweak will be used. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string. The tweak is constructed as a sequence of bytes in big endian byte order such that: - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in UTF-8 format followed by a single byte of value 2
     * 
     */
    @InputImport(name="context")
    private final @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> context;

    public Input<GooglePrivacyDlpV2FieldIdArgs> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * The key used by the encryption algorithm.
     * 
     */
    @InputImport(name="cryptoKey", required=true)
    private final Input<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;

    public Input<GooglePrivacyDlpV2CryptoKeyArgs> getCryptoKey() {
        return this.cryptoKey;
    }

    /**
     * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range [2, 95]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is: 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&*()_-+={[}]|\:;"'<,>.?/
     * 
     */
    @InputImport(name="customAlphabet")
    private final @Nullable Input<String> customAlphabet;

    public Input<String> getCustomAlphabet() {
        return this.customAlphabet == null ? Input.empty() : this.customAlphabet;
    }

    /**
     * The native way to select the alphabet. Must be in the range [2, 95].
     * 
     */
    @InputImport(name="radix")
    private final @Nullable Input<Integer> radix;

    public Input<Integer> getRadix() {
        return this.radix == null ? Input.empty() : this.radix;
    }

    /**
     * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info_type_name(surrogate_character_count):surrogate For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc' This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text. In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
     * 
     */
    @InputImport(name="surrogateInfoType")
    private final @Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType;

    public Input<GooglePrivacyDlpV2InfoTypeArgs> getSurrogateInfoType() {
        return this.surrogateInfoType == null ? Input.empty() : this.surrogateInfoType;
    }

    public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs(
        @Nullable Input<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet,
        @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> context,
        Input<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey,
        @Nullable Input<String> customAlphabet,
        @Nullable Input<Integer> radix,
        @Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType) {
        this.commonAlphabet = commonAlphabet;
        this.context = context;
        this.cryptoKey = Objects.requireNonNull(cryptoKey, "expected parameter 'cryptoKey' to be non-null");
        this.customAlphabet = customAlphabet;
        this.radix = radix;
        this.surrogateInfoType = surrogateInfoType;
    }

    private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs() {
        this.commonAlphabet = Input.empty();
        this.context = Input.empty();
        this.cryptoKey = Input.empty();
        this.customAlphabet = Input.empty();
        this.radix = Input.empty();
        this.surrogateInfoType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet;
        private @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> context;
        private Input<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;
        private @Nullable Input<String> customAlphabet;
        private @Nullable Input<Integer> radix;
        private @Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAlphabet = defaults.commonAlphabet;
    	      this.context = defaults.context;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.customAlphabet = defaults.customAlphabet;
    	      this.radix = defaults.radix;
    	      this.surrogateInfoType = defaults.surrogateInfoType;
        }

        public Builder setCommonAlphabet(@Nullable Input<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet) {
            this.commonAlphabet = commonAlphabet;
            return this;
        }

        public Builder setCommonAlphabet(@Nullable GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet commonAlphabet) {
            this.commonAlphabet = Input.ofNullable(commonAlphabet);
            return this;
        }

        public Builder setContext(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable GooglePrivacyDlpV2FieldIdArgs context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setCryptoKey(Input<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder setCryptoKey(GooglePrivacyDlpV2CryptoKeyArgs cryptoKey) {
            this.cryptoKey = Input.of(Objects.requireNonNull(cryptoKey));
            return this;
        }

        public Builder setCustomAlphabet(@Nullable Input<String> customAlphabet) {
            this.customAlphabet = customAlphabet;
            return this;
        }

        public Builder setCustomAlphabet(@Nullable String customAlphabet) {
            this.customAlphabet = Input.ofNullable(customAlphabet);
            return this;
        }

        public Builder setRadix(@Nullable Input<Integer> radix) {
            this.radix = radix;
            return this;
        }

        public Builder setRadix(@Nullable Integer radix) {
            this.radix = Input.ofNullable(radix);
            return this;
        }

        public Builder setSurrogateInfoType(@Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType) {
            this.surrogateInfoType = surrogateInfoType;
            return this;
        }

        public Builder setSurrogateInfoType(@Nullable GooglePrivacyDlpV2InfoTypeArgs surrogateInfoType) {
            this.surrogateInfoType = Input.ofNullable(surrogateInfoType);
            return this;
        }

        public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs build() {
            return new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs(commonAlphabet, context, cryptoKey, customAlphabet, radix, surrogateInfoType);
        }
    }
}
