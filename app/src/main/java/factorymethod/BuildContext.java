package factorymethod;

public class BuildContext {

  private final String branchName;
  private final String commitSha;
  private final String environment;
  private final String workspacePath;
  private final String artifactName;

  public BuildContext(String branchName,
      String commitSha,
      String environment,
      String workspacePath,
      String artifactName) {
    this.branchName = branchName;
    this.commitSha = commitSha;
    this.environment = environment;
    this.workspacePath = workspacePath;
    this.artifactName = artifactName;
  }

  public String getBranchName() {
    return branchName;
  }

  public String getCommitSha() {
    return commitSha;
  }

  public String getEnvironment() {
    return environment;
  }

  public String getWorkspacePath() {
    return workspacePath;
  }

  public String getArtifactName() {
    return artifactName;
  }
}
