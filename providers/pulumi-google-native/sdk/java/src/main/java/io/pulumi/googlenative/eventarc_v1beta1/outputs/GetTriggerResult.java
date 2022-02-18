// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.DestinationResponse;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.MatchingCriteriaResponse;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.TransportResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    /**
     * The creation time.
     * 
     */
    private final String createTime;
    /**
     * Destination specifies where the events should be sent to.
     * 
     */
    private final DestinationResponse destination;
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    private final Map<String,String> labels;
    /**
     * null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
     * 
     */
    private final List<MatchingCriteriaResponse> matchingCriteria;
    /**
     * The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    private final String name;
    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
     * 
     */
    private final String serviceAccount;
    /**
     * In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    private final TransportResponse transport;
    /**
     * The last-modified time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","destination","etag","labels","matchingCriteria","name","serviceAccount","transport","updateTime"})
    private GetTriggerResult(
        String createTime,
        DestinationResponse destination,
        String etag,
        Map<String,String> labels,
        List<MatchingCriteriaResponse> matchingCriteria,
        String name,
        String serviceAccount,
        TransportResponse transport,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destination = Objects.requireNonNull(destination);
        this.etag = Objects.requireNonNull(etag);
        this.labels = Objects.requireNonNull(labels);
        this.matchingCriteria = Objects.requireNonNull(matchingCriteria);
        this.name = Objects.requireNonNull(name);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.transport = Objects.requireNonNull(transport);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The creation time.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Destination specifies where the events should be sent to.
     * 
     */
    public DestinationResponse getDestination() {
        return this.destination;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
     * 
     */
    public List<MatchingCriteriaResponse> getMatchingCriteria() {
        return this.matchingCriteria;
    }
    /**
     * The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
     * 
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    public TransportResponse getTransport() {
        return this.transport;
    }
    /**
     * The last-modified time.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DestinationResponse destination;
        private String etag;
        private Map<String,String> labels;
        private List<MatchingCriteriaResponse> matchingCriteria;
        private String name;
        private String serviceAccount;
        private TransportResponse transport;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.matchingCriteria = defaults.matchingCriteria;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transport = defaults.transport;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestination(DestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMatchingCriteria(List<MatchingCriteriaResponse> matchingCriteria) {
            this.matchingCriteria = Objects.requireNonNull(matchingCriteria);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setTransport(TransportResponse transport) {
            this.transport = Objects.requireNonNull(transport);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetTriggerResult build() {
            return new GetTriggerResult(createTime, destination, etag, labels, matchingCriteria, name, serviceAccount, transport, updateTime);
        }
    }
}
