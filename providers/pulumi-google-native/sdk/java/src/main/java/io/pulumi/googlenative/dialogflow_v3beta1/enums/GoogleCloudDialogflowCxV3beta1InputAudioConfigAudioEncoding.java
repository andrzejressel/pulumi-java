// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Audio encoding of the audio content to process.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding {
        /**
         * Not specified.
         * 
         */
        AudioEncodingUnspecified("AUDIO_ENCODING_UNSPECIFIED"),
        /**
         * Uncompressed 16-bit signed little-endian samples (Linear PCM).
         * 
         */
        AudioEncodingLinear16("AUDIO_ENCODING_LINEAR_16"),
        /**
         * [`FLAC`](https://xiph.org/flac/documentation.html) (Free Lossless Audio Codec) is the recommended encoding because it is lossless (therefore recognition is not compromised) and requires only about half the bandwidth of `LINEAR16`. `FLAC` stream encoding supports 16-bit and 24-bit samples, however, not all fields in `STREAMINFO` are supported.
         * 
         */
        AudioEncodingFlac("AUDIO_ENCODING_FLAC"),
        /**
         * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
         * 
         */
        AudioEncodingMulaw("AUDIO_ENCODING_MULAW"),
        /**
         * Adaptive Multi-Rate Narrowband codec. `sample_rate_hertz` must be 8000.
         * 
         */
        AudioEncodingAmr("AUDIO_ENCODING_AMR"),
        /**
         * Adaptive Multi-Rate Wideband codec. `sample_rate_hertz` must be 16000.
         * 
         */
        AudioEncodingAmrWb("AUDIO_ENCODING_AMR_WB"),
        /**
         * Opus encoded audio frames in Ogg container ([OggOpus](https://wiki.xiph.org/OggOpus)). `sample_rate_hertz` must be 16000.
         * 
         */
        AudioEncodingOggOpus("AUDIO_ENCODING_OGG_OPUS"),
        /**
         * Although the use of lossy encodings is not recommended, if a very low bitrate encoding is required, `OGG_OPUS` is highly preferred over Speex encoding. The [Speex](https://speex.org/) encoding supported by Dialogflow API has a header byte in each block, as in MIME type `audio/x-speex-with-header-byte`. It is a variant of the RTP Speex encoding defined in [RFC 5574](https://tools.ietf.org/html/rfc5574). The stream is a sequence of blocks, one block per RTP packet. Each block starts with a byte containing the length of the block, in bytes, followed by one or more frames of Speex data, padded to an integral number of bytes (octets) as specified in RFC 5574. In other words, each RTP header is replaced with a single byte containing the block length. Only Speex wideband is supported. `sample_rate_hertz` must be 16000.
         * 
         */
        AudioEncodingSpeexWithHeaderByte("AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE");

        private final String value;

        GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
