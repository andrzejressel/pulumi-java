// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configuration for running an Apache Spark (https://spark.apache.org/) batch workload.
 * 
 */
public final class SparkBatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkBatchArgs Empty = new SparkBatchArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @InputImport(name="archiveUris")
    private final @Nullable Input<List<String>> archiveUris;

    public Input<List<String>> getArchiveUris() {
        return this.archiveUris == null ? Input.empty() : this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @InputImport(name="args")
    private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @InputImport(name="fileUris")
    private final @Nullable Input<List<String>> fileUris;

    public Input<List<String>> getFileUris() {
        return this.fileUris == null ? Input.empty() : this.fileUris;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    @InputImport(name="jarFileUris")
    private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    /**
     * Optional. The name of the driver main class. The jar file that contains the class must be in the classpath or specified in jar_file_uris.
     * 
     */
    @InputImport(name="mainClass")
    private final @Nullable Input<String> mainClass;

    public Input<String> getMainClass() {
        return this.mainClass == null ? Input.empty() : this.mainClass;
    }

    /**
     * Optional. The HCFS URI of the jar file that contains the main class.
     * 
     */
    @InputImport(name="mainJarFileUri")
    private final @Nullable Input<String> mainJarFileUri;

    public Input<String> getMainJarFileUri() {
        return this.mainJarFileUri == null ? Input.empty() : this.mainJarFileUri;
    }

    public SparkBatchArgs(
        @Nullable Input<List<String>> archiveUris,
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> fileUris,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<String> mainClass,
        @Nullable Input<String> mainJarFileUri) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.mainClass = mainClass;
        this.mainJarFileUri = mainJarFileUri;
    }

    private SparkBatchArgs() {
        this.archiveUris = Input.empty();
        this.args = Input.empty();
        this.fileUris = Input.empty();
        this.jarFileUris = Input.empty();
        this.mainClass = Input.empty();
        this.mainJarFileUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> archiveUris;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> fileUris;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<String> mainClass;
        private @Nullable Input<String> mainJarFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkBatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
        }

        public Builder setArchiveUris(@Nullable Input<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }

        public Builder setArchiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Input.ofNullable(archiveUris);
            return this;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setFileUris(@Nullable Input<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }

        public Builder setFileUris(@Nullable List<String> fileUris) {
            this.fileUris = Input.ofNullable(fileUris);
            return this;
        }

        public Builder setJarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder setMainClass(@Nullable Input<String> mainClass) {
            this.mainClass = mainClass;
            return this;
        }

        public Builder setMainClass(@Nullable String mainClass) {
            this.mainClass = Input.ofNullable(mainClass);
            return this;
        }

        public Builder setMainJarFileUri(@Nullable Input<String> mainJarFileUri) {
            this.mainJarFileUri = mainJarFileUri;
            return this;
        }

        public Builder setMainJarFileUri(@Nullable String mainJarFileUri) {
            this.mainJarFileUri = Input.ofNullable(mainJarFileUri);
            return this;
        }

        public SparkBatchArgs build() {
            return new SparkBatchArgs(archiveUris, args, fileUris, jarFileUris, mainClass, mainJarFileUri);
        }
    }
}
