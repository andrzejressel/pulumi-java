// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.inputs.WorkerSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Taskrunner configuration settings.
 * 
 */
public final class TaskRunnerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskRunnerSettingsArgs Empty = new TaskRunnerSettingsArgs();

    /**
     * Whether to also send taskrunner log info to stderr.
     * 
     */
    @InputImport(name="alsologtostderr")
    private final @Nullable Input<Boolean> alsologtostderr;

    public Input<Boolean> getAlsologtostderr() {
        return this.alsologtostderr == null ? Input.empty() : this.alsologtostderr;
    }

    /**
     * The location on the worker for task-specific subdirectories.
     * 
     */
    @InputImport(name="baseTaskDir")
    private final @Nullable Input<String> baseTaskDir;

    public Input<String> getBaseTaskDir() {
        return this.baseTaskDir == null ? Input.empty() : this.baseTaskDir;
    }

    /**
     * The base URL for the taskrunner to use when accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators". If not specified, the default value is "http://www.googleapis.com/"
     * 
     */
    @InputImport(name="baseUrl")
    private final @Nullable Input<String> baseUrl;

    public Input<String> getBaseUrl() {
        return this.baseUrl == null ? Input.empty() : this.baseUrl;
    }

    /**
     * The file to store preprocessing commands in.
     * 
     */
    @InputImport(name="commandlinesFileName")
    private final @Nullable Input<String> commandlinesFileName;

    public Input<String> getCommandlinesFileName() {
        return this.commandlinesFileName == null ? Input.empty() : this.commandlinesFileName;
    }

    /**
     * Whether to continue taskrunner if an exception is hit.
     * 
     */
    @InputImport(name="continueOnException")
    private final @Nullable Input<Boolean> continueOnException;

    public Input<Boolean> getContinueOnException() {
        return this.continueOnException == null ? Input.empty() : this.continueOnException;
    }

    /**
     * The API version of endpoint, e.g. "v1b3"
     * 
     */
    @InputImport(name="dataflowApiVersion")
    private final @Nullable Input<String> dataflowApiVersion;

    public Input<String> getDataflowApiVersion() {
        return this.dataflowApiVersion == null ? Input.empty() : this.dataflowApiVersion;
    }

    /**
     * The command to launch the worker harness.
     * 
     */
    @InputImport(name="harnessCommand")
    private final @Nullable Input<String> harnessCommand;

    public Input<String> getHarnessCommand() {
        return this.harnessCommand == null ? Input.empty() : this.harnessCommand;
    }

    /**
     * The suggested backend language.
     * 
     */
    @InputImport(name="languageHint")
    private final @Nullable Input<String> languageHint;

    public Input<String> getLanguageHint() {
        return this.languageHint == null ? Input.empty() : this.languageHint;
    }

    /**
     * The directory on the VM to store logs.
     * 
     */
    @InputImport(name="logDir")
    private final @Nullable Input<String> logDir;

    public Input<String> getLogDir() {
        return this.logDir == null ? Input.empty() : this.logDir;
    }

    /**
     * Whether to send taskrunner log info to Google Compute Engine VM serial console.
     * 
     */
    @InputImport(name="logToSerialconsole")
    private final @Nullable Input<Boolean> logToSerialconsole;

    public Input<Boolean> getLogToSerialconsole() {
        return this.logToSerialconsole == null ? Input.empty() : this.logToSerialconsole;
    }

    /**
     * Indicates where to put logs. If this is not specified, the logs will not be uploaded. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @InputImport(name="logUploadLocation")
    private final @Nullable Input<String> logUploadLocation;

    public Input<String> getLogUploadLocation() {
        return this.logUploadLocation == null ? Input.empty() : this.logUploadLocation;
    }

    /**
     * The OAuth2 scopes to be requested by the taskrunner in order to access the Cloud Dataflow API.
     * 
     */
    @InputImport(name="oauthScopes")
    private final @Nullable Input<List<String>> oauthScopes;

    public Input<List<String>> getOauthScopes() {
        return this.oauthScopes == null ? Input.empty() : this.oauthScopes;
    }

    /**
     * The settings to pass to the parallel worker harness.
     * 
     */
    @InputImport(name="parallelWorkerSettings")
    private final @Nullable Input<WorkerSettingsArgs> parallelWorkerSettings;

    public Input<WorkerSettingsArgs> getParallelWorkerSettings() {
        return this.parallelWorkerSettings == null ? Input.empty() : this.parallelWorkerSettings;
    }

    /**
     * The streaming worker main class name.
     * 
     */
    @InputImport(name="streamingWorkerMainClass")
    private final @Nullable Input<String> streamingWorkerMainClass;

    public Input<String> getStreamingWorkerMainClass() {
        return this.streamingWorkerMainClass == null ? Input.empty() : this.streamingWorkerMainClass;
    }

    /**
     * The UNIX group ID on the worker VM to use for tasks launched by taskrunner; e.g. "wheel".
     * 
     */
    @InputImport(name="taskGroup")
    private final @Nullable Input<String> taskGroup;

    public Input<String> getTaskGroup() {
        return this.taskGroup == null ? Input.empty() : this.taskGroup;
    }

    /**
     * The UNIX user ID on the worker VM to use for tasks launched by taskrunner; e.g. "root".
     * 
     */
    @InputImport(name="taskUser")
    private final @Nullable Input<String> taskUser;

    public Input<String> getTaskUser() {
        return this.taskUser == null ? Input.empty() : this.taskUser;
    }

    /**
     * The prefix of the resources the taskrunner should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @InputImport(name="tempStoragePrefix")
    private final @Nullable Input<String> tempStoragePrefix;

    public Input<String> getTempStoragePrefix() {
        return this.tempStoragePrefix == null ? Input.empty() : this.tempStoragePrefix;
    }

    /**
     * The ID string of the VM.
     * 
     */
    @InputImport(name="vmId")
    private final @Nullable Input<String> vmId;

    public Input<String> getVmId() {
        return this.vmId == null ? Input.empty() : this.vmId;
    }

    /**
     * The file to store the workflow in.
     * 
     */
    @InputImport(name="workflowFileName")
    private final @Nullable Input<String> workflowFileName;

    public Input<String> getWorkflowFileName() {
        return this.workflowFileName == null ? Input.empty() : this.workflowFileName;
    }

    public TaskRunnerSettingsArgs(
        @Nullable Input<Boolean> alsologtostderr,
        @Nullable Input<String> baseTaskDir,
        @Nullable Input<String> baseUrl,
        @Nullable Input<String> commandlinesFileName,
        @Nullable Input<Boolean> continueOnException,
        @Nullable Input<String> dataflowApiVersion,
        @Nullable Input<String> harnessCommand,
        @Nullable Input<String> languageHint,
        @Nullable Input<String> logDir,
        @Nullable Input<Boolean> logToSerialconsole,
        @Nullable Input<String> logUploadLocation,
        @Nullable Input<List<String>> oauthScopes,
        @Nullable Input<WorkerSettingsArgs> parallelWorkerSettings,
        @Nullable Input<String> streamingWorkerMainClass,
        @Nullable Input<String> taskGroup,
        @Nullable Input<String> taskUser,
        @Nullable Input<String> tempStoragePrefix,
        @Nullable Input<String> vmId,
        @Nullable Input<String> workflowFileName) {
        this.alsologtostderr = alsologtostderr;
        this.baseTaskDir = baseTaskDir;
        this.baseUrl = baseUrl;
        this.commandlinesFileName = commandlinesFileName;
        this.continueOnException = continueOnException;
        this.dataflowApiVersion = dataflowApiVersion;
        this.harnessCommand = harnessCommand;
        this.languageHint = languageHint;
        this.logDir = logDir;
        this.logToSerialconsole = logToSerialconsole;
        this.logUploadLocation = logUploadLocation;
        this.oauthScopes = oauthScopes;
        this.parallelWorkerSettings = parallelWorkerSettings;
        this.streamingWorkerMainClass = streamingWorkerMainClass;
        this.taskGroup = taskGroup;
        this.taskUser = taskUser;
        this.tempStoragePrefix = tempStoragePrefix;
        this.vmId = vmId;
        this.workflowFileName = workflowFileName;
    }

    private TaskRunnerSettingsArgs() {
        this.alsologtostderr = Input.empty();
        this.baseTaskDir = Input.empty();
        this.baseUrl = Input.empty();
        this.commandlinesFileName = Input.empty();
        this.continueOnException = Input.empty();
        this.dataflowApiVersion = Input.empty();
        this.harnessCommand = Input.empty();
        this.languageHint = Input.empty();
        this.logDir = Input.empty();
        this.logToSerialconsole = Input.empty();
        this.logUploadLocation = Input.empty();
        this.oauthScopes = Input.empty();
        this.parallelWorkerSettings = Input.empty();
        this.streamingWorkerMainClass = Input.empty();
        this.taskGroup = Input.empty();
        this.taskUser = Input.empty();
        this.tempStoragePrefix = Input.empty();
        this.vmId = Input.empty();
        this.workflowFileName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskRunnerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> alsologtostderr;
        private @Nullable Input<String> baseTaskDir;
        private @Nullable Input<String> baseUrl;
        private @Nullable Input<String> commandlinesFileName;
        private @Nullable Input<Boolean> continueOnException;
        private @Nullable Input<String> dataflowApiVersion;
        private @Nullable Input<String> harnessCommand;
        private @Nullable Input<String> languageHint;
        private @Nullable Input<String> logDir;
        private @Nullable Input<Boolean> logToSerialconsole;
        private @Nullable Input<String> logUploadLocation;
        private @Nullable Input<List<String>> oauthScopes;
        private @Nullable Input<WorkerSettingsArgs> parallelWorkerSettings;
        private @Nullable Input<String> streamingWorkerMainClass;
        private @Nullable Input<String> taskGroup;
        private @Nullable Input<String> taskUser;
        private @Nullable Input<String> tempStoragePrefix;
        private @Nullable Input<String> vmId;
        private @Nullable Input<String> workflowFileName;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskRunnerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alsologtostderr = defaults.alsologtostderr;
    	      this.baseTaskDir = defaults.baseTaskDir;
    	      this.baseUrl = defaults.baseUrl;
    	      this.commandlinesFileName = defaults.commandlinesFileName;
    	      this.continueOnException = defaults.continueOnException;
    	      this.dataflowApiVersion = defaults.dataflowApiVersion;
    	      this.harnessCommand = defaults.harnessCommand;
    	      this.languageHint = defaults.languageHint;
    	      this.logDir = defaults.logDir;
    	      this.logToSerialconsole = defaults.logToSerialconsole;
    	      this.logUploadLocation = defaults.logUploadLocation;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.parallelWorkerSettings = defaults.parallelWorkerSettings;
    	      this.streamingWorkerMainClass = defaults.streamingWorkerMainClass;
    	      this.taskGroup = defaults.taskGroup;
    	      this.taskUser = defaults.taskUser;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.vmId = defaults.vmId;
    	      this.workflowFileName = defaults.workflowFileName;
        }

        public Builder setAlsologtostderr(@Nullable Input<Boolean> alsologtostderr) {
            this.alsologtostderr = alsologtostderr;
            return this;
        }

        public Builder setAlsologtostderr(@Nullable Boolean alsologtostderr) {
            this.alsologtostderr = Input.ofNullable(alsologtostderr);
            return this;
        }

        public Builder setBaseTaskDir(@Nullable Input<String> baseTaskDir) {
            this.baseTaskDir = baseTaskDir;
            return this;
        }

        public Builder setBaseTaskDir(@Nullable String baseTaskDir) {
            this.baseTaskDir = Input.ofNullable(baseTaskDir);
            return this;
        }

        public Builder setBaseUrl(@Nullable Input<String> baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder setBaseUrl(@Nullable String baseUrl) {
            this.baseUrl = Input.ofNullable(baseUrl);
            return this;
        }

        public Builder setCommandlinesFileName(@Nullable Input<String> commandlinesFileName) {
            this.commandlinesFileName = commandlinesFileName;
            return this;
        }

        public Builder setCommandlinesFileName(@Nullable String commandlinesFileName) {
            this.commandlinesFileName = Input.ofNullable(commandlinesFileName);
            return this;
        }

        public Builder setContinueOnException(@Nullable Input<Boolean> continueOnException) {
            this.continueOnException = continueOnException;
            return this;
        }

        public Builder setContinueOnException(@Nullable Boolean continueOnException) {
            this.continueOnException = Input.ofNullable(continueOnException);
            return this;
        }

        public Builder setDataflowApiVersion(@Nullable Input<String> dataflowApiVersion) {
            this.dataflowApiVersion = dataflowApiVersion;
            return this;
        }

        public Builder setDataflowApiVersion(@Nullable String dataflowApiVersion) {
            this.dataflowApiVersion = Input.ofNullable(dataflowApiVersion);
            return this;
        }

        public Builder setHarnessCommand(@Nullable Input<String> harnessCommand) {
            this.harnessCommand = harnessCommand;
            return this;
        }

        public Builder setHarnessCommand(@Nullable String harnessCommand) {
            this.harnessCommand = Input.ofNullable(harnessCommand);
            return this;
        }

        public Builder setLanguageHint(@Nullable Input<String> languageHint) {
            this.languageHint = languageHint;
            return this;
        }

        public Builder setLanguageHint(@Nullable String languageHint) {
            this.languageHint = Input.ofNullable(languageHint);
            return this;
        }

        public Builder setLogDir(@Nullable Input<String> logDir) {
            this.logDir = logDir;
            return this;
        }

        public Builder setLogDir(@Nullable String logDir) {
            this.logDir = Input.ofNullable(logDir);
            return this;
        }

        public Builder setLogToSerialconsole(@Nullable Input<Boolean> logToSerialconsole) {
            this.logToSerialconsole = logToSerialconsole;
            return this;
        }

        public Builder setLogToSerialconsole(@Nullable Boolean logToSerialconsole) {
            this.logToSerialconsole = Input.ofNullable(logToSerialconsole);
            return this;
        }

        public Builder setLogUploadLocation(@Nullable Input<String> logUploadLocation) {
            this.logUploadLocation = logUploadLocation;
            return this;
        }

        public Builder setLogUploadLocation(@Nullable String logUploadLocation) {
            this.logUploadLocation = Input.ofNullable(logUploadLocation);
            return this;
        }

        public Builder setOauthScopes(@Nullable Input<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        public Builder setOauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Input.ofNullable(oauthScopes);
            return this;
        }

        public Builder setParallelWorkerSettings(@Nullable Input<WorkerSettingsArgs> parallelWorkerSettings) {
            this.parallelWorkerSettings = parallelWorkerSettings;
            return this;
        }

        public Builder setParallelWorkerSettings(@Nullable WorkerSettingsArgs parallelWorkerSettings) {
            this.parallelWorkerSettings = Input.ofNullable(parallelWorkerSettings);
            return this;
        }

        public Builder setStreamingWorkerMainClass(@Nullable Input<String> streamingWorkerMainClass) {
            this.streamingWorkerMainClass = streamingWorkerMainClass;
            return this;
        }

        public Builder setStreamingWorkerMainClass(@Nullable String streamingWorkerMainClass) {
            this.streamingWorkerMainClass = Input.ofNullable(streamingWorkerMainClass);
            return this;
        }

        public Builder setTaskGroup(@Nullable Input<String> taskGroup) {
            this.taskGroup = taskGroup;
            return this;
        }

        public Builder setTaskGroup(@Nullable String taskGroup) {
            this.taskGroup = Input.ofNullable(taskGroup);
            return this;
        }

        public Builder setTaskUser(@Nullable Input<String> taskUser) {
            this.taskUser = taskUser;
            return this;
        }

        public Builder setTaskUser(@Nullable String taskUser) {
            this.taskUser = Input.ofNullable(taskUser);
            return this;
        }

        public Builder setTempStoragePrefix(@Nullable Input<String> tempStoragePrefix) {
            this.tempStoragePrefix = tempStoragePrefix;
            return this;
        }

        public Builder setTempStoragePrefix(@Nullable String tempStoragePrefix) {
            this.tempStoragePrefix = Input.ofNullable(tempStoragePrefix);
            return this;
        }

        public Builder setVmId(@Nullable Input<String> vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = Input.ofNullable(vmId);
            return this;
        }

        public Builder setWorkflowFileName(@Nullable Input<String> workflowFileName) {
            this.workflowFileName = workflowFileName;
            return this;
        }

        public Builder setWorkflowFileName(@Nullable String workflowFileName) {
            this.workflowFileName = Input.ofNullable(workflowFileName);
            return this;
        }

        public TaskRunnerSettingsArgs build() {
            return new TaskRunnerSettingsArgs(alsologtostderr, baseTaskDir, baseUrl, commandlinesFileName, continueOnException, dataflowApiVersion, harnessCommand, languageHint, logDir, logToSerialconsole, logUploadLocation, oauthScopes, parallelWorkerSettings, streamingWorkerMainClass, taskGroup, taskUser, tempStoragePrefix, vmId, workflowFileName);
        }
    }
}
