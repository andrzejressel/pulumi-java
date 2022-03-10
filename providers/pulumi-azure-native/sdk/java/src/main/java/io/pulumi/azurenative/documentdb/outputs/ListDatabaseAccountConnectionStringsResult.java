// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.DatabaseAccountConnectionStringResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListDatabaseAccountConnectionStringsResult {
    /**
     * An array that contains the connection strings for the Cosmos DB account.
     * 
     */
    private final @Nullable List<DatabaseAccountConnectionStringResponse> connectionStrings;

    @OutputCustomType.Constructor
    private ListDatabaseAccountConnectionStringsResult(@OutputCustomType.Parameter("connectionStrings") @Nullable List<DatabaseAccountConnectionStringResponse> connectionStrings) {
        this.connectionStrings = connectionStrings;
    }

    /**
     * An array that contains the connection strings for the Cosmos DB account.
     * 
    */
    public List<DatabaseAccountConnectionStringResponse> getConnectionStrings() {
        return this.connectionStrings == null ? List.of() : this.connectionStrings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDatabaseAccountConnectionStringsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DatabaseAccountConnectionStringResponse> connectionStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDatabaseAccountConnectionStringsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionStrings = defaults.connectionStrings;
        }

        public Builder setConnectionStrings(@Nullable List<DatabaseAccountConnectionStringResponse> connectionStrings) {
            this.connectionStrings = connectionStrings;
            return this;
        }
        public ListDatabaseAccountConnectionStringsResult build() {
            return new ListDatabaseAccountConnectionStringsResult(connectionStrings);
        }
    }
}
