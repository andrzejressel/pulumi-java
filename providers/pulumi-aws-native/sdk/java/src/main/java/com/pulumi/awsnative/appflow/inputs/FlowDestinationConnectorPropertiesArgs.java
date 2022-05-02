// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowEventBridgeDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowLookoutMetricsDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowMarketoDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowRedshiftDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowS3DestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSAPODataDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSalesforceDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSnowflakeDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowUpsolverDestinationPropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowZendeskDestinationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Destination connector details
 * 
 */
public final class FlowDestinationConnectorPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDestinationConnectorPropertiesArgs Empty = new FlowDestinationConnectorPropertiesArgs();

    @Import(name="eventBridge")
    private @Nullable Output<FlowEventBridgeDestinationPropertiesArgs> eventBridge;

    public Optional<Output<FlowEventBridgeDestinationPropertiesArgs>> eventBridge() {
        return Optional.ofNullable(this.eventBridge);
    }

    @Import(name="lookoutMetrics")
    private @Nullable Output<FlowLookoutMetricsDestinationPropertiesArgs> lookoutMetrics;

    public Optional<Output<FlowLookoutMetricsDestinationPropertiesArgs>> lookoutMetrics() {
        return Optional.ofNullable(this.lookoutMetrics);
    }

    @Import(name="marketo")
    private @Nullable Output<FlowMarketoDestinationPropertiesArgs> marketo;

    public Optional<Output<FlowMarketoDestinationPropertiesArgs>> marketo() {
        return Optional.ofNullable(this.marketo);
    }

    @Import(name="redshift")
    private @Nullable Output<FlowRedshiftDestinationPropertiesArgs> redshift;

    public Optional<Output<FlowRedshiftDestinationPropertiesArgs>> redshift() {
        return Optional.ofNullable(this.redshift);
    }

    @Import(name="s3")
    private @Nullable Output<FlowS3DestinationPropertiesArgs> s3;

    public Optional<Output<FlowS3DestinationPropertiesArgs>> s3() {
        return Optional.ofNullable(this.s3);
    }

    @Import(name="sAPOData")
    private @Nullable Output<FlowSAPODataDestinationPropertiesArgs> sAPOData;

    public Optional<Output<FlowSAPODataDestinationPropertiesArgs>> sAPOData() {
        return Optional.ofNullable(this.sAPOData);
    }

    @Import(name="salesforce")
    private @Nullable Output<FlowSalesforceDestinationPropertiesArgs> salesforce;

    public Optional<Output<FlowSalesforceDestinationPropertiesArgs>> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }

    @Import(name="snowflake")
    private @Nullable Output<FlowSnowflakeDestinationPropertiesArgs> snowflake;

    public Optional<Output<FlowSnowflakeDestinationPropertiesArgs>> snowflake() {
        return Optional.ofNullable(this.snowflake);
    }

    @Import(name="upsolver")
    private @Nullable Output<FlowUpsolverDestinationPropertiesArgs> upsolver;

    public Optional<Output<FlowUpsolverDestinationPropertiesArgs>> upsolver() {
        return Optional.ofNullable(this.upsolver);
    }

    @Import(name="zendesk")
    private @Nullable Output<FlowZendeskDestinationPropertiesArgs> zendesk;

    public Optional<Output<FlowZendeskDestinationPropertiesArgs>> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    private FlowDestinationConnectorPropertiesArgs() {}

    private FlowDestinationConnectorPropertiesArgs(FlowDestinationConnectorPropertiesArgs $) {
        this.eventBridge = $.eventBridge;
        this.lookoutMetrics = $.lookoutMetrics;
        this.marketo = $.marketo;
        this.redshift = $.redshift;
        this.s3 = $.s3;
        this.sAPOData = $.sAPOData;
        this.salesforce = $.salesforce;
        this.snowflake = $.snowflake;
        this.upsolver = $.upsolver;
        this.zendesk = $.zendesk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDestinationConnectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDestinationConnectorPropertiesArgs $;

        public Builder() {
            $ = new FlowDestinationConnectorPropertiesArgs();
        }

        public Builder(FlowDestinationConnectorPropertiesArgs defaults) {
            $ = new FlowDestinationConnectorPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventBridge(@Nullable Output<FlowEventBridgeDestinationPropertiesArgs> eventBridge) {
            $.eventBridge = eventBridge;
            return this;
        }

        public Builder eventBridge(FlowEventBridgeDestinationPropertiesArgs eventBridge) {
            return eventBridge(Output.of(eventBridge));
        }

        public Builder lookoutMetrics(@Nullable Output<FlowLookoutMetricsDestinationPropertiesArgs> lookoutMetrics) {
            $.lookoutMetrics = lookoutMetrics;
            return this;
        }

        public Builder lookoutMetrics(FlowLookoutMetricsDestinationPropertiesArgs lookoutMetrics) {
            return lookoutMetrics(Output.of(lookoutMetrics));
        }

        public Builder marketo(@Nullable Output<FlowMarketoDestinationPropertiesArgs> marketo) {
            $.marketo = marketo;
            return this;
        }

        public Builder marketo(FlowMarketoDestinationPropertiesArgs marketo) {
            return marketo(Output.of(marketo));
        }

        public Builder redshift(@Nullable Output<FlowRedshiftDestinationPropertiesArgs> redshift) {
            $.redshift = redshift;
            return this;
        }

        public Builder redshift(FlowRedshiftDestinationPropertiesArgs redshift) {
            return redshift(Output.of(redshift));
        }

        public Builder s3(@Nullable Output<FlowS3DestinationPropertiesArgs> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(FlowS3DestinationPropertiesArgs s3) {
            return s3(Output.of(s3));
        }

        public Builder sAPOData(@Nullable Output<FlowSAPODataDestinationPropertiesArgs> sAPOData) {
            $.sAPOData = sAPOData;
            return this;
        }

        public Builder sAPOData(FlowSAPODataDestinationPropertiesArgs sAPOData) {
            return sAPOData(Output.of(sAPOData));
        }

        public Builder salesforce(@Nullable Output<FlowSalesforceDestinationPropertiesArgs> salesforce) {
            $.salesforce = salesforce;
            return this;
        }

        public Builder salesforce(FlowSalesforceDestinationPropertiesArgs salesforce) {
            return salesforce(Output.of(salesforce));
        }

        public Builder snowflake(@Nullable Output<FlowSnowflakeDestinationPropertiesArgs> snowflake) {
            $.snowflake = snowflake;
            return this;
        }

        public Builder snowflake(FlowSnowflakeDestinationPropertiesArgs snowflake) {
            return snowflake(Output.of(snowflake));
        }

        public Builder upsolver(@Nullable Output<FlowUpsolverDestinationPropertiesArgs> upsolver) {
            $.upsolver = upsolver;
            return this;
        }

        public Builder upsolver(FlowUpsolverDestinationPropertiesArgs upsolver) {
            return upsolver(Output.of(upsolver));
        }

        public Builder zendesk(@Nullable Output<FlowZendeskDestinationPropertiesArgs> zendesk) {
            $.zendesk = zendesk;
            return this;
        }

        public Builder zendesk(FlowZendeskDestinationPropertiesArgs zendesk) {
            return zendesk(Output.of(zendesk));
        }

        public FlowDestinationConnectorPropertiesArgs build() {
            return $;
        }
    }

}
