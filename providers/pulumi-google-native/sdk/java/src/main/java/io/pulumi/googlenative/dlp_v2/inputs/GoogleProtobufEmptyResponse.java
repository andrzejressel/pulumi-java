// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


/**
 * A generic empty message that you can re-use to avoid defining duplicated empty messages in your APIs. A typical example is to use it as the request or the response type of an API method. For instance: service Foo { rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty); } The JSON representation for `Empty` is empty JSON object `{}`.
 * 
 */
public final class GoogleProtobufEmptyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleProtobufEmptyResponse Empty = new GoogleProtobufEmptyResponse();

    public GoogleProtobufEmptyResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleProtobufEmptyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleProtobufEmptyResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleProtobufEmptyResponse build() {
            return new GoogleProtobufEmptyResponse();
        }
    }
}
