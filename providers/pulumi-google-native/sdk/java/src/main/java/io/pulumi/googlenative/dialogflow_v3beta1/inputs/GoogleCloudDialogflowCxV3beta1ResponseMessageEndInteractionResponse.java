// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import java.util.Objects;


/**
 * Indicates that interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only and not supposed to be defined by the user.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse();

    public GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse();
        }
    }
}
