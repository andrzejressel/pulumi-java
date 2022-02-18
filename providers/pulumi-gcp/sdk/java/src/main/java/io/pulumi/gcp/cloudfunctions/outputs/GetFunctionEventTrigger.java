// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudfunctions.outputs.GetFunctionEventTriggerFailurePolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetFunctionEventTrigger {
    /**
     * The type of event to observe. For example: `"google.storage.object.finalize"`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/)
     * for a full reference of accepted triggers.
     * 
     */
    private final String eventType;
    /**
     * Policy for failed executions. Structure is documented below.
     * 
     */
    private final List<GetFunctionEventTriggerFailurePolicy> failurePolicies;
    /**
     * The name of the resource whose events are being observed, for example, `"myBucket"`
     * 
     */
    private final String resource;

    @OutputCustomType.Constructor({"eventType","failurePolicies","resource"})
    private GetFunctionEventTrigger(
        String eventType,
        List<GetFunctionEventTriggerFailurePolicy> failurePolicies,
        String resource) {
        this.eventType = Objects.requireNonNull(eventType);
        this.failurePolicies = Objects.requireNonNull(failurePolicies);
        this.resource = Objects.requireNonNull(resource);
    }

    /**
     * The type of event to observe. For example: `"google.storage.object.finalize"`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/)
     * for a full reference of accepted triggers.
     * 
     */
    public String getEventType() {
        return this.eventType;
    }
    /**
     * Policy for failed executions. Structure is documented below.
     * 
     */
    public List<GetFunctionEventTriggerFailurePolicy> getFailurePolicies() {
        return this.failurePolicies;
    }
    /**
     * The name of the resource whose events are being observed, for example, `"myBucket"`
     * 
     */
    public String getResource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionEventTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventType;
        private List<GetFunctionEventTriggerFailurePolicy> failurePolicies;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionEventTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.failurePolicies = defaults.failurePolicies;
    	      this.resource = defaults.resource;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder setFailurePolicies(List<GetFunctionEventTriggerFailurePolicy> failurePolicies) {
            this.failurePolicies = Objects.requireNonNull(failurePolicies);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public GetFunctionEventTrigger build() {
            return new GetFunctionEventTrigger(eventType, failurePolicies, resource);
        }
    }
}
