// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.ConflictResolutionPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.ContainerPartitionKeyResponse;
import io.pulumi.azurenative.documentdb.outputs.IndexingPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.UniqueKeyPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GremlinGraphGetPropertiesResponseResource {
    /**
     * The conflict resolution policy for the graph.
     * 
     */
    private final @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
    /**
     * Default time to live
     * 
     */
    private final @Nullable Integer defaultTtl;
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * Name of the Cosmos DB Gremlin graph
     * 
     */
    private final String id;
    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the graph
     * 
     */
    private final @Nullable IndexingPolicyResponse indexingPolicy;
    /**
     * The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    private final @Nullable ContainerPartitionKeyResponse partitionKey;
    /**
     * A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;
    /**
     * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    private final @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

    @OutputCustomType.Constructor
    private GremlinGraphGetPropertiesResponseResource(
        @OutputCustomType.Parameter("conflictResolutionPolicy") @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy,
        @OutputCustomType.Parameter("defaultTtl") @Nullable Integer defaultTtl,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("indexingPolicy") @Nullable IndexingPolicyResponse indexingPolicy,
        @OutputCustomType.Parameter("partitionKey") @Nullable ContainerPartitionKeyResponse partitionKey,
        @OutputCustomType.Parameter("rid") String rid,
        @OutputCustomType.Parameter("ts") Double ts,
        @OutputCustomType.Parameter("uniqueKeyPolicy") @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.defaultTtl = defaultTtl;
        this.etag = etag;
        this.id = id;
        this.indexingPolicy = indexingPolicy;
        this.partitionKey = partitionKey;
        this.rid = rid;
        this.ts = ts;
        this.uniqueKeyPolicy = uniqueKeyPolicy;
    }

    /**
     * The conflict resolution policy for the graph.
     * 
    */
    public Optional<ConflictResolutionPolicyResponse> getConflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }
    /**
     * Default time to live
     * 
    */
    public Optional<Integer> getDefaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Name of the Cosmos DB Gremlin graph
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the graph
     * 
    */
    public Optional<IndexingPolicyResponse> getIndexingPolicy() {
        return Optional.ofNullable(this.indexingPolicy);
    }
    /**
     * The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
    */
    public Optional<ContainerPartitionKeyResponse> getPartitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * A system generated property. A unique identifier.
     * 
    */
    public String getRid() {
        return this.rid;
    }
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
    */
    public Double getTs() {
        return this.ts;
    }
    /**
     * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
    */
    public Optional<UniqueKeyPolicyResponse> getUniqueKeyPolicy() {
        return Optional.ofNullable(this.uniqueKeyPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GremlinGraphGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
        private @Nullable Integer defaultTtl;
        private String etag;
        private String id;
        private @Nullable IndexingPolicyResponse indexingPolicy;
        private @Nullable ContainerPartitionKeyResponse partitionKey;
        private String rid;
        private Double ts;
        private @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GremlinGraphGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexingPolicy = defaults.indexingPolicy;
    	      this.partitionKey = defaults.partitionKey;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
    	      this.uniqueKeyPolicy = defaults.uniqueKeyPolicy;
        }

        public Builder setConflictResolutionPolicy(@Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIndexingPolicy(@Nullable IndexingPolicyResponse indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }

        public Builder setPartitionKey(@Nullable ContainerPartitionKeyResponse partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public Builder setUniqueKeyPolicy(@Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
            this.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }
        public GremlinGraphGetPropertiesResponseResource build() {
            return new GremlinGraphGetPropertiesResponseResource(conflictResolutionPolicy, defaultTtl, etag, id, indexingPolicy, partitionKey, rid, ts, uniqueKeyPolicy);
        }
    }
}
