// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.RoutineArgs;
import com.pulumi.gcp.bigquery.inputs.RoutineState;
import com.pulumi.gcp.bigquery.outputs.RoutineArgument;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A user-defined function or a stored procedure that belongs to a Dataset
 * 
 * To get more information about Routine, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/routines)
 * * How-to Guides
 *     * [Routines Intro](https://cloud.google.com/bigquery/docs/reference/rest/v2/routines)
 * 
 * ## Example Usage
 * ### Big Query Routine Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new Dataset(&#34;test&#34;, DatasetArgs.builder()        
 *             .datasetId(&#34;dataset_id&#34;)
 *             .build());
 * 
 *         var sproc = new Routine(&#34;sproc&#34;, RoutineArgs.builder()        
 *             .datasetId(test.getDatasetId())
 *             .routineId(&#34;routine_id&#34;)
 *             .routineType(&#34;PROCEDURE&#34;)
 *             .language(&#34;SQL&#34;)
 *             .definitionBody(&#34;CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Routine can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/routine:Routine default projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/routine:Routine default {{project}}/{{dataset_id}}/{{routine_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/routine:Routine default {{dataset_id}}/{{routine_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/routine:Routine")
public class Routine extends com.pulumi.resources.CustomResource {
    /**
     * Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * 
     */
    @Export(name="arguments", type=List.class, parameters={RoutineArgument.class})
    private Output</* @Nullable */ List<RoutineArgument>> arguments;

    /**
     * @return Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<RoutineArgument>>> arguments() {
        return Codegen.optional(this.arguments);
    }
    /**
     * The time when this routine was created, in milliseconds since the epoch.
     * 
     */
    @Export(name="creationTime", type=Integer.class, parameters={})
    private Output<Integer> creationTime;

    /**
     * @return The time when this routine was created, in milliseconds since the epoch.
     * 
     */
    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    /**
     * The ID of the dataset containing this routine
     * 
     */
    @Export(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this routine
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }
    /**
     * The body of the routine. For functions, this is the expression in the AS clause.
     * If language=SQL, it is the substring inside (but excluding) the parentheses.
     * 
     */
    @Export(name="definitionBody", type=String.class, parameters={})
    private Output<String> definitionBody;

    /**
     * @return The body of the routine. For functions, this is the expression in the AS clause.
     * If language=SQL, it is the substring inside (but excluding) the parentheses.
     * 
     */
    public Output<String> definitionBody() {
        return this.definitionBody;
    }
    /**
     * The description of the routine if defined.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the routine if defined.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The determinism level of the JavaScript UDF if defined.
     * Possible values are `DETERMINISM_LEVEL_UNSPECIFIED`, `DETERMINISTIC`, and `NOT_DETERMINISTIC`.
     * 
     */
    @Export(name="determinismLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> determinismLevel;

    /**
     * @return The determinism level of the JavaScript UDF if defined.
     * Possible values are `DETERMINISM_LEVEL_UNSPECIFIED`, `DETERMINISTIC`, and `NOT_DETERMINISTIC`.
     * 
     */
    public Output<Optional<String>> determinismLevel() {
        return Codegen.optional(this.determinismLevel);
    }
    /**
     * Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the
     * imported JAVASCRIPT libraries.
     * 
     */
    @Export(name="importedLibraries", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> importedLibraries;

    /**
     * @return Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the
     * imported JAVASCRIPT libraries.
     * 
     */
    public Output<Optional<List<String>>> importedLibraries() {
        return Codegen.optional(this.importedLibraries);
    }
    /**
     * The language of the routine.
     * Possible values are `SQL` and `JAVASCRIPT`.
     * 
     */
    @Export(name="language", type=String.class, parameters={})
    private Output</* @Nullable */ String> language;

    /**
     * @return The language of the routine.
     * Possible values are `SQL` and `JAVASCRIPT`.
     * 
     */
    public Output<Optional<String>> language() {
        return Codegen.optional(this.language);
    }
    /**
     * The time when this routine was modified, in milliseconds since the epoch.
     * 
     */
    @Export(name="lastModifiedTime", type=Integer.class, parameters={})
    private Output<Integer> lastModifiedTime;

    /**
     * @return The time when this routine was modified, in milliseconds since the epoch.
     * 
     */
    public Output<Integer> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. Can be set only if routineType = &#34;TABLE_VALUED_FUNCTION&#34;.
     * If absent, the return table type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the columns in the evaluated table result will
     * be cast to match the column types specificed in return table type, at query time.
     * 
     */
    @Export(name="returnTableType", type=String.class, parameters={})
    private Output</* @Nullable */ String> returnTableType;

    /**
     * @return Optional. Can be set only if routineType = &#34;TABLE_VALUED_FUNCTION&#34;.
     * If absent, the return table type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the columns in the evaluated table result will
     * be cast to match the column types specificed in return table type, at query time.
     * 
     */
    public Output<Optional<String>> returnTableType() {
        return Codegen.optional(this.returnTableType);
    }
    /**
     * A JSON schema for the return type. Optional if language = &#34;SQL&#34;; required otherwise.
     * If absent, the return type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the evaluated result will be cast to
     * the specified returned type at query time. ~&gt;**NOTE**: Because this field expects a JSON
     * string, any changes to the string will create a diff, even if the JSON itself hasn&#39;t
     * changed. If the API returns a different value for the same schema, e.g. it switche
     * d the order of values or replaced STRUCT field type with RECORD field type, we currently
     * cannot suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    @Export(name="returnType", type=String.class, parameters={})
    private Output</* @Nullable */ String> returnType;

    /**
     * @return A JSON schema for the return type. Optional if language = &#34;SQL&#34;; required otherwise.
     * If absent, the return type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the evaluated result will be cast to
     * the specified returned type at query time. ~&gt;**NOTE**: Because this field expects a JSON
     * string, any changes to the string will create a diff, even if the JSON itself hasn&#39;t
     * changed. If the API returns a different value for the same schema, e.g. it switche
     * d the order of values or replaced STRUCT field type with RECORD field type, we currently
     * cannot suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    public Output<Optional<String>> returnType() {
        return Codegen.optional(this.returnType);
    }
    /**
     * The ID of the the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    @Export(name="routineId", type=String.class, parameters={})
    private Output<String> routineId;

    /**
     * @return The ID of the the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    public Output<String> routineId() {
        return this.routineId;
    }
    /**
     * The type of routine.
     * Possible values are `SCALAR_FUNCTION`, `PROCEDURE`, and `TABLE_VALUED_FUNCTION`.
     * 
     */
    @Export(name="routineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> routineType;

    /**
     * @return The type of routine.
     * Possible values are `SCALAR_FUNCTION`, `PROCEDURE`, and `TABLE_VALUED_FUNCTION`.
     * 
     */
    public Output<Optional<String>> routineType() {
        return Codegen.optional(this.routineType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Routine(String name) {
        this(name, RoutineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Routine(String name, RoutineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Routine(String name, RoutineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/routine:Routine", name, args == null ? RoutineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Routine(String name, Output<String> id, @Nullable RoutineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/routine:Routine", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Routine get(String name, Output<String> id, @Nullable RoutineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Routine(name, id, state, options);
    }
}
