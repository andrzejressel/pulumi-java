// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyPairArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPairArgs Empty = new GetKeyPairArgs();

    /**
     * The name of the SSH key pair
     * 
     */
    @Import(name="keyName", required=true)
    private String keyName;

    /**
     * @return The name of the SSH key pair
     * 
     */
    public String keyName() {
        return this.keyName;
    }

    private GetKeyPairArgs() {}

    private GetKeyPairArgs(GetKeyPairArgs $) {
        this.keyName = $.keyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyPairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyPairArgs $;

        public Builder() {
            $ = new GetKeyPairArgs();
        }

        public Builder(GetKeyPairArgs defaults) {
            $ = new GetKeyPairArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of the SSH key pair
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            $.keyName = keyName;
            return this;
        }

        public GetKeyPairArgs build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            return $;
        }
    }

}
