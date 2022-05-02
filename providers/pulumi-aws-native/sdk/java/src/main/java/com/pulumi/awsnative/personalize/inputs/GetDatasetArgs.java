// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetArgs Empty = new GetDatasetArgs();

    /**
     * The ARN of the dataset
     * 
     */
    @Import(name="datasetArn", required=true)
    private String datasetArn;

    /**
     * @return The ARN of the dataset
     * 
     */
    public String datasetArn() {
        return this.datasetArn;
    }

    private GetDatasetArgs() {}

    private GetDatasetArgs(GetDatasetArgs $) {
        this.datasetArn = $.datasetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetArgs $;

        public Builder() {
            $ = new GetDatasetArgs();
        }

        public Builder(GetDatasetArgs defaults) {
            $ = new GetDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetArn The ARN of the dataset
         * 
         * @return builder
         * 
         */
        public Builder datasetArn(String datasetArn) {
            $.datasetArn = datasetArn;
            return this;
        }

        public GetDatasetArgs build() {
            $.datasetArn = Objects.requireNonNull($.datasetArn, "expected parameter 'datasetArn' to be non-null");
            return $;
        }
    }

}
