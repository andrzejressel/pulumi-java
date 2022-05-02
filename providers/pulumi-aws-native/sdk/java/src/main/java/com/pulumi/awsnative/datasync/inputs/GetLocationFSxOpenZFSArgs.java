// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationFSxOpenZFSArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationFSxOpenZFSArgs Empty = new GetLocationFSxOpenZFSArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx OpenZFS file system location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
    private String locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon FSx OpenZFS file system location that is created.
     * 
     */
    public String locationArn() {
        return this.locationArn;
    }

    private GetLocationFSxOpenZFSArgs() {}

    private GetLocationFSxOpenZFSArgs(GetLocationFSxOpenZFSArgs $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationFSxOpenZFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationFSxOpenZFSArgs $;

        public Builder() {
            $ = new GetLocationFSxOpenZFSArgs();
        }

        public Builder(GetLocationFSxOpenZFSArgs defaults) {
            $ = new GetLocationFSxOpenZFSArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon FSx OpenZFS file system location that is created.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        public GetLocationFSxOpenZFSArgs build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
